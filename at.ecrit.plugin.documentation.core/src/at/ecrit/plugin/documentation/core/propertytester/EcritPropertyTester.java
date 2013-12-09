package at.ecrit.plugin.documentation.core.propertytester;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;

import at.ecrit.plugin.documentation.core.helper.Helper;

public class EcritPropertyTester extends PropertyTester {

	public static final String PROPERTY_IS_MODELED_PROJECT = "modeledProject";

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		if (!(receiver instanceof IProject))
			return false;

		IProject project = (IProject) receiver;

		if (property.equals(PROPERTY_IS_MODELED_PROJECT)) {
			if (Helper.getModelFile(project) != null)
				return true;
		}

		return false;
	}

}
