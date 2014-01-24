/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depictable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDepictable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Depictable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	byte[] generatePNGDepictionImage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getElementDepictionImageName();

} // Depictable
