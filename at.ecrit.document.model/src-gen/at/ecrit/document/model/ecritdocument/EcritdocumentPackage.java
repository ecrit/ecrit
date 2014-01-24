/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentFactory
 * @model kind="package"
 * @generated
 */
public interface EcritdocumentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecritdocument";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecrit.at/model/document/2014";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecritdocument";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcritdocumentPackage eINSTANCE = at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.DocumentedElement <em>Documented Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.DocumentedElement
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedElement()
	 * @generated
	 */
	int DOCUMENTED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT__POSTCONDITION = 2;

	/**
	 * The number of structural features of the '<em>Documented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Documented Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.StepImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = DOCUMENTED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PRECONDITION = DOCUMENTED_ELEMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__POSTCONDITION = DOCUMENTED_ELEMENT__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Executable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__EXECUTABLE_BY = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initiatable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INITIATABLE_BY = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Possible Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__POSSIBLE_ERROR = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Keybinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__KEYBINDING = DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = DOCUMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.CommandStepImpl <em>Command Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.CommandStepImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getCommandStep()
	 * @generated
	 */
	int COMMAND_STEP = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__DESCRIPTION = STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__PRECONDITION = STEP__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__POSTCONDITION = STEP__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Executable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__EXECUTABLE_BY = STEP__EXECUTABLE_BY;

	/**
	 * The feature id for the '<em><b>Initiatable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__INITIATABLE_BY = STEP__INITIATABLE_BY;

	/**
	 * The feature id for the '<em><b>Possible Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__POSSIBLE_ERROR = STEP__POSSIBLE_ERROR;

	/**
	 * The feature id for the '<em><b>Keybinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__KEYBINDING = STEP__KEYBINDING;

	/**
	 * The feature id for the '<em><b>Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP__COMMAND = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.DocumentImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STEP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CREATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Document Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Product Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PRODUCT_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Application Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__APPLICATION_LAYOUT = 5;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Find Or Create Command Step By Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___FIND_OR_CREATE_COMMAND_STEP_BY_COMMAND__MCOMMAND = 0;

	/**
	 * The operation id for the '<em>Generate Depictable Item PNG Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GENERATE_DEPICTABLE_ITEM_PNG_IMAGES__STRING = 1;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.UserImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.ErrorMessageImpl <em>Error Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.ErrorMessageImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getErrorMessage()
	 * @generated
	 */
	int ERROR_MESSAGE = 4;

	/**
	 * The number of structural features of the '<em>Error Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Error Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.DirectStepImpl <em>Direct Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.DirectStepImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDirectStep()
	 * @generated
	 */
	int DIRECT_STEP = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__DESCRIPTION = STEP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__PRECONDITION = STEP__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__POSTCONDITION = STEP__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Executable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__EXECUTABLE_BY = STEP__EXECUTABLE_BY;

	/**
	 * The feature id for the '<em><b>Initiatable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__INITIATABLE_BY = STEP__INITIATABLE_BY;

	/**
	 * The feature id for the '<em><b>Possible Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__POSSIBLE_ERROR = STEP__POSSIBLE_ERROR;

	/**
	 * The feature id for the '<em><b>Keybinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__KEYBINDING = STEP__KEYBINDING;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP__CONTRIBUTION = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Direct Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl <em>Initiatable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getInitiatableItem()
	 * @generated
	 */
	int INITIATABLE_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM__ITEM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Containing Window</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM__CONTAINING_WINDOW = 2;

	/**
	 * The feature id for the '<em><b>Containing Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM__CONTAINING_PART = 3;

	/**
	 * The feature id for the '<em><b>Containing Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM__CONTAINING_MENU = 4;

	/**
	 * The feature id for the '<em><b>Containing Toolbar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM__CONTAINING_TOOLBAR = 5;

	/**
	 * The feature id for the '<em><b>Visible When</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM__VISIBLE_WHEN = 6;

	/**
	 * The number of structural features of the '<em>Initiatable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Location Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM___GET_LOCATION_DESCRIPTION = 0;

	/**
	 * The number of operations of the '<em>Initiatable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIATABLE_ITEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl <em>Application Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getApplicationLayout()
	 * @generated
	 */
	int APPLICATION_LAYOUT = 7;

	/**
	 * The feature id for the '<em><b>Perspective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYOUT__PERSPECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYOUT__PART = 1;

	/**
	 * The feature id for the '<em><b>Window</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYOUT__WINDOW = 2;

	/**
	 * The number of structural features of the '<em>Application Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl <em>Documented Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedPerspective()
	 * @generated
	 */
	int DOCUMENTED_PERSPECTIVE = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE__DESCRIPTION = DOCUMENTED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE__PRECONDITION = DOCUMENTED_ELEMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE__POSTCONDITION = DOCUMENTED_ELEMENT__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documented Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Generate PNG Depiction Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE___GENERATE_PNG_DEPICTION_IMAGE = DOCUMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Element Depiction Image Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE___GET_ELEMENT_DEPICTION_IMAGE_NAME = DOCUMENTED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Documented Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PERSPECTIVE_OPERATION_COUNT = DOCUMENTED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.Depictable <em>Depictable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.Depictable
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDepictable()
	 * @generated
	 */
	int DEPICTABLE = 10;

	/**
	 * The number of structural features of the '<em>Depictable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPICTABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Generate PNG Depiction Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPICTABLE___GENERATE_PNG_DEPICTION_IMAGE = 0;

	/**
	 * The operation id for the '<em>Get Element Depiction Image Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPICTABLE___GET_ELEMENT_DEPICTION_IMAGE_NAME = 1;

	/**
	 * The number of operations of the '<em>Depictable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPICTABLE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPartImpl <em>Documented Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.DocumentedPartImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedPart()
	 * @generated
	 */
	int DOCUMENTED_PART = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PART__DESCRIPTION = DOCUMENTED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PART__PRECONDITION = DOCUMENTED_ELEMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PART__POSTCONDITION = DOCUMENTED_ELEMENT__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PART__MODEL_ELEMENT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained In Perspective</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PART__CONTAINED_IN_PERSPECTIVE = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documented Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PART_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Documented Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_PART_OPERATION_COUNT = DOCUMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl <em>Documented Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedWindow()
	 * @generated
	 */
	int DOCUMENTED_WINDOW = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_WINDOW__DESCRIPTION = DOCUMENTED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_WINDOW__PRECONDITION = DOCUMENTED_ELEMENT__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_WINDOW__POSTCONDITION = DOCUMENTED_ELEMENT__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_WINDOW__MODEL_ELEMENT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Perspective</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE = DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Documented Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_WINDOW_FEATURE_COUNT = DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Documented Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTED_WINDOW_OPERATION_COUNT = DOCUMENTED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.InitiatableItemType <em>Initiatable Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getInitiatableItemType()
	 * @generated
	 */
	int INITIATABLE_ITEM_TYPE = 13;


	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 14;


	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.CommandStep <em>Command Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Step</em>'.
	 * @see at.ecrit.document.model.ecritdocument.CommandStep
	 * @generated
	 */
	EClass getCommandStep();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.CommandStep#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Command</em>'.
	 * @see at.ecrit.document.model.ecritdocument.CommandStep#getCommand()
	 * @see #getCommandStep()
	 * @generated
	 */
	EReference getCommandStep_Command();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference list '{@link at.ecrit.document.model.ecritdocument.Step#getExecutableBy <em>Executable By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executable By</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step#getExecutableBy()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ExecutableBy();

	/**
	 * Returns the meta object for the reference list '{@link at.ecrit.document.model.ecritdocument.Step#getInitiatableBy <em>Initiatable By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Initiatable By</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step#getInitiatableBy()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_InitiatableBy();

	/**
	 * Returns the meta object for the reference list '{@link at.ecrit.document.model.ecritdocument.Step#getPossibleError <em>Possible Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Possible Error</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step#getPossibleError()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_PossibleError();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.Step#getKeybinding <em>Keybinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Keybinding</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step#getKeybinding()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Keybinding();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ecrit.document.model.ecritdocument.Document#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Document#getStep()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Step();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.Document#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Document#getCreationDate()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.Document#getDocumentVersion <em>Document Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Version</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Document#getDocumentVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentVersion();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.Document#getProductVersion <em>Product Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Version</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Document#getProductVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_ProductVersion();

	/**
	 * Returns the meta object for the containment reference '{@link at.ecrit.document.model.ecritdocument.Document#getApplicationLayout <em>Application Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application Layout</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Document#getApplicationLayout()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_ApplicationLayout();

	/**
	 * Returns the meta object for the '{@link at.ecrit.document.model.ecritdocument.Document#findOrCreateCommandStepByCommand(org.eclipse.e4.ui.model.application.commands.MCommand) <em>Find Or Create Command Step By Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Or Create Command Step By Command</em>' operation.
	 * @see at.ecrit.document.model.ecritdocument.Document#findOrCreateCommandStepByCommand(org.eclipse.e4.ui.model.application.commands.MCommand)
	 * @generated
	 */
	EOperation getDocument__FindOrCreateCommandStepByCommand__MCommand();

	/**
	 * Returns the meta object for the '{@link at.ecrit.document.model.ecritdocument.Document#generateDepictableItemPNGImages(java.lang.String) <em>Generate Depictable Item PNG Images</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Depictable Item PNG Images</em>' operation.
	 * @see at.ecrit.document.model.ecritdocument.Document#generateDepictableItemPNGImages(java.lang.String)
	 * @generated
	 */
	EOperation getDocument__GenerateDepictableItemPNGImages__String();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see at.ecrit.document.model.ecritdocument.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.ErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Message</em>'.
	 * @see at.ecrit.document.model.ecritdocument.ErrorMessage
	 * @generated
	 */
	EClass getErrorMessage();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.DirectStep <em>Direct Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Step</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DirectStep
	 * @generated
	 */
	EClass getDirectStep();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.DirectStep#getContribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contribution</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DirectStep#getContribution()
	 * @see #getDirectStep()
	 * @generated
	 */
	EReference getDirectStep_Contribution();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.InitiatableItem <em>Initiatable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initiatable Item</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem
	 * @generated
	 */
	EClass getInitiatableItem();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getItem()
	 * @see #getInitiatableItem()
	 * @generated
	 */
	EReference getInitiatableItem_Item();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Type</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getItemType()
	 * @see #getInitiatableItem()
	 * @generated
	 */
	EAttribute getInitiatableItem_ItemType();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingWindow <em>Containing Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Window</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingWindow()
	 * @see #getInitiatableItem()
	 * @generated
	 */
	EReference getInitiatableItem_ContainingWindow();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingPart <em>Containing Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Part</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingPart()
	 * @see #getInitiatableItem()
	 * @generated
	 */
	EReference getInitiatableItem_ContainingPart();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingMenu <em>Containing Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Menu</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingMenu()
	 * @see #getInitiatableItem()
	 * @generated
	 */
	EReference getInitiatableItem_ContainingMenu();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingToolbar <em>Containing Toolbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Toolbar</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getContainingToolbar()
	 * @see #getInitiatableItem()
	 * @generated
	 */
	EReference getInitiatableItem_ContainingToolbar();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getVisibleWhen <em>Visible When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Visible When</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getVisibleWhen()
	 * @see #getInitiatableItem()
	 * @generated
	 */
	EReference getInitiatableItem_VisibleWhen();

	/**
	 * Returns the meta object for the '{@link at.ecrit.document.model.ecritdocument.InitiatableItem#getLocationDescription() <em>Get Location Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Location Description</em>' operation.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem#getLocationDescription()
	 * @generated
	 */
	EOperation getInitiatableItem__GetLocationDescription();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.ApplicationLayout <em>Application Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Layout</em>'.
	 * @see at.ecrit.document.model.ecritdocument.ApplicationLayout
	 * @generated
	 */
	EClass getApplicationLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getPerspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perspective</em>'.
	 * @see at.ecrit.document.model.ecritdocument.ApplicationLayout#getPerspective()
	 * @see #getApplicationLayout()
	 * @generated
	 */
	EReference getApplicationLayout_Perspective();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see at.ecrit.document.model.ecritdocument.ApplicationLayout#getPart()
	 * @see #getApplicationLayout()
	 * @generated
	 */
	EReference getApplicationLayout_Part();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ecrit.document.model.ecritdocument.ApplicationLayout#getWindow <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Window</em>'.
	 * @see at.ecrit.document.model.ecritdocument.ApplicationLayout#getWindow()
	 * @see #getApplicationLayout()
	 * @generated
	 */
	EReference getApplicationLayout_Window();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.DocumentedElement <em>Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Element</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedElement
	 * @generated
	 */
	EClass getDocumentedElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.DocumentedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedElement#getDescription()
	 * @see #getDocumentedElement()
	 * @generated
	 */
	EAttribute getDocumentedElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.DocumentedElement#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedElement#getPrecondition()
	 * @see #getDocumentedElement()
	 * @generated
	 */
	EAttribute getDocumentedElement_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.DocumentedElement#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedElement#getPostcondition()
	 * @see #getDocumentedElement()
	 * @generated
	 */
	EAttribute getDocumentedElement_Postcondition();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.DocumentedPerspective <em>Documented Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Perspective</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPerspective
	 * @generated
	 */
	EClass getDocumentedPerspective();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.DocumentedPerspective#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPerspective#getModelElement()
	 * @see #getDocumentedPerspective()
	 * @generated
	 */
	EReference getDocumentedPerspective_ModelElement();

	/**
	 * Returns the meta object for the reference list '{@link at.ecrit.document.model.ecritdocument.DocumentedPerspective#getContainedParts <em>Contained Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Parts</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPerspective#getContainedParts()
	 * @see #getDocumentedPerspective()
	 * @generated
	 */
	EReference getDocumentedPerspective_ContainedParts();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.Depictable <em>Depictable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depictable</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Depictable
	 * @generated
	 */
	EClass getDepictable();

	/**
	 * Returns the meta object for the '{@link at.ecrit.document.model.ecritdocument.Depictable#generatePNGDepictionImage() <em>Generate PNG Depiction Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate PNG Depiction Image</em>' operation.
	 * @see at.ecrit.document.model.ecritdocument.Depictable#generatePNGDepictionImage()
	 * @generated
	 */
	EOperation getDepictable__GeneratePNGDepictionImage();

	/**
	 * Returns the meta object for the '{@link at.ecrit.document.model.ecritdocument.Depictable#getElementDepictionImageName() <em>Get Element Depiction Image Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element Depiction Image Name</em>' operation.
	 * @see at.ecrit.document.model.ecritdocument.Depictable#getElementDepictionImageName()
	 * @generated
	 */
	EOperation getDepictable__GetElementDepictionImageName();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.DocumentedPart <em>Documented Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Part</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPart
	 * @generated
	 */
	EClass getDocumentedPart();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.DocumentedPart#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPart#getModelElement()
	 * @see #getDocumentedPart()
	 * @generated
	 */
	EReference getDocumentedPart_ModelElement();

	/**
	 * Returns the meta object for the reference list '{@link at.ecrit.document.model.ecritdocument.DocumentedPart#getContainedInPerspective <em>Contained In Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained In Perspective</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPart#getContainedInPerspective()
	 * @see #getDocumentedPart()
	 * @generated
	 */
	EReference getDocumentedPart_ContainedInPerspective();

	/**
	 * Returns the meta object for class '{@link at.ecrit.document.model.ecritdocument.DocumentedWindow <em>Documented Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documented Window</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedWindow
	 * @generated
	 */
	EClass getDocumentedWindow();

	/**
	 * Returns the meta object for the reference '{@link at.ecrit.document.model.ecritdocument.DocumentedWindow#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedWindow#getModelElement()
	 * @see #getDocumentedWindow()
	 * @generated
	 */
	EReference getDocumentedWindow_ModelElement();

	/**
	 * Returns the meta object for the reference list '{@link at.ecrit.document.model.ecritdocument.DocumentedWindow#getContainedPerspective <em>Contained Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Perspective</em>'.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedWindow#getContainedPerspective()
	 * @see #getDocumentedWindow()
	 * @generated
	 */
	EReference getDocumentedWindow_ContainedPerspective();

	/**
	 * Returns the meta object for enum '{@link at.ecrit.document.model.ecritdocument.InitiatableItemType <em>Initiatable Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initiatable Item Type</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
	 * @generated
	 */
	EEnum getInitiatableItemType();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcritdocumentFactory getEcritdocumentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.CommandStepImpl <em>Command Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.CommandStepImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getCommandStep()
		 * @generated
		 */
		EClass COMMAND_STEP = eINSTANCE.getCommandStep();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_STEP__COMMAND = eINSTANCE.getCommandStep_Command();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.StepImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Executable By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__EXECUTABLE_BY = eINSTANCE.getStep_ExecutableBy();

		/**
		 * The meta object literal for the '<em><b>Initiatable By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INITIATABLE_BY = eINSTANCE.getStep_InitiatableBy();

		/**
		 * The meta object literal for the '<em><b>Possible Error</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__POSSIBLE_ERROR = eINSTANCE.getStep_PossibleError();

		/**
		 * The meta object literal for the '<em><b>Keybinding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__KEYBINDING = eINSTANCE.getStep_Keybinding();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.DocumentImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__STEP = eINSTANCE.getDocument_Step();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__CREATION_DATE = eINSTANCE.getDocument_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Document Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_VERSION = eINSTANCE.getDocument_DocumentVersion();

		/**
		 * The meta object literal for the '<em><b>Product Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__PRODUCT_VERSION = eINSTANCE.getDocument_ProductVersion();

		/**
		 * The meta object literal for the '<em><b>Application Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__APPLICATION_LAYOUT = eINSTANCE.getDocument_ApplicationLayout();

		/**
		 * The meta object literal for the '<em><b>Find Or Create Command Step By Command</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT___FIND_OR_CREATE_COMMAND_STEP_BY_COMMAND__MCOMMAND = eINSTANCE.getDocument__FindOrCreateCommandStepByCommand__MCommand();

		/**
		 * The meta object literal for the '<em><b>Generate Depictable Item PNG Images</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT___GENERATE_DEPICTABLE_ITEM_PNG_IMAGES__STRING = eINSTANCE.getDocument__GenerateDepictableItemPNGImages__String();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.UserImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.ErrorMessageImpl <em>Error Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.ErrorMessageImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getErrorMessage()
		 * @generated
		 */
		EClass ERROR_MESSAGE = eINSTANCE.getErrorMessage();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.DirectStepImpl <em>Direct Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.DirectStepImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDirectStep()
		 * @generated
		 */
		EClass DIRECT_STEP = eINSTANCE.getDirectStep();

		/**
		 * The meta object literal for the '<em><b>Contribution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_STEP__CONTRIBUTION = eINSTANCE.getDirectStep_Contribution();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl <em>Initiatable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.InitiatableItemImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getInitiatableItem()
		 * @generated
		 */
		EClass INITIATABLE_ITEM = eINSTANCE.getInitiatableItem();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATABLE_ITEM__ITEM = eINSTANCE.getInitiatableItem_Item();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIATABLE_ITEM__ITEM_TYPE = eINSTANCE.getInitiatableItem_ItemType();

		/**
		 * The meta object literal for the '<em><b>Containing Window</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATABLE_ITEM__CONTAINING_WINDOW = eINSTANCE.getInitiatableItem_ContainingWindow();

		/**
		 * The meta object literal for the '<em><b>Containing Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATABLE_ITEM__CONTAINING_PART = eINSTANCE.getInitiatableItem_ContainingPart();

		/**
		 * The meta object literal for the '<em><b>Containing Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATABLE_ITEM__CONTAINING_MENU = eINSTANCE.getInitiatableItem_ContainingMenu();

		/**
		 * The meta object literal for the '<em><b>Containing Toolbar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATABLE_ITEM__CONTAINING_TOOLBAR = eINSTANCE.getInitiatableItem_ContainingToolbar();

		/**
		 * The meta object literal for the '<em><b>Visible When</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIATABLE_ITEM__VISIBLE_WHEN = eINSTANCE.getInitiatableItem_VisibleWhen();

		/**
		 * The meta object literal for the '<em><b>Get Location Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INITIATABLE_ITEM___GET_LOCATION_DESCRIPTION = eINSTANCE.getInitiatableItem__GetLocationDescription();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl <em>Application Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.ApplicationLayoutImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getApplicationLayout()
		 * @generated
		 */
		EClass APPLICATION_LAYOUT = eINSTANCE.getApplicationLayout();

		/**
		 * The meta object literal for the '<em><b>Perspective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LAYOUT__PERSPECTIVE = eINSTANCE.getApplicationLayout_Perspective();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LAYOUT__PART = eINSTANCE.getApplicationLayout_Part();

		/**
		 * The meta object literal for the '<em><b>Window</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_LAYOUT__WINDOW = eINSTANCE.getApplicationLayout_Window();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.DocumentedElement <em>Documented Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.DocumentedElement
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedElement()
		 * @generated
		 */
		EClass DOCUMENTED_ELEMENT = eINSTANCE.getDocumentedElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED_ELEMENT__DESCRIPTION = eINSTANCE.getDocumentedElement_Description();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED_ELEMENT__PRECONDITION = eINSTANCE.getDocumentedElement_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTED_ELEMENT__POSTCONDITION = eINSTANCE.getDocumentedElement_Postcondition();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl <em>Documented Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.DocumentedPerspectiveImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedPerspective()
		 * @generated
		 */
		EClass DOCUMENTED_PERSPECTIVE = eINSTANCE.getDocumentedPerspective();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT = eINSTANCE.getDocumentedPerspective_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Contained Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS = eINSTANCE.getDocumentedPerspective_ContainedParts();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.Depictable <em>Depictable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.Depictable
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDepictable()
		 * @generated
		 */
		EClass DEPICTABLE = eINSTANCE.getDepictable();

		/**
		 * The meta object literal for the '<em><b>Generate PNG Depiction Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPICTABLE___GENERATE_PNG_DEPICTION_IMAGE = eINSTANCE.getDepictable__GeneratePNGDepictionImage();

		/**
		 * The meta object literal for the '<em><b>Get Element Depiction Image Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPICTABLE___GET_ELEMENT_DEPICTION_IMAGE_NAME = eINSTANCE.getDepictable__GetElementDepictionImageName();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentedPartImpl <em>Documented Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.DocumentedPartImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedPart()
		 * @generated
		 */
		EClass DOCUMENTED_PART = eINSTANCE.getDocumentedPart();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED_PART__MODEL_ELEMENT = eINSTANCE.getDocumentedPart_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Contained In Perspective</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED_PART__CONTAINED_IN_PERSPECTIVE = eINSTANCE.getDocumentedPart_ContainedInPerspective();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl <em>Documented Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.impl.DocumentedWindowImpl
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getDocumentedWindow()
		 * @generated
		 */
		EClass DOCUMENTED_WINDOW = eINSTANCE.getDocumentedWindow();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED_WINDOW__MODEL_ELEMENT = eINSTANCE.getDocumentedWindow_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Contained Perspective</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE = eINSTANCE.getDocumentedWindow_ContainedPerspective();

		/**
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.InitiatableItemType <em>Initiatable Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getInitiatableItemType()
		 * @generated
		 */
		EEnum INITIATABLE_ITEM_TYPE = eINSTANCE.getInitiatableItemType();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

	}

} //EcritdocumentPackage
