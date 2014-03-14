/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage
 * @generated
 */
public interface EcritdocumentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcritdocumentFactory eINSTANCE = at.ecrit.document.model.ecritdocument.impl.EcritdocumentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Command Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Step</em>'.
	 * @generated
	 */
	CommandStep createCommandStep();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Message</em>'.
	 * @generated
	 */
	ErrorMessage createErrorMessage();

	/**
	 * Returns a new object of class '<em>Direct Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Step</em>'.
	 * @generated
	 */
	DirectStep createDirectStep();

	/**
	 * Returns a new object of class '<em>Initiatable Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initiatable Item</em>'.
	 * @generated
	 */
	InitiatableItem createInitiatableItem();

	/**
	 * Returns a new object of class '<em>Application Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Layout</em>'.
	 * @generated
	 */
	ApplicationLayout createApplicationLayout();

	/**
	 * Returns a new object of class '<em>Documented Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documented Perspective</em>'.
	 * @generated
	 */
	DocumentedPerspective createDocumentedPerspective();

	/**
	 * Returns a new object of class '<em>Documented Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documented Part</em>'.
	 * @generated
	 */
	DocumentedPart createDocumentedPart();

	/**
	 * Returns a new object of class '<em>Documented Window</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Documented Window</em>'.
	 * @generated
	 */
	DocumentedWindow createDocumentedWindow();

	/**
	 * Returns a new object of class '<em>Application Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Properties</em>'.
	 * @generated
	 */
	ApplicationProperties createApplicationProperties();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcritdocumentPackage getEcritdocumentPackage();

} //EcritdocumentFactory
