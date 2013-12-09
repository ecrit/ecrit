/**
 */
package at.ecrit.model.plugin.modelDocumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentationFactory
 * @model kind="package"
 * @generated
 */
public interface ModelDocumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelDocumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecrit.at/2014/model/modelDocumentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelDocumentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelDocumentationPackage eINSTANCE = at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl <em>Element Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl
	 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getElementDocumentation()
	 * @generated
	 */
	int ELEMENT_DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION__ELEMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION__ELEMENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Element Xmi Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID = 3;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION__VALID_FROM = 4;

	/**
	 * The feature id for the '<em><b>Valid To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION__VALID_TO = 5;

	/**
	 * The number of structural features of the '<em>Element Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Element Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationImpl <em>Model Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationImpl
	 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getModelDocumentation()
	 * @generated
	 */
	int MODEL_DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Element Documentation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Referenced Model File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE = 1;

	/**
	 * The number of structural features of the '<em>Model Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOCUMENTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 2;

	/**
	 * The meta object id for the '<em>Version</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Version
	 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 3;


	/**
	 * Returns the meta object for class '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation <em>Element Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Documentation</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ElementDocumentation
	 * @generated
	 */
	EClass getElementDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getDocumentation()
	 * @see #getElementDocumentation()
	 * @generated
	 */
	EAttribute getElementDocumentation_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementType()
	 * @see #getElementDocumentation()
	 * @generated
	 */
	EAttribute getElementDocumentation_ElementType();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Id</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementId()
	 * @see #getElementDocumentation()
	 * @generated
	 */
	EAttribute getElementDocumentation_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementXmiId <em>Element Xmi Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Xmi Id</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getElementXmiId()
	 * @see #getElementDocumentation()
	 * @generated
	 */
	EAttribute getElementDocumentation_ElementXmiId();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidFrom()
	 * @see #getElementDocumentation()
	 * @generated
	 */
	EAttribute getElementDocumentation_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidTo <em>Valid To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid To</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ElementDocumentation#getValidTo()
	 * @see #getElementDocumentation()
	 * @generated
	 */
	EAttribute getElementDocumentation_ValidTo();

	/**
	 * Returns the meta object for class '{@link at.ecrit.model.plugin.modelDocumentation.ModelDocumentation <em>Model Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Documentation</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentation
	 * @generated
	 */
	EClass getModelDocumentation();

	/**
	 * Returns the meta object for the reference list '{@link at.ecrit.model.plugin.modelDocumentation.ModelDocumentation#getElementDocumentation <em>Element Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element Documentation</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentation#getElementDocumentation()
	 * @see #getModelDocumentation()
	 * @generated
	 */
	EReference getModelDocumentation_ElementDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link at.ecrit.model.plugin.modelDocumentation.ModelDocumentation#getReferencedModelFile <em>Referenced Model File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Model File</em>'.
	 * @see at.ecrit.model.plugin.modelDocumentation.ModelDocumentation#getReferencedModelFile()
	 * @see #getModelDocumentation()
	 * @generated
	 */
	EAttribute getModelDocumentation_ReferencedModelFile();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getIProject();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version</em>'.
	 * @see org.osgi.framework.Version
	 * @model instanceClass="org.osgi.framework.Version"
	 * @generated
	 */
	EDataType getVersion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelDocumentationFactory getModelDocumentationFactory();

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
		 * The meta object literal for the '{@link at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl <em>Element Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.model.plugin.modelDocumentation.impl.ElementDocumentationImpl
		 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getElementDocumentation()
		 * @generated
		 */
		EClass ELEMENT_DOCUMENTATION = eINSTANCE.getElementDocumentation();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DOCUMENTATION__DOCUMENTATION = eINSTANCE.getElementDocumentation_Documentation();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DOCUMENTATION__ELEMENT_TYPE = eINSTANCE.getElementDocumentation_ElementType();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DOCUMENTATION__ELEMENT_ID = eINSTANCE.getElementDocumentation_ElementId();

		/**
		 * The meta object literal for the '<em><b>Element Xmi Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DOCUMENTATION__ELEMENT_XMI_ID = eINSTANCE.getElementDocumentation_ElementXmiId();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DOCUMENTATION__VALID_FROM = eINSTANCE.getElementDocumentation_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DOCUMENTATION__VALID_TO = eINSTANCE.getElementDocumentation_ValidTo();

		/**
		 * The meta object literal for the '{@link at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationImpl <em>Model Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationImpl
		 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getModelDocumentation()
		 * @generated
		 */
		EClass MODEL_DOCUMENTATION = eINSTANCE.getModelDocumentation();

		/**
		 * The meta object literal for the '<em><b>Element Documentation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION = eINSTANCE.getModelDocumentation_ElementDocumentation();

		/**
		 * The meta object literal for the '<em><b>Referenced Model File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE = eINSTANCE.getModelDocumentation_ReferencedModelFile();

		/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '<em>Version</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Version
		 * @see at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationPackageImpl#getVersion()
		 * @generated
		 */
		EDataType VERSION = eINSTANCE.getVersion();

	}

} //ModelDocumentationPackage
