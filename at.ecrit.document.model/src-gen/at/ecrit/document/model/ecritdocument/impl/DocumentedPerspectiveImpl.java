/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.DocumentedPart;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;

import java.util.Collection;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documented Perspective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl#getContainedParts <em>Contained Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentedPerspectiveImpl extends MinimalEObjectImpl.Container implements DocumentedPerspective {
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
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected MPerspective modelElement;

	/**
	 * The cached value of the '{@link #getContainedParts() <em>Contained Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedPart> containedParts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentedPerspectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.DOCUMENTED_PERSPECTIVE;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__PRECONDITION, oldPrecondition, precondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPerspective getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (MPerspective)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPerspective basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(MPerspective newModelElement) {
		MPerspective oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedPart> getContainedParts() {
		if (containedParts == null) {
			containedParts = new EObjectResolvingEList<DocumentedPart>(DocumentedPart.class, this, EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS);
		}
		return containedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__DESCRIPTION:
				return getDescription();
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__PRECONDITION:
				return getPrecondition();
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__POSTCONDITION:
				return getPostcondition();
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS:
				return getContainedParts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT:
				setModelElement((MPerspective)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS:
				getContainedParts().clear();
				getContainedParts().addAll((Collection<? extends DocumentedPart>)newValue);
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
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT:
				setModelElement((MPerspective)null);
				return;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS:
				getContainedParts().clear();
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
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT:
				return modelElement != null;
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS:
				return containedParts != null && !containedParts.isEmpty();
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
		result.append(description);
		result.append(", precondition: ");
		result.append(precondition);
		result.append(", postcondition: ");
		result.append(postcondition);
		result.append(')');
		return result.toString();
	}

} //DocumentedPerspectiveImpl
