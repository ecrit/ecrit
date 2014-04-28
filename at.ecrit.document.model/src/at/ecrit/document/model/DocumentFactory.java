package at.ecrit.document.model;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.internal.workbench.swt.E4Application;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ecrit.document.model.ecritdocument.ApplicationLayout;
import at.ecrit.document.model.ecritdocument.ApplicationProperties;
import at.ecrit.document.model.ecritdocument.CommandStep;
import at.ecrit.document.model.ecritdocument.DirectStep;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedElement;
import at.ecrit.document.model.ecritdocument.DocumentedPart;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.document.model.ecritdocument.DocumentedWindow;
import at.ecrit.document.model.ecritdocument.EcritdocumentFactory;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import at.ecrit.document.model.ecritdocument.InitiatableItem;
import at.ecrit.document.model.ecritdocument.InitiatableItemType;
import at.ecrit.document.model.internal.AppModelHelper;
import at.ecrit.document.model.internal.ApplicationDocumentation;
import at.ecrit.document.model.internal.ElementDocumentation;
import at.ecrit.document.model.internal.PerspectiveStackDocumentation;
import at.ecrit.document.model.outputconverter.AbstractOutputConverter;
import at.ecrit.document.model.outputconverter.NullOutputConverter;

public class DocumentFactory {
	
	public static AbstractOutputConverter outputConverter;
	protected static IEclipseContext applicationContext;
	protected static MApplication application;
	private static EModelService modelService;
	
	private static Log log = LogFactory.getLog(DocumentFactory.class);
	
	/**
	 * 
	 * @param appModelResource
	 *            a resource containing the Eclipse application model ( <code>e4xmi</code>)
	 * @param ecritResource
	 *            a resource containing the Ecrit extension model to the appModelResource (
	 *            <code>ecritxmi</code>)
	 * @return
	 */
	public static Document createFromApplicationModel(Resource appModelResource,
		AbstractOutputConverter outputConverter){
		if (outputConverter != null) {
			DocumentFactory.outputConverter = outputConverter;
		} else {
			DocumentFactory.outputConverter = new NullOutputConverter();
		}
		Document doc = EcritdocumentFactory.eINSTANCE.createDocument();
		
		application = (MApplication) appModelResource.getContents().get(0);
		applicationContext = E4Application.createDefaultContext();
		application.setContext(applicationContext);
		applicationContext.set(MApplication.class, application);
		E4Application.initializeServices(application);
		modelService = application.getContext().get(EModelService.class);
		
		AppModelHelper.initAppModel(modelService, appModelResource);
		
		setDocumentInformation(doc, application);
		collectApplicationLayout(doc, appModelResource);
		initCommandSteps(application, doc);
		populateStepsWithContributions(appModelResource, doc);
		
		return doc;
	}
	
	private static void collectApplicationLayout(Document doc, Resource appModelResource){
		
		ApplicationLayout al = EcritdocumentFactory.eINSTANCE.createApplicationLayout();
		MApplication application = (MApplication) appModelResource.getContents().get(0);
		
		// Collect all part elements
		List<MPart> parts = modelService.findElements(application, null, MPart.class, null);
		for (MPart mPart : parts) {
			findOrCreatePartInApplicationLayout(al, mPart);
		}
		
		// Collect all window elements
		List<MWindow> windows = modelService.findElements(application, null, MWindow.class, null);
		for (MWindow mWindow : windows) {
			DocumentedWindow dw = EcritdocumentFactory.eINSTANCE.createDocumentedWindow();
			dw.setModelElement(mWindow);
			addElementDocumentation(dw, mWindow);
			al.getWindow().add(dw);
		}
		
		// Collect all perspective elements
		List<MPerspective> perspectives =
			modelService.findElements(application, null, MPerspective.class, null);
		for (MPerspective perspective : perspectives) {
			DocumentedPerspective dp = EcritdocumentFactory.eINSTANCE.createDocumentedPerspective();
			dp.setModelElement(perspective);
			addElementDocumentation(dp, perspective);
			al.getPerspective().add(dp);
			
			// collect all contained parts
			List<MPart> partsE = modelService.findElements(perspective, null, MPart.class, null);
			for (MPart mPart : partsE) {
				DocumentedPart dpart = findOrCreatePartInApplicationLayout(al, mPart);
				dpart.getContainedInPerspective().add(perspective);
				dp.getContainedParts().add(dpart);
			}
		}
		
		doc.setApplicationLayout(al);
	}
	
	/**
	 * Find or create a DocumentedPart entry in the ApplicationLayout
	 * 
	 * @param al
	 * @param mPart
	 * @param md
	 * @return
	 */
	private static DocumentedPart findOrCreatePartInApplicationLayout(ApplicationLayout al,
		MPart mPart){
		DocumentedPart documentedPart = null;
		
		for (DocumentedPart dp : al.getPart()) {
			if (dp.getModelElement().getElementId().equals(mPart.getElementId()))
				documentedPart = dp;
		}
		
		if (documentedPart == null) {
			documentedPart =
				(DocumentedPart) EcoreUtil.create(EcritdocumentPackage.Literals.DOCUMENTED_PART);
			documentedPart.setModelElement(mPart);
			addElementDocumentation(documentedPart, mPart);
			al.getPart().add(documentedPart);
		}
		
		return documentedPart;
	}
	
	private static void addElementDocumentation(DocumentedElement de, MApplicationElement ma){
		if (ma.getElementId() == null || ma.getElementId().length() == 0) {
			System.out.println("No element id for " + ma);
			return;
		}
		ElementDocumentation ed = AppModelHelper.getElementDocumentation(ma.getElementId());
		de.setDescription(ed.getDescription());
		de.setPostcondition(ed.getPostcondition());
		de.setPrecondition(ed.getPrecondition());
	}
	
	private static void setDocumentInformation(Document doc, MApplication app){
		ElementDocumentation el = AppModelHelper.getElementDocumentation(app.getElementId());
		ApplicationDocumentation al = AppModelHelper.getApplicationDocumentation();
		
		ApplicationProperties appProperties =
			EcritdocumentFactory.eINSTANCE.createApplicationProperties();
		appProperties.setAbout(al.getAbout());
		appProperties.setRequiresInstallation(al.getInstall());
		appProperties.setHasConceptOfMultipleUsers(al.getMultiUser());
		appProperties.setRequiresLogin(al.getRequiresLogin());
		appProperties.setPerspectiveSwitcher(loadPerspectiveSwitchInformation());
		doc.setApplicationProperties(appProperties);
		
		if (el.getDescription() != null) {
			doc.setTitle(el.getDescription());
		} else {
			doc.setTitle(app.getElementId());
		}
		doc.setCreationDate(new Date());
	}
	
	/**
	 * load perspective switching information
	 * 
	 * @return string with info from perspective switch tab or empty string if no information was
	 *         found.
	 */
	private static String loadPerspectiveSwitchInformation(){
		// Collect all perspective stack elements
		List<MPerspectiveStack> perspectiveStacks =
			modelService.findElements(application, null, MPerspectiveStack.class, null);
		StringBuilder sb = new StringBuilder();
		int psElements = perspectiveStacks.size();
		
		for (MPerspectiveStack perspectiveStack : perspectiveStacks) {
			if (perspectiveStack.getElementId() == null) {
				log.error("Skipping perspectiveStack due to null ID " + perspectiveStack);
				continue;
			}
			
			PerspectiveStackDocumentation psDocu =
				AppModelHelper.getPerspectiveStackDocumentation(perspectiveStack.getElementId());
			if (psElements <= 1) {
				sb.append(psDocu.getPerspectiveSwitcher());
			} else {
				sb.append(perspectiveStack.getElementId() + ":\n");
				sb.append(psDocu.getPerspectiveSwitcher());
				sb.append("\n\n");
			}
		}
		return sb.toString();
	}
	
	private static void initCommandSteps(MApplication application, Document doc){
		// get all commands, add them as CommandSteps
		List<MCommand> commands = application.getCommands();
		for (MCommand mCommand : commands) {
			CommandStep temp = EcritdocumentFactory.eINSTANCE.createCommandStep();
			temp.setCommand(mCommand);
			
			ElementDocumentation ed =
				AppModelHelper.getElementDocumentation(mCommand.getElementId());
			temp.setDescription(ed.getDescription());
			temp.setPostcondition(ed.getPostcondition());
			temp.setPrecondition(ed.getPrecondition());
			
			doc.getStep().add(temp);
		}
	}
	
	private static EObject previousObject = null;
	
	private static void populateStepsWithContributions(Resource appModelResource, Document doc){
		
		for (TreeIterator<EObject> i = appModelResource.getAllContents(); i.hasNext();) {
			EObject eObject = (EObject) i.next();
			
			if (eObject instanceof MHandledItem) {
				MHandledItem mmi = (MHandledItem) eObject;
				MCommand command = mmi.getCommand();
				if (command == null) {
					log.warn("HandledItem without associated command found " + mmi);
					continue;
				}
				
				CommandStep cStep = doc.findOrCreateCommandStepByCommand(command);
				log.debug("Added " + mmi + " to " + cStep);
				
				InitiatableItem ii = EcritdocumentFactory.eINSTANCE.createInitiatableItem();
				ii.setItem(mmi);
				
				MElementContainer<?> parent = mmi.getParent();
				if (parent instanceof MMenu) {
					ii.setItemType(InitiatableItemType.MENU);
					ii.setContainingMenu((MMenu) parent);
					
					// find part contribution is associated to
					for (DocumentedPart part : doc.getApplicationLayout().getPart()) {
						if (part.getModelElement().getMenus().contains(parent)) {
							ii.setContainingPart(part.getModelElement());
							part.getInitiatableItems().add(ii);
						}
					}
				} else {
					ii.setItemType(InitiatableItemType.TOOLBAR);
					ii.setContainingToolbar((MToolBar) parent);
				}
				
				cStep.getInitiatableBy().add(ii);
				
			} else if (eObject instanceof MItem && eObject instanceof MContribution) {
				// Direct[x]Item
				DirectStep dStep = EcritdocumentFactory.eINSTANCE.createDirectStep();
				dStep.setContribution((MContribution) eObject);
				log.debug("Added direct contribution " + dStep);
			}
			
			previousObject = eObject;
		}
		
	}
}
