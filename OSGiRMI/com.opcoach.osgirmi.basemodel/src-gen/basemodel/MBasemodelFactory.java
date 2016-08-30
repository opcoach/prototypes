/**
 */
package basemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see basemodel.MBasemodelPackage
 * @generated
 */
public interface MBasemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MBasemodelFactory eINSTANCE = basemodel.impl.MBasemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Object</em>'.
	 * @generated
	 */
	MBaseObject createBaseObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MBasemodelPackage getBasemodelPackage();

} //MBasemodelFactory
