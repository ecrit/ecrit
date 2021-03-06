/**
 */
package at.ecrit.document.model.ecritdocument.util;

import at.ecrit.document.model.ecritdocument.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.ecrit.document.model.ecritdocument.EcritdocumentPackage
 * @generated
 */
public class EcritdocumentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcritdocumentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcritdocumentSwitch() {
		if (modelPackage == null) {
			modelPackage = EcritdocumentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EcritdocumentPackage.COMMAND_STEP: {
				CommandStep commandStep = (CommandStep)theEObject;
				T result = caseCommandStep(commandStep);
				if (result == null) result = caseStep(commandStep);
				if (result == null) result = caseDocumentedElement(commandStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseDocumentedElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.ERROR_MESSAGE: {
				ErrorMessage errorMessage = (ErrorMessage)theEObject;
				T result = caseErrorMessage(errorMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DIRECT_STEP: {
				DirectStep directStep = (DirectStep)theEObject;
				T result = caseDirectStep(directStep);
				if (result == null) result = caseStep(directStep);
				if (result == null) result = caseDocumentedElement(directStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.INITIATABLE_ITEM: {
				InitiatableItem initiatableItem = (InitiatableItem)theEObject;
				T result = caseInitiatableItem(initiatableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.APPLICATION_LAYOUT: {
				ApplicationLayout applicationLayout = (ApplicationLayout)theEObject;
				T result = caseApplicationLayout(applicationLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_ELEMENT: {
				DocumentedElement documentedElement = (DocumentedElement)theEObject;
				T result = caseDocumentedElement(documentedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_PERSPECTIVE: {
				DocumentedPerspective documentedPerspective = (DocumentedPerspective)theEObject;
				T result = caseDocumentedPerspective(documentedPerspective);
				if (result == null) result = caseDocumentedElement(documentedPerspective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_PART: {
				DocumentedPart documentedPart = (DocumentedPart)theEObject;
				T result = caseDocumentedPart(documentedPart);
				if (result == null) result = caseDocumentedElement(documentedPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_WINDOW: {
				DocumentedWindow documentedWindow = (DocumentedWindow)theEObject;
				T result = caseDocumentedWindow(documentedWindow);
				if (result == null) result = caseDocumentedElement(documentedWindow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.APPLICATION_PROPERTIES: {
				ApplicationProperties applicationProperties = (ApplicationProperties)theEObject;
				T result = caseApplicationProperties(applicationProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_MENU: {
				DocumentedMenu documentedMenu = (DocumentedMenu)theEObject;
				T result = caseDocumentedMenu(documentedMenu);
				if (result == null) result = caseDocumentedElement(documentedMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_TRIM_BAR: {
				DocumentedTrimBar documentedTrimBar = (DocumentedTrimBar)theEObject;
				T result = caseDocumentedTrimBar(documentedTrimBar);
				if (result == null) result = caseDocumentedElement(documentedTrimBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_TRIM: {
				DocumentedTrim documentedTrim = (DocumentedTrim)theEObject;
				T result = caseDocumentedTrim(documentedTrim);
				if (result == null) result = caseDocumentedElement(documentedTrim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EcritdocumentPackage.DOCUMENTED_TOOL_BAR: {
				DocumentedToolBar documentedToolBar = (DocumentedToolBar)theEObject;
				T result = caseDocumentedToolBar(documentedToolBar);
				if (result == null) result = caseDocumentedElement(documentedToolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandStep(CommandStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorMessage(ErrorMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectStep(DirectStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initiatable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initiatable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitiatableItem(InitiatableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationLayout(ApplicationLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedElement(DocumentedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Perspective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedPerspective(DocumentedPerspective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedPart(DocumentedPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Window</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Window</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedWindow(DocumentedWindow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationProperties(ApplicationProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedMenu(DocumentedMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Trim Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Trim Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedTrimBar(DocumentedTrimBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Trim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Trim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedTrim(DocumentedTrim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented Tool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented Tool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentedToolBar(DocumentedToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EcritdocumentSwitch
