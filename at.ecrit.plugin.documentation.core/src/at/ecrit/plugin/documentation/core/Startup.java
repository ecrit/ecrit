package at.ecrit.plugin.documentation.core;

import org.eclipse.ui.IStartup;

public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		// This is to activate this plug-in only;
		// It is required to "initialize" the propertyTester
	}

}
