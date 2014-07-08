package at.ecrit.document.model.methods;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.e4.ui.model.application.ui.menu.MHandledToolItem;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;

import at.ecrit.document.model.ecritdocument.InitiatableItem;

public class InitiatableItemMethods {
	
	private static HashMap<String, String> idLabelMap;
	
	@SuppressWarnings("restriction")
	public static Map<String, String> getLocationDescription(InitiatableItem ii){
		idLabelMap = new HashMap<String, String>();
		
		switch (ii.getItemType()) {
		case MENU:
			boolean hasContainingPart = (ii.getContainingPart() != null);
			boolean hasContainingMenu = (ii.getContainingMenu() != null);
			if (hasContainingPart) {
				String elementId = ii.getContainingPart().getElementId();
				String label = "Part: " + ii.getContainingPart().getLabel();
				idLabelMap.put(elementId, label);
			}
			
			if (hasContainingMenu) {
				String elementId = ii.getContainingMenu().getElementId();
				String label = ii.getContainingMenu().getLabel();
				if (label == null) {
					label = elementId;
				}
				idLabelMap.put(elementId, "Menu: " + label);
			}
			break;
		case TOOLBAR:
			MItem item = ii.getItem();
			String label = item.getLabel();
			if (label == null || label.isEmpty()) {
				if (item instanceof MHandledToolItem) {
					label = ((MHandledToolItem) item).getCommand().getCommandName();
				} else {
					label = "";
				}
			}
			idLabelMap.put(ii.getItem().getElementId(), "Toolbar " + label);
			
			break;
		default:
			idLabelMap.put(ii + "", "NOT YET DEFINED ITEM TYPE " + ii);
			break;
		}
		
		return idLabelMap;
	}
}
