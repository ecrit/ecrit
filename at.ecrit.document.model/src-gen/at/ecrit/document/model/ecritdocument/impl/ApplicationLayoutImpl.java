/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.ApplicationLayout;
import at.ecrit.document.model.ecritdocument.DocumentedMenu;
import at.ecrit.document.model.ecritdocument.DocumentedPart;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.document.model.ecritdocument.DocumentedWindow;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl#getPart <em>Part</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl#getWindow <em>Window</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationLayoutImpl extends MinimalEObjectImpl.Container implements ApplicationLayout {
	/**
	 * The cached value of the '{@link #getPerspective() <em>Perspective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspective()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedPerspective> perspective;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedPart> part;

	/**
	 * The cached value of the '{@link #getWindow() <em>Window</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindow()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedWindow> window;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentedMenu> menu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.APPLICATION_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedPerspective> getPerspective() {
		if (perspective == null) {
			perspective = new EObjectContainmentEList<DocumentedPerspective>(DocumentedPerspective.class, this, EcritdocumentPackage.APPLICATION_LAYOUT__PERSPECTIVE);
		}
		return perspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedPart> getPart() {
		if (part == null) {
			part = new EObjectContainmentEList<DocumentedPart>(DocumentedPart.class, this, EcritdocumentPackage.APPLICATION_LAYOUT__PART);
		}
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedWindow> getWindow() {
		if (window == null) {
			window = new EObjectContainmentEList<DocumentedWindow>(DocumentedWindow.class, this, EcritdocumentPackage.APPLICATION_LAYOUT__WINDOW);
		}
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentedMenu> getMenu() {
		if (menu == null) {
			menu = new EObjectContainmentEList<DocumentedMenu>(DocumentedMenu.class, this, EcritdocumentPackage.APPLICATION_LAYOUT__MENU);
		}
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcritdocumentPackage.APPLICATION_LAYOUT__PERSPECTIVE:
				return ((InternalEList<?>)getPerspective()).basicRemove(otherEnd, msgs);
			case EcritdocumentPackage.APPLICATION_LAYOUT__PART:
				return ((InternalEList<?>)getPart()).basicRemove(otherEnd, msgs);
			case EcritdocumentPackage.APPLICATION_LAYOUT__WINDOW:
				return ((InternalEList<?>)getWindow()).basicRemove(otherEnd, msgs);
			case EcritdocumentPackage.APPLICATION_LAYOUT__MENU:
				return ((InternalEList<?>)getMenu()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.APPLICATION_LAYOUT__PERSPECTIVE:
				return getPerspective();
			case EcritdocumentPackage.APPLICATION_LAYOUT__PART:
				return getPart();
			case EcritdocumentPackage.APPLICATION_LAYOUT__WINDOW:
				return getWindow();
			case EcritdocumentPackage.APPLICATION_LAYOUT__MENU:
				return getMenu();
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
			case EcritdocumentPackage.APPLICATION_LAYOUT__PERSPECTIVE:
				getPerspective().clear();
				getPerspective().addAll((Collection<? extends DocumentedPerspective>)newValue);
				return;
			case EcritdocumentPackage.APPLICATION_LAYOUT__PART:
				getPart().clear();
				getPart().addAll((Collection<? extends DocumentedPart>)newValue);
				return;
			case EcritdocumentPackage.APPLICATION_LAYOUT__WINDOW:
				getWindow().clear();
				getWindow().addAll((Collection<? extends DocumentedWindow>)newValue);
				return;
			case EcritdocumentPackage.APPLICATION_LAYOUT__MENU:
				getMenu().clear();
				getMenu().addAll((Collection<? extends DocumentedMenu>)newValue);
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
			case EcritdocumentPackage.APPLICATION_LAYOUT__PERSPECTIVE:
				getPerspective().clear();
				return;
			case EcritdocumentPackage.APPLICATION_LAYOUT__PART:
				getPart().clear();
				return;
			case EcritdocumentPackage.APPLICATION_LAYOUT__WINDOW:
				getWindow().clear();
				return;
			case EcritdocumentPackage.APPLICATION_LAYOUT__MENU:
				getMenu().clear();
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
			case EcritdocumentPackage.APPLICATION_LAYOUT__PERSPECTIVE:
				return perspective != null && !perspective.isEmpty();
			case EcritdocumentPackage.APPLICATION_LAYOUT__PART:
				return part != null && !part.isEmpty();
			case EcritdocumentPackage.APPLICATION_LAYOUT__WINDOW:
				return window != null && !window.isEmpty();
			case EcritdocumentPackage.APPLICATION_LAYOUT__MENU:
				return menu != null && !menu.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationLayoutImpl
