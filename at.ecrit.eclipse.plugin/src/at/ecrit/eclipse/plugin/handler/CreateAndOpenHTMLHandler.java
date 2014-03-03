package at.ecrit.eclipse.plugin.handler;



import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.eclipse.plugin.internal.Activator;

public class CreateAndOpenHTMLHandler extends AbstractHandler {

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		StructuredSelection selection = (StructuredSelection) HandlerUtil.getCurrentSelection(event);
		IFile e4xmiFile = (IFile) selection.getFirstElement();

		URI uri = URI.createURI(e4xmiFile.getLocationURI().toString());
		Resource appModelResource = Activator.getResourceSet().getResource(
				uri, true);
		
		Document doc = DocumentFactory.createFromApplicationModel(appModelResource);
		
		
		
		return null;
	}

}
