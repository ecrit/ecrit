/**
 */
package at.ecrit.document.model.ecritdocument;

import java.util.Date;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Document#getStep <em>Step</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Document#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Document#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Document#getDocumentVersion <em>Document Version</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Document#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.Document#getApplicationLayout <em>Application Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link at.ecrit.document.model.ecritdocument.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocument_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocument_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Document#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocument_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Document#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Document Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Version</em>' attribute.
	 * @see #setDocumentVersion(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocument_DocumentVersion()
	 * @model
	 * @generated
	 */
	String getDocumentVersion();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Document#getDocumentVersion <em>Document Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Version</em>' attribute.
	 * @see #getDocumentVersion()
	 * @generated
	 */
	void setDocumentVersion(String value);

	/**
	 * Returns the value of the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Version</em>' attribute.
	 * @see #setProductVersion(String)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocument_ProductVersion()
	 * @model
	 * @generated
	 */
	String getProductVersion();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Document#getProductVersion <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Version</em>' attribute.
	 * @see #getProductVersion()
	 * @generated
	 */
	void setProductVersion(String value);

	/**
	 * Returns the value of the '<em><b>Application Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Layout</em>' containment reference.
	 * @see #setApplicationLayout(ApplicationLayout)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getDocument_ApplicationLayout()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ApplicationLayout getApplicationLayout();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.Document#getApplicationLayout <em>Application Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Layout</em>' containment reference.
	 * @see #getApplicationLayout()
	 * @generated
	 */
	void setApplicationLayout(ApplicationLayout value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model commandRequired="true"
	 * @generated
	 */
	CommandStep findOrCreateCommandStepByCommand(MCommand command);

} // Document
