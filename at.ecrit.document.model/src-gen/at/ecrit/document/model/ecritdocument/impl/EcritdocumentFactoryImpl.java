/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.*;

import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcritdocumentFactoryImpl extends EFactoryImpl implements EcritdocumentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcritdocumentFactory init() {
		try {
			EcritdocumentFactory theEcritdocumentFactory = (EcritdocumentFactory)EPackage.Registry.INSTANCE.getEFactory(EcritdocumentPackage.eNS_URI);
			if (theEcritdocumentFactory != null) {
				return theEcritdocumentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcritdocumentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcritdocumentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcritdocumentPackage.COMMAND_STEP: return createCommandStep();
			case EcritdocumentPackage.DOCUMENT: return createDocument();
			case EcritdocumentPackage.USER: return createUser();
			case EcritdocumentPackage.ERROR_MESSAGE: return createErrorMessage();
			case EcritdocumentPackage.DIRECT_STEP: return createDirectStep();
			case EcritdocumentPackage.INITIATABLE_ITEM: return createInitiatableItem();
			case EcritdocumentPackage.APPLICATION_LAYOUT: return createApplicationLayout();
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE: return createDocumentedPerspective();
			case EcritdocumentPackage.DOCUMENTED_PART: return createDocumentedPart();
			case EcritdocumentPackage.DOCUMENTED_WINDOW: return createDocumentedWindow();
			case EcritdocumentPackage.APPLICATION_PROPERTIES: return createApplicationProperties();
			case EcritdocumentPackage.DOCUMENTED_MENU: return createDocumentedMenu();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EcritdocumentPackage.INITIATABLE_ITEM_TYPE:
				return createInitiatableItemTypeFromString(eDataType, initialValue);
			case EcritdocumentPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EcritdocumentPackage.INITIATABLE_ITEM_TYPE:
				return convertInitiatableItemTypeToString(eDataType, instanceValue);
			case EcritdocumentPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandStep createCommandStep() {
		CommandStepImpl commandStep = new CommandStepImpl();
		return commandStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorMessage createErrorMessage() {
		ErrorMessageImpl errorMessage = new ErrorMessageImpl();
		return errorMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectStep createDirectStep() {
		DirectStepImpl directStep = new DirectStepImpl();
		return directStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiatableItem createInitiatableItem() {
		InitiatableItemImpl initiatableItem = new InitiatableItemImpl();
		return initiatableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLayout createApplicationLayout() {
		ApplicationLayoutImpl applicationLayout = new ApplicationLayoutImpl();
		return applicationLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentedPerspective createDocumentedPerspective() {
		DocumentedPerspectiveImpl documentedPerspective = new DocumentedPerspectiveImpl();
		return documentedPerspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentedPart createDocumentedPart() {
		DocumentedPartImpl documentedPart = new DocumentedPartImpl();
		return documentedPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentedWindow createDocumentedWindow() {
		DocumentedWindowImpl documentedWindow = new DocumentedWindowImpl();
		return documentedWindow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationProperties createApplicationProperties() {
		ApplicationPropertiesImpl applicationProperties = new ApplicationPropertiesImpl();
		return applicationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentedMenu createDocumentedMenu() {
		DocumentedMenuImpl documentedMenu = new DocumentedMenuImpl();
		return documentedMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiatableItemType createInitiatableItemTypeFromString(EDataType eDataType, String initialValue) {
		InitiatableItemType result = InitiatableItemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitiatableItemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcritdocumentPackage getEcritdocumentPackage() {
		return (EcritdocumentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcritdocumentPackage getPackage() {
		return EcritdocumentPackage.eINSTANCE;
	}

} //EcritdocumentFactoryImpl
