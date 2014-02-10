package at.ecrit.document.model.internal;

import java.util.Map;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class AppModelHelper {

	private static MApplication application;
	private static EModelService modelService;

	public static void initAppModel(MApplication application,
			EModelService modelService) {
		AppModelHelper.application = application;
		AppModelHelper.modelService = modelService;
	}

	public static ElementDocumentation getElementDocumentation(String elementId) {
		if(elementId==null || elementId.length()==0) throw new IllegalArgumentException();
		
		MApplicationElement mae = modelService.find(elementId, application);
		if(mae==null) {
			System.out.println("not found "+elementId);
			return new ElementDocumentation("", "", "");
		}
		
		Map<String, String> persistedState = mae.getPersistedState();
		return new ElementDocumentation(
				persistedState.get(Constants.PERSISTENT_STATE_DESCRIPTION),
				persistedState.get(Constants.PERSISTENT_STATE_PRECONDITION),
				persistedState.get(Constants.PERSISTENT_STATE_POSTCONDITION));
	}

}
