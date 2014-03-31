package at.ecrit.document.model.outputconverter;

public class NullOutputConverter extends AbstractOutputConverter {
	
	@Override
	public String parse(String textile){
		// might use NoOpDocumentBuilder to get rid of textile specific elements
		return textile;
	}
	
}
