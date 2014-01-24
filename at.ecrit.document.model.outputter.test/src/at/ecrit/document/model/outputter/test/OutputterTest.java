package at.ecrit.document.model.outputter.test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.e4.ui.internal.workbench.E4XMIResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.outputter.Activator;
import at.ecrit.document.model.outputter.Outputter;
import at.ecrit.document.model.outputter.TemplateConstants;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class OutputterTest {

	private static ResourceSet resourceSet = new ResourceSetImpl();

	@Test
	public void testProcessOutput() {
		URL applicationModelUrl = OutputterTest.class
				.getResource("Application.e4xmi");
		URL ecritModelUrl = OutputterTest.class
				.getResource("Application.ecritxmi");

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("e4xmi", new E4XMIResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecritxmi", new XMIResourceFactoryImpl());
		
		Resource appModelResource = resourceSet.getResource(
				URI.createURI(applicationModelUrl.toString()), true);
		
		Resource ecritModelResource = resourceSet.getResource(
				URI.createURI(ecritModelUrl.toString()), true);

		Document doc = DocumentFactory.createFromApplicationModel(appModelResource, ecritModelResource);

		try {
			Configuration cfg = Activator.getFreemarkerConfig();
			Template template = cfg.getTemplate(
					TemplateConstants.HTML_TEMPLATE);
			
			Outputter.processOutput(doc, template, new File("/Users/marco/Desktop/"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
