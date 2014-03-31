package at.ecrit.document.model.internal;

import at.ecrit.document.model.DocumentFactory;

public class ElementDocumentation {
	
	private String description, precondition, postcondition;
	
	public ElementDocumentation(String description, String precondition, String postcondition){
		this.description = description;
		this.precondition = precondition;
		this.postcondition = postcondition;
	}
	
	public String getDescription(){
		if (description == null) {
			description = "";
		}
		return DocumentFactory.outputConverter.parse(description);
		// return (description != null) ? description : "";
	}
	
	public String getPostcondition(){
		if (postcondition == null) {
			postcondition = "";
		}
		return DocumentFactory.outputConverter.parse(postcondition);
		// return (postcondition != null) ? postcondition : "";
	}
	
	public String getPrecondition(){
		if (precondition == null) {
			precondition = "";
		}
		return DocumentFactory.outputConverter.parse(precondition);
		// return (precondition != null) ? precondition : "";
	}
}
