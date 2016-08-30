/**
 */
package parcauto;

import org.eclipse.emf.common.util.EList;

import basemodel.BaseObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parc Auto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link parcauto.MParcAuto#getVoitures <em>Voitures</em>}</li>
 *   <li>{@link parcauto.MParcAuto#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see parcauto.MParcautoPackage#getParcAuto()
 * @model
 * @generated
 */
public interface MParcAuto extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Voitures</b></em>' containment reference list.

	 
	 * The list contents are of type {@link parcauto.MVoiture}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voitures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voitures</em>' containment reference list.
	 * @see parcauto.MParcautoPackage#getParcAuto_Voitures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Voiture> getVoitures();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see parcauto.MParcautoPackage#getParcAuto_Capacity()
	 * @model
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link parcauto.MParcAuto#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

} // MParcAuto
