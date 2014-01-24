/**
 */
package at.ecrit.document.model.ecritdocument.util;

import at.ecrit.document.model.ecritdocument.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage
 * @generated
 */
public class EcritdocumentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcritdocumentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcritdocumentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcritdocumentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcritdocumentSwitch<Adapter> modelSwitch =
		new EcritdocumentSwitch<Adapter>() {
			@Override
			public Adapter caseCommandStep(CommandStep object) {
				return createCommandStepAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseErrorMessage(ErrorMessage object) {
				return createErrorMessageAdapter();
			}
			@Override
			public Adapter caseDirectStep(DirectStep object) {
				return createDirectStepAdapter();
			}
			@Override
			public Adapter caseInitiatableItem(InitiatableItem object) {
				return createInitiatableItemAdapter();
			}
			@Override
			public Adapter caseApplicationLayout(ApplicationLayout object) {
				return createApplicationLayoutAdapter();
			}
			@Override
			public Adapter caseDocumentedElement(DocumentedElement object) {
				return createDocumentedElementAdapter();
			}
			@Override
			public Adapter caseDocumentedPerspective(DocumentedPerspective object) {
				return createDocumentedPerspectiveAdapter();
			}
			@Override
			public Adapter caseDepictable(Depictable object) {
				return createDepictableAdapter();
			}
			@Override
			public Adapter caseDocumentedPart(DocumentedPart object) {
				return createDocumentedPartAdapter();
			}
			@Override
			public Adapter caseDocumentedWindow(DocumentedWindow object) {
				return createDocumentedWindowAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.CommandStep <em>Command Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.CommandStep
	 * @generated
	 */
	public Adapter createCommandStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.ErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.ErrorMessage
	 * @generated
	 */
	public Adapter createErrorMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.DirectStep <em>Direct Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.DirectStep
	 * @generated
	 */
	public Adapter createDirectStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.InitiatableItem <em>Initiatable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.InitiatableItem
	 * @generated
	 */
	public Adapter createInitiatableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.ApplicationLayout <em>Application Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.ApplicationLayout
	 * @generated
	 */
	public Adapter createApplicationLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.DocumentedElement <em>Documented Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedElement
	 * @generated
	 */
	public Adapter createDocumentedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.DocumentedPerspective <em>Documented Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPerspective
	 * @generated
	 */
	public Adapter createDocumentedPerspectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.Depictable <em>Depictable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.Depictable
	 * @generated
	 */
	public Adapter createDepictableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.DocumentedPart <em>Documented Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedPart
	 * @generated
	 */
	public Adapter createDocumentedPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ecrit.document.model.ecritdocument.DocumentedWindow <em>Documented Window</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ecrit.document.model.ecritdocument.DocumentedWindow
	 * @generated
	 */
	public Adapter createDocumentedWindowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EcritdocumentAdapterFactory
