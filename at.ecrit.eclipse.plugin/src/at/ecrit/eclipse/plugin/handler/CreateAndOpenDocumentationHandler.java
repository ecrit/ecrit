package at.ecrit.eclipse.plugin.handler;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.StatusDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.outputconverter.AbstractOutputConverter;
import at.ecrit.document.model.outputconverter.NullOutputConverter;
import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.internal.Activator;
import at.ecrit.eclipse.plugin.internal.ui.OutputSelectionDialog;

public class CreateAndOpenDocumentationHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		StructuredSelection selection = (StructuredSelection) HandlerUtil
				.getCurrentSelection(event);
		IFile e4xmiFile = (IFile) selection.getFirstElement();

		URI uri = URI.createURI(e4xmiFile.getLocationURI().toString());
		Resource appModelResource = Activator.getResourceSet().getResource(uri,
				true);

		OutputSelectionDialog osd = new OutputSelectionDialog();

		int retVal = osd.open();
		if (retVal != Dialog.OK)
			return null;

		AbstractOutputter outputter = osd.getSelectedOutputter();
		File outputLocation = osd.getSelectedOutputLocation();

		AbstractOutputConverter aoc = (outputter.getOutputConverter() == null) ? aoc = new NullOutputConverter()
				: outputter.getOutputConverter();

		Document doc = DocumentFactory.createFromApplicationModel(
				appModelResource, aoc);

		IStatus performOutput = outputter.performOutput(doc, outputLocation, appModelResource);
		if(!performOutput.isOK()) {
			ErrorDialog ed = new ErrorDialog(Display.getCurrent().getActiveShell(), "Error on output", performOutput.getMessage(), performOutput, performOutput.getSeverity());
			ed.open();
		}

		appModelResource.unload();

		return null;
	}
}
