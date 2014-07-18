/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented Trim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedTrim#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DocumentedTrim#getContainedInTrimBar <em>Contained In Trim Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrim()
 * @model
 * @generated
 */
public interface DocumentedTrim extends DocumentedElement {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(MTrimElement)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrim_ModelElement()
	 * @model required="true"
	 * @generated
	 */
	MTrimElement getModelElement();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.DocumentedTrim#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(MTrimElement value);

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
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocumentedTrim_ContainedInTrimBar()
	 * @model
	 * @generated
	 */
	EList<MTrimBar> getContainedInTrimBar();

} // DocumentedTrim
