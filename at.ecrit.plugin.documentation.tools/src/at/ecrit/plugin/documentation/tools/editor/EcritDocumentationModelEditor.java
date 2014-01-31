/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 ******************************************************************************/
package at.ecrit.plugin.documentation.tools.editor;

import java.io.IOException;

import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.e4.tools.compat.parts.DIEditorPart;
import org.eclipse.e4.tools.emf.ui.common.IModelResource.ModelListener;
import org.eclipse.e4.tools.emf.ui.internal.wbm.ApplicationModelEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;

import at.ecrit.plugin.documentation.core.constants.StringConstants;
import at.ecrit.plugin.documentation.core.helper.Helper;
import at.ecrit.plugin.documentation.tools.elementEditor.EcritElementEditorContribution;

@SuppressWarnings("restriction")
public class EcritDocumentationModelEditor extends
		DIEditorPart<ApplicationModelEditor> {
//	private UndoAction undoAction;
//	private RedoAction redoAction;
	
	private IFile ecritXmiFile;
	
	private ModelListener listener = new ModelListener() {

		public void dirtyChanged() {
			firePropertyChange(PROP_DIRTY);
		}

		public void commandStackChanged() {

		}
	};

	public EcritDocumentationModelEditor() {
		super(ApplicationModelEditor.class, COPY | CUT | PASTE);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		// We need to fetch the application model file
		// hence we need to re-write the FileEditorInput
		ecritXmiFile =  ((FileEditorInput) input).getFile();		

		Workspace ws = (Workspace) ecritXmiFile.getWorkspace();
		IPath e4xmiFilePath = new Path(ecritXmiFile.getFullPath().toString()
				.replace(StringConstants.ECRIT_PLUGIN_DOC_XMLFILE_POSTFIX, StringConstants.E4XMI));
		IFile e4xmiFile = (IFile) ws.newResource(e4xmiFilePath, IResource.FILE);

		FileEditorInput e4XmiFEInput = new FileEditorInput(e4xmiFile);
		
		// initializes the context
		super.init(site, e4XmiFEInput);
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		setPartName(getEditorInput().getName());
	}

	@Override
	protected void makeActions() {
		super.makeActions();
//		undoAction = new UndoAction(getComponent().getModelProvider());
//		undoAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_UNDO);
//
//		redoAction = new RedoAction(getComponent().getModelProvider());
//		redoAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_REDO);

//		getEditorSite().getActionBars().setGlobalActionHandler(
//				ActionFactory.UNDO.getId(), undoAction);
//		getEditorSite().getActionBars().setGlobalActionHandler(
//				ActionFactory.REDO.getId(), redoAction);
	}

	@Override
	public void dispose() {
//		if (undoAction != null)
//			undoAction.dispose();
//
//		if (redoAction != null)
//			redoAction.dispose();

		if (listener != null && getComponent() != null
				&& getComponent().getModelProvider() != null)
			getComponent().getModelProvider().removeModelListener(listener);

		super.dispose();
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		// BUG if the editor is opened on an .e4xmi file this
		// doSave method is not being called; hence the changes are not stored!
		
		super.doSave(monitor);
		
		try {
			Resource res = EcritElementEditorContribution.getBundleDocumentation().eResource();
			res.save(Helper.getResourceSaveOptions());
			System.out.println("Saved "+ecritXmiFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public IFile getEcritXmiFile() {
		return ecritXmiFile;
	}
}
