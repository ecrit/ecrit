package at.ecrit.eclipse.plugin.internal.ui;

import java.io.File;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.internal.Activator;
import at.ecrit.eclipse.plugin.internal.OutputExtensionPoint;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.databinding.viewers.ViewerProperties;

public class OutputSelectionDialog extends TitleAreaDialog {
	private DataBindingContext m_bindingContext;
	private Text txtDirectory;

	private WritableValue outputDirectory = new WritableValue(null, File.class);
	private WritableValue outputter = new WritableValue(null,
			AbstractOutputter.class);
	private ComboViewer comboViewer;
	private IDialogSettings settings;

	private static final String SETTINGS_DIRECTORY = "outputDirectory";
	
	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 * @wbp.parser.constructor
	 */
	public OutputSelectionDialog(Shell parentShell) {
		super(parentShell);
		settings = Activator.getDefault().getDialogSettings();
		String directory = settings.get(SETTINGS_DIRECTORY);
		if(directory!=null) {
			outputDirectory.setValue(new File(directory));
		}
	}

	public OutputSelectionDialog() {
		this(PlatformUI.createDisplay().getActiveShell());
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Selection output and destination");

		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblNewLabel.setText("Outputter");

		comboViewer = new ComboViewer(container, SWT.NONE);
		Combo comboOutputter = comboViewer.getCombo();
		comboOutputter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 2, 1));
		comboViewer.setLabelProvider(new ViewerLabelProvider() {
			@Override
			public String getText(Object element) {
				AbstractOutputter ao = (AbstractOutputter) element;
				return ao.getOutputterLabel();
			}
		});
		comboViewer.setContentProvider(ArrayContentProvider.getInstance());

		Label lblDirectory = new Label(container, SWT.NONE);
		lblDirectory.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblDirectory.setText("Directory");

		txtDirectory = new Text(container, SWT.BORDER);
		txtDirectory.setEditable(false);
		txtDirectory.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		final Button btnNewButton = new Button(container, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dd = new DirectoryDialog(btnNewButton
						.getShell());
				dd.setMessage("Please select an output location");
				dd.setText("Output directory selection");
				String selection = dd.open();
				outputDirectory.setValue(new File(selection));
				settings.put(SETTINGS_DIRECTORY, selection);
			}
		});
		btnNewButton.setText("Browse ...");

		Object[] outputterArray = OutputExtensionPoint
				.getContributedOutputters().toArray();
		comboViewer.setInput(outputterArray);
		if (outputterArray.length > 0) {
			comboViewer.setSelection(
					new StructuredSelection(outputterArray[0]), true);
			outputter.setValue(outputterArray[0]);
		}

		return area;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
		m_bindingContext = initDataBindings();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}

	public AbstractOutputter getSelectedOutputter() {
		return (AbstractOutputter) outputter.getValue();
	}

	public File getSelectedOutputLocation() {
		return (File) outputDirectory.getValue();
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTxtDirectoryObserveWidget = WidgetProperties
				.text(SWT.Modify).observe(txtDirectory);
		IObservableValue outputDirectoryAbsolutePathObserveDetailValue = PojoProperties
				.value(File.class, "absolutePath", String.class).observeDetail(
						outputDirectory);
		bindingContext
				.bindValue(observeTextTxtDirectoryObserveWidget,
						outputDirectoryAbsolutePathObserveDetailValue,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_NEVER), null);
		//
		IObservableValue observeSingleSelectionComboViewer = ViewerProperties
				.singleSelection().observe(comboViewer);
		bindingContext
				.bindValue(observeSingleSelectionComboViewer, outputter, null,
						new UpdateValueStrategy(
								UpdateValueStrategy.POLICY_NEVER));
		//
		return bindingContext;
	}

	private static class ViewerLabelProvider extends LabelProvider {
		public Image getImage(Object element) {
			return super.getImage(element);
		}

		public String getText(Object element) {
			return super.getText(element);
		}
	}
}
