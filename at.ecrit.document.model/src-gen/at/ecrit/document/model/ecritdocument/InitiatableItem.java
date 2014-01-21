/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.e4.ui.model.application.ui.MExpression;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;

import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.model.application.ui.menu.MToolBar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initiatable Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getItem <em>Item</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getItemType <em>Item Type</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingWindow <em>Containing Window</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingPart <em>Containing Part</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingMenu <em>Containing Menu</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingToolbar <em>Containing Toolbar</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getVisibleWhen <em>Visible When</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem()
 * @model
 * @generated
 */
public interface InitiatableItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(MItem)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem_Item()
	 * @model
	 * @generated
	 */
	MItem getItem();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(MItem value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The literals are from the enumeration {@link at.ecrit.document.model.ecritdocument.InitiatableItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
	 * @see #setItemType(InitiatableItemType)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem_ItemType()
	 * @model
	 * @generated
	 */
	InitiatableItemType getItemType();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(InitiatableItemType value);

	/**
	 * Returns the value of the '<em><b>Containing Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Window</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Window</em>' reference.
	 * @see #setContainingWindow(MWindow)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem_ContainingWindow()
	 * @model
	 * @generated
	 */
	MWindow getContainingWindow();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingWindow <em>Containing Window</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Window</em>' reference.
	 * @see #getContainingWindow()
	 * @generated
	 */
	void setContainingWindow(MWindow value);

	/**
	 * Returns the value of the '<em><b>Containing Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Part</em>' reference.
	 * @see #setContainingPart(MPart)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem_ContainingPart()
	 * @model
	 * @generated
	 */
	MPart getContainingPart();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingPart <em>Containing Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Part</em>' reference.
	 * @see #getContainingPart()
	 * @generated
	 */
	void setContainingPart(MPart value);

	/**
	 * Returns the value of the '<em><b>Containing Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Menu</em>' reference.
	 * @see #setContainingMenu(MMenu)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem_ContainingMenu()
	 * @model
	 * @generated
	 */
	MMenu getContainingMenu();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingMenu <em>Containing Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Menu</em>' reference.
	 * @see #getContainingMenu()
	 * @generated
	 */
	void setContainingMenu(MMenu value);

	/**
	 * Returns the value of the '<em><b>Containing Toolbar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Toolbar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Toolbar</em>' reference.
	 * @see #setContainingToolbar(MToolBar)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem_ContainingToolbar()
	 * @model
	 * @generated
	 */
	MToolBar getContainingToolbar();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingToolbar <em>Containing Toolbar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Toolbar</em>' reference.
	 * @see #getContainingToolbar()
	 * @generated
	 */
	void setContainingToolbar(MToolBar value);

	/**
	 * Returns the value of the '<em><b>Visible When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible When</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible When</em>' reference.
	 * @see #setVisibleWhen(MExpression)
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItem_VisibleWhen()
	 * @model
	 * @generated
	 */
	MExpression getVisibleWhen();

	/**
	 * Sets the value of the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getVisibleWhen <em>Visible When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible When</em>' reference.
	 * @see #getVisibleWhen()
	 * @generated
	 */
	void setVisibleWhen(MExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLocationDescription();

} // InitiatableItem
