package at.ecrit.eclipse.plugin.outputter.common;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.MUILabel;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPlaceholder;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.wb.swt.ResourceManager;

import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.eclipse.plugin.outputter.depiction.TreeNode;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

public class DepictionImageGenerator {
	
	private static String LINEBREAK = "\n";
	private static String[] SEPARATORS = {
		" ", ",", "-"
	};
	private String separator;
	private Document document;
	private Resource appModelResource;
	private File outputLocation;
	private int width, height;
	
	private Image applicationImage = ResourceManager.getPluginImage("at.ecrit.eclipse.plugin",
		"rsc/icons/application_small.png");
	private Image stackImage = ResourceManager.getPluginImage("at.ecrit.eclipse.plugin",
		"rsc/icons/applications-stack_small.png");
	private boolean useSmallFont = false;
	private Font smallFont = new Font(Display.getCurrent(), "Arial", 6, SWT.NORMAL);
	
	public DepictionImageGenerator(Document document, File outputLocation,
		Resource appModelResource, int width, int height){
		this.document = document;
		this.appModelResource = appModelResource;
		this.outputLocation = outputLocation;
		this.width = width;
		this.height = height;
	}
	
	public void generate(){
		// generate images for perspectives
		for (DocumentedPerspective perspective : document.getApplicationLayout().getPerspective()) {
			
			createDepictionImageForPerspective(perspective.getModelElement());
		}
	}
	
	@SuppressWarnings("unchecked")
	private void createDepictionImageForPerspective(MPerspective modelElement){
		
		String outputFileName =
			outputLocation.getAbsolutePath() + File.separator + modelElement.getElementId()
				+ ".png";
		
		System.out.println("[PERSPECTIVE]=======" + outputFileName);
		
		Display display = Display.getCurrent();
		Image image = new Image(display, width, height);
		GC gc = new GC(image);
		
		TreeNode<MUIElement> treeRoot = generateUITreeForPerspective(modelElement);
		treeRoot.setData(new Rectangle(0, 0, width, height));
		
		for (TreeNode<MUIElement> node : treeRoot.getTreeTraverser().preOrderTraversal(treeRoot)) {
			// use parents data in case node has no data set
			if (node.getData() == null) {
				System.out.println("Node " + node.getReference() + node.getData());
				node.setData(node.getParent().getData());
				
				if (node.getData() == null) {
					node.setData(node.getParent().getParent().getData());
					
					if (node.getData() == null) {
						node.setData(treeRoot.getData());
					}
				}
			}
			
			// make sure rectangle starting point is inside the root windows bounds
			Rectangle nodeRectangle = (Rectangle) node.getData();
			if (nodeRectangle.x >= width) {
				nodeRectangle.x = width - nodeRectangle.width;
				node.setData(nodeRectangle);
			}
			List<TreeNode<MUIElement>> children = node.getChildren();
			
			MUIElement currentObject = node.getReference();
			if (currentObject instanceof MPerspective) {
				// set value on children
				arrangeHorizontal(node, currentObject, children, null);
				MPerspective perspective = (MPerspective) currentObject;
				if (perspective.getChildren() == null || perspective.getChildren().isEmpty()) {
					MPart labelPart = MBasicFactory.INSTANCE.createPart();
					labelPart.setLabel(perspective.getLabel());
					labelPart.setElementId(perspective.getElementId() + ".part");
					perspective.getChildren().add(labelPart);
					Rectangle rect =
						fixRectangleBoundaries((Rectangle) treeRoot.getData(),
							(Rectangle) node.getData());
					drawRectangle(rect, labelPart, gc, node);
				}
				
			} else if (currentObject instanceof MPartSashContainer) {
				// set value on children
				MPartSashContainer mpsc = (MPartSashContainer) currentObject;
				
				String containerData = mpsc.getContainerData();
				int[] weight = null;
				if (containerData != null && containerData.length() > 0) {
					String[] split = containerData.split(",");
					weight = new int[split.length];
					for (int i = 0; i < split.length; i++) {
						weight[i] = Integer.parseInt(ensureSaveContainerData(split[i]));
					}
				}
				
				if (mpsc.isHorizontal()) {
					arrangeHorizontal(node, currentObject, children, weight);
				} else {
					arrangeVertical(node, currentObject, children, weight);
				}
				
			} else if (currentObject instanceof MPartStack) {
				arrangeStacked(node, currentObject, children);
			} else {
				Rectangle rect =
					fixRectangleBoundaries((Rectangle) treeRoot.getData(),
						(Rectangle) node.getData());
				drawRectangle(rect, currentObject, gc, node);
			}
			
			String nodeRefId = "No NodeReference found";
			if (node.getReference() != null) {
				nodeRefId = node.getReference().getElementId();
			}
			System.out.println(node.getLevel() + ": " + nodeRefId + " " + node.getData());
		}
		
		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[] {
			image.getImageData()
		};
		loader.save(outputFileName, SWT.IMAGE_PNG);
		System.out.println("Saved " + outputFileName);
		
		gc.dispose();
		image.dispose();
	}
	
	private String ensureSaveContainerData(String value){
		int val = Integer.parseInt(value);
		
		while (val > 100) {
			if (val % 10 == 0) {
				val = val / 10;
			} else {
				return "50";
			}
		}
		return val + "";
	}
	
	/**
	 * fix the boundaries of a rectangle, such that its width and height does not overflow the
	 * overall image size.
	 * 
	 * @param windowRectangle
	 *            the overall image rectangle
	 * @param the
	 *            apperture of of the windowRectangle for this node
	 * @return the corrected rectangle
	 */
	private Rectangle fixRectangleBoundaries(Rectangle windowRectangle, Rectangle nodeRectangle){
		int nodeBorderHeight = nodeRectangle.y + nodeRectangle.height;
		int nodeBorderWidth = nodeRectangle.x + nodeRectangle.width;
		
		int newWidth =
			(nodeBorderWidth >= windowRectangle.width) ? nodeRectangle.width - 1
					: nodeRectangle.width;
		int newHeight =
			(nodeBorderHeight >= windowRectangle.height) ? nodeRectangle.height - 1
					: nodeRectangle.height;
		
		return new Rectangle(nodeRectangle.x, nodeRectangle.y, newWidth, newHeight);
	}
	
	/**
	 * draws the leaf rectangle, i.e. the single part description element
	 * 
	 * @param data
	 * @param currentObject
	 * @param gc
	 * @param node
	 */
	private void drawRectangle(Rectangle data, MUIElement currentObject, GC gc,
		TreeNode<MUIElement> node){
		gc.drawRectangle(data);
		gc.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
		gc.fillRectangle(data.x, data.y, data.width, 10);
		
		System.out.println("Drawing " + currentObject);
		
		String label;
		if (node.getParent() != null && node.getParent().getReference() instanceof MPartStack) {
			gc.drawImage(stackImage, data.x + 2, data.y + 1);
			List<String> labels = new ArrayList<String>();
			List<TreeNode<MUIElement>> children = node.getParent().getChildren();
			for (TreeNode<MUIElement> treeNode : children) {
				if (treeNode.getReference() != null) {
					String lab = ((MUILabel) treeNode.getReference()).getLabel();
					labels.add(lab);
				}
			}
			label = Joiner.on(", ").join(labels);
		} else {
			gc.drawImage(applicationImage, data.x + 2, data.y + 1);
			if (currentObject instanceof MUILabel) {
				label = ((MUILabel) currentObject).getLabel();
			} else {
				label = currentObject.getElementId();
			}
		}
		
		gc.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		
		Point size = gc.textExtent(label);
		Point center = new Point(data.x + (data.width / 2), data.y + (data.height / 2));
		
		if (data.width < size.x) {
			label = wrapText(split(label, 0), data.width - 10, gc);
			size = gc.textExtent(label);
			if (size.x >= data.width - 5 || size.y >= data.height - 5) {
				gc.setFont(smallFont);
				size = gc.textExtent(label);
			}
			center = new Point(data.x + (data.width / 2), data.y + (data.height - size.y) / 2);
		}
		
		gc.drawText(label, center.x - (size.x / 2), center.y);
	}
	
	private String wrapText(String[] segments, int max, GC gc){
		StringBuilder sb = new StringBuilder();
		StringBuilder finalText = new StringBuilder();
		
		for (int i = 0; i < segments.length; i++) {
			String segment = segments[i];
			Point point = gc.textExtent(segment);
			
			// check if this segment is already to long
			if (point.x > max) {
				String[] segmentSplit = split(segment, 0);
				segment = wrapText(segmentSplit, max, gc);
			}
			
			point = gc.textExtent(sb.toString() + segment);
			// text too long -> add linebreak before continuing
			if (point.x > max) {
				finalText.append(sb.toString());
				finalText.append(LINEBREAK);
				sb.setLength(0);
				sb.append(segment);
			} else {
				sb.append(segment);
			}
		}
		
		if (sb.length() > 0) {
			finalText.append(sb.toString());
		}
		
		// remove potential first and last line break
		return removeRedundantLinebreaks(finalText.toString());
	}
	
	/**
	 * removes potential linebreaks in the beginning/end of the parts label
	 * 
	 * @param text
	 *            complete (wrapped) label
	 * @return a string without linebreaks at first/last position
	 */
	private String removeRedundantLinebreaks(String text){
		if (text.startsWith(LINEBREAK)) {
			text = text.replaceFirst(LINEBREAK, "");
		}
		
		if (text.endsWith(LINEBREAK)) {
			int endLineBreak = text.lastIndexOf(LINEBREAK);
			text = text.substring(0, endLineBreak);
		}
		return text;
	}
	
	private String[] split(String label, int idx){
		String[] split = label.split(SEPARATORS[idx]);
		if (split.length <= 1) {
			idx++;
			if (idx < SEPARATORS.length) {
				split = split(label, idx);
			} else {
				split = Iterables.toArray(Splitter.fixedLength(3).split(label), String.class);
				separator = "";
			}
		} else {
			separator = SEPARATORS[idx];
		}
		return split;
	}
	
	/**
	 * 
	 * @param node
	 * @param currentObject
	 * @param children
	 * @param weight
	 *            if <code>null</code> weight equally between all children
	 */
	private void arrangeVertical(TreeNode<MUIElement> node, MUIElement currentObject,
		List<TreeNode<MUIElement>> children, int[] weight){
		
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
			child.setData(new Rectangle(thisRectangle.x, sumUpTo(splitPoints, i + 1),
				thisRectangle.width, (int) (multiplier * weight[i])));
		}
	}
	
	private void arrangeHorizontal(TreeNode<MUIElement> node, MUIElement currentObject,
		List<TreeNode<MUIElement>> children, int[] weight){
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
			child.setData(new Rectangle(sumUpTo(splitPoints, i + 1), thisRectangle.y,
				(int) (multiplier * weight[i]), thisRectangle.height));
		}
	}
	
	/**
	 * arrange the childs s.t. they are presented within a part stack
	 * 
	 * @param node
	 * @param currentObject
	 * @param children
	 */
	private void arrangeStacked(TreeNode<MUIElement> node, MUIElement currentObject,
		List<TreeNode<MUIElement>> children){
		if (children == null || children.size() == 0)
			return;
		for (TreeNode<MUIElement> child : children) {
			Rectangle thisRectangle = (Rectangle) node.getData();
			child.setData(thisRectangle);
		}
		
	}
	
	private int[] ensureSaveWeight(TreeNode<MUIElement> node, List<TreeNode<MUIElement>> children,
		int[] weight){
		int[] ret;
		if (weight == null) {
			ret = new int[children.size()];
			Arrays.fill(ret, 100 / children.size());
		} else {
			if (weight.length > children.size()) {
				ret = Arrays.copyOf(weight, children.size());
				System.out.println(node.getReference().getElementId()
					+ " has more weight defined, than children. Truncating.");
			} else if (weight.length <= children.size() && weight.length == 1) {
				ret = Arrays.copyOf(weight, children.size());
				
				if (children.get(0).getReference().getContainerData() != null) {
					for (int i = 0; i < children.size(); i++) {
						MUIElement muiElement = children.get(i).getReference();
						if (muiElement.getContainerData() != null) {
							String value = ensureSaveContainerData(muiElement.getContainerData());
							ret[i] = Integer.parseInt(value);
						}
					}
				} else {
					int singleWeight = 100 / children.size();
					for (int i = 0; i < children.size(); i++) {
						ret[i] = singleWeight;
					}
				}
				
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
	private int sumUpTo(int[] array, int i){
		int ret = 0;
		for (int j = 0; j < i; j++) {
			ret += array[j];
		}
		return ret;
	}
	
	/**
	 * Generate a tree of a given perspective and all its children. Eases the treatment of such, as
	 * the iteration in the application model is not feasible in the required way.
	 * 
	 * @param modelElement
	 * @return
	 */
	private TreeNode<MUIElement> generateUITreeForPerspective(MPerspective modelElement){
		TreeNode<MUIElement> tree = null;
		for (TreeIterator<EObject> i = appModelResource.getAllContents(); i.hasNext();) {
			EObject eObject = (EObject) i.next();
			if (eObject instanceof MPerspective) {
				MPerspective perspective = (MPerspective) eObject;
				if (perspective.equals(modelElement)) {
					tree = new TreeNode<MUIElement>(perspective);
				}
			} else if (tree != null
				&& (eObject instanceof MPartSashContainer || eObject instanceof MPlaceholder
					|| eObject instanceof MPart || eObject instanceof MPartStack)) {
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
