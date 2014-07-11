package at.ecrit.e4.tools.extension.core.control;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import at.ecrit.e4.tools.extension.core.assistance.TextileContentAssistProcessor;
import at.ecrit.e4.tools.extension.core.assistance.TextileTagTracker;
import at.ecrit.e4.tools.extension.core.listener.PersistedStateValueChangeListener;

public class MapEntryEditorComposite extends AbstractEditorComposite {
	
	final WritableValue value_description = new WritableValue("", String.class);
	private Text checked;
	
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
			
			final SourceViewer viewer =
				new SourceViewer(this, null, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
			GridData gd_Viewer = new GridData(GridData.FILL_BOTH);
			gd_Viewer.horizontalSpan = 2;
			viewer.getControl().setLayoutData(gd_Viewer);
			viewer.setDocument(new Document());
			viewer.setEditable(true);
			viewer.enableOperation(ISourceViewer.CONTENTASSIST_PROPOSALS, true);
			viewer.enableOperation(ISourceViewer.QUICK_ASSIST, true);
			viewer.enableOperation(ISourceViewer.CONTENTASSIST_CONTEXT_INFORMATION, true);
			viewer.configure(new TextileSourceViewerConfiguration());
			viewer.getControl().addKeyListener(new KeyAdapter() {
				public void keyPressed(KeyEvent e){
					if ((e.character == SWT.SPACE) && ((e.stateMask & SWT.MOD1) != 0)) {
						viewer.doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
					}
				}
			});
			
			context.bindValue(textProp.observeDelayed(200, viewer.getTextWidget()),
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
			
			checked = new Text(this, SWT.NONE);
			checked.setVisible(false);
			checked.setText("");
			
			context.bindValue(textProp.observeDelayed(200, checked), value_description);
		}
	}
	
	class TextileSourceViewerConfiguration extends SourceViewerConfiguration {
		
		public TextileSourceViewerConfiguration(){
			super();
		}
		
		@Override
		public IContentAssistant getContentAssistant(ISourceViewer sourceViewer){
			ContentAssistant assistant = new ContentAssistant();
			assistant.setContentAssistProcessor(new TextileContentAssistProcessor(
				new TextileTagTracker()), IDocument.DEFAULT_CONTENT_TYPE);
			assistant.setProposalPopupOrientation(IContentAssistant.PROPOSAL_OVERLAY);
			assistant.setContextInformationPopupOrientation(IContentAssistant.CONTEXT_INFO_ABOVE);
			assistant.install(sourceViewer);
			
			return assistant;
		}
	}
}
