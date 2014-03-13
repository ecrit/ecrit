package at.ecrit.eclipse.plugin.internal.ui;

import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.internal.Activator;
import at.ecrit.eclipse.plugin.internal.OutputExtensionPoint;

public class OutputterSelectionDialog extends FilteredItemsSelectionDialog {

	private List<AbstractOutputter> contributedOutputters;

	public OutputterSelectionDialog(Shell shell) {
		super(shell);
		setListLabelProvider(new AbstractOutputterLabelProvider());
		
		contributedOutputters = OutputExtensionPoint.getContributedOutputters();
	}


	@Override
	protected Control createExtendedContentArea(Composite parent) {
		// TODO Auto-generated method stub
		return null;
	}

	private static final String SETTINGS = OutputterSelectionDialog.class
			.getCanonicalName();

	@Override
	protected IDialogSettings getDialogSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings()
				.getSection(SETTINGS);

		if (settings == null) {
			settings = Activator.getDefault().getDialogSettings()
					.addNewSection(SETTINGS);
		}

		return settings;
	}

	@Override
	protected IStatus validateItem(Object item) {
		// TODO Auto-generated method stub
		return Status.OK_STATUS;
	}

	@Override
	protected ItemsFilter createFilter() {
		return new ItemsFilter() {
			
			@Override
			public boolean matchItem(Object item) {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public boolean isConsistentItem(Object item) {
				// TODO Auto-generated method stub
				return true;
			}
		};
	}


	@Override
	protected void fillContentProvider(AbstractContentProvider contentProvider,
			ItemsFilter itemsFilter, IProgressMonitor progressMonitor)
			throws CoreException {

		System.out.println("fillContentProvider");
		
		progressMonitor.beginTask("Looking for persons...",
				contributedOutputters.size());
		for (AbstractOutputter outputter : contributedOutputters) {
			contentProvider.add(outputter, itemsFilter);
			progressMonitor.worked(1);
		}

	}

	@Override
	public String getElementName(Object item) {
		AbstractOutputter ao = (AbstractOutputter) item;
		return ao.getOutputterLabel();
	}


	@Override
	protected Comparator getItemsComparator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class AbstractOutputterLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {
			AbstractOutputter ao = (AbstractOutputter) element;
			return ao.getOutputterLabel();
		}
	}

}
