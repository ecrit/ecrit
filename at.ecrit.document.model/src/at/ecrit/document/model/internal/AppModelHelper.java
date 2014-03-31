package at.ecrit.document.model.internal;

import java.util.Map;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class AppModelHelper {
	
	private static MApplication application;
	private static EModelService modelService;
	private static Resource appModelResource;
	
	public static void initAppModel(EModelService modelService, Resource appModelResource){
		AppModelHelper.application = (MApplication) appModelResource.getContents().get(0);
		AppModelHelper.appModelResource = appModelResource;
		AppModelHelper.modelService = modelService;
	}
	
	public static ElementDocumentation getElementDocumentation(String elementId){
		if (elementId == null || elementId.length() == 0)
			throw new IllegalArgumentException();
		
		// modelService only finds MUIElements not, all MApplicationElements
		MApplicationElement mae = modelService.find(elementId, application);
		
		if (mae == null) {
			System.out.println("Reverting to iterate search for " + elementId);
			
			for (TreeIterator<EObject> i = appModelResource.getAllContents(); i.hasNext();) {
				EObject object = i.next();
				if (object instanceof MApplicationElement) {
					MApplicationElement maeTemp = (MApplicationElement) object;
					if (maeTemp.getElementId().equalsIgnoreCase(elementId)) {
						mae = maeTemp;
					}
				}
			}
			
			if (mae == null) {
				System.out.println("Could not find element " + elementId);
				return new ElementDocumentation("", "", "");
			}
			
		}
		
		Map<String, String> persistedState = mae.getPersistedState();
		return new ElementDocumentation(persistedState.get(Constants.PERSISTENT_STATE_DESCRIPTION),
			persistedState.get(Constants.PERSISTENT_STATE_PRECONDITION),
			persistedState.get(Constants.PERSISTENT_STATE_POSTCONDITION));
	}
	
	public static ApplicationDocumentation getApplicationDocumentation(){
		if (application == null)
			throw new IllegalArgumentException();
		
		Map<String, String> persistedState = application.getPersistedState();
		return new ApplicationDocumentation(persistedState.get(Constants.PERSISTENT_STATE_ABOUT),
			persistedState.get(Constants.PERSISTENT_STATE_INSTALL),
			persistedState.get(Constants.PERSISTENT_STATE_MULTIUSER),
			persistedState.get(Constants.PERSISTENT_STATE_REQUIRES_LOGIN));
	}
}
