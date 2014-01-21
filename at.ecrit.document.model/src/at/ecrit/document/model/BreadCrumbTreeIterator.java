package at.ecrit.document.model;

import java.util.Iterator;

import org.eclipse.emf.common.util.AbstractTreeIterator;

public class BreadCrumbTreeIterator<E> extends AbstractTreeIterator<E> {

	private static final long serialVersionUID = 1L;

	public BreadCrumbTreeIterator(E object) {
		super(object);

	}

	@Override
	protected Iterator<? extends E> getChildren(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
