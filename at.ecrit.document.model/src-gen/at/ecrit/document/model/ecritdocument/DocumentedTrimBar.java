/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented Trim Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar#getContainedInWindow <em>Contained In Window</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar#getContainedTrimElements <em>Contained Trim Elements</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar#getContainedToolBars <em>Contained Tool Bars</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar#getContainedToolBarElements <em>Contained Tool Bar Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrimBar()
 * @model
 * @generated
 */
public interface DocumentedTrimBar extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(MTrimBar)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrimBar_ModelElement()
	 * @model required="true"
	 * @generated
	 */
	MTrimBar getModelElement();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(MTrimBar value);

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
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrimBar_ContainedInWindow()
	 * @model
	 * @generated
	 */
	EList<MWindow> getContainedInWindow();

	/**
	 * Returns the value of the '<em><b>Contained Trim Elements</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedTrim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Trim Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Trim Elements</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrimBar_ContainedTrimElements()
	 * @model
	 * @generated
	 */
	EList<DocumentedTrim> getContainedTrimElements();

	/**
	 * Returns the value of the '<em><b>Contained Tool Bars</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.e4.ui.model.application.ui.menu.MToolBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Tool Bars</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Tool Bars</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrimBar_ContainedToolBars()
	 * @model
	 * @generated
	 */
	EList<MToolBar> getContainedToolBars();

	/**
	 * Returns the value of the '<em><b>Contained Tool Bar Elements</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedToolBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Tool Bar Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Tool Bar Elements</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrimBar_ContainedToolBarElements()
	 * @model
	 * @generated
	 */
	EList<DocumentedToolBar> getContainedToolBarElements();

} // DocumentedTrimBar
