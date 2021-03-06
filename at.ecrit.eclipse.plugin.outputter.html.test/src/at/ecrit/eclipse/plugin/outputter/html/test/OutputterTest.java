package at.ecrit.eclipse.plugin.outputter.html.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.e4.ui.internal.workbench.E4XMIResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.eclipse.plugin.outputter.html.HTMLOutputConverter;
import at.ecrit.eclipse.plugin.outputter.html.HTMLOutputter;

public class OutputterTest {
	
	private static ResourceSet resourceSet = new ResourceSetImpl();
	private File appModelFile;
	
	@Before
	public void selectAppModelFile() throws IOException{
		String filePath = "";
		
		// allow inserting of path of any application.e4xmi
		System.out
			.println("Would you like to test another Apllication Model file than the usual? Enter it's path:");
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		long elapsed = System.currentTimeMillis() + 7000; // wait 7seconds for user input
		
		while (System.currentTimeMillis() < elapsed) {
			if (bReader.ready())
				filePath += bReader.readLine();
		}
		bReader.close();
		
		// if path is empty use default file
		if (filePath.isEmpty()) {
			URL applicationModelUrl = OutputterTest.class.getResource("Application.e4xmi");
			applicationModelUrl = FileLocator.toFileURL(applicationModelUrl);
			filePath = applicationModelUrl.getPath();
		}
		appModelFile = new File(filePath);
	}
	
	@Test
	public void testProcessOutput() throws IOException{
		if (appModelFile == null || !appModelFile.exists()) {
			System.out.println("Application Model File not set");
		} else {
			// URL applicationModelUrl = OutputterTest.class.getResource("Application.e4xmi");
			URL applicationModelUrl = appModelFile.toURL();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("e4xmi", new E4XMIResourceFactory());
			Resource appModelResource =
				resourceSet.getResource(URI.createURI(applicationModelUrl.toString()), true);
			
			Document doc =
				DocumentFactory.createFromApplicationModel(appModelResource,
					new HTMLOutputConverter());
			File destFolder =
				new File(System.getProperty("user.dir") + File.separator + "ecrit_doc");
			if (!destFolder.exists()) {
				destFolder.mkdir();
			}
			HTMLOutputter outputter = new HTMLOutputter();
			outputter.performOutput(doc, destFolder, appModelResource);
		}
	}
}
