package at.ecrit.e4.tools.extension.core.assistance;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TextileTagTracker {
	private String[] tag = new String[] {
		"p. ", "pre. ", "bc. ", "bq. ", "div. ", "h1. ", "h2. ", "h3. ", "h4. ", "h5. ", "h6. ",
		"###. ", "# ", "## ", "* ", "** ", "*txt*", "**txt**", "++txt++", "--txt--", "_txt_",
		"__txt__", "--", "++", "^^", "~~", "??citation??", "%span%", "@code@", "!image.png!",
		"|column|", "\"txt\":url"
	};
	
	private String[] tagDescription = new String[] {
		"p. - Paragraph", "pre. - Pre-formatted text", "bc. - Block code", "bq. - Block quote",
		"div. - Divisions", "h1. - Heading 1", "h2. - Heading 2", "h3. - Heading 3",
		"h4. - Heading 4", "h5. - Heading 5", "h6. - Heading 6", "###. - a comment block",
		"# - List (numeric)", "## - List (level 2, numeric)", "* - List (bullet)",
		"** - List (level 2, bullet)", "* - *strong*", "** - **bold**", "++ - ++bigger++",
		"-- - --smaller--", "_ - _emphasis_", "__ - __italic__", "- -deleted-", "+ - +inserted+",
		"^ - ^superscript^", "~ - ~subscript~", "?? - ??citation??", "% - %span%", "@ - @code@",
		"! - !image.png!", "| - |table_col1|table_col2|",
		"\" - \"Text to display\":http://example.com"
	};
	
	private List<String> tagList;
	private HashMap<String, String> tagMap;
	
	public TextileTagTracker(){
		tagList = Arrays.asList(tag);
		initTagMap();
	}
	
	public Map<String, String> suggest(String token){
		Map<String, String> suggestions = new HashMap<String, String>();
		
		for (Iterator<String> i = tagMap.keySet().iterator(); i.hasNext();) {
			String currTag = (String) i.next();
			if (currTag.startsWith(token)) {
				suggestions.put(currTag, tagMap.get(currTag));
			}
		}
		Map<String, String> sortSuggestionMap = new TreeMap<String, String>(suggestions);
		return sortSuggestionMap;
	}
	
	private void initTagMap(){
		tagMap = new HashMap<String, String>();
		
		for (int i = 0; i < tag.length; i++) {
			tagMap.put(tag[i], tagDescription[i]);
		}
	}
}
