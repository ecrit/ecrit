/**
 */
package at.ecrit.model.plugin.modelDocumentation.impl;

import at.ecrit.model.plugin.modelDocumentation.ElementDocumentation;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentation;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentationFactory;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage;

import org.eclipse.core.resources.IProject;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelDocumentationPackageImpl extends EPackageImpl implements ModelDocumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionEDataType = null;

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
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelDocumentationPackageImpl() {
		super(eNS_URI, ModelDocumentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelDocumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelDocumentationPackage init() {
		if (isInited) return (ModelDocumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ModelDocumentationPackage.eNS_URI);

		// Obtain or create and register package
		ModelDocumentationPackageImpl theModelDocumentationPackage = (ModelDocumentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelDocumentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelDocumentationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelDocumentationPackage.createPackageContents();

		// Initialize created meta-data
		theModelDocumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelDocumentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelDocumentationPackage.eNS_URI, theModelDocumentationPackage);
		return theModelDocumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDocumentation() {
		return elementDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDocumentation_Documentation() {
		return (EAttribute)elementDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDocumentation_ElementType() {
		return (EAttribute)elementDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDocumentation_ElementId() {
		return (EAttribute)elementDocumentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDocumentation_ElementXmiId() {
		return (EAttribute)elementDocumentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDocumentation_ValidFrom() {
		return (EAttribute)elementDocumentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementDocumentation_ValidTo() {
		return (EAttribute)elementDocumentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelDocumentation() {
		return modelDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelDocumentation_ElementDocumentation() {
		return (EReference)modelDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelDocumentation_ReferencedModelFile() {
		return (EAttribute)modelDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProject() {
		return iProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersion() {
		return versionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDocumentationFactory getModelDocumentationFactory() {
		return (ModelDocumentationFactory)getEFactoryInstance();
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
		elementDocumentationEClass = createEClass(ELEMENT_DOCUMENTATION);
		createEAttribute(elementDocumentationEClass, ELEMENT_DOCUMENTATION__DOCUMENTATION);
		createEAttribute(elementDocumentationEClass, ELEMENT_DOCUMENTATION__ELEMENT_TYPE);
		createEAttribute(elementDocumentationEClass, ELEMENT_DOCUMENTATION__ELEMENT_ID);
		createEAttribute(elementDocumentationEClass, ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID);
		createEAttribute(elementDocumentationEClass, ELEMENT_DOCUMENTATION__VALID_FROM);
		createEAttribute(elementDocumentationEClass, ELEMENT_DOCUMENTATION__VALID_TO);

		modelDocumentationEClass = createEClass(MODEL_DOCUMENTATION);
		createEReference(modelDocumentationEClass, MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION);
		createEAttribute(modelDocumentationEClass, MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE);

		// Create data types
		iProjectEDataType = createEDataType(IPROJECT);
		versionEDataType = createEDataType(VERSION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(elementDocumentationEClass, ElementDocumentation.class, "ElementDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementDocumentation_Documentation(), ecorePackage.getEString(), "documentation", null, 0, 1, ElementDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementDocumentation_ElementType(), ecorePackage.getEString(), "elementType", null, 0, 1, ElementDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementDocumentation_ElementId(), ecorePackage.getEString(), "elementId", null, 0, 1, ElementDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementDocumentation_ElementXmiId(), ecorePackage.getEString(), "elementXmiId", null, 0, 1, ElementDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementDocumentation_ValidFrom(), this.getVersion(), "validFrom", null, 0, 1, ElementDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementDocumentation_ValidTo(), this.getVersion(), "validTo", null, 0, 1, ElementDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelDocumentationEClass, ModelDocumentation.class, "ModelDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelDocumentation_ElementDocumentation(), this.getElementDocumentation(), null, "elementDocumentation", null, 0, -1, ModelDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelDocumentation_ReferencedModelFile(), ecorePackage.getEString(), "referencedModelFile", null, 1, 1, ModelDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionEDataType, Version.class, "Version", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelDocumentationPackageImpl
