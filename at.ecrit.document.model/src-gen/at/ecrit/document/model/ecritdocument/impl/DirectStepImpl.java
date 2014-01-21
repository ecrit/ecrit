/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.DirectStep;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;

import org.eclipse.e4.ui.model.application.MContribution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Direct Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DirectStepImpl#getContribution <em>Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DirectStepImpl extends StepImpl implements DirectStep {
	/**
	 * The cached value of the '{@link #getContribution() <em>Contribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribution()
	 * @generated
	 * @ordered
	 */
	protected MContribution contribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.DIRECT_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MContribution getContribution() {
		if (contribution != null && ((EObject)contribution).eIsProxy()) {
			InternalEObject oldContribution = (InternalEObject)contribution;
			contribution = (MContribution)eResolveProxy(oldContribution);
			if (contribution != oldContribution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcritdocumentPackage.DIRECT_STEP__CONTRIBUTION, oldContribution, contribution));
			}
		}
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MContribution basicGetContribution() {
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContribution(MContribution newContribution) {
		MContribution oldContribution = contribution;
		contribution = newContribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DIRECT_STEP__CONTRIBUTION, oldContribution, contribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.DIRECT_STEP__CONTRIBUTION:
				if (resolve) return getContribution();
				return basicGetContribution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcritdocumentPackage.DIRECT_STEP__CONTRIBUTION:
				setContribution((MContribution)newValue);
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
			case EcritdocumentPackage.DIRECT_STEP__CONTRIBUTION:
				setContribution((MContribution)null);
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
			case EcritdocumentPackage.DIRECT_STEP__CONTRIBUTION:
				return contribution != null;
		}
		return super.eIsSet(featureID);
	}

} //DirectStepImpl
