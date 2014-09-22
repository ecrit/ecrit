package at.ecrit.e4.tools.extension.core;

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.e4.tools.emf.ui.common.AbstractElementEditorContribution;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

import at.ecrit.e4.tools.extension.core.control.MapEntryEditorComposite;

public class EcritFAQDocumentationElementEditorContribution extends
		AbstractElementEditorContribution {
	
	@Override
	public Class<?> getContributableTo(){
		return MApplication.class;
	}
	
	@Override
	public String getTabLabel(){
		return "FAQ";
	}
	
	@Override
	public void createContributedEditorTab(Composite parent, EMFDataBindingContext context,
		WritableValue master, EditingDomain editingDomain, IProject project){
		
		URI uri = editingDomain.getResourceSet().getResources().get(0).getURI();
		IFile file = project.getFile(uri.lastSegment());
		IPath projPath = file.getParent().getLocation();
		
		Composite faqComp =
			new MapEntryEditorComposite(parent, SWT.None, context, master, editingDomain, "FAQ",
				Constants.PERSISTENT_STATE_FAQ, projPath.toString(), new String[] {
					"*.textile", "*.txt"
				});
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		faqComp.setLayoutData(gd);
	}
	
}
