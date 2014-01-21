/**
 */
package at.ecrit.document.model.ecritdocument;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	int STEP__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PRECONDITION = 1;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__POSTCONDITION = 2;

	/**
	 * The feature id for the '<em><b>Executable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__EXECUTABLE_BY = 3;

	/**
	 * The feature id for the '<em><b>Initiatable By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INITIATABLE_BY = 4;

	/**
	 * The feature id for the '<em><b>Possible Error</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__POSSIBLE_ERROR = 5;

	/**
	 * The feature id for the '<em><b>Keybinding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__KEYBINDING = 6;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Find Or Create Command Step By Command</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___FIND_OR_CREATE_COMMAND_STEP_BY_COMMAND__MCOMMAND = 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = 1;

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
	 * The meta object id for the '{@link at.ecrit.document.model.ecritdocument.InitiatableItemType <em>Initiatable Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
	 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getInitiatableItemType()
	 * @generated
	 */
	int INITIATABLE_ITEM_TYPE = 7;


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
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.Step#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step#getDescription()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Description();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.Step#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precondition</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step#getPrecondition()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Precondition();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.document.model.ecritdocument.Step#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postcondition</em>'.
	 * @see at.ecrit.document.model.ecritdocument.Step#getPostcondition()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Postcondition();

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
	 * Returns the meta object for the '{@link at.ecrit.document.model.ecritdocument.Document#findOrCreateCommandStepByCommand(org.eclipse.e4.ui.model.application.commands.MCommand) <em>Find Or Create Command Step By Command</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Or Create Command Step By Command</em>' operation.
	 * @see at.ecrit.document.model.ecritdocument.Document#findOrCreateCommandStepByCommand(org.eclipse.e4.ui.model.application.commands.MCommand)
	 * @generated
	 */
	EOperation getDocument__FindOrCreateCommandStepByCommand__MCommand();

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
	 * Returns the meta object for enum '{@link at.ecrit.document.model.ecritdocument.InitiatableItemType <em>Initiatable Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Initiatable Item Type</em>'.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
	 * @generated
	 */
	EEnum getInitiatableItemType();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__PRECONDITION = eINSTANCE.getStep_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__POSTCONDITION = eINSTANCE.getStep_Postcondition();

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
		 * The meta object literal for the '<em><b>Find Or Create Command Step By Command</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT___FIND_OR_CREATE_COMMAND_STEP_BY_COMMAND__MCOMMAND = eINSTANCE.getDocument__FindOrCreateCommandStepByCommand__MCommand();

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
		 * The meta object literal for the '{@link at.ecrit.document.model.ecritdocument.InitiatableItemType <em>Initiatable Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.document.model.ecritdocument.InitiatableItemType
		 * @see at.ecrit.document.model.ecritdocument.impl.EcritdocumentPackageImpl#getInitiatableItemType()
		 * @generated
		 */
		EEnum INITIATABLE_ITEM_TYPE = eINSTANCE.getInitiatableItemType();

	}

} //EcritdocumentPackage
