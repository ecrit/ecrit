package at.ecrit.e4.tools.extension.core;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.e4.tools.emf.ui.common.AbstractElementEditorContribution;
import org.eclipse.e4.ui.model.application.MApplicationElement;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import at.ecrit.e4.tools.extension.core.control.MapEntryEditorComposite;

public class EcritDocumentationElementEditorContribution extends
		AbstractElementEditorContribution {

	public EcritDocumentationElementEditorContribution() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<?> getContributableTo() {
		return MApplicationElement.class;
	}

	@Override
	public String getTabLabel() {
		return "Documentation";
	}

	@Override
	public void createContributedEditorTab(Composite parent,
			EMFDataBindingContext context, final WritableValue master,
			final EditingDomain editingDomain, IProject project) {

		Composite descEdComp = new MapEntryEditorComposite(parent, SWT.None,
				context, master, editingDomain, "Description",
				Constants.PERSISTENT_STATE_DESCRIPTION);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		descEdComp.setLayoutData(gd);

		Composite preCondComp = new MapEntryEditorComposite(parent, SWT.None,
				context, master, editingDomain, "Precondition",
				Constants.PERSISTENT_STATE_PRECONDITION);
		preCondComp.setLayoutData(gd);

		Composite postCondComp = new MapEntryEditorComposite(parent, SWT.None,
				context, master, editingDomain, "Postcondition",
				Constants.PERSISTENT_STATE_POSTCONDITION);
		postCondComp.setLayoutData(gd);
	}

}
