/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.commands.MKeyBinding;

import org.eclipse.emf.common.util.EList;

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
public interface Step extends DocumentedElement {
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
	 * It is bidirectional and its opposite is '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getAssociatedStep <em>Associated Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiatable By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiatable By</em>' reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getStep_InitiatableBy()
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getAssociatedStep
	 * @model opposite="associatedStep"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isCommandStep();

} // Step
