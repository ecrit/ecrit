/**
 */
package at.ecrit.document.model.ecritdocument.impl;

import at.ecrit.document.model.ecritdocument.ApplicationLayout;
import at.ecrit.document.model.ecritdocument.CommandStep;
import at.ecrit.document.model.ecritdocument.Document;
import at.ecrit.document.model.ecritdocument.EcritdocumentFactory;
import at.ecrit.document.model.ecritdocument.EcritdocumentPackage;
import at.ecrit.document.model.ecritdocument.Step;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Date;
import org.eclipse.e4.ui.model.application.commands.MCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Document</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl#getStep <em>Step</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl#getDocumentVersion <em>Document Version</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl#getProductVersion <em>Product Version</em>}</li>
 *   <li>{@link at.ecrit.document.model.ecritdocument.impl.DocumentImpl#getApplicationLayout <em>Application Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends MinimalEObjectImpl.Container implements
		Document {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> step;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentVersion() <em>Document Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentVersion() <em>Document Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentVersion()
	 * @generated
	 * @ordered
	 */
	protected String documentVersion = DOCUMENT_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductVersion() <em>Product Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductVersion()
	 * @generated
	 * @ordered
	 */
	protected String productVersion = PRODUCT_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApplicationLayout() <em>Application Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationLayout()
	 * @generated
	 * @ordered
	 */
	protected ApplicationLayout applicationLayout;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcritdocumentPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<Step>(Step.class, this, EcritdocumentPackage.DOCUMENT__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENT__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentVersion() {
		return documentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentVersion(String newDocumentVersion) {
		String oldDocumentVersion = documentVersion;
		documentVersion = newDocumentVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENT__DOCUMENT_VERSION, oldDocumentVersion, documentVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductVersion() {
		return productVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductVersion(String newProductVersion) {
		String oldProductVersion = productVersion;
		productVersion = newProductVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENT__PRODUCT_VERSION, oldProductVersion, productVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLayout getApplicationLayout() {
		return applicationLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationLayout(ApplicationLayout newApplicationLayout, NotificationChain msgs) {
		ApplicationLayout oldApplicationLayout = applicationLayout;
		applicationLayout = newApplicationLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT, oldApplicationLayout, newApplicationLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationLayout(ApplicationLayout newApplicationLayout) {
		if (newApplicationLayout != applicationLayout) {
			NotificationChain msgs = null;
			if (applicationLayout != null)
				msgs = ((InternalEObject)applicationLayout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT, null, msgs);
			if (newApplicationLayout != null)
				msgs = ((InternalEObject)newApplicationLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT, null, msgs);
			msgs = basicSetApplicationLayout(newApplicationLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT, newApplicationLayout, newApplicationLayout));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated not
	 */
	public CommandStep findOrCreateCommandStepByCommand(MCommand command) {
		if (command == null)
			throw new IllegalArgumentException();
		
		// try to find existing
		for (Step stepEntry : step) {
			if (stepEntry instanceof CommandStep) {
				CommandStep se = (CommandStep) stepEntry;
				MCommand com = se.getCommand();
				if (com != null) {
					if (com.getElementId().equalsIgnoreCase(
							command.getElementId()))
						return se;
				}
			}
		}
		
		// create new
		CommandStep newstep = EcritdocumentFactory.eINSTANCE.createCommandStep();
		newstep.setCommand(command);
		step.add(newstep);
		return newstep;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENT__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
			case EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT:
				return basicSetApplicationLayout(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENT__STEP:
				return getStep();
			case EcritdocumentPackage.DOCUMENT__TITLE:
				return getTitle();
			case EcritdocumentPackage.DOCUMENT__CREATION_DATE:
				return getCreationDate();
			case EcritdocumentPackage.DOCUMENT__DOCUMENT_VERSION:
				return getDocumentVersion();
			case EcritdocumentPackage.DOCUMENT__PRODUCT_VERSION:
				return getProductVersion();
			case EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT:
				return getApplicationLayout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENT__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case EcritdocumentPackage.DOCUMENT__TITLE:
				setTitle((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENT__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case EcritdocumentPackage.DOCUMENT__DOCUMENT_VERSION:
				setDocumentVersion((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENT__PRODUCT_VERSION:
				setProductVersion((String)newValue);
				return;
			case EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT:
				setApplicationLayout((ApplicationLayout)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENT__STEP:
				getStep().clear();
				return;
			case EcritdocumentPackage.DOCUMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENT__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENT__DOCUMENT_VERSION:
				setDocumentVersion(DOCUMENT_VERSION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENT__PRODUCT_VERSION:
				setProductVersion(PRODUCT_VERSION_EDEFAULT);
				return;
			case EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT:
				setApplicationLayout((ApplicationLayout)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcritdocumentPackage.DOCUMENT__STEP:
				return step != null && !step.isEmpty();
			case EcritdocumentPackage.DOCUMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case EcritdocumentPackage.DOCUMENT__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case EcritdocumentPackage.DOCUMENT__DOCUMENT_VERSION:
				return DOCUMENT_VERSION_EDEFAULT == null ? documentVersion != null : !DOCUMENT_VERSION_EDEFAULT.equals(documentVersion);
			case EcritdocumentPackage.DOCUMENT__PRODUCT_VERSION:
				return PRODUCT_VERSION_EDEFAULT == null ? productVersion != null : !PRODUCT_VERSION_EDEFAULT.equals(productVersion);
			case EcritdocumentPackage.DOCUMENT__APPLICATION_LAYOUT:
				return applicationLayout != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case EcritdocumentPackage.DOCUMENT___FIND_OR_CREATE_COMMAND_STEP_BY_COMMAND__MCOMMAND:
				return findOrCreateCommandStepByCommand((MCommand)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", documentVersion: ");
		result.append(documentVersion);
		result.append(", productVersion: ");
		result.append(productVersion);
		result.append(')');
		return result.toString();
	}

} // DocumentImpl
