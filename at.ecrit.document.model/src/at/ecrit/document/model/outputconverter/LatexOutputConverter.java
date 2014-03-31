package at.ecrit.document.model.outputconverter;

import java.io.StringWriter;

import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder;

public class LatexOutputConverter extends AbstractOutputConverter {
	
	@Override
	public String parse(String textile){
		// TODO convert to latex format
		StringWriter writer = new StringWriter();
		
		HtmlDocumentBuilder htmlDocBuilder = new HtmlDocumentBuilder(writer);
		htmlDocBuilder.setEmitAsDocument(false);
		
		parser.setBuilder(htmlDocBuilder);
		parser.parse(textile, false);
		
		return writer.toString();
	}
	
}
