/**
 */
package at.ecrit.model.plugin.modelDocumentation.impl;

import at.ecrit.model.plugin.modelDocumentation.*;

import org.eclipse.core.resources.IProject;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.osgi.framework.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelDocumentationFactoryImpl extends EFactoryImpl implements ModelDocumentationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelDocumentationFactory init() {
		try {
			ModelDocumentationFactory theModelDocumentationFactory = (ModelDocumentationFactory)EPackage.Registry.INSTANCE.getEFactory(ModelDocumentationPackage.eNS_URI);
			if (theModelDocumentationFactory != null) {
				return theModelDocumentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelDocumentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDocumentationFactoryImpl() {
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
			case ModelDocumentationPackage.ELEMENT_DOCUMENTATION: return createElementDocumentation();
			case ModelDocumentationPackage.MODEL_DOCUMENTATION: return createModelDocumentation();
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
			case ModelDocumentationPackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case ModelDocumentationPackage.VERSION:
				return createVersionFromString(eDataType, initialValue);
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
			case ModelDocumentationPackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case ModelDocumentationPackage.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDocumentation createElementDocumentation() {
		ElementDocumentationImpl elementDocumentation = new ElementDocumentationImpl();
		return elementDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDocumentation createModelDocumentation() {
		ModelDocumentationImpl modelDocumentation = new ModelDocumentationImpl();
		return modelDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersionFromString(EDataType eDataType, String initialValue) {
		return (Version)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDocumentationPackage getModelDocumentationPackage() {
		return (ModelDocumentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelDocumentationPackage getPackage() {
		return ModelDocumentationPackage.eINSTANCE;
	}

} //ModelDocumentationFactoryImpl
