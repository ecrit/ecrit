package at.ecrit.e4.tools.extension.core.control;

import java.util.Iterator;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.mylyn.internal.wikitext.ui.WikiTextUiPlugin;
import org.eclipse.mylyn.internal.wikitext.ui.editor.MarkupEditor;
import org.eclipse.mylyn.wikitext.core.parser.markup.MarkupLanguage;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;
import org.eclipse.mylyn.wikitext.ui.editor.MarkupSourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.swt.IFocusService;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditorPreferenceConstants;
import org.eclipse.ui.texteditor.AnnotationPreference;
import org.eclipse.ui.texteditor.DefaultMarkerAnnotationAccess;
import org.eclipse.ui.texteditor.MarkerAnnotationPreferences;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;

import at.ecrit.e4.tools.extension.core.assistance.TextileContentAssistProcessor;
import at.ecrit.e4.tools.extension.core.assistance.TextileTagTracker;
import at.ecrit.e4.tools.extension.core.listener.PersistedStateValueChangeListener;

public class MapEntryEditorComposite extends AbstractEditorComposite {
	
	final WritableValue value_description = new WritableValue("", String.class);
	Text checked;
	
	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 * @param context
	 * @param master
	 * @param editingDomain
	 * @param label
	 *            the label to show for the editor field
	 * @param key
	 *            the key for the persistent state map to bind to
	 */
	public MapEntryEditorComposite(Composite parent, int style, EMFDataBindingContext context,
		WritableValue master, EditingDomain editingDomain, String label, String key){
		super(parent, style);
		setLayout(new GridLayout(3, false));
		
		master.addValueChangeListener(new MasterValueChangeListener(value_description, key));
		value_description.addValueChangeListener(new PersistedStateValueChangeListener(key, master,
			editingDomain));
		
		{
			Label l = new Label(this, SWT.NONE);
			l.setText(label);
			GridData gd_l = new GridData(GridData.HORIZONTAL_ALIGN_END);
			gd_l.minimumWidth = 100;
			gd_l.widthHint = 100;
			l.setLayoutData(gd_l);
			
			// final Text text = new Text(this, SWT.BORDER | SWT.WRAP | SWT.MULTI);
			// GridData gd_text = new GridData(GridData.FILL_BOTH);
			// gd_text.horizontalSpan = 2;
			// text.setLayoutData(gd_text);
			//
			// context.bindValue(textProp.observeDelayed(200, text),
			// value_description);
			
			TextViewer textViewer =
				new TextViewer(this, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
			GridData gd_Viewer = new GridData(GridData.FILL_BOTH);
			gd_Viewer.horizontalSpan = 2;
			textViewer.getTextWidget().setLayoutData(gd_Viewer);
			textViewer.setDocument(new Document());
			
			final ContentAssistant assistant = new ContentAssistant();
			assistant.setContentAssistProcessor(new TextileContentAssistProcessor(
				new TextileTagTracker()), IDocument.DEFAULT_CONTENT_TYPE);
			// assistant.setProposalPopupOrientation(0);
			assistant.install(textViewer);
			
			textViewer.getControl().addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e){
					if ((e.character == ' ') && ((e.stateMask & SWT.CTRL) != 0)) {
						assistant.showPossibleCompletions();
					} else {
						// ignore
					}
				}
			});
			context.bindValue(textProp.observeDelayed(200, textViewer.getTextWidget()),
				value_description);
		}
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public MapEntryEditorComposite(Composite parent, int style, EMFDataBindingContext context,
		WritableValue master, EditingDomain editingDomain, String label, String key,
		boolean defaultValue){
		super(parent, style);
		setLayout(new GridLayout(3, false));
		
		{
			Label l = new Label(this, SWT.NONE);
			l.setText(label);
			GridData gd_l = new GridData(GridData.HORIZONTAL_ALIGN_END);
			gd_l.minimumWidth = 100;
			gd_l.widthHint = 100;
			l.setLayoutData(gd_l);
			new Label(this, SWT.NONE);
			
			checked = new Text(this, SWT.NONE);
			checked.setVisible(false);
			checked.setText("");
			new Label(this, SWT.NONE);
			
			Button btnCheck = new Button(this, SWT.CHECK);
			btnCheck.setSelection(defaultValue);
			btnCheck.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(org.eclipse.swt.events.SelectionEvent e){
					if (((Button) e.widget).getSelection()) {
						checked.setText("true");
					} else {
						checked.setText("");
					}
				};
			});
			
			context.bindValue(textProp.observeDelayed(200, checked), value_description);
		}
	}
	
	/**
	 * would work as well but has some bugs - FIXME
	 * 
	 * @param parent
	 * @param style
	 * @return
	 */
	private SourceViewer createTextileEditor(Composite parent, int style){
		SourceViewer viewer = new SourceViewer(parent, null, style | SWT.WRAP);
		viewer.setDocument(new Document());
		viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		// configure the viewer
		MarkupSourceViewerConfiguration configuration =
			new MarkupSourceViewerConfiguration(WikiTextUiPlugin.getDefault().getPreferenceStore());
		configuration.setMarkupLanguage(new TextileLanguage());
		viewer.configure(configuration);
		viewer.getTextWidget().setData(MarkupLanguage.class.getName(), new TextileLanguage());
		viewer.getTextWidget().setData(ISourceViewer.class.getName(), viewer);
		
		// we want the viewer to show annotations
		viewer.showAnnotations(true);
		viewer.showAnnotationsOverview(true);
		viewer.setEditable(true);
		
		DefaultMarkerAnnotationAccess annotationAccess = new DefaultMarkerAnnotationAccess();
		MarkerAnnotationPreferences annotationPreferences = new MarkerAnnotationPreferences();
		
		// configure viewer annotation/decoration support
		final SourceViewerDecorationSupport support =
			new SourceViewerDecorationSupport(viewer, null, annotationAccess,
				EditorsUI.getSharedTextColors());
		
		// hook the support up to the preference store
		Iterator<AnnotationPreference> e =
			annotationPreferences.getAnnotationPreferences().iterator();
		while (e.hasNext()) {
			AnnotationPreference preference = e.next();
			support.setAnnotationPreference(preference);
		}
		
		support.setCursorLinePainterPreferenceKeys(
			AbstractDecoratedTextEditorPreferenceConstants.EDITOR_CURRENT_LINE,
			AbstractDecoratedTextEditorPreferenceConstants.EDITOR_CURRENT_LINE_COLOR);
		support.setMarginPainterPreferenceKeys(
			AbstractDecoratedTextEditorPreferenceConstants.EDITOR_PRINT_MARGIN,
			AbstractDecoratedTextEditorPreferenceConstants.EDITOR_PRINT_MARGIN_COLOR,
			AbstractDecoratedTextEditorPreferenceConstants.EDITOR_PRINT_MARGIN_COLUMN);
		
		StyledText styledText = viewer.getTextWidget();
		GridDataFactory.fillDefaults().hint(400, SWT.DEFAULT).grab(true, true).applyTo(styledText);
		
		support.install(EditorsUI.getPreferenceStore());
		styledText.addDisposeListener(new DisposeListener() {
			
			@Override
			public void widgetDisposed(DisposeEvent e){
				support.uninstall();
			}
		});
		
		final ContentAssistant assistant = new ContentAssistant();
		assistant.setContentAssistProcessor(new TextileContentAssistProcessor(
			new TextileTagTracker()), IDocument.DEFAULT_CONTENT_TYPE);
		assistant.install(viewer);
		
		viewer.getTextWidget().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e){
				if (isRelevantKeyCode(e.keyCode)) {
					assistant.showPossibleCompletions();
				}
			}
			
			private boolean isRelevantKeyCode(int keyCode){
				// for some reason not all key presses result in a selection change
				switch (keyCode) {
				case SWT.ARROW_DOWN:
				case SWT.ARROW_LEFT:
				case SWT.ARROW_RIGHT:
				case SWT.ARROW_UP:
				case SWT.PAGE_DOWN:
				case SWT.PAGE_UP:
					return true;
				}
				return false;
			}
		});
		
		IFocusService focusService =
			(IFocusService) PlatformUI.getWorkbench().getService(IFocusService.class);
		if (focusService != null) {
			focusService.addFocusTracker(viewer.getTextWidget(), MarkupEditor.EDITOR_SOURCE_VIEWER);
		}
		return viewer;
	}
	
	@Override
	protected void checkSubclass(){
		// Disable the check that prevents subclassing of SWT components
	}
}
