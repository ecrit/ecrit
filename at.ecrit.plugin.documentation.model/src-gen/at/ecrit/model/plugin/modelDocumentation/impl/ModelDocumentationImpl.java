/**
 */
package at.ecrit.model.plugin.modelDocumentation.impl;

import at.ecrit.model.plugin.modelDocumentation.ElementDocumentation;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentation;
import at.ecrit.model.plugin.modelDocumentation.ModelDocumentationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationImpl#getElementDocumentation <em>Element Documentation</em>}</li>
 *   <li>{@link at.ecrit.model.plugin.modelDocumentation.impl.ModelDocumentationImpl#getReferencedModelFile <em>Referenced Model File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelDocumentationImpl extends MinimalEObjectImpl.Container implements ModelDocumentation {
	/**
	 * The cached value of the '{@link #getElementDocumentation() <em>Element Documentation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDocumentation> elementDocumentation;

	/**
	 * The default value of the '{@link #getReferencedModelFile() <em>Referenced Model File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedModelFile()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_MODEL_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedModelFile() <em>Referenced Model File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedModelFile()
	 * @generated
	 * @ordered
	 */
	protected String referencedModelFile = REFERENCED_MODEL_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelDocumentationPackage.Literals.MODEL_DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDocumentation> getElementDocumentation() {
		if (elementDocumentation == null) {
			elementDocumentation = new EObjectResolvingEList<ElementDocumentation>(ElementDocumentation.class, this, ModelDocumentationPackage.MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION);
		}
		return elementDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedModelFile() {
		return referencedModelFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedModelFile(String newReferencedModelFile) {
		String oldReferencedModelFile = referencedModelFile;
		referencedModelFile = newReferencedModelFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelDocumentationPackage.MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE, oldReferencedModelFile, referencedModelFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION:
				return getElementDocumentation();
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE:
				return getReferencedModelFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION:
				getElementDocumentation().clear();
				getElementDocumentation().addAll((Collection<? extends ElementDocumentation>)newValue);
				return;
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE:
				setReferencedModelFile((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION:
				getElementDocumentation().clear();
				return;
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE:
				setReferencedModelFile(REFERENCED_MODEL_FILE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__ELEMENT_DOCUMENTATION:
				return elementDocumentation != null && !elementDocumentation.isEmpty();
			case ModelDocumentationPackage.MODEL_DOCUMENTATION__REFERENCED_MODEL_FILE:
				return REFERENCED_MODEL_FILE_EDEFAULT == null ? referencedModelFile != null : !REFERENCED_MODEL_FILE_EDEFAULT.equals(referencedModelFile);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (referencedModelFile: ");
		result.append(referencedModelFile);
		result.append(')');
		return result.toString();
	}

} //ModelDocumentationImpl
