/**
 */
package com.opcoach.basemodel.impl;

import com.opcoach.basemodel.BaseObject;
import com.opcoach.basemodel.MBasemodelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.basemodel.impl.MBaseObjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.opcoach.basemodel.impl.MBaseObjectImpl#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link com.opcoach.basemodel.impl.MBaseObjectImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MBaseObjectImpl extends MinimalEObjectImpl.Container implements BaseObject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_UPDATE_DATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLastUpdateDate() <em>Last Update Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdateDate()
	 * @generated
	 * @ordered
	 */
	protected long lastUpdateDate = LAST_UPDATE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBaseObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MBasemodelPackage.Literals.BASE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MBasemodelPackage.BASE_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdateDate(long newLastUpdateDate) {
		long oldLastUpdateDate = lastUpdateDate;
		lastUpdateDate = newLastUpdateDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MBasemodelPackage.BASE_OBJECT__LAST_UPDATE_DATE, oldLastUpdateDate, lastUpdateDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MBasemodelPackage.BASE_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MBasemodelPackage.BASE_OBJECT__ID:
				return getId();
			case MBasemodelPackage.BASE_OBJECT__LAST_UPDATE_DATE:
				return getLastUpdateDate();
			case MBasemodelPackage.BASE_OBJECT__NAME:
				return getName();
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
			case MBasemodelPackage.BASE_OBJECT__ID:
				setId((Long)newValue);
				return;
			case MBasemodelPackage.BASE_OBJECT__LAST_UPDATE_DATE:
				setLastUpdateDate((Long)newValue);
				return;
			case MBasemodelPackage.BASE_OBJECT__NAME:
				setName((String)newValue);
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
			case MBasemodelPackage.BASE_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case MBasemodelPackage.BASE_OBJECT__LAST_UPDATE_DATE:
				setLastUpdateDate(LAST_UPDATE_DATE_EDEFAULT);
				return;
			case MBasemodelPackage.BASE_OBJECT__NAME:
				setName(NAME_EDEFAULT);
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
			case MBasemodelPackage.BASE_OBJECT__ID:
				return id != ID_EDEFAULT;
			case MBasemodelPackage.BASE_OBJECT__LAST_UPDATE_DATE:
				return lastUpdateDate != LAST_UPDATE_DATE_EDEFAULT;
			case MBasemodelPackage.BASE_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", lastUpdateDate: ");
		result.append(lastUpdateDate);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MBaseObjectImpl
