package at.ecrit.eclipse.plugin.internal;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class ProductExtensionPoint {
	private static final String EP_ID = "org.eclipse.core.runtime.products";
	private static final String ATTR_NAME = "name";
	private static final String ATTR_VALUE = "value";
	private static final String ATTR_APPLICATION_XMI = "applicationXMI";
	
	public static String getContributedApplicationXMI(String productName){
		String applicationXmi = "";
		
		IConfigurationElement[] configurationElementsFor =
			Platform.getExtensionRegistry().getConfigurationElementsFor(EP_ID);
		
		for (IConfigurationElement iConfigurationElement : configurationElementsFor) {
			// check if the product we're looking for is reached
			if (iConfigurationElement.getAttribute(ATTR_NAME).equals(productName)) {
				IConfigurationElement[] ice = iConfigurationElement.getChildren();
				for (IConfigurationElement configElement : ice) {
					// try to find the applicationXMI definition
					if (configElement.getAttribute(ATTR_NAME).equals(ATTR_APPLICATION_XMI)) {
						applicationXmi = configElement.getAttribute(ATTR_VALUE);
					}
				}
			}
		}
		
		return applicationXmi;
	}
	
}
