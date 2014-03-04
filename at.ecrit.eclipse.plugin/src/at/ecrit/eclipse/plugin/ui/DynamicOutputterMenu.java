package at.ecrit.eclipse.plugin.ui;

import java.util.List;

import org.eclipse.jface.action.ContributionItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.services.IServiceLocator;

import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.internal.OutputExtensionPoint;

public class DynamicOutputterMenu extends ContributionItem {

	private List<AbstractOutputter> outputters;

	private IServiceLocator serviceLocator = PlatformUI.getWorkbench();
	private ICommandService commandService = (ICommandService) serviceLocator
			.getService(ICommandService.class);

	public DynamicOutputterMenu() {
		outputters = OutputExtensionPoint.getContributedOutputters();
	}

	@Override
	public void fill(Menu menu, int index) {
		for (AbstractOutputter output : outputters) {
			final MenuItem item = new MenuItem(menu, SWT.PUSH);
			item.setText(output.getOutputterLabel());
			item.setData(output);
			item.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					// use parametrized command 
				}
			});
		}
	}

}
