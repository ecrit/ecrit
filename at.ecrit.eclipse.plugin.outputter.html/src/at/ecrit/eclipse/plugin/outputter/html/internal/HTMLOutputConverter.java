package at.ecrit.eclipse.plugin.outputter.html.internal;

import java.io.StringWriter;

import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder;

import at.ecrit.document.model.outputconverter.AbstractOutputConverter;

public class HTMLOutputConverter extends AbstractOutputConverter {
	
	@Override
	public String parse(String textile){
		StringWriter writer = new StringWriter();
		HtmlDocumentBuilder htmlDocBuilder = new HtmlDocumentBuilder(writer);
		htmlDocBuilder.setEmitAsDocument(false);
		
		parser.setBuilder(htmlDocBuilder);
		parser.parse(textile, false);
		
		String parserOutput = removeAutoCreatedParagraphTags(writer.toString());
		return parserOutput;
	}
	
	private String removeAutoCreatedParagraphTags(String parserOutput){
		if (parserOutput != null && !parserOutput.isEmpty()) {
			if (parserOutput.contains("<p>") && parserOutput.contains("</p>")) {
				int pStartTag = parserOutput.indexOf("<p>") + 3;
				int pEndTag = parserOutput.lastIndexOf("</p>");
				parserOutput = parserOutput.substring(pStartTag, pEndTag);
			}
		}
		return parserOutput;
	}
}
