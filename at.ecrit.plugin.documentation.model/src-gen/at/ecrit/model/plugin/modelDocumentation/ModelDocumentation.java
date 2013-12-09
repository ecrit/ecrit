/**
 */
package at.ecrit.model.plugin.modelDocumentation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ModelDocumentation#getElementDocumentation <em>Element Documentation</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ModelDocumentation#getReferencedModelFile <em>Referenced Model File</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getModelDocumentation()
 * @model
 * @generated
 */
public interface ModelDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Documentation</b></em>' reference list.
	 * The list contents are of type {@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Documentation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Documentation</em>' reference list.
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getModelDocumentation_ElementDocumentation()
	 * @model
	 * @generated
	 */
	EList<ElementDocumentation> getElementDocumentation();

	/**
	 * Returns the value of the '<em><b>Referenced Model File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Model File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Model File</em>' attribute.
	 * @see #setReferencedModelFile(String)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getModelDocumentation_ReferencedModelFile()
	 * @model required="true"
	 * @generated
	 */
	String getReferencedModelFile();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ModelDocumentation#getReferencedModelFile <em>Referenced Model File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Model File</em>' attribute.
	 * @see #getReferencedModelFile()
	 * @generated
	 */
	void setReferencedModelFile(String value);

} // ModelDocumentation
