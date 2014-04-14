package at.ecrit.eclipse.plugin.outputter.latex.internal;

import html.to.latex.exception.FatalErrorException;
import html.to.latex.parser.Parser;
import at.ecrit.document.model.outputconverter.AbstractOutputConverter;
import at.ecrit.eclipse.plugin.outputter.html.internal.HTMLOutputConverter;

public class LatexOutputConverter extends AbstractOutputConverter {
	
	@Override
	public String parse(String textile){
		// parse textile to html first
		HTMLOutputConverter htmlConverter = new HTMLOutputConverter();
		String htmlStyleText = htmlConverter.parse(textile);
		
		// now use html2latex parser to convert to latex
		String output = "";
		try {
			Parser latexParser = new Parser(htmlStyleText);
			latexParser.parse();
			output = latexParser.getParserHandler().getConverter().getWriter().getOutput();
		} catch (FatalErrorException e) {
			// TODO log error
			e.printStackTrace();
		}
		System.out.println(output);
		
		return output;
	}
}
