package at.ecrit.eclipse.plugin.handler;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.outputconverter.NullOutputConverter;
import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.internal.Activator;
import at.ecrit.eclipse.plugin.internal.ui.OutputSelectionDialog;

public class CreateAndOpenDocumentationHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException{
		StructuredSelection selection =
			(StructuredSelection) HandlerUtil.getCurrentSelection(event);
		IFile e4xmiFile = (IFile) selection.getFirstElement();
		
		URI uri = URI.createURI(e4xmiFile.getLocationURI().toString());
		Resource appModelResource = Activator.getResourceSet().getResource(uri, true);
		
		// FIXME replace me with converter set via the extension point
		Document doc =
			DocumentFactory.createFromApplicationModel(appModelResource, new NullOutputConverter());
		
		OutputSelectionDialog osd = new OutputSelectionDialog();
		
		int retVal = osd.open();
		if (retVal != Dialog.OK)
			return null;
		
		AbstractOutputter outputter = osd.getSelectedOutputter();
		File outputLocation = osd.getSelectedOutputLocation();
		
		outputter.performOutput(doc, outputLocation, appModelResource);
		
		appModelResource.unload();
		
		return null;
	}
	
}
