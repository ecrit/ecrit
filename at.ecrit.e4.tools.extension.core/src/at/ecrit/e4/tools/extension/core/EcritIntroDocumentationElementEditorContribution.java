package at.ecrit.e4.tools.extension.core;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.e4.tools.emf.ui.common.AbstractElementEditorContribution;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import at.ecrit.e4.tools.extension.core.control.MapEntryEditorComposite;

public class EcritIntroDocumentationElementEditorContribution extends
		AbstractElementEditorContribution {
	
	public EcritIntroDocumentationElementEditorContribution(){
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public Class<?> getContributableTo(){
		return MApplication.class;
	}
	
	@Override
	public String getTabLabel(){
		return "About";
	}
	
	@Override
	public void createContributedEditorTab(Composite parent, EMFDataBindingContext context,
		final WritableValue master, final EditingDomain editingDomain, IProject project){
		
		Composite aboutComp =
			new MapEntryEditorComposite(parent, SWT.None, context, master, editingDomain, "About",
				Constants.PERSISTENT_STATE_ABOUT);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		aboutComp.setLayoutData(gd);
		
		Composite installComp =
			new MapEntryEditorComposite(parent, SWT.None, context, master, editingDomain,
				"Installation", Constants.PERSISTENT_STATE_INSTALL);
		installComp.setLayoutData(gd);
		
		Composite multiUser =
			new MapEntryEditorComposite(parent, SWT.None, context, master, editingDomain,
				"MultiUser", Constants.PERSISTENT_STATE_MULTIUSER, false);
		GridData gd_Btn = new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1);
		multiUser.setLayoutData(gd_Btn);
		
		Composite reqLoginComp =
			new MapEntryEditorComposite(parent, SWT.None, context, master, editingDomain,
				"RequiresLogin", Constants.PERSISTENT_STATE_REQUIRES_LOGIN, false);
		reqLoginComp.setLayoutData(gd_Btn);
	}
}
