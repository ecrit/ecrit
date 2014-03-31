package at.ecrit.document.model.outputconverter;

import java.io.StringWriter;

import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder;

public class HTMLOutputConverter extends AbstractOutputConverter {
	
	@Override
	public String parse(String textile){
		StringWriter writer = new StringWriter();
		HtmlDocumentBuilder htmlDocBuilder = new HtmlDocumentBuilder(writer);
		htmlDocBuilder.setEmitAsDocument(false);
		
		parser.setBuilder(htmlDocBuilder);
		parser.parse(textile, false);
		
		return writer.toString();
	}
	
}
