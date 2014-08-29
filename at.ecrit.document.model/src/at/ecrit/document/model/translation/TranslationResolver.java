package at.ecrit.document.model.translation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

public class TranslationResolver {
	private final String OSGI_BUNDLE_PROPS_DIR = "OSGI-INF" + File.separator + "l10n";
	private String defaultProperties = "bundle.properties";
	private Properties properties;
	
	public TranslationResolver(URI e4xmiURI){
		IPath p = new Path(e4xmiURI.devicePath());
		IPath projPath = p.removeLastSegments(1);
		IPath basePath = projPath.addTrailingSeparator().append(OSGI_BUNDLE_PROPS_DIR);
		File propertiesFile = getTranslationFile(null, basePath);
		
		if (propertiesFile != null) {
			try {
				properties = new Properties();
				FileInputStream fis = FileUtils.openInputStream(propertiesFile);
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public boolean translationAvailable(){
		if (properties == null) {
			return false;
		}
		return true;
	}
	
	/**
	 * Resolve the actual label value for the given key
	 * 
	 * @throws IllegalStateException
	 *             if properties file does not exist
	 * @param key
	 * @return found value or the key itself if it couldn't be found
	 */
	public String getValueFor(String key){
		if (properties == null) {
			throw new IllegalStateException("No properties for resolution available");
		}
		
		String property = properties.getProperty(key.replaceFirst("%", ""));
		if (property == null) {
			System.out.println("Property " + key + " not found");
			return key;
		}
		return property;
	}
	
	private File getTranslationFile(String fileName, IPath basePath){
		if (fileName == null) {
			fileName = getLanguageFilename();
		}
		
		IPath propFilePath = basePath.addTrailingSeparator().append(fileName);
		if (!propFilePath.toFile().exists()) {
			if (fileName.equals(defaultProperties)) {
				return null;
			} else {
				getTranslationFile(defaultProperties, basePath);
			}
		}
		return propFilePath.toFile();
	}
	
	private String getLanguageFilename(){
		Locale local = Locale.getDefault();
		
		String propFile;
		if (local.equals(Locale.ENGLISH)) {
			propFile = "bundle_en.properties";
		} else if (local.equals(Locale.GERMAN)) {
			propFile = "bundle_de.properties";
		} else if (local.equals(Locale.FRENCH)) {
			propFile = "bundle_fr.properties";
		} else {
			propFile = defaultProperties;
		}
		return propFile;
	}
}
