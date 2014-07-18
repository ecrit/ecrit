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
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getMenu <em>Menu</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getTrimBar <em>Trim Bar</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getTrim <em>Trim</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getToolBar <em>Tool Bar</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' containment reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' containment reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout_Menu()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentedMenu> getMenu();

	/**
	 * Returns the value of the '<em><b>Trim Bar</b></em>' containment reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedTrimBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim Bar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Bar</em>' containment reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout_TrimBar()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentedTrimBar> getTrimBar();

	/**
	 * Returns the value of the '<em><b>Trim</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedTrim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout_Trim()
	 * @model
	 * @generated
	 */
	EList<DocumentedTrim> getTrim();

	/**
	 * Returns the value of the '<em><b>Tool Bar</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.DocumentedToolBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Bar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Bar</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationLayout_ToolBar()
	 * @model
	 * @generated
	 */
	EList<DocumentedToolBar> getToolBar();

} // ApplicationLayout
