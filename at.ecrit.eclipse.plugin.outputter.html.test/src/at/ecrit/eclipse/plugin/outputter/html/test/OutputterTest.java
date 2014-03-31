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
import at.ecrit.document.model.outputconverter.HTMLOutputConverter;
import at.ecrit.eclipse.plugin.outputter.html.HTMLOutputter;
import at.ecrit.eclipse.plugin.outputter.html.internal.Activator;
import at.ecrit.eclipse.plugin.outputter.html.internal.TemplateConstants;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class OutputterTest {
	
	private static ResourceSet resourceSet = new ResourceSetImpl();
	
	@Test
	public void testProcessOutput(){
		URL applicationModelUrl = OutputterTest.class.getResource("Application.e4xmi");
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put("e4xmi", new E4XMIResourceFactory());
		
		Resource appModelResource =
			resourceSet.getResource(URI.createURI(applicationModelUrl.toString()), true);
		
		// TODO change this
		Document doc =
			DocumentFactory.createFromApplicationModel(appModelResource, new HTMLOutputConverter());
		
		try {
			Configuration cfg = Activator.getFreemarkerConfig();
			Template template = cfg.getTemplate(TemplateConstants.HTML_TEMPLATE);
			
			HTMLOutputter outputter = new HTMLOutputter();
			outputter.performOutput(doc, new File("C:/Users/Lucia/Desktop/ecrit_doc/"),
				appModelResource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
