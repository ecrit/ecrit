package at.ecrit.eclipse.plugin.internal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.internal.workbench.swt.E4Application;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.fragment.MModelFragment;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.pde.internal.core.FeatureModelManager;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.ifeature.IFeatureModel;
import org.eclipse.pde.internal.core.ifeature.IFeaturePlugin;
import org.osgi.framework.Bundle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ProductProcessor {
	private static final String ATTR_NAME = "name";
	private static final String ATTR_USE_FEATURES = "useFeatures";
	private static final String ATTR_ID = "id";
	private static final String TAG_FEATURES = "features";
	private static final String NODE_FEATURE = "feature";
	private static final String TAG_PLUGINS = "plugins";
	private static final String NODE_PLUGIN = "plugin";
	
	private static final String E4XMI_EXTENSION = ".e4xmi";
	
	private File productFile;
	private String productName;
	private String appModelPath;
	
	private boolean featureBased;
	private List<String> featureIds;
	private List<String> pluginIds;
	private List<MModelFragment> modelFragments;
	
	public ProductProcessor(URI uri){
		readBasicProductInformation(uri);
	}
	
	public URI getApplicationModelUri(){
		IPath path = new Path(appModelPath);
		File e4xmi = path.toFile();
		return URI.createURI(e4xmi.toURI().toString());
	}
	
	/**
	 * collect the basic informations from the product file
	 * 
	 * @param uri
	 *            location of the product file
	 */
	private void readBasicProductInformation(URI uri){
		try {
			featureIds = new ArrayList<String>();
			pluginIds = new ArrayList<String>();
			featureBased = false;
			productFile = new File(uri.toFileString());
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(productFile);
			// not essential but recommended
			doc.getDocumentElement().normalize();
			
			productName = doc.getDocumentElement().getAttribute(ATTR_NAME);
			System.out.println("Reading product info from " + productName + " ...");
			
			// get all feature-/plugin-ids
			String useFeatures = doc.getDocumentElement().getAttribute(ATTR_USE_FEATURES);
			if (useFeatures.equals("true")) {
				featureBased = true;
				featureIds.addAll(loadIdListOf(doc, TAG_FEATURES, NODE_FEATURE));
			} else {
				pluginIds.addAll(loadIdListOf(doc, TAG_PLUGINS, NODE_PLUGIN));
			}
			System.out.println("... is feature base: " + useFeatures);
			
			// try to find respective main application model
			appModelPath = ProductExtensionPoint.getContributedApplicationXMI(productName);
			if (appModelPath.isEmpty()) {
				appModelPath = inspectDirectoryForApplicationE4XMI(productFile.getParentFile());
			}
			System.out.println("... ApplicationModel (location): " + appModelPath);
			System.out.println("... FINISHED reading!");
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * loads list of all found id attributes inside of a tags node {@code <plugins> 
	 * <plugin id="at.medevit.ecrit.pharmacy_at.application">
	 * </plugins>
	 * }
	 * 
	 * @param doc
	 *            the document to read from
	 * @param elemTagName
	 *            (i.e. plugins)
	 * @param nodeName
	 *            the node we are looking for (i.e. plugin)
	 * @return the id attribute of the node (id)
	 */
	private List<String> loadIdListOf(Document doc, String elemTagName, String nodeName){
		List<String> idList = new ArrayList<String>();
		
		NodeList list = doc.getDocumentElement().getElementsByTagName(elemTagName);
		NodeList childNodes = list.item(0).getChildNodes();
		
		for (int pIdx = 0; pIdx < childNodes.getLength(); pIdx++) {
			Node node = childNodes.item(pIdx);
			
			if (node.getNodeName().equals(nodeName)) {
				Element elem = (Element) node;
				idList.add(elem.getAttribute(ATTR_ID));
			}
		}
		return idList;
	}
	
	public void mergeApplicationWithFragments(){
		modelFragments = new ArrayList<MModelFragment>();
		modelFragments.addAll(FragmentExtensionPoint.getContributedFragments(productFile
			.getParentFile()));
		
		if (featureBased) {
			modelFragments.addAll(loadFragmentsFeatureBased());
		} else {
			modelFragments.addAll(loadFragmentsPluginBased());
		}
		mergeFragments();
	}
	
	@SuppressWarnings("restriction")
	private void mergeFragments(){
		URI uri = getApplicationModelUri();
		
		Resource appModelResource = Activator.getResourceSet().getResource(uri, true);
		MApplication application = (MApplication) appModelResource.getContents().get(0);
		IEclipseContext applicationContext = E4Application.createDefaultContext();
		application.setContext(applicationContext);
		applicationContext.set(MApplication.class, application);
		E4Application.initializeServices(application);
		application.getContext().get(EModelService.class);
		
		for (MModelFragment fragment : modelFragments) {
			fragment.merge(application);
		}
	}
	
	private List<MModelFragment> loadFragmentsPluginBased(){
		List<MModelFragment> mFragments = new ArrayList<MModelFragment>();
		
		for (String id : pluginIds) {
			Bundle plugin = Platform.getBundle(id);
			if (plugin != null) {
				String location = plugin.getLocation();
				location = location.replace("reference:file:/", "");
				File pluginFile = new File(location);
				
				mFragments.addAll(FragmentExtensionPoint.getContributedFragments(pluginFile));
			}
		}
		System.out.println("Found [" + mFragments.size() + "] fragments");
		return mFragments;
	}
	
	private List<MModelFragment> loadFragmentsFeatureBased(){
		FeatureModelManager manager = PDECore.getDefault().getFeatureModelManager();
		
		for (String fId : featureIds) {
			IFeatureModel fModel = manager.findFeatureModel(fId);
			
			if (fModel != null) {
				for (IFeaturePlugin plugin : fModel.getFeature().getPlugins()) {
					if (!pluginIds.contains(plugin.getId())) {
						pluginIds.add(plugin.getId());
					}
				}
			}
		}
		return loadFragmentsPluginBased();
	}
	
	/**
	 * searches an application model definition in the given directory
	 * 
	 * @param parent
	 * @return
	 */
	private String inspectDirectoryForApplicationE4XMI(File parent){
		if (!parent.exists() || !parent.isDirectory()) {
			return "";
		}
		
		try {
			File[] files = parent.listFiles();
			for (File file : files) {
				if (file.getName().endsWith(E4XMI_EXTENSION)) {
					BufferedReader bReader = new BufferedReader(new FileReader(file));
					String line;
					int counter = 0;
					
					while ((line = bReader.readLine()) != null && counter < 3) {
						if (line.startsWith("<application:Application")) {
							return file.getAbsolutePath();
						}
						counter++;
					}
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public boolean isFeatureBased(){
		return featureBased;
	}
}
