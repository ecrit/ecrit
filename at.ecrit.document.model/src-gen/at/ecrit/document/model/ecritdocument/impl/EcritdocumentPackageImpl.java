/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.ApplicationLayout;
import at.ecrit.document.model.ecritdocument.ApplicationProperties;
import at.ecrit.document.model.ecritdocument.CommandStep;
import at.ecrit.document.model.ecritdocument.DirectStep;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.DocumentedElement;
import at.ecrit.document.model.ecritdocument.DocumentedPart;
import at.ecrit.document.model.ecritdocument.DocumentedPerspective;
import at.ecrit.document.model.ecritdocument.DocumentedWindow;
import at.ecrit.document.model.ecritdocument.EcritdocumentFactory;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import at.ecrit.document.model.ecritdocument.ErrorMessage;
import at.ecrit.document.model.ecritdocument.InitiatableItem;
import at.ecrit.document.model.ecritdocument.InitiatableItemType;
import at.ecrit.document.model.ecritdocument.Step;
import at.ecrit.document.model.ecritdocument.User;

import java.io.IOException;

import org.eclipse.e4.ui.model.application.commands.impl.CommandsPackageImpl;

import org.eclipse.e4.ui.model.application.impl.ApplicationPackageImpl;

import org.eclipse.e4.ui.model.application.ui.advanced.impl.AdvancedPackageImpl;

import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;

import org.eclipse.e4.ui.model.application.ui.impl.UiPackageImpl;

import org.eclipse.e4.ui.model.application.ui.menu.impl.MenuPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
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
	private EClass applicationLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedPerspectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentedWindowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initiatableItemTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

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
	public EReference getStep_ExecutableBy() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_InitiatableBy() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_PossibleError() {
		return (EReference)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Keybinding() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStep__IsCommandStep() {
		return stepEClass.getEOperations().get(0);
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
	public EAttribute getDocument_CreationDate() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_DocumentVersion() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_ProductVersion() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_ApplicationLayout() {
		return (EReference)documentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocument_ApplicationProperties() {
		return (EReference)documentEClass.getEStructuralFeatures().get(6);
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
	public EOperation getDocument__GetDocumentedElementByMUiElement__MUIElement() {
		return documentEClass.getEOperations().get(1);
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
	public EReference getInitiatableItem_AssociatedStep() {
		return (EReference)initiatableItemEClass.getEStructuralFeatures().get(7);
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
	public EClass getApplicationLayout() {
		return applicationLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationLayout_Perspective() {
		return (EReference)applicationLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationLayout_Part() {
		return (EReference)applicationLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationLayout_Window() {
		return (EReference)applicationLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentedElement() {
		return documentedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentedElement_Description() {
		return (EAttribute)documentedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentedElement_Precondition() {
		return (EAttribute)documentedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentedElement_Postcondition() {
		return (EAttribute)documentedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentedPerspective() {
		return documentedPerspectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentedPerspective_ModelElement() {
		return (EReference)documentedPerspectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentedPerspective_ContainedParts() {
		return (EReference)documentedPerspectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentedPart() {
		return documentedPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentedPart_ModelElement() {
		return (EReference)documentedPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentedPart_ContainedInPerspective() {
		return (EReference)documentedPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentedPart_InitiatableItems() {
		return (EReference)documentedPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentedWindow() {
		return documentedWindowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentedWindow_ModelElement() {
		return (EReference)documentedWindowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentedWindow_ContainedPerspective() {
		return (EReference)documentedWindowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationProperties() {
		return applicationPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationProperties_About() {
		return (EAttribute)applicationPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationProperties_RequiresLogin() {
		return (EAttribute)applicationPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationProperties_RequiresInstallation() {
		return (EAttribute)applicationPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationProperties_PerspectiveSwitcher() {
		return (EAttribute)applicationPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationProperties_HasConceptOfMultipleUsers() {
		return (EAttribute)applicationPropertiesEClass.getEStructuralFeatures().get(4);
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
	public EDataType getIOException() {
		return ioExceptionEDataType;
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
		createEReference(stepEClass, STEP__EXECUTABLE_BY);
		createEReference(stepEClass, STEP__INITIATABLE_BY);
		createEReference(stepEClass, STEP__POSSIBLE_ERROR);
		createEReference(stepEClass, STEP__KEYBINDING);
		createEOperation(stepEClass, STEP___IS_COMMAND_STEP);

		documentEClass = createEClass(DOCUMENT);
		createEReference(documentEClass, DOCUMENT__STEP);
		createEAttribute(documentEClass, DOCUMENT__TITLE);
		createEAttribute(documentEClass, DOCUMENT__CREATION_DATE);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_VERSION);
		createEAttribute(documentEClass, DOCUMENT__PRODUCT_VERSION);
		createEReference(documentEClass, DOCUMENT__APPLICATION_LAYOUT);
		createEReference(documentEClass, DOCUMENT__APPLICATION_PROPERTIES);
		createEOperation(documentEClass, DOCUMENT___FIND_OR_CREATE_COMMAND_STEP_BY_COMMAND__MCOMMAND);
		createEOperation(documentEClass, DOCUMENT___GET_DOCUMENTED_ELEMENT_BY_MUI_ELEMENT__MUIELEMENT);

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
		createEReference(initiatableItemEClass, INITIATABLE_ITEM__ASSOCIATED_STEP);
		createEOperation(initiatableItemEClass, INITIATABLE_ITEM___GET_LOCATION_DESCRIPTION);

		applicationLayoutEClass = createEClass(APPLICATION_LAYOUT);
		createEReference(applicationLayoutEClass, APPLICATION_LAYOUT__PERSPECTIVE);
		createEReference(applicationLayoutEClass, APPLICATION_LAYOUT__PART);
		createEReference(applicationLayoutEClass, APPLICATION_LAYOUT__WINDOW);

		documentedElementEClass = createEClass(DOCUMENTED_ELEMENT);
		createEAttribute(documentedElementEClass, DOCUMENTED_ELEMENT__DESCRIPTION);
		createEAttribute(documentedElementEClass, DOCUMENTED_ELEMENT__PRECONDITION);
		createEAttribute(documentedElementEClass, DOCUMENTED_ELEMENT__POSTCONDITION);

		documentedPerspectiveEClass = createEClass(DOCUMENTED_PERSPECTIVE);
		createEReference(documentedPerspectiveEClass, DOCUMENTED_PERSPECTIVE__MODEL_ELEMENT);
		createEReference(documentedPerspectiveEClass, DOCUMENTED_PERSPECTIVE__CONTAINED_PARTS);

		documentedPartEClass = createEClass(DOCUMENTED_PART);
		createEReference(documentedPartEClass, DOCUMENTED_PART__MODEL_ELEMENT);
		createEReference(documentedPartEClass, DOCUMENTED_PART__CONTAINED_IN_PERSPECTIVE);
		createEReference(documentedPartEClass, DOCUMENTED_PART__INITIATABLE_ITEMS);

		documentedWindowEClass = createEClass(DOCUMENTED_WINDOW);
		createEReference(documentedWindowEClass, DOCUMENTED_WINDOW__MODEL_ELEMENT);
		createEReference(documentedWindowEClass, DOCUMENTED_WINDOW__CONTAINED_PERSPECTIVE);

		applicationPropertiesEClass = createEClass(APPLICATION_PROPERTIES);
		createEAttribute(applicationPropertiesEClass, APPLICATION_PROPERTIES__ABOUT);
		createEAttribute(applicationPropertiesEClass, APPLICATION_PROPERTIES__REQUIRES_LOGIN);
		createEAttribute(applicationPropertiesEClass, APPLICATION_PROPERTIES__REQUIRES_INSTALLATION);
		createEAttribute(applicationPropertiesEClass, APPLICATION_PROPERTIES__PERSPECTIVE_SWITCHER);
		createEAttribute(applicationPropertiesEClass, APPLICATION_PROPERTIES__HAS_CONCEPT_OF_MULTIPLE_USERS);

		// Create enums
		initiatableItemTypeEEnum = createEEnum(INITIATABLE_ITEM_TYPE);

		// Create data types
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
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
		UiPackageImpl theUiPackage = (UiPackageImpl)EPackage.Registry.INSTANCE.getEPackage(UiPackageImpl.eNS_URI);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackageImpl.eNS_URI);
		MenuPackageImpl theMenuPackage = (MenuPackageImpl)EPackage.Registry.INSTANCE.getEPackage(MenuPackageImpl.eNS_URI);
		BasicPackageImpl theBasicPackage = (BasicPackageImpl)EPackage.Registry.INSTANCE.getEPackage(BasicPackageImpl.eNS_URI);
		AdvancedPackageImpl theAdvancedPackage = (AdvancedPackageImpl)EPackage.Registry.INSTANCE.getEPackage(AdvancedPackageImpl.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commandStepEClass.getESuperTypes().add(this.getStep());
		stepEClass.getESuperTypes().add(this.getDocumentedElement());
		directStepEClass.getESuperTypes().add(this.getStep());
		documentedPerspectiveEClass.getESuperTypes().add(this.getDocumentedElement());
		documentedPartEClass.getESuperTypes().add(this.getDocumentedElement());
		documentedWindowEClass.getESuperTypes().add(this.getDocumentedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(commandStepEClass, CommandStep.class, "CommandStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandStep_Command(), theCommandsPackage.getCommand(), null, "command", null, 0, 1, CommandStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_ExecutableBy(), this.getUser(), null, "executableBy", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_InitiatableBy(), this.getInitiatableItem(), this.getInitiatableItem_AssociatedStep(), "initiatableBy", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_PossibleError(), this.getErrorMessage(), null, "possibleError", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Keybinding(), theCommandsPackage.getKeyBinding(), null, "keybinding", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStep__IsCommandStep(), ecorePackage.getEBoolean(), "isCommandStep", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocument_Step(), this.getStep(), null, "step", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_Title(), ecorePackage.getEString(), "title", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_DocumentVersion(), ecorePackage.getEString(), "documentVersion", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_ProductVersion(), ecorePackage.getEString(), "productVersion", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_ApplicationLayout(), this.getApplicationLayout(), null, "applicationLayout", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocument_ApplicationProperties(), this.getApplicationProperties(), null, "applicationProperties", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDocument__FindOrCreateCommandStepByCommand__MCommand(), this.getCommandStep(), "findOrCreateCommandStepByCommand", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCommandsPackage.getCommand(), "command", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDocument__GetDocumentedElementByMUiElement__MUIElement(), this.getDocumentedElement(), "getDocumentedElementByMUiElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUiPackage.getUIElement(), "mUiElement", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEReference(getInitiatableItem_AssociatedStep(), this.getStep(), this.getStep_InitiatableBy(), "associatedStep", null, 0, 1, InitiatableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInitiatableItem__GetLocationDescription(), null, "getLocationDescription", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(applicationLayoutEClass, ApplicationLayout.class, "ApplicationLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationLayout_Perspective(), this.getDocumentedPerspective(), null, "perspective", null, 0, -1, ApplicationLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationLayout_Part(), this.getDocumentedPart(), null, "part", null, 0, -1, ApplicationLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationLayout_Window(), this.getDocumentedWindow(), null, "window", null, 0, -1, ApplicationLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedElementEClass, DocumentedElement.class, "DocumentedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentedElement_Precondition(), ecorePackage.getEString(), "precondition", null, 0, 1, DocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentedElement_Postcondition(), ecorePackage.getEString(), "postcondition", null, 0, 1, DocumentedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedPerspectiveEClass, DocumentedPerspective.class, "DocumentedPerspective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentedPerspective_ModelElement(), theAdvancedPackage.getPerspective(), null, "modelElement", null, 1, 1, DocumentedPerspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentedPerspective_ContainedParts(), this.getDocumentedPart(), null, "containedParts", null, 0, -1, DocumentedPerspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedPartEClass, DocumentedPart.class, "DocumentedPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentedPart_ModelElement(), theBasicPackage.getPart(), null, "modelElement", null, 1, 1, DocumentedPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentedPart_ContainedInPerspective(), theAdvancedPackage.getPerspective(), null, "containedInPerspective", null, 0, -1, DocumentedPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentedPart_InitiatableItems(), this.getInitiatableItem(), null, "initiatableItems", null, 0, -1, DocumentedPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentedWindowEClass, DocumentedWindow.class, "DocumentedWindow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentedWindow_ModelElement(), theBasicPackage.getWindow(), null, "modelElement", null, 1, 1, DocumentedWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentedWindow_ContainedPerspective(), theAdvancedPackage.getPerspective(), null, "containedPerspective", null, 0, -1, DocumentedWindow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationPropertiesEClass, ApplicationProperties.class, "ApplicationProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationProperties_About(), ecorePackage.getEString(), "about", null, 0, 1, ApplicationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationProperties_RequiresLogin(), ecorePackage.getEBoolean(), "requiresLogin", null, 0, 1, ApplicationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationProperties_RequiresInstallation(), ecorePackage.getEString(), "requiresInstallation", null, 0, 1, ApplicationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationProperties_PerspectiveSwitcher(), ecorePackage.getEString(), "perspectiveSwitcher", null, 0, 1, ApplicationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplicationProperties_HasConceptOfMultipleUsers(), ecorePackage.getEBoolean(), "hasConceptOfMultipleUsers", null, 0, 1, ApplicationProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(initiatableItemTypeEEnum, InitiatableItemType.class, "InitiatableItemType");
		addEEnumLiteral(initiatableItemTypeEEnum, InitiatableItemType.MENU);
		addEEnumLiteral(initiatableItemTypeEEnum, InitiatableItemType.TOOLBAR);

		// Initialize data types
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EcritdocumentPackageImpl
