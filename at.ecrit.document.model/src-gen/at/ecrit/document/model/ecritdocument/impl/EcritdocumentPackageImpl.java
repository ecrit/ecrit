/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.CommandStep;
import at.ecrit.document.model.ecritdocument.DirectStep;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.EcritdocumentFactory;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import at.ecrit.document.model.ecritdocument.ErrorMessage;
import at.ecrit.document.model.ecritdocument.InitiatableItem;
import at.ecrit.document.model.ecritdocument.InitiatableItemType;
import at.ecrit.document.model.ecritdocument.Step;
import at.ecrit.document.model.ecritdocument.User;

import org.eclipse.e4.ui.model.application.commands.impl.CommandsPackageImpl;

import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;

import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;
import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;
import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcritdocumentPackageImpl extends EPackageImpl implements EcritdocumentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiatableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initiatableItemTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcritdocumentPackageImpl() {
		super(eNS_URI, EcritdocumentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcritdocumentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcritdocumentPackage init() {
		if (isInited) return (EcritdocumentPackage)EPackage.Registry.INSTANCE.getEPackage(EcritdocumentPackage.eNS_URI);

		// Obtain or create and register package
		EcritdocumentPackageImpl theEcritdocumentPackage = (EcritdocumentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcritdocumentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcritdocumentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApplicationPackageImpl.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcritdocumentPackage.createPackageContents();

		// Initialize created meta-data
		theEcritdocumentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcritdocumentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcritdocumentPackage.eNS_URI, theEcritdocumentPackage);
		return theEcritdocumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandStep() {
		return commandStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandStep_Command() {
		return (EReference)commandStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Description() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Precondition() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Postcondition() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_ExecutableBy() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_InitiatableBy() {
		return (EReference)stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_PossibleError() {
		return (EReference)stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Keybinding() {
		return (EReference)stepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_Step() {
		return (EReference)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_Title() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocument__FindOrCreateCommandStepByCommand__MCommand() {
		return documentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorMessage() {
		return errorMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectStep() {
		return directStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectStep_Contribution() {
		return (EReference)directStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitiatableItem() {
		return initiatableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiatableItem_Item() {
		return (EReference)initiatableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiatableItem_ItemType() {
		return (EAttribute)initiatableItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiatableItem_ContainingWindow() {
		return (EReference)initiatableItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiatableItem_ContainingPart() {
		return (EReference)initiatableItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiatableItem_ContainingMenu() {
		return (EReference)initiatableItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiatableItem_ContainingToolbar() {
		return (EReference)initiatableItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitiatableItem_VisibleWhen() {
		return (EReference)initiatableItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitiatableItem__GetLocationDescription() {
		return initiatableItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitiatableItemType() {
		return initiatableItemTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcritdocumentFactory getEcritdocumentFactory() {
		return (EcritdocumentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		commandStepEClass = createEClass(COMMAND_STEP);
		createEReference(commandStepEClass, COMMAND_STEP__COMMAND);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__DESCRIPTION);
		createEAttribute(stepEClass, STEP__PRECONDITION);
		createEAttribute(stepEClass, STEP__POSTCONDITION);
		createEReference(stepEClass, STEP__EXECUTABLE_BY);
		createEReference(stepEClass, STEP__INITIATABLE_BY);
		createEReference(stepEClass, STEP__POSSIBLE_ERROR);
		createEReference(stepEClass, STEP__KEYBINDING);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__STEP);
		createEAttribute(documentEClass, DOCUMENT__TITLE);
		createEOperation(documentEClass, DOCUMENT___FIND_OR_CREATE_COMMAND_STEP_BY_COMMAND__MCOMMAND);

		userEClass = createEClass(USER);

		errorMessageEClass = createEClass(ERROR_MESSAGE);

		directStepEClass = createEClass(DIRECT_STEP);
		createEReference(directStepEClass, DIRECT_STEP__CONTRIBUTION);

		initiatableItemEClass = createEClass(INITIATABLE_ITEM);
		createEReference(initiatableItemEClass, INITIATABLE_ITEM__ITEM);
		createEAttribute(initiatableItemEClass, INITIATABLE_ITEM__ITEM_TYPE);
		createEReference(initiatableItemEClass, INITIATABLE_ITEM__CONTAINING_WINDOW);
		createEReference(initiatableItemEClass, INITIATABLE_ITEM__CONTAINING_PART);
		createEReference(initiatableItemEClass, INITIATABLE_ITEM__CONTAINING_MENU);
		createEReference(initiatableItemEClass, INITIATABLE_ITEM__CONTAINING_TOOLBAR);
		createEReference(initiatableItemEClass, INITIATABLE_ITEM__VISIBLE_WHEN);
		createEOperation(initiatableItemEClass, INITIATABLE_ITEM___GET_LOCATION_DESCRIPTION);

		// Create enums
		initiatableItemTypeEEnum = createEEnum(INITIATABLE_ITEM_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommandsPackageImpl theCommandsPackage = (CommandsPackageImpl)EPackage.Registry.INSTANCE.getEPackage(CommandsPackageImpl.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackageImpl.eNS_URI);
		MenuPackageImpl theMenuPackage = (MenuPackageImpl)EPackage.Registry.INSTANCE.getEPackage(MenuPackageImpl.eNS_URI);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)EPackage.Registry.INSTANCE.getEPackage(BasicPackageImpl.eNS_URI);
		UiPackageImpl theUiPackage = (UiPackageImpl)EPackage.Registry.INSTANCE.getEPackage(UiPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commandStepEClass.getESuperTypes().add(this.getStep());
		directStepEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(commandStepEClass, CommandStep.class, "CommandStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandStep_Command(), theCommandsPackage.getCommand(), null, "command", null, 0, 1, CommandStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Postcondition(), ecorePackage.getEString(), "postcondition", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_ExecutableBy(), this.getUser(), null, "executableBy", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_InitiatableBy(), this.getInitiatableItem(), null, "initiatableBy", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_PossibleError(), this.getErrorMessage(), null, "possibleError", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Keybinding(), theCommandsPackage.getKeyBinding(), null, "keybinding", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Step(), this.getStep(), null, "step", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Title(), ecorePackage.getEString(), "title", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDocument__FindOrCreateCommandStepByCommand__MCommand(), this.getCommandStep(), "findOrCreateCommandStepByCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommandsPackage.getCommand(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorMessageEClass, ErrorMessage.class, "ErrorMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directStepEClass, DirectStep.class, "DirectStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectStep_Contribution(), theApplicationPackage.getContribution(), null, "contribution", null, 0, 1, DirectStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initiatableItemEClass, InitiatableItem.class, "InitiatableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInitiatableItem_Item(), theMenuPackage.getItem(), null, "item", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitiatableItem_ItemType(), this.getInitiatableItemType(), "itemType", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitiatableItem_ContainingWindow(), theBasicPackage.getWindow(), null, "containingWindow", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitiatableItem_ContainingPart(), theBasicPackage.getPart(), null, "containingPart", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitiatableItem_ContainingMenu(), theMenuPackage.getMenu(), null, "containingMenu", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitiatableItem_ContainingToolbar(), theMenuPackage.getToolBar(), null, "containingToolbar", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInitiatableItem_VisibleWhen(), theUiPackage.getExpression(), null, "visibleWhen", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getInitiatableItem__GetLocationDescription(), ecorePackage.getEString(), "getLocationDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(initiatableItemTypeEEnum, InitiatableItemType.class, "InitiatableItemType");
		addEEnumLiteral(initiatableItemTypeEEnum, InitiatableItemType.MENU);
		addEEnumLiteral(initiatableItemTypeEEnum, InitiatableItemType.TOOLBAR);

		// Create resource
		createResource(eNS_URI);
	}

} //EcritdocumentPackageImpl
