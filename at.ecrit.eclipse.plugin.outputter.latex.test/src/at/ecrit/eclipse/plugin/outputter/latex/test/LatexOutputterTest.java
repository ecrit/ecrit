package at.ecrit.eclipse.plugin.outputter.latex.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.e4.ui.internal.workbench.E4XMIResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.eclipse.plugin.outputter.latex.LatexOutputter;
import at.ecrit.eclipse.plugin.outputter.latex.internal.LatexOutputConverter;

public class LatexOutputterTest {
	
	private static ResourceSet resourceSet = new ResourceSetImpl();
	
	@Test
	public void testProcessOutput() throws IOException{
		URL applicationModelUrl = LatexOutputterTest.class.getResource("Application.e4xmi");
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put("e4xmi", new E4XMIResourceFactory());
		
		Resource appModelResource =
			resourceSet.getResource(URI.createURI(applicationModelUrl.toString()), true);
		
		Document doc =
			DocumentFactory
				.createFromApplicationModel(appModelResource, new LatexOutputConverter());
		File destFolder = new File(System.getProperty("user.dir") + "\\ecrit_latex_doc");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		LatexOutputter outputter = new LatexOutputter();
		outputter.performOutput(doc, destFolder, appModelResource);
	}
	
}