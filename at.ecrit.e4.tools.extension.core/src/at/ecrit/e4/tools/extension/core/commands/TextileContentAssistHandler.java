package at.ecrit.e4.tools.extension.core.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import at.ecrit.e4.tools.extension.core.control.MapEntryEditorComposite;

public class TextileContentAssistHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException{
		Composite focusedComposite = Display.getCurrent().getFocusControl().getParent();
		
		if (focusedComposite instanceof MapEntryEditorComposite) {
			MapEntryEditorComposite meec = (MapEntryEditorComposite) focusedComposite;
			if (meec.viewer != null) {
				SourceViewer textileViewer = (SourceViewer) meec.viewer;
				textileViewer.doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
			}
		}
		return null;
	}
}
