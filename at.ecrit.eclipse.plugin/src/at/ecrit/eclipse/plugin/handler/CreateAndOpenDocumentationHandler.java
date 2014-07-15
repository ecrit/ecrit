package at.ecrit.eclipse.plugin.handler;

import java.io.File;

import javax.inject.Inject;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.ISetSelectionTarget;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.outputconverter.AbstractOutputConverter;
import at.ecrit.document.model.outputconverter.NullOutputConverter;
import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.internal.Activator;
import at.ecrit.eclipse.plugin.internal.ProductProcessor;
import at.ecrit.eclipse.plugin.internal.ui.OutputSelectionDialog;

public class CreateAndOpenDocumentationHandler extends AbstractHandler {
	private static final String PRODUCT_EXTENSION = "product";
	private static final String ID_PACKAGE_EXPLORER = "org.eclipse.jdt.ui.PackageExplorer";
	
	@Inject
	IExtensionRegistry registry;
	
	private IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
	private IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	private IProject outputProject;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException{
		StructuredSelection selection =
			(StructuredSelection) HandlerUtil.getCurrentSelection(event);
		IFile e4xmiFile = (IFile) selection.getFirstElement();
		URI uri = URI.createURI(e4xmiFile.getLocationURI().toString());
		
		if (e4xmiFile.getFileExtension().equals(PRODUCT_EXTENSION)) {
			ProductProcessor product = new ProductProcessor(uri);
			product.mergeApplicationWithFragments();
			uri = product.getApplicationModelUri();
			
		}
		Resource appModelResource = Activator.getResourceSet().getResource(uri, true);
		OutputSelectionDialog osd = new OutputSelectionDialog(uri);
		
		int retVal = osd.open();
		if (retVal != Dialog.OK)
			return null;
		
		AbstractOutputter outputter = osd.getSelectedOutputter();
		File outputLocation = osd.getSelectedOutputLocation();
		
		if (outputLocation == null) {
			outputLocation = createOutputLocation(outputter, uri);
		} else {
			// TODO
			// workspaceRoot.getProject(name) how to find?
		}
		
		AbstractOutputConverter aoc =
			(outputter.getOutputConverter() == null) ? aoc = new NullOutputConverter() : outputter
				.getOutputConverter();
		
		Document doc = DocumentFactory.createFromApplicationModel(appModelResource, aoc);
		
		IStatus performOutput = outputter.performOutput(doc, outputLocation, appModelResource);
		if (!performOutput.isOK()) {
			ErrorDialog ed =
				new ErrorDialog(Display.getCurrent().getActiveShell(), "Error on output",
					performOutput.getMessage(), performOutput, performOutput.getSeverity());
			ed.open();
		}
		
		appModelResource.unload();
		
		// refresh the created project
		try {
			outputProject.refreshLocal(IProject.DEPTH_INFINITE, new NullProgressMonitor());
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		IWorkbenchPage page = window.getActivePage();
		String mainOutputFile = outputter.getMainDocumentationFileName();
		
		// try to expand the project folder in the package explorer
		IViewPart packageExplorer = page.findView(ID_PACKAGE_EXPLORER);
		((ISetSelectionTarget) packageExplorer).selectReveal(new StructuredSelection(outputProject
			.getFile(mainOutputFile)));
		
		// open the main file for editing
		try {
			IDE.openEditor(page, outputProject.getFile(mainOutputFile));
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * generate a new project where the documentation will be stored.
	 * 
	 * @param outputter
	 * @param uri
	 * 
	 * @return the project directory
	 */
	private File createOutputLocation(AbstractOutputter outputter, URI uri){
		String label = outputter.getOutputterLabel().replace(" ", ".");
		String[] uriSegments = uri.segments();
		label = uriSegments[uriSegments.length - 2] + "." + (label.toLowerCase()).trim();
		
		outputProject = workspaceRoot.getProject(label);
		
		try {
			if (outputProject.exists()) {
				outputProject.delete(true, null);
			}
			outputProject.create(null);
			outputProject.open(null);
			outputter.setProjectDescription(outputProject);
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return outputProject.getLocation().toFile();
	}
	
}
