package at.ecrit.eclipse.plugin.outputter.html;

import java.io.File;

import org.eclipse.core.runtime.IStatus;

import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.eclipse.plugin.extension.AbstractOutputter;

public class HTMLOutputter extends AbstractOutputter {

	@Override
	public String getOutputterLabel() {
		return "HTML Output";
	}

	@Override
	public IStatus performOutput(Document document, File outputLocation) {
		// TODO Auto-generated method stub
		return null;
	}

}
