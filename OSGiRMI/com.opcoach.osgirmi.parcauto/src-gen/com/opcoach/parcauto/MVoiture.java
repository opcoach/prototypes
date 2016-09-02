/**
 */
package com.opcoach.parcauto;

import com.opcoach.basemodel.BaseObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voiture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.parcauto.MVoiture#getImmatriculation <em>Immatriculation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.parcauto.MParcautoPackage#getVoiture()
 * @model
 * @generated
 */
public interface MVoiture extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Immatriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immatriculation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immatriculation</em>' attribute.
	 * @see #setImmatriculation(String)
	 * @see com.opcoach.parcauto.MParcautoPackage#getVoiture_Immatriculation()
	 * @model
	 * @generated
	 */
	String getImmatriculation();

	/**
	 * Sets the value of the '{@link com.opcoach.parcauto.MVoiture#getImmatriculation <em>Immatriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immatriculation</em>' attribute.
	 * @see #getImmatriculation()
	 * @generated
	 */
	void setImmatriculation(String value);

} // MVoiture
