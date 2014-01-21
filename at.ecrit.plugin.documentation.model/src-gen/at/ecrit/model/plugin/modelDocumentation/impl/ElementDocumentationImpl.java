/**
 */
package at.ecrit.model.plugin.modelDocumentation.impl;

import at.ecrit.model.plugin.modelDocumentation.ElementDocumentation;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getElementId <em>Element Id</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getElementXmiId <em>Element Xmi Id</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getValidFrom <em>Valid From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementDocumentationImpl extends MinimalEObjectImpl.Container implements ElementDocumentation {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The default value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTCONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected String postcondition = POSTCONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected String precondition = PRECONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected String elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementId() <em>Element Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementId()
	 * @generated
	 * @ordered
	 */
	protected String elementId = ELEMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementXmiId() <em>Element Xmi Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementXmiId()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_XMI_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElementXmiId() <em>Element Xmi Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementXmiId()
	 * @generated
	 * @ordered
	 */
	protected String elementXmiId = ELEMENT_XMI_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Version VALID_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValidFrom() <em>Valid From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFrom()
	 * @generated
	 * @ordered
	 */
	protected Version validFrom = VALID_FROM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelDocumentationPackage.Literals.ELEMENT_DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(String newPostcondition) {
		String oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(String newPrecondition) {
		String oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(String newElementType) {
		String oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementId() {
		return elementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementId(String newElementId) {
		String oldElementId = elementId;
		elementId = newElementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_ID, oldElementId, elementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElementXmiId() {
		return elementXmiId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementXmiId(String newElementXmiId) {
		String oldElementXmiId = elementXmiId;
		elementXmiId = newElementXmiId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID, oldElementXmiId, elementXmiId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getValidFrom() {
		return validFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFrom(Version newValidFrom) {
		Version oldValidFrom = validFrom;
		validFrom = newValidFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__VALID_FROM, oldValidFrom, validFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DESCRIPTION:
				return getDescription();
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__POSTCONDITION:
				return getPostcondition();
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__PRECONDITION:
				return getPrecondition();
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_TYPE:
				return getElementType();
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_ID:
				return getElementId();
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID:
				return getElementXmiId();
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__VALID_FROM:
				return getValidFrom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_TYPE:
				setElementType((String)newValue);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_ID:
				setElementId((String)newValue);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID:
				setElementXmiId((String)newValue);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__VALID_FROM:
				setValidFrom((Version)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DESCRIPTION:
				unsetDescription();
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_ID:
				setElementId(ELEMENT_ID_EDEFAULT);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID:
				setElementXmiId(ELEMENT_XMI_ID_EDEFAULT);
				return;
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__VALID_FROM:
				setValidFrom(VALID_FROM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DESCRIPTION:
				return isSetDescription();
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_TYPE:
				return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_ID:
				return ELEMENT_ID_EDEFAULT == null ? elementId != null : !ELEMENT_ID_EDEFAULT.equals(elementId);
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID:
				return ELEMENT_XMI_ID_EDEFAULT == null ? elementXmiId != null : !ELEMENT_XMI_ID_EDEFAULT.equals(elementXmiId);
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__VALID_FROM:
				return VALID_FROM_EDEFAULT == null ? validFrom != null : !VALID_FROM_EDEFAULT.equals(validFrom);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", elementType: ");
		result.append(elementType);
		result.append(", elementId: ");
		result.append(elementId);
		result.append(", elementXmiId: ");
		result.append(elementXmiId);
		result.append(", validFrom: ");
		result.append(validFrom);
		result.append(')');
		return result.toString();
	}

} //ElementDocumentationImpl
