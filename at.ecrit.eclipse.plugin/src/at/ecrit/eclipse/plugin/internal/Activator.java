package at.ecrit.eclipse.plugin.internal;

import org.eclipse.e4.ui.internal.workbench.E4XMIResourceFactory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	private static ResourceSet resourceSet = new ResourceSetImpl();

	public Activator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(BundleContext context) throws Exception {
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("e4xmi", new E4XMIResourceFactory());

		super.start(context);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		resourceSet = null;
		
		super.stop(context);
	}
	
	public static ResourceSet getResourceSet() {
		return resourceSet;
	}

}
