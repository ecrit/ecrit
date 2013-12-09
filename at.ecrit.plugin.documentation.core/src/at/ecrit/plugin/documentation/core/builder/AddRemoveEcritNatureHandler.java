package at.ecrit.plugin.documentation.core.builder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;

import at.ecrit.plugin.documentation.core.constants.StringConstants;
import at.ecrit.plugin.documentation.core.helper.Helper;

public class AddRemoveEcritNatureHandler extends AbstractHandler {

	private ISelection selection;

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		//
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element)
							.getAdapter(IProject.class);
				}
				if (project != null) {
					try {
						toggleNature(project);
					} catch (CoreException e) {
						// TODO log something
						throw new ExecutionException("Failed to toggle nature",
								e);
					}
				}
			}
		}

		return null;
	}

	/**
	 * Toggles sample nature on a project
	 * 
	 * @param project
	 *            to have sample nature added or removed
	 */
	private void toggleNature(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();

		for (int i = 0; i < natures.length; ++i) {
			if (EcritNature.NATURE_ID.equals(natures[i])) {
				// Remove the nature
				String[] newNatures = new String[natures.length - 1];
				System.arraycopy(natures, 0, newNatures, 0, i);
				System.arraycopy(natures, i + 1, newNatures, i, natures.length
						- i - 1);
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
				if (project.exists(Helper.getEcritModelFileForProject(project)
						.getProjectRelativePath())) {
					boolean ret = MessageDialog
							.openQuestion(
									Display.getCurrent().getActiveShell(),
									"Ecrit documentation file found",
									"Do you want to remove the existing Ecrit documentation file?");
					if(ret) {
						IFile ecritFile = Helper.getEcritModelFileForProject(project);
						ecritFile.delete(true, null);
						project.refreshLocal(IResource.DEPTH_ONE, null);
					}
				}
				return;
			}
		}

		// Add the nature
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = EcritNature.NATURE_ID;
		description.setNatureIds(newNatures);
		project.setDescription(description, null);
		initializeEcritDocumentationFile(project);
	}

	private void initializeEcritDocumentationFile(IProject project)
			throws CoreException {

		IFile modelFile = Helper.getModelFile(project);
		IFile ecritModelFile = Helper.getEcritModelFileForProject(project);

		InputStream initialEcritFile;
		try {
			initialEcritFile = Helper.getInitialFileInputStream(project,
					modelFile);
			ecritModelFile.create(initialEcritFile, true, null);
		} catch (IOException e) {
			e.printStackTrace();
			CoreException exc = new CoreException(Status.CANCEL_STATUS);
			exc.addSuppressed(e);
			throw exc;
		}

		project.refreshLocal(IResource.DEPTH_ONE, null);

	}

}