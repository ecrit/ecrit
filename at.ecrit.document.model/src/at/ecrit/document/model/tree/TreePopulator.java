package at.ecrit.document.model.tree;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.e4.ui.model.application.MApplicationFactory;
import org.eclipse.e4.ui.model.application.impl.ApplicationFactoryImpl;
import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainer;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;
import org.eclipse.e4.ui.model.application.ui.basic.impl.PartSashContainerImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TreePopulator {

	/**
	 * populate a tree for generating a later depiction of the perspective the
	 * children elements are recursively search to create a tree of
	 * {@link TreeNodeDepictableItem} elements.
	 * 
	 * @param perspective
	 * @return
	 */
	public static TreeNode populateDepictionTreeForPerspective(
			MPerspective perspective) {

		// we need an initial ratio, as this is a pseudo element
		int size = perspective.getChildren().size();
		int[] ratios = new int[size];
		Arrays.fill(ratios, 100 / size);

		MPartSashContainer mpsc = MBasicFactory.INSTANCE.createPartSashContainer();
		mpsc.setContainerData(Arrays.toString(ratios));
		
		TreeNode<TreeNodeDepictableItem> rootNode = new TreeNode<TreeNodeDepictableItem>(
				new TreeNodeDepictableItem(mpsc, ratios));

		List<MPartSashContainerElement> lu = perspective.getChildren();
		for (MPartSashContainerElement child : lu) {
			recurseOnSashContainer(rootNode, child);
		}

		return rootNode;
	}

	private static void recurseOnSashContainer(TreeNode tn,
			MPartSashContainerElement in) {
		if (in instanceof MPartSashContainer) {
			// add this sash container to the parent node
			MPartSashContainer inContainer = (MPartSashContainer) in;
			List<MPartSashContainerElement> inContainerChildren = inContainer
					.getChildren();

			int numberOfChildren = inContainer.getChildren().size();
			int[] ratiosInt = new int[numberOfChildren];
			String containerData = inContainer.getContainerData();
			if (containerData != null) {
				String[] ratiosString = inContainer.getContainerData().split(
						",");
				for (int i = 0; i < ratiosString.length; i++) {
					ratiosInt[i] = Integer.parseInt(ratiosString[i]);
				}
			} else {
				Arrays.fill(ratiosInt, 100 / numberOfChildren);
			}

			Assert.isTrue(inContainerChildren.size() == ratiosInt.length);

			TreeNode treeNode = new TreeNode(new TreeNodeDepictableItem(
					inContainer, ratiosInt));
			tn.addChildNode(treeNode);

			// recurse into sub elements
			for (MPartSashContainerElement temp : inContainerChildren) {
				recurseOnSashContainer(treeNode, temp);
			}

		} else {
			// end recursion, this is a leaf
			// may however be a stack - but not of concern now
			TreeNodeDepictableItem tnItem = new TreeNodeDepictableItem(in, null);
			tn.addChildNode(new TreeNode(tnItem));
		}

	}

}
