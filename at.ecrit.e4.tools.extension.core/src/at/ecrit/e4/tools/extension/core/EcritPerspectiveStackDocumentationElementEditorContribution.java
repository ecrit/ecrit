package at.ecrit.e4.tools.extension.core;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.e4.tools.emf.ui.common.AbstractElementEditorContribution;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import at.ecrit.e4.tools.extension.core.control.MapEntryEditorComposite;

public class EcritPerspectiveStackDocumentationElementEditorContribution extends
		AbstractElementEditorContribution {
	
	public EcritPerspectiveStackDocumentationElementEditorContribution(){
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Class<?> getContributableTo(){
		return MPerspectiveStack.class;
	}
	
	@Override
	public String getTabLabel(){
		return "Perspective Switcher";
	}
	
	@Override
	public void createContributedEditorTab(Composite parent, EMFDataBindingContext context,
		WritableValue master, EditingDomain editingDomain, IProject project){
		
		// MApplication application =
		// (MApplication) editingDomain.getResourceSet().getResources().get(0).getContents()
		// .get(0);
		// List<MPerspective> perspectives =
		// modelService.findElements(application, null, MPerspective.class, null);
		
		Composite perspectiveSwitchComp =
			new MapEntryEditorComposite(parent, SWT.None, context, master, editingDomain,
				"PerspectiveSwitch", Constants.PERSISTENT_STATE_PERSPECTIVE_SWITCH);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		perspectiveSwitchComp.setLayoutData(gd);
	}
	
}
