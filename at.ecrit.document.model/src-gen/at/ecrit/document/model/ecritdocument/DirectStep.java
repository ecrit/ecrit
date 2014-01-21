/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.MContribution;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.DirectStep#getContribution <em>Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDirectStep()
 * @model
 * @generated
 */
public interface DirectStep extends Step {
	/**
	 * Returns the value of the '<em><b>Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution</em>' reference.
	 * @see #setContribution(MContribution)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDirectStep_Contribution()
	 * @model
	 * @generated
	 */
	MContribution getContribution();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.DirectStep#getContribution <em>Contribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contribution</em>' reference.
	 * @see #getContribution()
	 * @generated
	 */
	void setContribution(MContribution value);

} // DirectStep
