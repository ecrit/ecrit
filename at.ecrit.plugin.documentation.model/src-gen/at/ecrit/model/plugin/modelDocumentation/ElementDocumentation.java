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
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementType <em>Element Type</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementId <em>Element Id</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementXmiId <em>Element Xmi Id</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidFrom <em>Valid From</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidTo <em>Valid To</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation()
 * @model
 * @generated
 */
public interface ElementDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #setDocumentation(String)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_Documentation()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #isSetDocumentation()
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

	/**
	 * Unsets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	void unsetDocumentation();

	/**
	 * Returns whether the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDocumentation <em>Documentation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Documentation</em>' attribute is set.
	 * @see #unsetDocumentation()
	 * @see #getDocumentation()
	 * @see #setDocumentation(String)
	 * @generated
	 */
	boolean isSetDocumentation();

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

	/**
	 * Returns the value of the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid To</em>' attribute.
	 * @see #setValidTo(Version)
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#getElementDocumentation_ValidTo()
	 * @model dataType="at.ecrit.model.plugin.modelDocumentation.Version"
	 * @generated
	 */
	Version getValidTo();

	/**
	 * Sets the value of the '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidTo <em>Valid To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valid To</em>' attribute.
	 * @see #getValidTo()
	 * @generated
	 */
	void setValidTo(Version value);

} // ElementDocumentation
