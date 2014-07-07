package at.ecrit.eclipse.plugin.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.ui.model.fragment.MModelFragment;
import org.eclipse.e4.ui.model.fragment.MModelFragments;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class FragmentExtensionPoint {
	private static final String EP_ID = "org.eclipse.e4.workbench.model";
	private static final String ATTR_URI = "uri";
	
	public static List<MModelFragment> getContributedFragments(File appFile){
		String application = appFile.getName();
		List<MModelFragment> ret = new ArrayList<MModelFragment>();
		
		IConfigurationElement[] configurationElementsFor =
			Platform.getExtensionRegistry().getConfigurationElementsFor(EP_ID);
		
		try {
			for (IConfigurationElement iConfigurationElement : configurationElementsFor) {
				if (iConfigurationElement.getNamespaceIdentifier().equals(application)) {
					if (iConfigurationElement.getName().equals("fragment")) {
						String fragmentUri = iConfigurationElement.getAttribute(ATTR_URI);
						
						File fragmentFile =
							new File(appFile.getAbsolutePath() + File.separator + fragmentUri);
						
						Resource appModelResource =
							Activator.getResourceSet().getResource(
								URI.createURI(fragmentFile.toURI().toString()), true);
						MModelFragments modelFragment =
							(MModelFragments) appModelResource.getContents().get(0);
						ret.addAll(modelFragment.getFragments());
						
						appModelResource.unload();
					}
				}
			}
		} catch (InvalidRegistryObjectException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
