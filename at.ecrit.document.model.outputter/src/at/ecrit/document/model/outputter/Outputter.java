package at.ecrit.document.model.outputter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import at.ecrit.document.model.ecritdocument.Document;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class Outputter {
	
	public static void processOutput(Document doc, Template template, File targetDirectory) {
		
		
		Map<String, Object> input = new HashMap<String, Object>();
		input.put("doc", doc);

		// Writer consoleWriter = new OutputStreamWriter(System.out);
		// try {
		// template.process(input, consoleWriter);
		// } catch (TemplateException | IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		try {
			File outputFile = new File(targetDirectory, "main.tex");
			FileWriter fileWriter = new FileWriter(outputFile);
			template.process(input, fileWriter);
			fileWriter.close();
			System.out.println("[DONE] Written to "
					+ outputFile.getAbsolutePath());
			
//			doc.generateDepictableItemPNGImages(targetDirectory.getAbsolutePath());
		} catch (IOException | TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
