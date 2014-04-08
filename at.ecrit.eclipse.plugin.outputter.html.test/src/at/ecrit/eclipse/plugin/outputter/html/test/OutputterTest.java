package at.ecrit.eclipse.plugin.outputter.html.test;

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
import at.ecrit.eclipse.plugin.outputter.html.HTMLOutputter;
import at.ecrit.eclipse.plugin.outputter.html.internal.HTMLOutputConverter;

public class OutputterTest {

	private static ResourceSet resourceSet = new ResourceSetImpl();

	@Test
	public void testProcessOutput() throws IOException {
		URL applicationModelUrl = OutputterTest.class
				.getResource("Application.e4xmi");

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("e4xmi", new E4XMIResourceFactory());

		Resource appModelResource = resourceSet.getResource(
				URI.createURI(applicationModelUrl.toString()), true);

		Document doc = DocumentFactory.createFromApplicationModel(
				appModelResource, new HTMLOutputConverter());
		File destFolder = new File(System.getProperty("user.dir")
				+ File.separator + "ecrit_doc");
		if (!destFolder.exists()) {
			destFolder.mkdir();
		}
		HTMLOutputter outputter = new HTMLOutputter();
		outputter.performOutput(doc, destFolder, appModelResource);
	}

}
