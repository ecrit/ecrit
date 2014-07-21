package at.ecrit.eclipse.plugin.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.e4.ui.model.fragment.MModelFragment;
import org.eclipse.e4.ui.model.fragment.MModelFragments;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginObject;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.internal.core.bundle.WorkspaceBundlePluginModel;
import org.eclipse.pde.internal.core.plugin.PluginElement;
import org.eclipse.pde.internal.core.project.PDEProject;

public class FragmentExtensionPoint {
	private static final String EP_ID = "org.eclipse.e4.workbench.model";
	private static final String ATTR_URI = "uri";
	final static String FRAGMENT = "fragment";
	
	public static List<MModelFragment> getContributedFragments(File appFile){
		String application = appFile.getName();
		List<MModelFragment> ret = new ArrayList<MModelFragment>();
		
// IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects(IProject.NONE);
		IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject(application);
		try {
			if (!iProject.isOpen())
				return ret;
			if (!iProject.hasNature(IBundleProjectDescription.PLUGIN_NATURE))
				return ret;
			
			IFile pluginXml = PDEProject.getPluginXml(iProject);
			IFile manifest = PDEProject.getManifest(iProject);
			WorkspaceBundlePluginModel fModel = new WorkspaceBundlePluginModel(manifest, pluginXml);
			fModel.setBundleDescription(PluginRegistry.findModel(iProject).getBundleDescription());
			// fModel.load();
			
			for (IPluginExtension iPluginExtension : fModel.getPluginBase().getExtensions()) {
				// if o.e.e4.workbench.model extension point
				if (EP_ID.equalsIgnoreCase(iPluginExtension.getPoint())) {
					for (IPluginObject child : iPluginExtension.getChildren()) {
						// get fragment part
						if (FRAGMENT.equalsIgnoreCase(child.getName())) {
							// resolve fragment file location
							IPluginAttribute attribute =
								((PluginElement) child).getAttribute(ATTR_URI);
							String fragmentUri = attribute.getValue();
							IFile file = iProject.getFile(fragmentUri);
							System.out.println("Found fragment " + iProject.getName() + ", Uri: "
								+ file.getLocation().toString());
							
							Resource appModelResource =
								Activator.getResourceSet().getResource(
									URI.createURI(file.getLocationURI().toString()), true);
							EList<EObject> contents = appModelResource.getContents();
							
							// check if contents actually has content
							if (contents != null && !contents.isEmpty()) {
								// add all fragments to the list
								MModelFragments modelFragment = (MModelFragments) contents.get(0);
								ret.addAll(modelFragment.getFragments());
							}
							appModelResource.unload();
						}
					}
				}
			}
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return ret;
	}
}
