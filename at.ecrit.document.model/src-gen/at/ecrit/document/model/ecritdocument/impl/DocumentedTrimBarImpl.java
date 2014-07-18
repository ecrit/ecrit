/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.DocumentedToolBar;
import at.ecrit.document.model.ecritdocument.DocumentedTrim;
import at.ecrit.document.model.ecritdocument.DocumentedTrimBar;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import java.util.Collection;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
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
 * An implementation of the model object '<em><b>Documented Trim Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getContainedInWindow <em>Contained In Window</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getContainedTrimElements <em>Contained Trim Elements</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getContainedToolBars <em>Contained Tool Bars</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedTrimBarImpl#getContainedToolBarElements <em>Contained Tool Bar Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentedTrimBarImpl extends MinimalEObjectImpl.Container implements DocumentedTrimBar {
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
	protected MTrimBar modelElement;

	/**
	 * The cached value of the '{@link #getContainedInWindow() <em>Contained In Window</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedInWindow()
	 * @generated
	 * @ordered
	 */
	protected EList<MWindow> containedInWindow;

	/**
	 * The cached value of the '{@link #getContainedTrimElements() <em>Contained Trim Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedTrimElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedTrim> containedTrimElements;

	/**
	 * The cached value of the '{@link #getContainedToolBars() <em>Contained Tool Bars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedToolBars()
	 * @generated
	 * @ordered
	 */
	protected EList<MToolBar> containedToolBars;

	/**
	 * The cached value of the '{@link #getContainedToolBarElements() <em>Contained Tool Bar Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedToolBarElements()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedToolBar> containedToolBarElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentedTrimBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.DOCUMENTED_TRIM_BAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__PRECONDITION, oldPrecondition, precondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTrimBar getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (MTrimBar)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTrimBar basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(MTrimBar newModelElement) {
		MTrimBar oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MWindow> getContainedInWindow() {
		if (containedInWindow == null) {
			containedInWindow = new EObjectResolvingEList<MWindow>(MWindow.class, this, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_IN_WINDOW);
		}
		return containedInWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedTrim> getContainedTrimElements() {
		if (containedTrimElements == null) {
			containedTrimElements = new EObjectResolvingEList<DocumentedTrim>(DocumentedTrim.class, this, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TRIM_ELEMENTS);
		}
		return containedTrimElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MToolBar> getContainedToolBars() {
		if (containedToolBars == null) {
			containedToolBars = new EObjectResolvingEList<MToolBar>(MToolBar.class, this, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BARS);
		}
		return containedToolBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedToolBar> getContainedToolBarElements() {
		if (containedToolBarElements == null) {
			containedToolBarElements = new EObjectResolvingEList<DocumentedToolBar>(DocumentedToolBar.class, this, EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BAR_ELEMENTS);
		}
		return containedToolBarElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__DESCRIPTION:
				return getDescription();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__PRECONDITION:
				return getPrecondition();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__POSTCONDITION:
				return getPostcondition();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_IN_WINDOW:
				return getContainedInWindow();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TRIM_ELEMENTS:
				return getContainedTrimElements();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BARS:
				return getContainedToolBars();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BAR_ELEMENTS:
				return getContainedToolBarElements();
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
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__MODEL_ELEMENT:
				setModelElement((MTrimBar)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_IN_WINDOW:
				getContainedInWindow().clear();
				getContainedInWindow().addAll((Collection<? extends MWindow>)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TRIM_ELEMENTS:
				getContainedTrimElements().clear();
				getContainedTrimElements().addAll((Collection<? extends DocumentedTrim>)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BARS:
				getContainedToolBars().clear();
				getContainedToolBars().addAll((Collection<? extends MToolBar>)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BAR_ELEMENTS:
				getContainedToolBarElements().clear();
				getContainedToolBarElements().addAll((Collection<? extends DocumentedToolBar>)newValue);
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
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__MODEL_ELEMENT:
				setModelElement((MTrimBar)null);
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_IN_WINDOW:
				getContainedInWindow().clear();
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TRIM_ELEMENTS:
				getContainedTrimElements().clear();
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BARS:
				getContainedToolBars().clear();
				return;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BAR_ELEMENTS:
				getContainedToolBarElements().clear();
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
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__MODEL_ELEMENT:
				return modelElement != null;
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_IN_WINDOW:
				return containedInWindow != null && !containedInWindow.isEmpty();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TRIM_ELEMENTS:
				return containedTrimElements != null && !containedTrimElements.isEmpty();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BARS:
				return containedToolBars != null && !containedToolBars.isEmpty();
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR__CONTAINED_TOOL_BAR_ELEMENTS:
				return containedToolBarElements != null && !containedToolBarElements.isEmpty();
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

} //DocumentedTrimBarImpl
