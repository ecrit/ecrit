package at.ecrit.document.model.outputter;

import java.util.Locale;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;

public class Activator implements BundleActivator {

	private static Configuration freemarkerConfig = null;
	
	@Override
	public void start(BundleContext context) throws Exception {
		// Initialize Freemarker
		freemarkerConfig = new Configuration();
		freemarkerConfig.setClassForTemplateLoading(Outputter.class, "/templates");
		freemarkerConfig.setIncompatibleImprovements(new Version(2, 3, 20));
		freemarkerConfig.setDefaultEncoding("UTF-8");
		freemarkerConfig.setLocale(Locale.US);
		freemarkerConfig.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
	}

	public static Configuration getFreemarkerConfig() {
		return freemarkerConfig;
	}
}
