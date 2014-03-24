package at.ecrit.eclipse.plugin.outputter.common;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
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
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;

import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedElement;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.eclipse.plugin.outputter.depiction.TreeNode;

public class DepictionImageGenerator {

	private Document document;
	private Resource appModelResource;
	private File outputLocation;
	private int width, height;

	public DepictionImageGenerator(Document document, File outputLocation,
			Resource appModelResource, int width, int height) {
		this.document = document;
		this.appModelResource = appModelResource;
		this.outputLocation = outputLocation;
		this.width = width;
		this.height = height;
	}

	public void generate() {
		// generate images for perspectives
		for (DocumentedPerspective perspective : document
				.getApplicationLayout().getPerspective()) {

			createDepictionImageForPerspective(perspective.getModelElement());
		}
	}

	@SuppressWarnings("unchecked")
	private void createDepictionImageForPerspective(MPerspective modelElement) {

		String outputFileName = outputLocation.getAbsolutePath()
				+ File.separator + modelElement.getElementId() + ".png";

		System.out.println("[PERSPECTIVE]=======" + outputFileName);

		Display display = Display.getCurrent();
		Image image = new Image(display, width, height);
		GC gc = new GC(image);

		TreeNode<MUIElement> treeRoot = generateUITreeForPerspective(modelElement);

		treeRoot.setData(new Rectangle(0, 0, width, height));

		for (TreeNode<MUIElement> node : treeRoot.getTreeTraverser()
				.preOrderTraversal(treeRoot)) {
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
				Rectangle rect = fixRectangleBoundaries(
						(Rectangle) treeRoot.getData(),
						(Rectangle) node.getData());
				drawRectangle(rect, currentObject, gc);
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

	/**
	 * fix the boundaries of a rectangle, such that its width and height does
	 * not overflow the overall image size.
	 * 
	 * @param windowRectangle
	 *            the overall image rectangle
	 * @param the
	 *            apperture of of the windowRectangle for this node
	 * @return the corrected rectangle
	 */
	private Rectangle fixRectangleBoundaries(Rectangle windowRectangle,
			Rectangle nodeRectangle) {
		int nodeBorderHeight = nodeRectangle.y + nodeRectangle.height;
		int nodeBorderWidth = nodeRectangle.x + nodeRectangle.width;

		int newWidth = (nodeBorderWidth >= windowRectangle.width) ? nodeRectangle.width - 1
				: nodeRectangle.width;
		int newHeight = (nodeBorderHeight >= windowRectangle.height) ? nodeRectangle.height - 1
				: nodeRectangle.height;

		return new Rectangle(nodeRectangle.x, nodeRectangle.y, newWidth,
				newHeight);
	}

	private void drawRectangle(Rectangle data, MUIElement currentObject, GC gc) {
		gc.drawRectangle(data);
		gc.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
		gc.fillRectangle(data.x, data.y, data.width, 10);
		gc.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));

		String label;
		if (currentObject instanceof MUILabel) {
			label = ((MUILabel) currentObject).getLabel();
		} else {
			label = currentObject.getElementId();
		}
		Point size = gc.textExtent(label);
		
		Point center = new Point(data.x+(data.width/2), data.y+(data.height/2));
		
		gc.drawText(label, center.x-(size.x/2), center.y);
	}

	/**
	 * 
	 * @param node
	 * @param currentObject
	 * @param children
	 * @param weight
	 *            if <code>null</code> weight equally between all children
	 */
	private void arrangeVertical(TreeNode<MUIElement> node,
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

	private void arrangeHorizontal(TreeNode<MUIElement> node,
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

	private int[] ensureSaveWeight(TreeNode<MUIElement> node,
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
	private int sumUpTo(int[] array, int i) {
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
	 * @param modelElement
	 * @return
	 */
	private TreeNode<MUIElement> generateUITreeForPerspective(
			MPerspective modelElement) {
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
