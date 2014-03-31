package at.ecrit.document.model.test;

import java.net.URL;

import org.eclipse.e4.ui.internal.workbench.E4XMIResourceFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import at.ecrit.document.model.DocumentFactory;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.outputconverter.NullOutputConverter;

public class DocumentFactoryTest {
	
	private static ResourceSet resourceSet = new ResourceSetImpl();
	
	@Test
	public void testCreateFromApplicationModel(){
		URL applicationModelUrl = DocumentFactoryTest.class.getResource("Application.e4xmi");
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
			.put("e4xmi", new E4XMIResourceFactory());
		
		Resource appModelResource =
			resourceSet.getResource(URI.createURI(applicationModelUrl.toString()), true);
		
		Document doc =
			DocumentFactory.createFromApplicationModel(appModelResource, new NullOutputConverter());
	}
	
}
