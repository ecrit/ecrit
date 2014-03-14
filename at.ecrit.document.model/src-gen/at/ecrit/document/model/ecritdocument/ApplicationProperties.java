/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#isRequiresLogin <em>Requires Login</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#getRequiresInstallation <em>Requires Installation</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#getPerspectiveSwitcher <em>Perspective Switcher</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#isHasConceptOfMultipleUsers <em>Has Concept Of Multiple Users</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationProperties()
 * @model
 * @generated
 */
public interface ApplicationProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Requires Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Login</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Login</em>' attribute.
	 * @see #setRequiresLogin(boolean)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationProperties_RequiresLogin()
	 * @model
	 * @generated
	 */
	boolean isRequiresLogin();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#isRequiresLogin <em>Requires Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Login</em>' attribute.
	 * @see #isRequiresLogin()
	 * @generated
	 */
	void setRequiresLogin(boolean value);

	/**
	 * Returns the value of the '<em><b>Requires Installation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Installation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Installation</em>' attribute.
	 * @see #setRequiresInstallation(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationProperties_RequiresInstallation()
	 * @model
	 * @generated
	 */
	String getRequiresInstallation();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#getRequiresInstallation <em>Requires Installation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Installation</em>' attribute.
	 * @see #getRequiresInstallation()
	 * @generated
	 */
	void setRequiresInstallation(String value);

	/**
	 * Returns the value of the '<em><b>Perspective Switcher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perspective Switcher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspective Switcher</em>' attribute.
	 * @see #setPerspectiveSwitcher(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationProperties_PerspectiveSwitcher()
	 * @model
	 * @generated
	 */
	String getPerspectiveSwitcher();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#getPerspectiveSwitcher <em>Perspective Switcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspective Switcher</em>' attribute.
	 * @see #getPerspectiveSwitcher()
	 * @generated
	 */
	void setPerspectiveSwitcher(String value);

	/**
	 * Returns the value of the '<em><b>Has Concept Of Multiple Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Concept Of Multiple Users</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Concept Of Multiple Users</em>' attribute.
	 * @see #setHasConceptOfMultipleUsers(boolean)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getApplicationProperties_HasConceptOfMultipleUsers()
	 * @model
	 * @generated
	 */
	boolean isHasConceptOfMultipleUsers();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.ApplicationProperties#isHasConceptOfMultipleUsers <em>Has Concept Of Multiple Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Concept Of Multiple Users</em>' attribute.
	 * @see #isHasConceptOfMultipleUsers()
	 * @generated
	 */
	void setHasConceptOfMultipleUsers(boolean value);

} // ApplicationProperties
