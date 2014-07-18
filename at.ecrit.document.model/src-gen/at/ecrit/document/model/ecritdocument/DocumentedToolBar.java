/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented Tool Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedToolBar#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedToolBar#getContainedInTrimBar <em>Contained In Trim Bar</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedToolBar#getContainedInToolBar <em>Contained In Tool Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedToolBar()
 * @model
 * @generated
 */
public interface DocumentedToolBar extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(MToolBarElement)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedToolBar_ModelElement()
	 * @model required="true"
	 * @generated
	 */
	MToolBarElement getModelElement();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.DocumentedToolBar#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(MToolBarElement value);

	/**
	 * Returns the value of the '<em><b>Contained In Trim Bar</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.e4.ui.model.application.ui.basic.MTrimBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In Trim Bar</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In Trim Bar</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedToolBar_ContainedInTrimBar()
	 * @model
	 * @generated
	 */
	EList<MTrimBar> getContainedInTrimBar();

	/**
	 * Returns the value of the '<em><b>Contained In Tool Bar</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.e4.ui.model.application.ui.menu.MToolBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In Tool Bar</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In Tool Bar</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedToolBar_ContainedInToolBar()
	 * @model
	 * @generated
	 */
	EList<MToolBar> getContainedInToolBar();

} // DocumentedToolBar
