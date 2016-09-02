/**
 */
package com.opcoach.parcauto.impl;

import com.opcoach.basemodel.impl.BaseObjectImpl;
import com.opcoach.parcauto.MParcautoPackage;
import com.opcoach.parcauto.Voiture;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.parcauto.impl.MVoitureImpl#getImmatriculation <em>Immatriculation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MVoitureImpl extends BaseObjectImpl implements Voiture {
	/**
	 * The default value of the '{@link #getImmatriculation() <em>Immatriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmatriculation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMMATRICULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImmatriculation() <em>Immatriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmatriculation()
	 * @generated
	 * @ordered
	 */
	protected String immatriculation = IMMATRICULATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MVoitureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MParcautoPackage.Literals.VOITURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImmatriculation() {
		return immatriculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmatriculation(String newImmatriculation) {
		String oldImmatriculation = immatriculation;
		immatriculation = newImmatriculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MParcautoPackage.VOITURE__IMMATRICULATION, oldImmatriculation, immatriculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MParcautoPackage.VOITURE__IMMATRICULATION:
				return getImmatriculation();
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
			case MParcautoPackage.VOITURE__IMMATRICULATION:
				setImmatriculation((String)newValue);
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
			case MParcautoPackage.VOITURE__IMMATRICULATION:
				setImmatriculation(IMMATRICULATION_EDEFAULT);
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
			case MParcautoPackage.VOITURE__IMMATRICULATION:
				return IMMATRICULATION_EDEFAULT == null ? immatriculation != null : !IMMATRICULATION_EDEFAULT.equals(immatriculation);
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
		result.append(" (Immatriculation: ");
		result.append(immatriculation);
		result.append(')');
		return result.toString();
	}

} //MVoitureImpl
