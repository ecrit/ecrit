package at.ecrit.document.model.outputconverter;

import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;

public abstract class AbstractOutputConverter {
	protected MarkupParser parser;
	
	public AbstractOutputConverter(){
		parser = new MarkupParser(new TextileLanguage());
	}
	
	public abstract String parse(String textile);
}
