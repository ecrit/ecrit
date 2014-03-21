package at.ecrit.eclipse.plugin.outputter.common;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;

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

	@SuppressWarnings("unchecked")
	private static void createDepictionImageForPerspective(
			MPerspective modelElement, Resource appModelResource,
			File outputLocation, int width, int height) {

		String outputFileName = outputLocation.getAbsolutePath()
				+ File.separator + modelElement.getElementId() + ".png";

		System.out.println("[PERSPECTIVE]=======" + outputFileName);

		Display display = Display.getCurrent();
		Image image = new Image(display, width, height);
		GC gc = new GC(image);

		TreeNode<MUIElement> tree = generateUITreeForPerspective(
				appModelResource, modelElement);

		tree.setData(new Rectangle(0, 0, width, height));

		for (TreeNode<MUIElement> node : tree.getTreeTraverser()
				.preOrderTraversal(tree)) {
			List<TreeNode<MUIElement>> children = node.getChildren();

			MUIElement currentObject = node.getReference();
			if (currentObject instanceof MPerspective) {
				// set value on children
				arrangeHorizontal(node, currentObject, children, null);

			} else if (currentObject instanceof MPartSashContainer) {
				// set value on children
				MPartSashContainer mpsc = (MPartSashContainer) currentObject;

				String containerData = mpsc.getContainerData();
				int[] weight = null;
				if (containerData != null && containerData.length() > 0) {
					String[] split = containerData.split(",");
					weight = new int[split.length];
					for (int i = 0; i < split.length; i++) {
						weight[i] = Integer.parseInt(split[i]);
					}
				}

				if (mpsc.isHorizontal()) {
					arrangeHorizontal(node, currentObject, children, weight);
				} else {
					arrangeVertical(node, currentObject, children, weight);
				}

			} else {
				drawRectangle((Rectangle) node.getData(), currentObject, gc);
			}

			System.out
					.println(node.getLevel() + ": "
							+ node.getReference().getElementId() + " "
							+ node.getData());
		}

		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[] { image.getImageData() };
		loader.save(outputFileName, SWT.IMAGE_PNG);
		System.out.println("Saved " + outputFileName);

		gc.dispose();
		image.dispose();
	}

	private static void drawRectangle(Rectangle data, MUIElement currentObject,
			GC gc) {
		gc.drawRectangle(data);
		gc.drawText(currentObject.getElementId(), data.x + 10, data.y + 10);
//		System.out.println("DRAW " + currentObject.getElementId() + " " + data);
	}

	/**
	 * 
	 * @param node
	 * @param currentObject
	 * @param children
	 * @param weight
	 *            if <code>null</code> weight equally between all children
	 */
	private static void arrangeVertical(TreeNode<MUIElement> node,
			MUIElement currentObject, List<TreeNode<MUIElement>> children,
			int[] weight) {

		if (children == null || children.size() == 0)
			return;

		weight = ensureSaveWeight(node, children, weight);

		// define split locations
		int splitPoints[] = new int[weight.length + 1];
		splitPoints[0] = ((Rectangle) node.getData()).y;
		float multiplier = ((Rectangle) node.getData()).height / 100f;
		for (int i = 1; i < splitPoints.length; i++) {
			int newValue = (int) (sumUpTo(weight, i) * multiplier);
			splitPoints[i] = newValue;
		}

		// set respective points to child nodes
		for (int i = 0; i < weight.length; i++) {
			TreeNode<MUIElement> child = children.get(i);

			Rectangle thisRectangle = (Rectangle) node.getData();
			child.setData(new Rectangle(thisRectangle.x, sumUpTo(splitPoints,
					i + 1), thisRectangle.width, (int) (multiplier * weight[i])));
		}
	}

	private static void arrangeHorizontal(TreeNode<MUIElement> node,
			MUIElement currentObject, List<TreeNode<MUIElement>> children,
			int[] weight) {
		// ok
		if (children == null || children.size() == 0)
			return;

		weight = ensureSaveWeight(node, children, weight);

		// define split locations
		int splitPoints[] = new int[weight.length + 1];

		splitPoints[0] = ((Rectangle) node.getData()).x;
		float multiplier = ((Rectangle) node.getData()).width / 100f;
		for (int i = 1; i < splitPoints.length; i++) {
			int newValue = (int) (sumUpTo(weight, i) * multiplier);
			splitPoints[i] = newValue;
		}

		// set respective points to child nodes
		for (int i = 0; i < weight.length; i++) {
			TreeNode<MUIElement> child = children.get(i);

			Rectangle thisRectangle = (Rectangle) node.getData();
			child.setData(new Rectangle(sumUpTo(splitPoints, i + 1),
					thisRectangle.y, (int) (multiplier * weight[i]),
					thisRectangle.height));
		}
	}

	private static int[] ensureSaveWeight(TreeNode<MUIElement> node,
			List<TreeNode<MUIElement>> children, int[] weight) {
		int[] ret;
		if (weight == null) {
			ret = new int[children.size()];
			Arrays.fill(ret, 100 / children.size());
		} else {
			if (weight.length > children.size()) {
				ret = Arrays.copyOf(weight, children.size());
				System.out
						.println(node.getReference().getElementId()
								+ " has more weight defined, than children. Truncating.");
			} else {
				ret = weight;
			}
		}
		return ret;
	}

	/**
	 * @param array
	 * @param i
	 * @return the sum of all values of the array up to index i
	 */
	private static int sumUpTo(int[] array, int i) {
		int ret = 0;
		for (int j = 0; j < i; j++) {
			ret += array[j];
		}
		return ret;
	}

	/**
	 * Generate a tree of a given perspective and all its children. Eases the
	 * treatment of such, as the iteration in the application model is not
	 * feasible in the required way.
	 * 
	 * @param appModelResource
	 * @param modelElement
	 * @return
	 */
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
					// System.out.println(node.getReference().getElementId()
					// + " ---C---> " + muie.getElementId());
				}
			}
		}
		return tree;
	}
}
