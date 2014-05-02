package at.ecrit.document.model.methods;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.e4.ui.model.application.ui.menu.impl.HandledMenuItemImpl;

import at.ecrit.document.model.ecritdocument.InitiatableItem;

public class InitiatableItemMethods {
	
	private static HashMap<String, String> idLabelMap;
	
	@SuppressWarnings("restriction")
	public static Map<String, String> getLocationDescription(InitiatableItem ii){
		idLabelMap = new HashMap<String, String>();
		boolean oneWindowOnly; // consider if we have only one window
		
		switch (ii.getItemType()) {
		case MENU:
			boolean hasContainingPart = (ii.getContainingPart() != null);
			boolean hasContainingMenu = (ii.getContainingMenu() != null);
			if (hasContainingPart) {
				String elementId = ii.getContainingPart().getElementId();
				String label = "Part " + ii.getContainingPart().getLabel();
				idLabelMap.put(elementId, label);
			}
			
			if (hasContainingMenu) {
				String elementId = ii.getContainingMenu().getElementId();
				String label = ii.getContainingMenu().getLabel();
				if (label == null) {
					label = elementId;
				}
				idLabelMap.put(elementId, "Menu " + label);
			}
			
			HandledMenuItemImpl mmi = (HandledMenuItemImpl) ii.getItem();
			String elementId = mmi.getCommand().getElementId();
			String label = "Command " + mmi.getCommand().getCommandName();
			idLabelMap.put(elementId, label);
			
			break;
		case TOOLBAR:
			idLabelMap.put(ii.getItem().getElementId(), "Toolbar LEFT/RIGHT/UP/DOWN?? "
				+ ii.getItem().getLocalizedLabel());
			break;
		default:
			idLabelMap.put(ii + "", "NOT YET DEFINED ITEM TYPE " + ii);
			break;
		}
		
		return idLabelMap;
	}
}
