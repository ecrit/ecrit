package at.ecrit.eclipse.plugin.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import at.ecrit.eclipse.plugin.extension.AbstractOutputter;

public class OutputExtensionPoint {

	private static final String EP_ID = "at.ecrit.eclipse.plugin.output";

	public static List<AbstractOutputter> getContributedOutputters() {
		List<AbstractOutputter> ret = new ArrayList<AbstractOutputter>();

		IConfigurationElement[] configurationElementsFor = Platform
				.getExtensionRegistry().getConfigurationElementsFor(EP_ID);

		for (IConfigurationElement iConfigurationElement : configurationElementsFor) {
			Object o;
			try {
				o = iConfigurationElement.createExecutableExtension("class");
				if (o instanceof AbstractOutputter) {
					ret.add((AbstractOutputter) o);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return ret;
	}

}
