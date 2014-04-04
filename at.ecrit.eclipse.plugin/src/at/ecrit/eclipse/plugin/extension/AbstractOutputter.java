package at.ecrit.eclipse.plugin.extension;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.resource.Resource;

import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.outputconverter.AbstractOutputConverter;

public abstract class AbstractOutputter {

	/**
	 * @return the name/description to be presented to the user when selecting
	 *         the output method
	 */
	public abstract String getOutputterLabel();

	/**
	 * perform the output
	 * @param document
	 * @param outputLocation
	 * @param appModelResource
	 * @return
	 */
	public abstract IStatus performOutput(Document document, File outputLocation, Resource appModelResource);

	/**
	 * Determine an output converter to use when delivering the string values from the documentation model
	 * to the template engine
	 * @return <code>null</code> if none required, als an AbstractOutputConverter
	 */
	public abstract AbstractOutputConverter getOutputConverter();
	
}
