/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getPart <em>Part</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getWindow <em>Window</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout()
 * @model
 * @generated
 */
public interface ApplicationLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Perspective</b></em>' containment reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedPerspective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective</em>' containment reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout_Perspective()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentedPerspective> getPerspective();

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout_Part()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentedPart> getPart();

	/**
	 * Returns the value of the '<em><b>Window</b></em>' containment reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedWindow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window</em>' containment reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout_Window()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentedWindow> getWindow();

} // ApplicationLayout
