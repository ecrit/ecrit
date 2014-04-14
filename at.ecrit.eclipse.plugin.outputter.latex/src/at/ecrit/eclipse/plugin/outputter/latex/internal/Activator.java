package at.ecrit.eclipse.plugin.outputter.latex.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import at.ecrit.eclipse.plugin.outputter.latex.LatexOutputter;
import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

public class Activator implements BundleActivator {
	
	public static final String PLUGIN_ID = "at.ecrit.eclipse.plugin.outputter.latex";
	
	private static Configuration freemarkerConfig = null;
	
	@Override
	public void start(BundleContext context) throws Exception{
		// Initialize Freemarker
		freemarkerConfig = new Configuration();
		freemarkerConfig.setClassForTemplateLoading(LatexOutputter.class, "/rsc/templates");
		freemarkerConfig.setIncompatibleImprovements(new Version(2, 3, 20));
		freemarkerConfig.setDefaultEncoding("UTF-8");
		freemarkerConfig.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
	}
	
	@Override
	public void stop(BundleContext context) throws Exception{
		// TODO Auto-generated method stub
		
	}
	
	public static Configuration getFreemarkerConfig(){
		return freemarkerConfig;
	}
	
}
