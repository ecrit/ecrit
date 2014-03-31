/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.ApplicationProperties;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationPropertiesImpl#getAbout <em>About</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationPropertiesImpl#isRequiresLogin <em>Requires Login</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationPropertiesImpl#getRequiresInstallation <em>Requires Installation</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationPropertiesImpl#getPerspectiveSwitcher <em>Perspective Switcher</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationPropertiesImpl#isHasConceptOfMultipleUsers <em>Has Concept Of Multiple Users</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationPropertiesImpl extends MinimalEObjectImpl.Container implements ApplicationProperties {
	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresLogin() <em>Requires Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresLogin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_LOGIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresLogin() <em>Requires Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresLogin()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresLogin = REQUIRES_LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiresInstallation() <em>Requires Installation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresInstallation()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRES_INSTALLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiresInstallation() <em>Requires Installation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresInstallation()
	 * @generated
	 * @ordered
	 */
	protected String requiresInstallation = REQUIRES_INSTALLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerspectiveSwitcher() <em>Perspective Switcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveSwitcher()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSPECTIVE_SWITCHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerspectiveSwitcher() <em>Perspective Switcher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectiveSwitcher()
	 * @generated
	 * @ordered
	 */
	protected String perspectiveSwitcher = PERSPECTIVE_SWITCHER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasConceptOfMultipleUsers() <em>Has Concept Of Multiple Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasConceptOfMultipleUsers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_CONCEPT_OF_MULTIPLE_USERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasConceptOfMultipleUsers() <em>Has Concept Of Multiple Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasConceptOfMultipleUsers()
	 * @generated
	 * @ordered
	 */
	protected boolean hasConceptOfMultipleUsers = HAS_CONCEPT_OF_MULTIPLE_USERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.APPLICATION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.APPLICATION_PROPERTIES__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiresLogin() {
		return requiresLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresLogin(boolean newRequiresLogin) {
		boolean oldRequiresLogin = requiresLogin;
		requiresLogin = newRequiresLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_LOGIN, oldRequiresLogin, requiresLogin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiresInstallation() {
		return requiresInstallation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresInstallation(String newRequiresInstallation) {
		String oldRequiresInstallation = requiresInstallation;
		requiresInstallation = newRequiresInstallation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_INSTALLATION, oldRequiresInstallation, requiresInstallation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerspectiveSwitcher() {
		return perspectiveSwitcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerspectiveSwitcher(String newPerspectiveSwitcher) {
		String oldPerspectiveSwitcher = perspectiveSwitcher;
		perspectiveSwitcher = newPerspectiveSwitcher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.APPLICATION_PROPERTIES__PERSPECTIVE_SWITCHER, oldPerspectiveSwitcher, perspectiveSwitcher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasConceptOfMultipleUsers() {
		return hasConceptOfMultipleUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasConceptOfMultipleUsers(boolean newHasConceptOfMultipleUsers) {
		boolean oldHasConceptOfMultipleUsers = hasConceptOfMultipleUsers;
		hasConceptOfMultipleUsers = newHasConceptOfMultipleUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.APPLICATION_PROPERTIES__HAS_CONCEPT_OF_MULTIPLE_USERS, oldHasConceptOfMultipleUsers, hasConceptOfMultipleUsers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.APPLICATION_PROPERTIES__ABOUT:
				return getAbout();
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_LOGIN:
				return isRequiresLogin();
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_INSTALLATION:
				return getRequiresInstallation();
			case EcritdocumentPackage.APPLICATION_PROPERTIES__PERSPECTIVE_SWITCHER:
				return getPerspectiveSwitcher();
			case EcritdocumentPackage.APPLICATION_PROPERTIES__HAS_CONCEPT_OF_MULTIPLE_USERS:
				return isHasConceptOfMultipleUsers();
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
			case EcritdocumentPackage.APPLICATION_PROPERTIES__ABOUT:
				setAbout((String)newValue);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_LOGIN:
				setRequiresLogin((Boolean)newValue);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_INSTALLATION:
				setRequiresInstallation((String)newValue);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__PERSPECTIVE_SWITCHER:
				setPerspectiveSwitcher((String)newValue);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__HAS_CONCEPT_OF_MULTIPLE_USERS:
				setHasConceptOfMultipleUsers((Boolean)newValue);
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
			case EcritdocumentPackage.APPLICATION_PROPERTIES__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_LOGIN:
				setRequiresLogin(REQUIRES_LOGIN_EDEFAULT);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_INSTALLATION:
				setRequiresInstallation(REQUIRES_INSTALLATION_EDEFAULT);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__PERSPECTIVE_SWITCHER:
				setPerspectiveSwitcher(PERSPECTIVE_SWITCHER_EDEFAULT);
				return;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__HAS_CONCEPT_OF_MULTIPLE_USERS:
				setHasConceptOfMultipleUsers(HAS_CONCEPT_OF_MULTIPLE_USERS_EDEFAULT);
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
			case EcritdocumentPackage.APPLICATION_PROPERTIES__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_LOGIN:
				return requiresLogin != REQUIRES_LOGIN_EDEFAULT;
			case EcritdocumentPackage.APPLICATION_PROPERTIES__REQUIRES_INSTALLATION:
				return REQUIRES_INSTALLATION_EDEFAULT == null ? requiresInstallation != null : !REQUIRES_INSTALLATION_EDEFAULT.equals(requiresInstallation);
			case EcritdocumentPackage.APPLICATION_PROPERTIES__PERSPECTIVE_SWITCHER:
				return PERSPECTIVE_SWITCHER_EDEFAULT == null ? perspectiveSwitcher != null : !PERSPECTIVE_SWITCHER_EDEFAULT.equals(perspectiveSwitcher);
			case EcritdocumentPackage.APPLICATION_PROPERTIES__HAS_CONCEPT_OF_MULTIPLE_USERS:
				return hasConceptOfMultipleUsers != HAS_CONCEPT_OF_MULTIPLE_USERS_EDEFAULT;
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
		result.append(" (about: ");
		result.append(about);
		result.append(", requiresLogin: ");
		result.append(requiresLogin);
		result.append(", requiresInstallation: ");
		result.append(requiresInstallation);
		result.append(", perspectiveSwitcher: ");
		result.append(perspectiveSwitcher);
		result.append(", hasConceptOfMultipleUsers: ");
		result.append(hasConceptOfMultipleUsers);
		result.append(')');
		return result.toString();
	}

} //ApplicationPropertiesImpl
