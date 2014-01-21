/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.commands.MCommand;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 * A step that is associated with a command.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.CommandStep#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getCommandStep()
 * @model
 * @generated
 */
public interface CommandStep extends Step {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' reference.
	 * @see #setCommand(MCommand)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getCommandStep_Command()
	 * @model
	 * @generated
	 */
	MCommand getCommand();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.CommandStep#getCommand <em>Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(MCommand value);

} // CommandStep
