package at.ecrit.eclipse.plugin.extension;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.resource.Resource;

import at.ecrit.document.model.ecritdocument.Document;

public abstract class AbstractOutputter {

	/**
	 * @return the name/description to be presented to the user when selecting
	 *         the output method
	 */
	public abstract String getOutputterLabel();

	public abstract IStatus performOutput(Document document, File outputLocation, Resource appModelResource);
	
}
