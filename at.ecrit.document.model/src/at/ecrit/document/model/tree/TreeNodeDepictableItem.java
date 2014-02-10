package at.ecrit.document.model.tree;

import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.swt.graphics.Point;

public class TreeNodeDepictableItem {

	private MApplicationElement applicationElement;
	
	private int ratio[];
	
	public Point height;
	public Point width;

	public TreeNodeDepictableItem(MApplicationElement modelElement, int[] ratio) {
		this.applicationElement = modelElement;
		this.ratio = ratio;
	}

	public void setApplicationElement(MApplicationElement applicationElement) {
		this.applicationElement = applicationElement;
	}
	
	public MApplicationElement getApplicationElement() {
		return applicationElement;
	}
	
	public int[] getRatio() {
		return ratio;
	}
}
