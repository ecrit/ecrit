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
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl#getDocumentation <em>Documentation</em>}</li>
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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * This is true if the Documentation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean documentationESet;

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
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		boolean oldDocumentationESet = documentationESet;
		documentationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DOCUMENTATION, oldDocumentation, documentation, !oldDocumentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDocumentation() {
		String oldDocumentation = documentation;
		boolean oldDocumentationESet = documentationESet;
		documentation = DOCUMENTATION_EDEFAULT;
		documentationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DOCUMENTATION, oldDocumentation, DOCUMENTATION_EDEFAULT, oldDocumentationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDocumentation() {
		return documentationESet;
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
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DOCUMENTATION:
				return getDocumentation();
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
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DOCUMENTATION:
				setDocumentation((String)newValue);
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
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DOCUMENTATION:
				unsetDocumentation();
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
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION__DOCUMENTATION:
				return isSetDocumentation();
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
		result.append(" (documentation: ");
		if (documentationESet) result.append(documentation); else result.append("<unset>");
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
