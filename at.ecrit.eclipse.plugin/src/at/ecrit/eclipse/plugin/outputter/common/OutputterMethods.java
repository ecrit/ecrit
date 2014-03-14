package at.ecrit.eclipse.plugin.outputter.common;

import java.io.File;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.Point;

import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.eclipse.plugin.outputter.depiction.TreeNode;

public class OutputterMethods {

	public static void generateDepictionImages(Document document,
			File outputLocation, Resource appModelResource, int width,
			int height) {

		// generate images for perspectives
		for (DocumentedPerspective perspective : document
				.getApplicationLayout().getPerspective()) {

			createDepictionImageForPerspective(perspective.getModelElement(),
					appModelResource, outputLocation, width, height);

		}
	}

	private static void createDepictionImageForPerspective(
			MPerspective modelElement, Resource appModelResource,
			File outputLocation, int width, int height) {

		String outputFileName = outputLocation.getAbsolutePath()
				+ File.separator + modelElement.getElementId() + ".png";

		System.out.println("[PERSPECTIVE]=======" + outputFileName);

		// Display display = new Display();
		// Image image = new Image(display, width, height);
		// GC gc = new GC(image);

		TreeNode<MUIElement> tree = generateUITreeForPerspective(appModelResource, modelElement);
		
		tree.setVertexOrigin(new Point(0,0));
		tree.setVertexBoundary(new Point(width, height));
		
		for(TreeNode<MUIElement> node : tree.getTreeTraverser().preOrderTraversal(tree)) {
			List<TreeNode<MUIElement>> children = node.getChildren();
			
			if(node.getReference() instanceof MPerspective) {
				for (int i = 0; i < children.size(); i++) {
					TreeNode<MUIElement> child = children.get(i);
					
					float y = (node.getVertexBoundary().y/children.size())*i;
					float y1 = (node.getVertexBoundary().y/children.size()*(i+1));

					child.setVertexOrigin(new Point(node.getVertexOrigin().x, (int) y));
					child.setVertexBoundary(new Point(node.getVertexBoundary().x, (int) y1));
				}
			}


			
			System.out.println(node.getLevel()+": "+node.getReference().getElementId()+" "+node.getVertexOrigin()+"-"+node.getVertexBoundary());
		}
		

		// ImageLoader loader = new ImageLoader();
		// loader.data = new ImageData[] { image.getImageData() };
		// loader.save(outputFileName, SWT.IMAGE_PNG);
		//
		// gc.dispose();
		// image.dispose();
		// display.dispose();
	}

	private static TreeNode<MUIElement> generateUITreeForPerspective(
			Resource appModelResource, MPerspective modelElement) {
		TreeNode<MUIElement> tree = null;
		for (TreeIterator<EObject> i = appModelResource.getAllContents(); i
				.hasNext();) {
			EObject eObject = (EObject) i.next();
			if (eObject instanceof MPerspective) {
				MPerspective perspective = (MPerspective) eObject;
				if (perspective.equals(modelElement)) {
					tree = new TreeNode<MUIElement>(perspective);
				}
			} else if (tree != null
					&& (eObject instanceof MPartSashContainer
							|| eObject instanceof MPlaceholder || eObject instanceof MPart)) {
				MUIElement muie;
				TreeNode<MUIElement> node;
				if (eObject instanceof MPlaceholder) {
					MPlaceholder mp = (MPlaceholder) eObject;
					node = tree.getNodeReferencing(mp.getParent());
					muie = mp.getRef();
				} else {
					muie = (MUIElement) eObject;
					node = tree.getNodeReferencing(muie.getParent());
				}

				if (node != null) {
					node.addChildNode(new TreeNode<MUIElement>(muie));
//					System.out.println(node.getReference().getElementId()
//							+ " ---C---> " + muie.getElementId());
				}
			}
		}
		return tree;
	}
}
