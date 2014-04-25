package at.ecrit.document.model.internal;

import at.ecrit.document.model.DocumentFactory;

public class PerspectiveStackDocumentation {
	
	private String perspectiveSwitcher;
	
	public PerspectiveStackDocumentation(String perspectiveSwitcher){
		this.perspectiveSwitcher = perspectiveSwitcher;
	}
	
	public String getPerspectiveSwitcher(){
		if (perspectiveSwitcher == null) {
			perspectiveSwitcher = "";
		}
		return DocumentFactory.outputConverter.parse(perspectiveSwitcher);
	}
}
