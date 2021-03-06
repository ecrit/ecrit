/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedWindow#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedWindow#getContainedPerspective <em>Contained Perspective</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedWindow#getContainedMenus <em>Contained Menus</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedWindow#getContainedTrimBars <em>Contained Trim Bars</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedWindow()
 * @model
 * @generated
 */
public interface DocumentedWindow extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(MWindow)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedWindow_ModelElement()
	 * @model required="true"
	 * @generated
	 */
	MWindow getModelElement();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.DocumentedWindow#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(MWindow value);

	/**
	 * Returns the value of the '<em><b>Contained Perspective</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.e4.ui.model.application.ui.advanced.MPerspective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Perspective</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Perspective</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedWindow_ContainedPerspective()
	 * @model
	 * @generated
	 */
	EList<MPerspective> getContainedPerspective();

	/**
	 * Returns the value of the '<em><b>Contained Menus</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Menus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Menus</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedWindow_ContainedMenus()
	 * @model
	 * @generated
	 */
	EList<DocumentedMenu> getContainedMenus();

	/**
	 * Returns the value of the '<em><b>Contained Trim Bars</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Trim Bars</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Trim Bars</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedWindow_ContainedTrimBars()
	 * @model
	 * @generated
	 */
	EList<DocumentedTrimBar> getContainedTrimBars();

} // DocumentedWindow
