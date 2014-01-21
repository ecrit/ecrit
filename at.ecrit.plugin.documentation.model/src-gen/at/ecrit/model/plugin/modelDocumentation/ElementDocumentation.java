/**
 */
package at.ecrit.model.plugin.modelDocumentation;

import org.eclipse.emf.ecore.EObject;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementType <em>Element Type</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementId <em>Element Id</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementXmiId <em>Element Xmi Id</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidFrom <em>Valid From</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation()
 * @model
 * @generated
 */
public interface ElementDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

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
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_Postcondition()
	 * @model
	 * @generated
	 */
	String getPostcondition();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getPostcondition <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' attribute.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(String value);

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
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_Precondition()
	 * @model
	 * @generated
	 */
	String getPrecondition();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getPrecondition <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' attribute.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see #setElementType(String)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_ElementType()
	 * @model
	 * @generated
	 */
	String getElementType();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(String value);

	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Id</em>' attribute.
	 * @see #setElementId(String)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_ElementId()
	 * @model
	 * @generated
	 */
	String getElementId();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementId <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' attribute.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(String value);

	/**
	 * Returns the value of the '<em><b>Element Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Xmi Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Xmi Id</em>' attribute.
	 * @see #setElementXmiId(String)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_ElementXmiId()
	 * @model
	 * @generated
	 */
	String getElementXmiId();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementXmiId <em>Element Xmi Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Xmi Id</em>' attribute.
	 * @see #getElementXmiId()
	 * @generated
	 */
	void setElementXmiId(String value);

	/**
	 * Returns the value of the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid From</em>' attribute.
	 * @see #setValidFrom(Version)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_ValidFrom()
	 * @model dataType="at.ecrit.model.plugin.modelDocumentation.Version"
	 * @generated
	 */
	Version getValidFrom();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidFrom <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid From</em>' attribute.
	 * @see #getValidFrom()
	 * @generated
	 */
	void setValidFrom(Version value);

} // ElementDocumentation
