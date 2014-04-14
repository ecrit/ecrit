package at.ecrit.eclipse.plugin.outputter.latex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.Bundle;

import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.outputconverter.AbstractOutputConverter;
import at.ecrit.eclipse.plugin.extension.AbstractOutputter;
import at.ecrit.eclipse.plugin.outputter.common.DepictionImageGenerator;
import at.ecrit.eclipse.plugin.outputter.latex.internal.Activator;
import at.ecrit.eclipse.plugin.outputter.latex.internal.LatexOutputConverter;
import at.ecrit.eclipse.plugin.outputter.latex.internal.TemplateConstants;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class LatexOutputter extends AbstractOutputter {
	private static final String TEMPLATE_LOCATION = "/rsc/templates";
	
	@Override
	public String getOutputterLabel(){
		return "Latex Output";
	}
	
	@Override
	public IStatus performOutput(Document document, File outputLocation, Resource appModelResource){
		IStatus ret = Status.OK_STATUS;
		try {
			Template template =
				Activator.getFreemarkerConfig().getTemplate(TemplateConstants.LATEX_TEMPLATE);
			
			System.out.println("OUTPUT from " + appModelResource);
			
			if (outputLocation.exists() && outputLocation.isDirectory()) {
				DepictionImageGenerator depictionImageGenerator =
					new DepictionImageGenerator(document, outputLocation, appModelResource, 400,
						250);
				depictionImageGenerator.generate();
				copyResourceFilesToOutputLocation(outputLocation);
				ret = generateLatexDocument(document, template, outputLocation);
			} else {
				return new Status(Status.ERROR, Activator.PLUGIN_ID, "Invalid Output Location ["
					+ outputLocation + "]");
			}
			
		} catch (IOException | InstantiationException | IllegalAccessException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, "Exception in output", e);
		}
		
		return ret;
	}
	
	private void copyResourceFilesToOutputLocation(File outputLocation) throws IOException{
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		Enumeration<URL> rscEntries = bundle.findEntries(TEMPLATE_LOCATION, "*", true);
		while (rscEntries.hasMoreElements()) {
			URL url = (URL) rscEntries.nextElement();
			
			// skip the template files and directories
			if (url.getFile().contains("ftl") || url.getFile().endsWith("/"))
				continue;
			
			InputStream in = url.openStream();
			File outputFile =
				new File(outputLocation, url.getFile().replaceFirst(TEMPLATE_LOCATION, ""));
			FileUtils.copyInputStreamToFile(in, outputFile);
		}
	}
	
	private IStatus generateLatexDocument(Document doc, Template template, File targetDirectory)
		throws InstantiationException, IllegalAccessException{
		Map<String, Object> input = new HashMap<String, Object>();
		input.put("doc", doc);
		
		try {
			File outputFile = new File(targetDirectory, "main.tex");
			FileWriter fileWriter = new FileWriter(outputFile);
			template.process(input, fileWriter);
			fileWriter.close();
			
			return new Status(Status.OK, Activator.PLUGIN_ID, "[DONE] Written to "
				+ outputFile.getAbsolutePath());
			
		} catch (IOException | TemplateException e) {
			return new Status(Status.ERROR, Activator.PLUGIN_ID, "Exception in output", e);
		}
	}
	
	@Override
	public AbstractOutputConverter getOutputConverter(){
		return new LatexOutputConverter();
	}
}
