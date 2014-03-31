package at.ecrit.eclipse.plugin.outputter.html;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;

import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.outputter.common.DepictionImageGenerator;
import at.ecrit.eclipse.plugin.outputter.html.internal.Activator;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class HTMLOutputter extends AbstractOutputter {
	
	@Override
	public String getOutputterLabel(){
		return "HTML Output";
	}
	
	@Override
	public IStatus performOutput(Document document, File outputLocation, Resource appModelResource){
		IStatus ret = Status.OK_STATUS;
		try {
			Template template = Activator.getFreemarkerConfig().getTemplate("htmlTemplate.ftl");
			
			System.out.println("OUTPUT from " + appModelResource);
			
			if (outputLocation.exists() && outputLocation.isDirectory()) {
				DepictionImageGenerator depictionImageGenerator =
					new DepictionImageGenerator(document, outputLocation, appModelResource, 400,
						250);
				depictionImageGenerator.generate();
				ret = generateHTMLDocument(document, template, outputLocation);
			} else {
				return new Status(Status.ERROR, Activator.PLUGIN_ID, "Invalid Output Location ["
					+ outputLocation + "]");
			}
			
		} catch (IOException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, "Exception in output", e);
		}
		
		return ret;
	}
	
	private IStatus generateHTMLDocument(Document doc, Template template, File targetDirectory){
		
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
			File outputFile = new File(targetDirectory, "index.html");
			FileWriter fileWriter = new FileWriter(outputFile);
			template.process(input, fileWriter);
			fileWriter.close();
			
			return new Status(Status.OK, Activator.PLUGIN_ID, "[DONE] Written to "
				+ outputFile.getAbsolutePath());
			
		} catch (IOException | TemplateException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, "Exception in output", e);
		}
		
	}
	
}
