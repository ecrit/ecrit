/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.commands.MKeyBinding;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <b>
 * ISO/IEC2008
 * </b>
 * A step: One element (numbered list item) in a procedure that tells a user to perform an action
 * (or actions)
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Step#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Step#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Step#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Step#getExecutableBy <em>Executable By</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Step#getInitiatableBy <em>Initiatable By</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Step#getPossibleError <em>Possible Error</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Step#getKeybinding <em>Keybinding</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Step#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' attribute.
	 * @see #setPrecondition(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_Precondition()
	 * @model
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Step#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' attribute.
	 * @see #setPostcondition(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_Postcondition()
	 * @model
	 * @generated
	 */
	String getPostcondition();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Step#getPostcondition <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' attribute.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(String value);

	/**
	 * Returns the value of the '<em><b>Executable By</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable By</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_ExecutableBy()
	 * @model
	 * @generated
	 */
	EList<User> getExecutableBy();

	/**
	 * Returns the value of the '<em><b>Initiatable By</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.InitiatableItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiatable By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiatable By</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_InitiatableBy()
	 * @model
	 * @generated
	 */
	EList<InitiatableItem> getInitiatableBy();

	/**
	 * Returns the value of the '<em><b>Possible Error</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.ErrorMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possible Error</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Error</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_PossibleError()
	 * @model
	 * @generated
	 */
	EList<ErrorMessage> getPossibleError();

	/**
	 * Returns the value of the '<em><b>Keybinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keybinding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keybinding</em>' reference.
	 * @see #setKeybinding(MKeyBinding)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_Keybinding()
	 * @model
	 * @generated
	 */
	MKeyBinding getKeybinding();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Step#getKeybinding <em>Keybinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keybinding</em>' reference.
	 * @see #getKeybinding()
	 * @generated
	 */
	void setKeybinding(MKeyBinding value);

} // Step
