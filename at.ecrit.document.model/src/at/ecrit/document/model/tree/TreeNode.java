/**
 * This software is subject to the terms of the Common Public License
 * Agreement, available at the following URL:
 *   http://www.opensource.org/licenses/cpl.html .
 * Copyright (C) 2003-2004 TONBELLER AG.
 * All Rights Reserved.
 * You must accept the terms of that agreement to use this software.
 */
package at.ecrit.document.model.tree;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Tree Node for the for a general tree of Objects
 */
public class TreeNode<T> {

	private TreeNode<T> parent = null;
	private List<TreeNode<T>> children = null;
	private T reference;

	/**
	 * cTtor
	 * 
	 * @param obj
	 *            referenced object
	 */
	public TreeNode(T obj) {
		this.parent = null;
		this.reference = obj;
		this.children = new ArrayList<TreeNode<T>>();
	}

	/**
	 * remove node from tree
	 */
	public void remove() {
		if (parent != null) {
			parent.removeChild(this);
		}
	}

	/**
	 * remove child node
	 * 
	 * @param child
	 */
	private void removeChild(TreeNode<T> child) {
		if (children.contains(child))
			children.remove(child);

	}

	/**
	 * add child node
	 * 
	 * @param child
	 *            node to be added
	 */
	public void addChildNode(TreeNode<T> child) {
		child.parent = this;
		if (!children.contains(child))
			children.add(child);
	}

	/**
	 * deep copy (clone)
	 * 
	 * @return copy of TreeNode
	 */
	public TreeNode<T> deepCopy() {
		TreeNode<T> newNode = new TreeNode<T>(reference);
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			TreeNode child = (TreeNode) iter.next();
			newNode.addChildNode(child.deepCopy());
		}
		return newNode;
	}

	/**
	 * deep copy (clone) and prune
	 * 
	 * @param depth
	 *            - number of child levels to be copied
	 * @return copy of TreeNode
	 */
	public TreeNode deepCopyPrune(int depth) {
		if (depth < 0)
			throw new IllegalArgumentException("Depth is negative");
		TreeNode newNode = new TreeNode(reference);
		if (depth == 0)
			return newNode;
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			TreeNode child = (TreeNode) iter.next();
			newNode.addChildNode(child.deepCopyPrune(depth - 1));
		}
		return newNode;
	}

	/**
	 * @return level = distance from root
	 */
	public int getLevel() {
		int level = 0;
		TreeNode<T> p = parent;
		while (p != null) {
			++level;
			p = p.parent;
		}
		return level;
	}

	public enum TraversalOrder {
		PREORDER, INORDER, POSTORDER, LEVEL
	};

	/**
	 * @return List of children
	 */
	public List<TreeNode<T>> getChildren() {
		return children;
	}

	/**
	 * @return parent node
	 */
	public TreeNode<T> getParent() {
		return parent;
	}

	/**
	 * @return reference object
	 */
	public T getReference() {
		return reference;
	}

	/**
	 * set reference object
	 * 
	 * @param object
	 *            reference
	 */
	public void setReference(T object) {
		reference = object;
	}

	

}