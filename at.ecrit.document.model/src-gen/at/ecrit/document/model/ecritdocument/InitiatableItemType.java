/**
 */
package at.ecrit.document.model.ecritdocument;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Initiatable Item Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#getInitiatableItemType()
 * @model
 * @generated
 */
public enum InitiatableItemType implements Enumerator {
	/**
	 * The '<em><b>MENU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENU_VALUE
	 * @generated
	 * @ordered
	 */
	MENU(0, "MENU", "MENU"),

	/**
	 * The '<em><b>TOOLBAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOLBAR_VALUE
	 * @generated
	 * @ordered
	 */
	TOOLBAR(0, "TOOLBAR", "TOOLBAR");

	/**
	 * The '<em><b>MENU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MENU_VALUE = 0;

	/**
	 * The '<em><b>TOOLBAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOOLBAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOOLBAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOOLBAR_VALUE = 0;

	/**
	 * An array of all the '<em><b>Initiatable Item Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InitiatableItemType[] VALUES_ARRAY =
		new InitiatableItemType[] {
			MENU,
			TOOLBAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Initiatable Item Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InitiatableItemType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Initiatable Item Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiatableItemType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitiatableItemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initiatable Item Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiatableItemType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitiatableItemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initiatable Item Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitiatableItemType get(int value) {
		switch (value) {
			case MENU_VALUE: return MENU;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InitiatableItemType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InitiatableItemType
