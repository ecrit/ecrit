package at.ecrit.document.model.internal;

public class ElementDocumentation {

	private String description, precondition, postcondition;
	
	public ElementDocumentation(String description, String precondition, String postcondition) {
		this.description = description;
		this.precondition = precondition;
		this.postcondition = postcondition;
	}

	public String getDescription() {
		return (description!=null) ? description : "";
	}
	
	public String getPostcondition() {
		return (postcondition!=null) ? postcondition : "";
	}
	
	public String getPrecondition() {
		return (precondition!=null) ? precondition : "";
	}
}
