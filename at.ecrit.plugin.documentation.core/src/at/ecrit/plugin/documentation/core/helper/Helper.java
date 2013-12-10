package at.ecrit.plugin.documentation.core.helper;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import at.ecrit.model.plugin.modelDocumentation.ModelDocumentation;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentationFactory;
import at.ecrit.plugin.documentation.core.constants.StringConstants;

public class Helper {

	private static ResourceSet resourceSet = new ResourceSetImpl();

	public static IFile getModelFile(IProject project) {
		IFile applicationModel = project
				.getFile(StringConstants.APPLICATION_E4XMI);
		// should we get the real name via the extension point?
		IFile fragmentModel = project.getFile(StringConstants.FRAGMENT_E4XMI);
		if (applicationModel.exists())
			return applicationModel;
		if (fragmentModel.exists())
			return fragmentModel;
		return null;
	}

	public static Resource getResourceForEcritModelFilePath(IPath modelFilePath) {
		// Get the URI of the model file.
		URI fileURI = URI.createPlatformResourceURI(modelFilePath.toString(),
				true);

		// Create a resource for this file.
		return resourceSet.createResource(fileURI);
	}

	/**
	 * Create a basic initial ecritxml file without any content yet
	 * 
	 * @param project
	 * @param modelFile
	 * @return
	 * @throws IOException
	 */
	public static InputStream getInitialFileInputStream(IProject project,
			IFile modelFile) throws IOException {

		ModelDocumentation md = ModelDocumentationFactory.eINSTANCE
				.createModelDocumentation();

		md.setReferencedModelFile(modelFile.getProjectRelativePath().toString());

		// Create a resource for this file
		Resource resource = getResourceForEcritModelFilePath(modelFile
				.getFullPath());

		resource.getContents().add(md);

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		resource.save(out, getResourceSaveOptions());
		return new ByteArrayInputStream(out.toByteArray());
	}

	public static IFile getEcritModelFileForProject(IProject project) {
		IFile modelFile = Helper.getModelFile(project);
		String fileName = modelFile.getName();
		IFile ecritModelFile = project.getFile(fileName.replace("e4xmi",
				StringConstants.ECRIT_PLUGIN_DOC_XMLFILE_POSTFIX));
		return ecritModelFile;
	}

	public static Map<String, String> getResourceSaveOptions() {
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		return options;
	}
	
	public static ModelDocumentation loadEcritModelDocumentationForProject(
			IProject project) {
		IFile ecritFile = getEcritModelFileForProject(project);

		URI fileURI = URI.createPlatformResourceURI(ecritFile.getFullPath()
				.toString(), true);

		Resource res = resourceSet.getResource(fileURI, true);

		if (res.getContents()!=null && res.getContents().get(0) == null) {
			ModelDocumentation mod = ModelDocumentationFactory.eINSTANCE
					.createModelDocumentation();
			res.getContents().add(mod);
		}

		return (ModelDocumentation) res.getContents().get(0);
	}

}
