package at.ecrit.document.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.e4.ui.model.application.ui.MElementContainer;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ecrit.document.model.ecritdocument.ApplicationLayout;
import at.ecrit.document.model.ecritdocument.CommandStep;
import at.ecrit.document.model.ecritdocument.DirectStep;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.document.model.ecritdocument.EcritdocumentFactory;
import at.ecrit.document.model.ecritdocument.InitiatableItem;
import at.ecrit.document.model.ecritdocument.InitiatableItemType;
import at.ecrit.model.plugin.modelDocumentation.ElementDocumentation;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentation;

public class DocumentFactory {
	
	private static Log log = LogFactory.getLog(DocumentFactory.class);
	
	/**
	 * 
	 * @param appModelResource a  resource containing the Eclipse application model (<code>e4xmi</code>)
	 * @param ecritResource a resource containing the Ecrit extension model to the appModelResource (<code>ecritxmi</code>)
	 * @return
	 */
	public static Document createFromApplicationModel(Resource appModelResource, Resource ecritResource) {
		Document doc = EcritdocumentFactory.eINSTANCE.createDocument();
		MApplication app = (MApplication) appModelResource.getContents().get(0);
		
		ModelDocumentation md = (ModelDocumentation) ecritResource.getContents().get(0);
		
		setDocumentInformation(doc, app, md);
		collectApplicationLayout(doc, appModelResource, md);
		initCommandSteps(app, doc, md);
		populateStepsWithContributions(appModelResource, doc);

		return doc;
	}

	private static void collectApplicationLayout(Document doc, Resource appModelResource,
			ModelDocumentation md) {
		
		ApplicationLayout al = EcritdocumentFactory.eINSTANCE.createApplicationLayout();
		
		for (TreeIterator<EObject> i = appModelResource.getAllContents(); i.hasNext();) {
			EObject eObject = (EObject) i.next();
			if(eObject instanceof MPart) {
				al.getPart().add((MPart) eObject);
			} else if (eObject instanceof MPerspective) {
				DocumentedPerspective dp = EcritdocumentFactory.eINSTANCE.createDocumentedPerspective();
				MPerspective ps = (MPerspective) eObject;
				ElementDocumentation ed = md.getElementDocumentation().get(ps.getElementId());
				if(ed!=null) {
					dp.setDescription(ed.getDescription());
					dp.setPostcondition(ed.getPostcondition());
					dp.setPrecondition(ed.getPrecondition());
				}
				dp.setModelElement(ps);
				al.getPerspective().add(dp);
			} else if (eObject instanceof MWindow) {
				al.getWindow().add((MWindow) eObject);
			}
		}
		
		doc.setApplicationLayout(al);
		
	}

	private static void setDocumentInformation(Document doc, MApplication app,
			ModelDocumentation md) {
		ElementDocumentation el = md.getElementDocumentation().get(app.getElementId());
		if (el != null) {
			doc.setTitle(el.getDescription());
		} else {
			doc.setTitle(app.getElementId());
		}
		
	}

	private static void initCommandSteps(MApplication application, Document doc, ModelDocumentation md) {
		// get all commands, add them as CommandSteps
		List<MCommand> commands = application.getCommands();
		for (MCommand mCommand : commands) {
			CommandStep temp = EcritdocumentFactory.eINSTANCE
					.createCommandStep();
			temp.setCommand(mCommand);
			
			ElementDocumentation ed = md.getElementDocumentation().get(mCommand.getElementId());
			if(ed!=null) {
				temp.setDescription(ed.getDescription());
				temp.setPostcondition(ed.getPostcondition());
				temp.setPrecondition(ed.getPrecondition());
			}
			
			doc.getStep().add(temp);
		}
	}

	private static EObject previousObject = null;
	
	private static void populateStepsWithContributions(
			Resource appModelResource, Document doc) {

		
		for (TreeIterator<EObject> i = appModelResource.getAllContents(); i.hasNext();) {
			EObject eObject = (EObject) i.next();
			
			if (eObject instanceof MHandledItem) {
				MHandledItem mmi = (MHandledItem) eObject;
				MCommand command = mmi.getCommand();
				if (command == null) {
					log.warn("HandledItem without associated command found "+mmi);
					continue;
				}
				
				CommandStep cStep = doc.findOrCreateCommandStepByCommand(command);
				log.debug("Added "+mmi+" to "+cStep);
				
				InitiatableItem ii = EcritdocumentFactory.eINSTANCE.createInitiatableItem();
				ii.setItem(mmi);
				
				MElementContainer<?> parent = mmi.getParent();
				if(parent instanceof MMenu) {
					ii.setItemType(InitiatableItemType.MENU);
					ii.setContainingMenu((MMenu) parent);
					
					// find part contribution is associated to
					for (MPart part : doc.getApplicationLayout().getPart()) {
						if (part.getMenus().contains(parent)) ii.setContainingPart(part);
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
				log.debug("Added direct contribution "+dStep);
			}
			
			previousObject = eObject;
		}
	
	}
}
