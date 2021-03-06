/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.DocumentedMenu;
import at.ecrit.document.model.ecritdocument.DocumentedTrimBar;
import at.ecrit.document.model.ecritdocument.DocumentedWindow;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import java.util.Collection;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
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
 * An implementation of the model object '<em><b>Documented Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl#getContainedPerspective <em>Contained Perspective</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl#getContainedMenus <em>Contained Menus</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl#getContainedTrimBars <em>Contained Trim Bars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentedWindowImpl extends MinimalEObjectImpl.Container implements DocumentedWindow {
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
	protected MWindow modelElement;

	/**
	 * The cached value of the '{@link #getContainedPerspective() <em>Contained Perspective</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPerspective()
	 * @generated
	 * @ordered
	 */
	protected EList<MPerspective> containedPerspective;

	/**
	 * The cached value of the '{@link #getContainedMenus() <em>Contained Menus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedMenu> containedMenus;

	/**
	 * The cached value of the '{@link #getContainedTrimBars() <em>Contained Trim Bars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedTrimBars()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedTrimBar> containedTrimBars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentedWindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.DOCUMENTED_WINDOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_WINDOW__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_WINDOW__PRECONDITION, oldPrecondition, precondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_WINDOW__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWindow getModelElement() {
		if (modelElement != null && ((EObject)modelElement).eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = (MWindow)eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.DOCUMENTED_WINDOW__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWindow basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(MWindow newModelElement) {
		MWindow oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENTED_WINDOW__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MPerspective> getContainedPerspective() {
		if (containedPerspective == null) {
			containedPerspective = new EObjectResolvingEList<MPerspective>(MPerspective.class, this, EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE);
		}
		return containedPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedMenu> getContainedMenus() {
		if (containedMenus == null) {
			containedMenus = new EObjectResolvingEList<DocumentedMenu>(DocumentedMenu.class, this, EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_MENUS);
		}
		return containedMenus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedTrimBar> getContainedTrimBars() {
		if (containedTrimBars == null) {
			containedTrimBars = new EObjectResolvingEList<DocumentedTrimBar>(DocumentedTrimBar.class, this, EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_TRIM_BARS);
		}
		return containedTrimBars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENTED_WINDOW__DESCRIPTION:
				return getDescription();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__PRECONDITION:
				return getPrecondition();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__POSTCONDITION:
				return getPostcondition();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE:
				return getContainedPerspective();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_MENUS:
				return getContainedMenus();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_TRIM_BARS:
				return getContainedTrimBars();
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
			case EcritdocumentPackage.DOCUMENTED_WINDOW__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__MODEL_ELEMENT:
				setModelElement((MWindow)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE:
				getContainedPerspective().clear();
				getContainedPerspective().addAll((Collection<? extends MPerspective>)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_MENUS:
				getContainedMenus().clear();
				getContainedMenus().addAll((Collection<? extends DocumentedMenu>)newValue);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_TRIM_BARS:
				getContainedTrimBars().clear();
				getContainedTrimBars().addAll((Collection<? extends DocumentedTrimBar>)newValue);
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
			case EcritdocumentPackage.DOCUMENTED_WINDOW__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__MODEL_ELEMENT:
				setModelElement((MWindow)null);
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE:
				getContainedPerspective().clear();
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_MENUS:
				getContainedMenus().clear();
				return;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_TRIM_BARS:
				getContainedTrimBars().clear();
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
			case EcritdocumentPackage.DOCUMENTED_WINDOW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EcritdocumentPackage.DOCUMENTED_WINDOW__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case EcritdocumentPackage.DOCUMENTED_WINDOW__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case EcritdocumentPackage.DOCUMENTED_WINDOW__MODEL_ELEMENT:
				return modelElement != null;
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE:
				return containedPerspective != null && !containedPerspective.isEmpty();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_MENUS:
				return containedMenus != null && !containedMenus.isEmpty();
			case EcritdocumentPackage.DOCUMENTED_WINDOW__CONTAINED_TRIM_BARS:
				return containedTrimBars != null && !containedTrimBars.isEmpty();
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

} //DocumentedWindowImpl
