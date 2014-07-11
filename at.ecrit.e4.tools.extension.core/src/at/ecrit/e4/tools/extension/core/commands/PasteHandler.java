package at.ecrit.e4.tools.extension.core.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class PasteHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException{
		Control focusedCtrl = Display.getCurrent().getFocusControl();
		
		if (focusedCtrl instanceof StyledText) {
			StyledText styledText = (StyledText) focusedCtrl;
			styledText.paste();
			styledText.redraw();
		}
		return null;
	}
	
}
