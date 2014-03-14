package at.ecrit.document.model.methods;

import org.eclipse.e4.ui.model.application.commands.MCommand;

import at.ecrit.document.model.ecritdocument.CommandStep;
import at.ecrit.document.model.ecritdocument.EcritdocumentFactory;
import at.ecrit.document.model.ecritdocument.Step;
import at.ecrit.document.model.ecritdocument.impl.DocumentImpl;

public class DocumentMethods {
	public static CommandStep findOrCreateCommandStepByCommand(MCommand command, DocumentImpl document) {
		if (command == null)
			throw new IllegalArgumentException();
		
		// try to find existing
		for (Step stepEntry : document.getStep()) {
			if (stepEntry instanceof CommandStep) {
				CommandStep se = (CommandStep) stepEntry;
				MCommand com = se.getCommand();
				if (com != null) {
					if (com.getElementId().equalsIgnoreCase(
							command.getElementId()))
						return se;
				}
			}
		}
		
		// create new
		CommandStep newstep = EcritdocumentFactory.eINSTANCE.createCommandStep();
		newstep.setCommand(command);
		document.getStep().add(newstep);
		return newstep;
	}
}
