/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MMenuElement;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedMenu#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedMenu#getContainedInPart <em>Contained In Part</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedMenu#getContainedInWindow <em>Contained In Window</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedMenu#getContainedMenuItems <em>Contained Menu Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedMenu()
 * @model
 * @generated
 */
public interface DocumentedMenu extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(MMenu)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedMenu_ModelElement()
	 * @model required="true"
	 * @generated
	 */
	MMenu getModelElement();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.DocumentedMenu#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(MMenu value);

	/**
	 * Returns the value of the '<em><b>Contained In Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.e4.ui.model.application.ui.basic.MPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In Part</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In Part</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedMenu_ContainedInPart()
	 * @model
	 * @generated
	 */
	EList<MPart> getContainedInPart();

	/**
	 * Returns the value of the '<em><b>Contained In Window</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.e4.ui.model.application.ui.basic.MWindow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained In Window</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained In Window</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedMenu_ContainedInWindow()
	 * @model
	 * @generated
	 */
	EList<MWindow> getContainedInWindow();

	/**
	 * Returns the value of the '<em><b>Contained Menu Items</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.e4.ui.model.application.ui.menu.MMenuElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Menu Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Menu Items</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedMenu_ContainedMenuItems()
	 * @model
	 * @generated
	 */
	EList<MMenuElement> getContainedMenuItems();

} // DocumentedMenu
