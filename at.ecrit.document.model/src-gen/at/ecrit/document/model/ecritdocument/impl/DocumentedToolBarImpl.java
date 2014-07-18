/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.DocumentedToolBar;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;

import java.util.Collection;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;

import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBarElement;

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
 * An implementation of the model object '<em><b>Documented Tool Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedToolBarImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedToolBarImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedToolBarImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedToolBarImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedToolBarImpl#getContainedInTrimBar <em>Contained In Trim Bar</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedToolBarImpl#getContainedInToolBar <em>Contained In Tool Bar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentedToolBarImpl extends MinimalEObjectImpl.Container implements DocumentedToolBar {
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
	protected MToolBarElement modelElement;

	/**
	 * The cached value of the '{@link #getContainedInTrimBar() <em>Contained In Trim Bar</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedInTrimBar()
	 * @generated
	 * @ordered
	 */
	protected EList<MTrimBar> containedInTrimBar;

	/**
	 * The cached value of the '{@link #getContainedInToolBar() <em>Contained In Tool Bar</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedInToolBar()
	 * @generated
	 * @ordered
	 */
	protected EList<MToolBar> containedInToolBar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentedToolBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.DOCUMENTED_TOOL_BAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TOOL_BAR__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TOOL_BAR__PRECONDITION, oldPrecondition, precondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TOOL_BAR__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MToolBarElement getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (MToolBarElement)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.DOCUMENTED_TOOL_BAR__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MToolBarElement basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(MToolBarElement newModelElement) {
		MToolBarElement oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TOOL_BAR__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MTrimBar> getContainedInTrimBar() {
		if (containedInTrimBar == null) {
			containedInTrimBar = new EObjectResolvingEList<MTrimBar>(MTrimBar.class, this, EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TRIM_BAR);
		}
		return containedInTrimBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MToolBar> getContainedInToolBar() {
		if (containedInToolBar == null) {
			containedInToolBar = new EObjectResolvingEList<MToolBar>(MToolBar.class, this, EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TOOL_BAR);
		}
		return containedInToolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__DESCRIPTION:
				return getDescription();
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__PRECONDITION:
				return getPrecondition();
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__POSTCONDITION:
				return getPostcondition();
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TRIM_BAR:
				return getContainedInTrimBar();
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TOOL_BAR:
				return getContainedInToolBar();
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
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__MODEL_ELEMENT:
				setModelElement((MToolBarElement)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TRIM_BAR:
				getContainedInTrimBar().clear();
				getContainedInTrimBar().addAll((Collection<? extends MTrimBar>)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TOOL_BAR:
				getContainedInToolBar().clear();
				getContainedInToolBar().addAll((Collection<? extends MToolBar>)newValue);
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
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__MODEL_ELEMENT:
				setModelElement((MToolBarElement)null);
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TRIM_BAR:
				getContainedInTrimBar().clear();
				return;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TOOL_BAR:
				getContainedInToolBar().clear();
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
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__MODEL_ELEMENT:
				return modelElement != null;
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TRIM_BAR:
				return containedInTrimBar != null && !containedInTrimBar.isEmpty();
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR__CONTAINED_IN_TOOL_BAR:
				return containedInToolBar != null && !containedInToolBar.isEmpty();
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

} //DocumentedToolBarImpl
