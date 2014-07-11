package at.ecrit.eclipse.plugin.internal.ui;

import java.io.File;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.internal.Activator;
import at.ecrit.eclipse.plugin.internal.OutputExtensionPoint;
import org.eclipse.wb.swt.ResourceManager;

public class OutputSelectionDialog extends TitleAreaDialog {
	private DataBindingContext m_bindingContext;
	private Text txtDirectory;
	private Button btnCreateNew, btnNewButton, btnExisting;
	
	private WritableValue outputDirectory = new WritableValue(null, File.class);
	private WritableValue outputter = new WritableValue(null, AbstractOutputter.class);
	private ComboViewer comboViewer;
	private IDialogSettings settings;
	private boolean useExisting;
	private URI uri;
	
	private static final String SETTINGS_DIRECTORY = "outputDirectory";
	private static final String SETTINGS_USE_EXISTING = "useExistingDirectory";
	
	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @wbp.parser.constructor
	 */
	public OutputSelectionDialog(Shell parentShell){
		super(parentShell);
		settings = Activator.getDefault().getDialogSettings();
		String directory = settings.get(SETTINGS_DIRECTORY);
		if (directory != null) {
			outputDirectory.setValue(new File(directory));
		}
		useExisting = settings.getBoolean(SETTINGS_USE_EXISTING);
	}
	
	public OutputSelectionDialog(URI uri){
		this(PlatformUI.createDisplay().getActiveShell());
		this.uri = uri;
	}
	
	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent){
		setTitleImage(ResourceManager.getPluginImage("at.ecrit.eclipse.plugin", "rsc/icons/ecrit_logo.png"));
		setTitle("Selection output and destination");
		
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Outputter");
		
		comboViewer = new ComboViewer(container, SWT.NONE);
		Combo comboOutputter = comboViewer.getCombo();
		comboOutputter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		comboViewer.setLabelProvider(new ViewerLabelProvider() {
			@Override
			public String getText(Object element){
				AbstractOutputter ao = (AbstractOutputter) element;
				return ao.getOutputterLabel();
			}
		});
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		// GROUP OUTPUT DIRECTORY
		Group groupDirectory = new Group(container, SWT.SHADOW_IN);
		groupDirectory.setText("Select the Output Location");
		groupDirectory.setLayout(new GridLayout(1, false));
		groupDirectory.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		
		btnCreateNew = new Button(groupDirectory, SWT.RADIO);
		btnCreateNew.setSelection(!useExisting);
		btnCreateNew.setText("Create New Directory");
		
		btnExisting = new Button(groupDirectory, SWT.RADIO);
		btnExisting.setSelection(useExisting);
		btnExisting.setText("Select Existing");
		btnExisting.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				useExisting = btnExisting.getSelection();
				btnNewButton.setEnabled(useExisting);
				txtDirectory.setEnabled(useExisting);
				settings.put(SETTINGS_USE_EXISTING, useExisting);
			}
		});
		
		Composite subContainer = new Composite(groupDirectory, SWT.NONE);
		subContainer.setLayout(new GridLayout(3, false));
		subContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Label lblDirectory = new Label(subContainer, SWT.NONE);
		lblDirectory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDirectory.setText("Directory");
		
		txtDirectory = new Text(subContainer, SWT.BORDER);
		txtDirectory.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtDirectory.setEditable(false);
		txtDirectory.setEnabled(useExisting);
		
		btnNewButton = new Button(subContainer, SWT.NONE);
		btnNewButton.setEnabled(useExisting);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				DirectoryDialog dd = new DirectoryDialog(btnNewButton.getShell());
				dd.setMessage("Please select an output location");
				dd.setText("Output directory selection");
				String selection = dd.open();
				outputDirectory.setValue(new File(selection));
				settings.put(SETTINGS_DIRECTORY, selection);
			}
		});
		btnNewButton.setText("Browse ...");
		
		Object[] outputterArray = OutputExtensionPoint.getContributedOutputters().toArray();
		comboViewer.setInput(outputterArray);
		if (outputterArray.length > 0) {
			comboViewer.setSelection(new StructuredSelection(outputterArray[0]), true);
			outputter.setValue(outputterArray[0]);
		}
		
		return area;
	}
	
	/**
	 * generate a new project where the documentation will be stored.
	 * 
	 * @return the project directory
	 */
	private File autoCreateOutputLocation(){
		String label = getSelectedOutputter().getOutputterLabel().replace(" ", ".");
		String[] uriSegments = uri.segments();
		label = uriSegments[uriSegments.length - 2] + "." + (label.toLowerCase()).trim();
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(label);
		try {
			if (project.exists()) {
				project.delete(true, null);
			}
			project.create(null);
			project.open(null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return project.getLocation().toFile();
	}
	
	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent){
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		m_bindingContext = initDataBindings();
	}
	
	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize(){
		return new Point(450, 300);
	}
	
	public AbstractOutputter getSelectedOutputter(){
		return (AbstractOutputter) outputter.getValue();
	}
	
	public File getSelectedOutputLocation(){
		if (useExisting) {
			return (File) outputDirectory.getValue();
		}
		return autoCreateOutputLocation();
	}
	
	protected DataBindingContext initDataBindings(){
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtDirectoryObserveWidget =
			WidgetProperties.text(SWT.Modify).observe(txtDirectory);
		IObservableValue outputDirectoryAbsolutePathObserveDetailValue =
			PojoProperties.value(File.class, "absolutePath", String.class).observeDetail(
				outputDirectory);
		bindingContext.bindValue(observeTextTxtDirectoryObserveWidget,
			outputDirectoryAbsolutePathObserveDetailValue, new UpdateValueStrategy(
				UpdateValueStrategy.POLICY_NEVER), null);
		//
		IObservableValue observeSingleSelectionComboViewer =
			ViewerProperties.singleSelection().observe(comboViewer);
		bindingContext.bindValue(observeSingleSelectionComboViewer, outputter, null,
			new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
		//
		return bindingContext;
	}
	
	private static class ViewerLabelProvider extends LabelProvider {
		public Image getImage(Object element){
			return super.getImage(element);
		}
		
		public String getText(Object element){
			return super.getText(element);
		}
	}
}
