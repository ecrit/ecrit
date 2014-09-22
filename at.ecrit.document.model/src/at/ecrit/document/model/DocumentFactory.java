package at.ecrit.document.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.internal.workbench.swt.E4Application;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.commands.MBindingTable;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.commands.MHandler;
import org.eclipse.e4.ui.model.application.commands.MKeyBinding;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimElement;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.model.application.ui.basic.impl.PartImpl;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuSeparator;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarSeparator;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuContributionImpl;
import org.eclipse.e4.ui.model.application.ui.menu.impl.ToolBarContributionImpl;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ecrit.document.model.ecritdocument.ApplicationLayout;
import at.ecrit.document.model.ecritdocument.ApplicationProperties;
import at.ecrit.document.model.ecritdocument.CommandStep;
import at.ecrit.document.model.ecritdocument.DirectStep;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedElement;
import at.ecrit.document.model.ecritdocument.DocumentedMenu;
import at.ecrit.document.model.ecritdocument.DocumentedPart;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.document.model.ecritdocument.DocumentedToolBar;
import at.ecrit.document.model.ecritdocument.DocumentedTrim;
import at.ecrit.document.model.ecritdocument.DocumentedTrimBar;
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
import at.ecrit.document.model.translation.TranslationResolver;

public class DocumentFactory {
	
	private static final String ID_SEPARATOR = ".";
	public static AbstractOutputConverter outputConverter;
	protected static IEclipseContext applicationContext;
	protected static MApplication application;
	private static EModelService modelService;
	private static URI uri;
	private static HashMap<MCommand, MKeyBinding> keyBindings;
	
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
		uri = appModelResource.getURI();
		applicationContext = E4Application.createDefaultContext();
		application.setContext(applicationContext);
		applicationContext.set(MApplication.class, application);
		E4Application.initializeServices(application);
		modelService = application.getContext().get(EModelService.class);
		
		AppModelHelper.initAppModel(modelService, appModelResource);
		applyLabelMappingAsRequired(appModelResource);
		
		setDocumentInformation(doc, application);
		collectApplicationLayout(doc, appModelResource);
		initBindings(application);
		initCommandSteps(application, doc);
		populateStepsWithContributions(appModelResource, doc);
		
		return doc;
	}
	
	private static void applyLabelMappingAsRequired(Resource appModelResource){
		TranslationResolver translator = new TranslationResolver(uri);
		
		for (TreeIterator<EObject> i = appModelResource.getAllContents(); i.hasNext();) {
			EObject eObject = (EObject) i.next();
			
			if (eObject instanceof MUILabel) {
				MUILabel muiLabel = (MUILabel) eObject;
				String label = muiLabel.getLabel();
				if (label != null && label.startsWith("%")) {
					muiLabel.setLabel(translator.getValueFor(label));
				}
			}
		}
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
			
			// Collect windows mainmenu items
			MMenu mainMenu = mWindow.getMainMenu();
			if (mainMenu != null) {
				DocumentedMenu dMainMenu = findOrCreateMenuInApplicationLayout(al, mainMenu);
				
				// add menus to documented main menu
				List<MMenuElement> menuElements = mainMenu.getChildren();
				for (MMenuElement mMenuElement : menuElements) {
					if (!(mMenuElement instanceof MMenuSeparator)) {
						findOrCreateElementId(mMenuElement);
						dMainMenu.getContainedMenuItems().add(mMenuElement);
					}
				}
				
				// set connection between the Window and it's MainMenu
				dMainMenu.getContainedInWindow().add(mWindow);
				dw.getContainedMenus().add(dMainMenu);
				
				// Collect trimBar elements (Toolbar and ToolControl)
				if (mWindow instanceof MTrimmedWindow) {
					MTrimmedWindow trimWindow = (MTrimmedWindow) mWindow;
					
					for (MTrimBar mTrimBar : trimWindow.getTrimBars()) {
						DocumentedTrimBar dTrimBar =
							findOrCreateTrimBarsInApplication(al, mTrimBar);
						
						List<MTrimElement> trimElements = mTrimBar.getChildren();
						for (MTrimElement mTrimElement : trimElements) {
							// if its a toolbar
							if (mTrimElement instanceof MToolBar) {
								MToolBar mToolBar = (MToolBar) mTrimElement;
								dTrimBar.getContainedToolBars().add(mToolBar);
								
								for (MToolBarElement mToolBarElement : mToolBar.getChildren()) {
									DocumentedToolBar dToolBar =
										findOrCreateToolBarInApplication(al, mToolBarElement);
									dToolBar.getContainedInToolBar().add(mToolBar);
									dToolBar.getContainedInTrimBar().add(mTrimBar);
									dTrimBar.getContainedToolBarElements().add(dToolBar);
								}
							}
							// everything apart form toolbar separators
							else if (!(mTrimElement instanceof MToolBarSeparator)) {
								DocumentedTrim dTrimElement =
									findOrcreateTrimElementInApplication(al, mTrimElement);
								dTrimElement.getContainedInTrimBar().add(mTrimBar);
								dTrimBar.getContainedTrimElements().add(dTrimElement);
							}
						}
						dTrimBar.getContainedInWindow().add(mWindow);
						dw.getContainedTrimBars().add(dTrimBar);
					}
				}
			}
		}
		
		// Collect all perspective elements
		List<MPerspective> perspectives =
			modelService.findElements(application, null, MPerspective.class, null);
		if (perspectives.isEmpty()) {
			perspectives.add(generateDefaultPerspective(application));
		}
		
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
				
				List<MMenu> menuE = mPart.getMenus();
				for (MMenu mMenu : menuE) {
					DocumentedMenu dmenu = findOrCreateMenuInApplicationLayout(al, mMenu);
					dmenu.getContainedInPart().add(mPart);
					dpart.getContainedMenus().add(dmenu);
				}
			}
		}
		
		doc.setApplicationLayout(al);
	}
	
	private static MPerspective generateDefaultPerspective(MApplication application){
		List<MPartSashContainer> partSashContainers =
			modelService.findElements(application, null, MPartSashContainer.class, null);
		
		// figure out the top window
		MWindow topWindow;
		if (partSashContainers.size() < 1) {
			List<MWindow> windows =
				modelService.findElements(application, null, MWindow.class, null);
			topWindow = windows.get(0);
		} else {
			topWindow = modelService.getTopLevelWindowFor(partSashContainers.get(0));
		}
		
		MPerspectiveStack perspectiveStack = null;
		if (!topWindow.getChildren().isEmpty()) {
			MWindowElement winElement = topWindow.getChildren().get(0);
			if (winElement instanceof MPerspectiveStack) {
				perspectiveStack = (MPerspectiveStack) winElement;
			}
		}
		
		// create dummy perspectiveStack if needed
		if (perspectiveStack == null) {
			perspectiveStack = modelService.createModelElement(MPerspectiveStack.class);
			perspectiveStack.setElementId("dummy.perspective.stack");
			topWindow.getChildren().add(perspectiveStack);
		}
		
		// generate perspective and add it to perspectiveStack
		// add parent partSashContainer as child
		MPerspective perspective = modelService.createModelElement(MPerspective.class);
		perspective.setElementId("Perspective");
		perspective.setLabel(" ");
		perspectiveStack.getChildren().add(perspective);
		
		for (MPartSashContainer mpsContainer : partSashContainers) {
			if (mpsContainer.getParent().getClass().getSimpleName().contains("TrimmedWindow")) {
				perspective.getChildren().add(mpsContainer);
			}
		}
		
		// in case there are simple shared parts without partstack or partsashcontainer
		// create dummy objects which hold shared parts
		if (perspective.getChildren().isEmpty()) {
			List<MUIElement> sharedElements = topWindow.getSharedElements();
			MPartStack partStack = modelService.createModelElement(MPartStack.class);
			perspective.getChildren().add(partStack);
			
			List<MPart> partsToAdd = new ArrayList<MPart>();
			for (MUIElement shared : sharedElements) {
				if (shared instanceof PartImpl) {
					partsToAdd.add((MPart) shared);
				}
			}
			partStack.getChildren().addAll(partsToAdd);
		}
		return perspective;
	}
	
	private static DocumentedTrim findOrcreateTrimElementInApplication(ApplicationLayout al,
		MTrimElement mTrimElement){
		DocumentedTrim documentedTrim = null;
		
		for (DocumentedTrim dt : al.getTrim()) {
			String trimElementId = findOrCreateElementId(mTrimElement);
			if ((dt.getModelElement().getElementId() != null)
				&& dt.getModelElement().getElementId().equals(trimElementId)) {
				documentedTrim = dt;
			}
		}
		
		if (documentedTrim == null) {
			documentedTrim =
				(DocumentedTrim) EcoreUtil.create(EcritdocumentPackage.Literals.DOCUMENTED_TRIM);
			documentedTrim.setModelElement(mTrimElement);
			addElementDocumentation(documentedTrim, mTrimElement);
			al.getTrim().add(documentedTrim);
		}
		return documentedTrim;
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
			String partElementId = findOrCreateElementId(mPart);
			if ((dp.getModelElement().getElementId() != null)
				&& dp.getModelElement().getElementId().equals(partElementId))
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
	
	private static DocumentedMenu findOrCreateMenuInApplicationLayout(ApplicationLayout al,
		MMenu mMenu){
		DocumentedMenu documentedMenu = null;
		
		for (DocumentedMenu dm : al.getMenu()) {
			String menuElementId = findOrCreateElementId(mMenu);
			if ((dm.getModelElement().getElementId() != null)
				&& dm.getModelElement().getElementId().equals(menuElementId))
				documentedMenu = dm;
		}
		
		if (documentedMenu == null) {
			documentedMenu =
				(DocumentedMenu) EcoreUtil.create(EcritdocumentPackage.Literals.DOCUMENTED_MENU);
			documentedMenu.setModelElement(mMenu);
			addElementDocumentation(documentedMenu, mMenu);
			al.getMenu().add(documentedMenu);
		}
		
		return documentedMenu;
	}
	
	private static DocumentedTrimBar findOrCreateTrimBarsInApplication(ApplicationLayout al,
		MTrimBar mTrimBar){
		DocumentedTrimBar documentedTrimBar = null;
		
		for (DocumentedTrimBar dtb : al.getTrimBar()) {
			String trimElementId = findOrCreateElementId(mTrimBar);
			if ((dtb.getModelElement().getElementId() != null)
				&& dtb.getModelElement().getElementId().equals(trimElementId)) {
				documentedTrimBar = dtb;
			}
		}
		
		if (documentedTrimBar == null) {
			documentedTrimBar =
				(DocumentedTrimBar) EcoreUtil
					.create(EcritdocumentPackage.Literals.DOCUMENTED_TRIM_BAR);
			documentedTrimBar.setModelElement(mTrimBar);
			addElementDocumentation(documentedTrimBar, mTrimBar);
			al.getTrimBar().add(documentedTrimBar);
			
		}
		return documentedTrimBar;
	}
	
	private static DocumentedToolBar findOrCreateToolBarInApplication(ApplicationLayout al,
		MToolBarElement mToolBarElement){
		DocumentedToolBar documentedToolBar = null;
		
		for (DocumentedToolBar dtb : al.getToolBar()) {
			String toolBarElementId = findOrCreateElementId(mToolBarElement);
			if ((dtb.getModelElement().getElementId() != null)
				&& dtb.getModelElement().getElementId().equals(toolBarElementId)) {
				documentedToolBar = dtb;
			}
		}
		
		if (documentedToolBar == null) {
			documentedToolBar =
				(DocumentedToolBar) EcoreUtil
					.create(EcritdocumentPackage.Literals.DOCUMENTED_TOOL_BAR);
			documentedToolBar.setModelElement(mToolBarElement);
			addElementDocumentation(documentedToolBar, mToolBarElement);
			al.getToolBar().add(documentedToolBar);
		}
		return documentedToolBar;
	}
	
	private static void addElementDocumentation(DocumentedElement de, MApplicationElement ma){
		String elementId = findOrCreateElementId(ma);
		if (elementId == null || elementId.isEmpty()) {
			System.out.println("No element id for " + ma);
			return;
		}
		ElementDocumentation ed = AppModelHelper.getElementDocumentation(elementId);
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
		appProperties.setUserRolesDescription(al.getUserRolesDesc());
		appProperties.setRequiresLogin(al.getRequiresLogin());
		appProperties.setPerspectiveSwitcher(loadPerspectiveSwitchInformation());
		appProperties.setFaq(al.getFAQ());
		
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
			findOrCreateElementId(perspectiveStack);
			
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
				AppModelHelper.getElementDocumentation(findOrCreateElementId(mCommand));
			temp.setDescription(ed.getDescription());
			temp.setPostcondition(ed.getPostcondition());
			temp.setPrecondition(ed.getPrecondition());
			
			if (keyBindings.containsKey(mCommand)) {
				temp.setKeybinding(keyBindings.get(mCommand));
			}
			doc.getStep().add(temp);
		}
	}
	
	private static void initBindings(MApplication application){
		keyBindings = new HashMap<MCommand, MKeyBinding>();
		
		List<MBindingTable> tables = application.getBindingTables();
		for (MBindingTable mbTable : tables) {
			findOrCreateElementId(mbTable);
			
			for (MKeyBinding mkBinding : mbTable.getBindings()) {
				findOrCreateElementId(mkBinding);
				if (mkBinding.getCommand() == null) {
					log.error("Skipping keybinding due to null command reference "
						+ mkBinding.getElementId());
					continue;
				}
				keyBindings.put(mkBinding.getCommand(), mkBinding);
				
				System.out.println("Command: " + mkBinding.getCommand().getCommandName()
					+ " -- KeySeq: " + mkBinding.getKeySequence());
			}
		}
	}
	
	private static EObject previousObject = null;
	
	private static void populateStepsWithContributions(Resource appModelResource, Document doc){
		for (TreeIterator<EObject> i = appModelResource.getAllContents(); i.hasNext();) {
			EObject eObject = (EObject) i.next();
			if (eObject instanceof MHandledItem) {
				MHandledItem mmi = (MHandledItem) eObject;
				findOrCreateElementId(mmi);
				MCommand command = mmi.getCommand();
				
				if (command == null) {
					log.warn("HandledItem without associated command found " + mmi);
					continue;
				}
				CommandStep cStep = doc.findOrCreateCommandStepByCommand(command);
				log.debug("Added " + mmi + " to " + cStep);
				
				InitiatableItem ii = EcritdocumentFactory.eINSTANCE.createInitiatableItem();
				ii.setItem(mmi);
				ii = setMenusPartsAndToolbar(ii, mmi.getParent(), doc);
				
				cStep.getInitiatableBy().add(ii);
				
			} else if (eObject instanceof MItem && eObject instanceof MContribution) {
				// Direct[x]Item
				MItem mi = (MItem) eObject;
				findOrCreateElementId(mi);
				
				// find belonging command
				String handlerId = ((MContribution) eObject).getContributionURI();
				MCommand cmd = null;
				for (MHandler mHandler : application.getHandlers()) {
					if (handlerId.equalsIgnoreCase(mHandler.getContributionURI())) {
						cmd = mHandler.getCommand();
					}
				}
				if (cmd == null) {
					log.warn("DirectItem without associated command found " + mi);
					continue;
				}
				
				InitiatableItem ii = EcritdocumentFactory.eINSTANCE.createInitiatableItem();
				ii.setItem(mi);
				ii = setMenusPartsAndToolbar(ii, mi.getParent(), doc);
				
				DirectStep dStep = EcritdocumentFactory.eINSTANCE.createDirectStep();
				dStep.setContribution((MContribution) eObject);
				log.debug("Added direct contribution " + dStep);
				dStep.getInitiatableBy().add(ii);
				
				CommandStep cStep = doc.findOrCreateCommandStepByCommand(cmd);
				log.debug("Added " + mi + " to " + cStep);
				cStep.getInitiatableBy().add(ii);
			}
			previousObject = eObject;
		}
		
	}
	
	private static InitiatableItem setMenusPartsAndToolbar(InitiatableItem ii,
		MElementContainer<?> parent, Document doc){
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
		} else if (parent instanceof MenuContributionImpl
			|| parent instanceof ToolBarContributionImpl) {
			// ignore
		} else {
			ii.setItemType(InitiatableItemType.TOOLBAR);
			ii.setContainingToolbar((MToolBar) parent);
		}
		return ii;
	}
	
	/**
	 * gets the set id or generates and sets (temporary) an id for this element
	 * 
	 * @param mAppElement
	 *            the element to get the id from
	 * @return the defined elementId or a auto-created elementId
	 * 
	 */
	private static String findOrCreateElementId(MApplicationElement mAppElement){
		String elementId = mAppElement.getElementId();
		
		if (elementId == null || elementId.isEmpty()) {
			int counter = 0;
			StringBuilder sb = new StringBuilder();
			
			sb.append(uri.segment(uri.segments().length - 2));
			sb.append(ID_SEPARATOR);
			sb.append(mAppElement.getClass().getSimpleName().toLowerCase());
			sb.append(ID_SEPARATOR);
			sb.append(getDescribingName(mAppElement));
			sb.append(counter + "");
			
			List<? extends MApplicationElement> existingId =
				modelService.findElements(application, sb.toString(), mAppElement.getClass(), null);
			while (existingId.size() > 0) {
				counter++;
				int lastDot = sb.lastIndexOf(ID_SEPARATOR);
				sb.replace(lastDot + 1, sb.length(), counter + "");
				
				// check if the id is already taken by some element
				existingId =
					modelService.findElements(application, sb.toString(), mAppElement.getClass(),
						null);
			}
			
			elementId = sb.toString();
			mAppElement.setElementId(elementId);
		}
		return elementId;
	}
	
	/**
	 * searches for a label, referred command or contribution in the MApplicationElement
	 * 
	 * @param mAppElement
	 *            the element to evaluate
	 * @return label, name of the refering command, contribution class name or an empty string if
	 *         nothing was found
	 */
	private static String getDescribingName(MApplicationElement mAppElement){
		String label = null;
		
		if (mAppElement instanceof MCommand) {
			label = getCommandNameSave(((MCommand) mAppElement));
		} else if (mAppElement instanceof MKeyBinding) {
			label = getCommandNameSave(((MKeyBinding) mAppElement).getCommand());
		} else if (mAppElement instanceof MHandler) {
			label = getCommandNameSave(((MHandler) mAppElement).getCommand());
		} else if (mAppElement instanceof MHandledItem) {
			label = getCommandNameSave(((MHandledItem) mAppElement).getCommand());
		} else if (mAppElement instanceof MUILabel) {
			label = ((MUILabel) mAppElement).getLabel();
		}
		
		if (label == null || label.isEmpty()) {
			String contrURI = mAppElement.getContributorURI();
			if (contrURI != null && !contrURI.isEmpty()) {
				int lastDot = contrURI.lastIndexOf(".");
				label = contrURI.substring(lastDot + 1, contrURI.length()).toLowerCase();
			} else {
				return "";
			}
		}
		label = label.replace("%", "");
		label = label.replace(" ", "") + ID_SEPARATOR;
		return label.toLowerCase();
	}
	
	private static String getCommandNameSave(MCommand cmd){
		if (cmd != null) {
			return cmd.getCommandName();
		} else {
			return "";
		}
	}
}
