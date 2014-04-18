package at.ecrit.eclipse.plugin.outputter.latex.internal;

import html.to.latex.exception.FatalErrorException;
import html.to.latex.parser.Parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import at.ecrit.document.model.outputconverter.AbstractOutputConverter;
import at.ecrit.eclipse.plugin.outputter.html.HTMLOutputConverter;

public class LatexOutputConverter extends AbstractOutputConverter {
	private final static String TABLE = "<table>";
	private final static String TABLE_END = "</table>";
	private final static String TABLE_HEADER = "<th>";
	private final static String TABLE_DATA = "<td>";
	
	@Override
	public String parse(String textile){
		// parse textile to html first
		HTMLOutputConverter htmlConverter = new HTMLOutputConverter();
		String htmlStyleText = htmlConverter.parse(textile);
		if (htmlStyleText.contains(TABLE)) {
			htmlStyleText = prepareTableForLatex(htmlStyleText);
		}
		System.out.println(htmlStyleText);
		
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
		
		return output;
	}
	
	private String prepareTableForLatex(String htmlText){
		StringBuilder sb = new StringBuilder();
		String[] tables = htmlText.split(TABLE_END);
		
		for (String tablePart : tables) {
			if (tablePart.contains(TABLE)) {
				String[] split = tablePart.split(TABLE);
				// add text etc. in front of the table
				if (split.length > 1) {
					sb.append(split[0]);
				}
				
				// add table with latexcols info
				String latexCols = countTableCols(split[1], TABLE_HEADER);
				if (latexCols.length() == 1) {
					latexCols = countTableCols(split[1], TABLE_DATA);
				}
				sb.append("<table latexcols='" + latexCols + "'>");
				sb.append(split[1]);
				sb.append(TABLE_END);
			} else {
				sb.append(tablePart);
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	private String countTableCols(String htmlString, String searchedPattern){
		Pattern pattern = Pattern.compile(searchedPattern);
		Matcher matcher = pattern.matcher(htmlString);
		
		String latexCols = "|";
		while (matcher.find()) {
			latexCols += "l|";
		}
		return latexCols;
	}
}
