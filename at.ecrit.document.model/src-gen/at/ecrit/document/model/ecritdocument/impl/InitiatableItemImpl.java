/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import at.ecrit.document.model.ecritdocument.InitiatableItem;
import at.ecrit.document.model.ecritdocument.InitiatableItemType;
import at.ecrit.document.model.methods.InitiatableItemMethods;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.e4.ui.model.application.ui.MExpression;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initiatable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl#getItem <em>Item</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl#getItemType <em>Item Type</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl#getContainingWindow <em>Containing Window</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl#getContainingPart <em>Containing Part</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl#getContainingMenu <em>Containing Menu</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl#getContainingToolbar <em>Containing Toolbar</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl#getVisibleWhen <em>Visible When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InitiatableItemImpl extends MinimalEObjectImpl.Container implements InitiatableItem {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected MItem item;

	/**
	 * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected static final InitiatableItemType ITEM_TYPE_EDEFAULT = InitiatableItemType.MENU;

	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated
	 * @ordered
	 */
	protected InitiatableItemType itemType = ITEM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainingWindow() <em>Containing Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingWindow()
	 * @generated
	 * @ordered
	 */
	protected MWindow containingWindow;

	/**
	 * The cached value of the '{@link #getContainingPart() <em>Containing Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingPart()
	 * @generated
	 * @ordered
	 */
	protected MPart containingPart;

	/**
	 * The cached value of the '{@link #getContainingMenu() <em>Containing Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingMenu()
	 * @generated
	 * @ordered
	 */
	protected MMenu containingMenu;

	/**
	 * The cached value of the '{@link #getContainingToolbar() <em>Containing Toolbar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingToolbar()
	 * @generated
	 * @ordered
	 */
	protected MToolBar containingToolbar;

	/**
	 * The cached value of the '{@link #getVisibleWhen() <em>Visible When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleWhen()
	 * @generated
	 * @ordered
	 */
	protected MExpression visibleWhen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitiatableItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.INITIATABLE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MItem getItem() {
		if (item != null && ((EObject)item).eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (MItem)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.INITIATABLE_ITEM__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MItem basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(MItem newItem) {
		MItem oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.INITIATABLE_ITEM__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiatableItemType getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemType(InitiatableItemType newItemType) {
		InitiatableItemType oldItemType = itemType;
		itemType = newItemType == null ? ITEM_TYPE_EDEFAULT : newItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.INITIATABLE_ITEM__ITEM_TYPE, oldItemType, itemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWindow getContainingWindow() {
		if (containingWindow != null && ((EObject)containingWindow).eIsProxy()) {
			InternalEObject oldContainingWindow = (InternalEObject)containingWindow;
			containingWindow = (MWindow)eResolveProxy(oldContainingWindow);
			if (containingWindow != oldContainingWindow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_WINDOW, oldContainingWindow, containingWindow));
			}
		}
		return containingWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWindow basicGetContainingWindow() {
		return containingWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingWindow(MWindow newContainingWindow) {
		MWindow oldContainingWindow = containingWindow;
		containingWindow = newContainingWindow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_WINDOW, oldContainingWindow, containingWindow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPart getContainingPart() {
		if (containingPart != null && ((EObject)containingPart).eIsProxy()) {
			InternalEObject oldContainingPart = (InternalEObject)containingPart;
			containingPart = (MPart)eResolveProxy(oldContainingPart);
			if (containingPart != oldContainingPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_PART, oldContainingPart, containingPart));
			}
		}
		return containingPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPart basicGetContainingPart() {
		return containingPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingPart(MPart newContainingPart) {
		MPart oldContainingPart = containingPart;
		containingPart = newContainingPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_PART, oldContainingPart, containingPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMenu getContainingMenu() {
		if (containingMenu != null && ((EObject)containingMenu).eIsProxy()) {
			InternalEObject oldContainingMenu = (InternalEObject)containingMenu;
			containingMenu = (MMenu)eResolveProxy(oldContainingMenu);
			if (containingMenu != oldContainingMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_MENU, oldContainingMenu, containingMenu));
			}
		}
		return containingMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMenu basicGetContainingMenu() {
		return containingMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingMenu(MMenu newContainingMenu) {
		MMenu oldContainingMenu = containingMenu;
		containingMenu = newContainingMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_MENU, oldContainingMenu, containingMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MToolBar getContainingToolbar() {
		if (containingToolbar != null && ((EObject)containingToolbar).eIsProxy()) {
			InternalEObject oldContainingToolbar = (InternalEObject)containingToolbar;
			containingToolbar = (MToolBar)eResolveProxy(oldContainingToolbar);
			if (containingToolbar != oldContainingToolbar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_TOOLBAR, oldContainingToolbar, containingToolbar));
			}
		}
		return containingToolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MToolBar basicGetContainingToolbar() {
		return containingToolbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingToolbar(MToolBar newContainingToolbar) {
		MToolBar oldContainingToolbar = containingToolbar;
		containingToolbar = newContainingToolbar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_TOOLBAR, oldContainingToolbar, containingToolbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MExpression getVisibleWhen() {
		if (visibleWhen != null && ((EObject)visibleWhen).eIsProxy()) {
			InternalEObject oldVisibleWhen = (InternalEObject)visibleWhen;
			visibleWhen = (MExpression)eResolveProxy(oldVisibleWhen);
			if (visibleWhen != oldVisibleWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.INITIATABLE_ITEM__VISIBLE_WHEN, oldVisibleWhen, visibleWhen));
			}
		}
		return visibleWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MExpression basicGetVisibleWhen() {
		return visibleWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleWhen(MExpression newVisibleWhen) {
		MExpression oldVisibleWhen = visibleWhen;
		visibleWhen = newVisibleWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.INITIATABLE_ITEM__VISIBLE_WHEN, oldVisibleWhen, visibleWhen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getLocationDescription() {
		return InitiatableItemMethods.getLocationDescription(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM_TYPE:
				return getItemType();
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_WINDOW:
				if (resolve) return getContainingWindow();
				return basicGetContainingWindow();
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_PART:
				if (resolve) return getContainingPart();
				return basicGetContainingPart();
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_MENU:
				if (resolve) return getContainingMenu();
				return basicGetContainingMenu();
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_TOOLBAR:
				if (resolve) return getContainingToolbar();
				return basicGetContainingToolbar();
			case EcritdocumentPackage.INITIATABLE_ITEM__VISIBLE_WHEN:
				if (resolve) return getVisibleWhen();
				return basicGetVisibleWhen();
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
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM:
				setItem((MItem)newValue);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM_TYPE:
				setItemType((InitiatableItemType)newValue);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_WINDOW:
				setContainingWindow((MWindow)newValue);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_PART:
				setContainingPart((MPart)newValue);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_MENU:
				setContainingMenu((MMenu)newValue);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_TOOLBAR:
				setContainingToolbar((MToolBar)newValue);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__VISIBLE_WHEN:
				setVisibleWhen((MExpression)newValue);
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
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM:
				setItem((MItem)null);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM_TYPE:
				setItemType(ITEM_TYPE_EDEFAULT);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_WINDOW:
				setContainingWindow((MWindow)null);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_PART:
				setContainingPart((MPart)null);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_MENU:
				setContainingMenu((MMenu)null);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_TOOLBAR:
				setContainingToolbar((MToolBar)null);
				return;
			case EcritdocumentPackage.INITIATABLE_ITEM__VISIBLE_WHEN:
				setVisibleWhen((MExpression)null);
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
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM:
				return item != null;
			case EcritdocumentPackage.INITIATABLE_ITEM__ITEM_TYPE:
				return itemType != ITEM_TYPE_EDEFAULT;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_WINDOW:
				return containingWindow != null;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_PART:
				return containingPart != null;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_MENU:
				return containingMenu != null;
			case EcritdocumentPackage.INITIATABLE_ITEM__CONTAINING_TOOLBAR:
				return containingToolbar != null;
			case EcritdocumentPackage.INITIATABLE_ITEM__VISIBLE_WHEN:
				return visibleWhen != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EcritdocumentPackage.INITIATABLE_ITEM___GET_LOCATION_DESCRIPTION:
				return getLocationDescription();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (itemType: ");
		result.append(itemType);
		result.append(')');
		return result.toString();
	}

} //InitiatableItemImpl
