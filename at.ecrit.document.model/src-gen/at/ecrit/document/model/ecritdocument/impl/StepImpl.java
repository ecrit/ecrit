/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import at.ecrit.document.model.ecritdocument.ErrorMessage;
import at.ecrit.document.model.ecritdocument.InitiatableItem;
import at.ecrit.document.model.ecritdocument.Step;
import at.ecrit.document.model.ecritdocument.User;
import java.util.Collection;
import org.eclipse.e4.ui.model.application.commands.MKeyBinding;
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
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.StepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.StepImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.StepImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.StepImpl#getExecutableBy <em>Executable By</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.StepImpl#getInitiatableBy <em>Initiatable By</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.StepImpl#getPossibleError <em>Possible Error</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.StepImpl#getKeybinding <em>Keybinding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The cached value of the '{@link #getExecutableBy() <em>Executable By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutableBy()
	 * @generated
	 * @ordered
	 */
	protected EList<User> executableBy;

	/**
	 * The cached value of the '{@link #getInitiatableBy() <em>Initiatable By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiatableBy()
	 * @generated
	 * @ordered
	 */
	protected EList<InitiatableItem> initiatableBy;

	/**
	 * The cached value of the '{@link #getPossibleError() <em>Possible Error</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleError()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorMessage> possibleError;

	/**
	 * The cached value of the '{@link #getKeybinding() <em>Keybinding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeybinding()
	 * @generated
	 * @ordered
	 */
	protected MKeyBinding keybinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.STEP__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.STEP__PRECONDITION, oldPrecondition, precondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.STEP__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getExecutableBy() {
		if (executableBy == null) {
			executableBy = new EObjectResolvingEList<User>(User.class, this, EcritdocumentPackage.STEP__EXECUTABLE_BY);
		}
		return executableBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InitiatableItem> getInitiatableBy() {
		if (initiatableBy == null) {
			initiatableBy = new EObjectResolvingEList<InitiatableItem>(InitiatableItem.class, this, EcritdocumentPackage.STEP__INITIATABLE_BY);
		}
		return initiatableBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorMessage> getPossibleError() {
		if (possibleError == null) {
			possibleError = new EObjectResolvingEList<ErrorMessage>(ErrorMessage.class, this, EcritdocumentPackage.STEP__POSSIBLE_ERROR);
		}
		return possibleError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKeyBinding getKeybinding() {
		if (keybinding != null && ((EObject)keybinding).eIsProxy()) {
			InternalEObject oldKeybinding = (InternalEObject)keybinding;
			keybinding = (MKeyBinding)eResolveProxy(oldKeybinding);
			if (keybinding != oldKeybinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.STEP__KEYBINDING, oldKeybinding, keybinding));
			}
		}
		return keybinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MKeyBinding basicGetKeybinding() {
		return keybinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeybinding(MKeyBinding newKeybinding) {
		MKeyBinding oldKeybinding = keybinding;
		keybinding = newKeybinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.STEP__KEYBINDING, oldKeybinding, keybinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.STEP__DESCRIPTION:
				return getDescription();
			case EcritdocumentPackage.STEP__PRECONDITION:
				return getPrecondition();
			case EcritdocumentPackage.STEP__POSTCONDITION:
				return getPostcondition();
			case EcritdocumentPackage.STEP__EXECUTABLE_BY:
				return getExecutableBy();
			case EcritdocumentPackage.STEP__INITIATABLE_BY:
				return getInitiatableBy();
			case EcritdocumentPackage.STEP__POSSIBLE_ERROR:
				return getPossibleError();
			case EcritdocumentPackage.STEP__KEYBINDING:
				if (resolve) return getKeybinding();
				return basicGetKeybinding();
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
			case EcritdocumentPackage.STEP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EcritdocumentPackage.STEP__PRECONDITION:
				setPrecondition((String)newValue);
				return;
			case EcritdocumentPackage.STEP__POSTCONDITION:
				setPostcondition((String)newValue);
				return;
			case EcritdocumentPackage.STEP__EXECUTABLE_BY:
				getExecutableBy().clear();
				getExecutableBy().addAll((Collection<? extends User>)newValue);
				return;
			case EcritdocumentPackage.STEP__INITIATABLE_BY:
				getInitiatableBy().clear();
				getInitiatableBy().addAll((Collection<? extends InitiatableItem>)newValue);
				return;
			case EcritdocumentPackage.STEP__POSSIBLE_ERROR:
				getPossibleError().clear();
				getPossibleError().addAll((Collection<? extends ErrorMessage>)newValue);
				return;
			case EcritdocumentPackage.STEP__KEYBINDING:
				setKeybinding((MKeyBinding)newValue);
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
			case EcritdocumentPackage.STEP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EcritdocumentPackage.STEP__PRECONDITION:
				setPrecondition(PRECONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.STEP__POSTCONDITION:
				setPostcondition(POSTCONDITION_EDEFAULT);
				return;
			case EcritdocumentPackage.STEP__EXECUTABLE_BY:
				getExecutableBy().clear();
				return;
			case EcritdocumentPackage.STEP__INITIATABLE_BY:
				getInitiatableBy().clear();
				return;
			case EcritdocumentPackage.STEP__POSSIBLE_ERROR:
				getPossibleError().clear();
				return;
			case EcritdocumentPackage.STEP__KEYBINDING:
				setKeybinding((MKeyBinding)null);
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
			case EcritdocumentPackage.STEP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EcritdocumentPackage.STEP__PRECONDITION:
				return PRECONDITION_EDEFAULT == null ? precondition != null : !PRECONDITION_EDEFAULT.equals(precondition);
			case EcritdocumentPackage.STEP__POSTCONDITION:
				return POSTCONDITION_EDEFAULT == null ? postcondition != null : !POSTCONDITION_EDEFAULT.equals(postcondition);
			case EcritdocumentPackage.STEP__EXECUTABLE_BY:
				return executableBy != null && !executableBy.isEmpty();
			case EcritdocumentPackage.STEP__INITIATABLE_BY:
				return initiatableBy != null && !initiatableBy.isEmpty();
			case EcritdocumentPackage.STEP__POSSIBLE_ERROR:
				return possibleError != null && !possibleError.isEmpty();
			case EcritdocumentPackage.STEP__KEYBINDING:
				return keybinding != null;
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

} //StepImpl
