/**
 */
package at.ecrit.model.plugin.modelDocumentation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage
 * @generated
 */
public interface ModelDocumentationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelDocumentationFactory eINSTANCE = at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Element Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Documentation</em>'.
	 * @generated
	 */
	ElementDocumentation createElementDocumentation();

	/**
	 * Returns a new object of class '<em>Model Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Documentation</em>'.
	 * @generated
	 */
	ModelDocumentation createModelDocumentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelDocumentationPackage getModelDocumentationPackage();

} //ModelDocumentationFactory
