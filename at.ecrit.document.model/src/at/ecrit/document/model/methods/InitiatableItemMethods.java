package at.ecrit.document.model.methods;

import at.ecrit.document.model.ecritdocument.InitiatableItem;

public class InitiatableItemMethods {

	public static String getLocationDescription(InitiatableItem ii) {
		StringBuilder sb = new StringBuilder();
		
		boolean oneWindowOnly; // consider if we have only one window
		
		switch (ii.getItemType()) {
		case MENU:
			boolean hasContainingPart = (ii.getContainingPart()!=null);
			boolean hasContainingMenu = (ii.getContainingMenu()!=null);
			if(hasContainingPart) sb.append("Part "+ii.getContainingPart().getElementId()+" | ");
			if(hasContainingMenu) sb.append("Menu "+ii.getContainingMenu().getElementId()+ " | ");
			sb.append(ii.getItem().getLabel());
			break;
		case TOOLBAR:
			sb.append("Toolbar LEFT/RIGHT/UP/DOWN?? "+ii.getItem().getLocalizedLabel());
			break;
		default:
			break;
		}
		
		return sb.toString();
	}

}
