/**
 */
package parcauto;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see parcauto.MParcautoPackage
 * @generated
 */
public interface MParcautoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MParcautoFactory eINSTANCE = parcauto.impl.MParcautoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parc Auto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parc Auto</em>'.
	 * @generated
	 */
	MParcAuto createParcAuto();

	/**
	 * Returns a new object of class '<em>Voiture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voiture</em>'.
	 * @generated
	 */
	MVoiture createVoiture();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MParcautoPackage getParcautoPackage();

} //MParcautoFactory
