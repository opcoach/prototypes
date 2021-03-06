/**
 */
package com.opcoach.parcauto;

import com.opcoach.basemodel.MBasemodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.opcoach.parcauto.MParcautoFactory
 * @model kind="package"
 * @generated
 */
public interface MParcautoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parcauto";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.opcoach.parcauto/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parcauto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MParcautoPackage eINSTANCE = com.opcoach.parcauto.impl.MParcautoPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.parcauto.impl.MParcAutoImpl <em>Parc Auto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.parcauto.impl.MParcAutoImpl
	 * @see com.opcoach.parcauto.impl.MParcautoPackageImpl#getParcAuto()
	 * @generated
	 */
	int PARC_AUTO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO__ID = MBasemodelPackage.BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO__LAST_UPDATE_DATE = MBasemodelPackage.BASE_OBJECT__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO__NAME = MBasemodelPackage.BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Voitures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO__VOITURES = MBasemodelPackage.BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO__CAPACITY = MBasemodelPackage.BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parc Auto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO_FEATURE_COUNT = MBasemodelPackage.BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculer ROI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO___CALCULER_ROI__MVOITURE = MBasemodelPackage.BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parc Auto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARC_AUTO_OPERATION_COUNT = MBasemodelPackage.BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.opcoach.parcauto.impl.MVoitureImpl <em>Voiture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.parcauto.impl.MVoitureImpl
	 * @see com.opcoach.parcauto.impl.MParcautoPackageImpl#getVoiture()
	 * @generated
	 */
	int VOITURE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__ID = MBasemodelPackage.BASE_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__LAST_UPDATE_DATE = MBasemodelPackage.BASE_OBJECT__LAST_UPDATE_DATE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__NAME = MBasemodelPackage.BASE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Immatriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE__IMMATRICULATION = MBasemodelPackage.BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_FEATURE_COUNT = MBasemodelPackage.BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Voiture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOITURE_OPERATION_COUNT = MBasemodelPackage.BASE_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.opcoach.parcauto.MParcAuto <em>Parc Auto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parc Auto</em>'.
	 * @see com.opcoach.parcauto.MParcAuto
	 * @generated
	 */
	EClass getParcAuto();

	/**
	 * Returns the meta object for the containment reference list '{@link com.opcoach.parcauto.MParcAuto#getVoitures <em>Voitures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voitures</em>'.
	 * @see com.opcoach.parcauto.MParcAuto#getVoitures()
	 * @see #getParcAuto()
	 * @generated
	 */
	EReference getParcAuto_Voitures();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.parcauto.MParcAuto#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.opcoach.parcauto.MParcAuto#getCapacity()
	 * @see #getParcAuto()
	 * @generated
	 */
	EAttribute getParcAuto_Capacity();

	/**
	 * Returns the meta object for the '{@link com.opcoach.parcauto.MParcAuto#calculerROI(com.opcoach.parcauto.MVoiture) <em>Calculer ROI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculer ROI</em>' operation.
	 * @see com.opcoach.parcauto.MParcAuto#calculerROI(com.opcoach.parcauto.MVoiture)
	 * @generated
	 */
	EOperation getParcAuto__CalculerROI__MVoiture();

	/**
	 * Returns the meta object for class '{@link com.opcoach.parcauto.MVoiture <em>Voiture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voiture</em>'.
	 * @see com.opcoach.parcauto.MVoiture
	 * @generated
	 */
	EClass getVoiture();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.parcauto.MVoiture#getImmatriculation <em>Immatriculation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immatriculation</em>'.
	 * @see com.opcoach.parcauto.MVoiture#getImmatriculation()
	 * @see #getVoiture()
	 * @generated
	 */
	EAttribute getVoiture_Immatriculation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MParcautoFactory getParcautoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.opcoach.parcauto.impl.MParcAutoImpl <em>Parc Auto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.parcauto.impl.MParcAutoImpl
		 * @see com.opcoach.parcauto.impl.MParcautoPackageImpl#getParcAuto()
		 * @generated
		 */
		EClass PARC_AUTO = eINSTANCE.getParcAuto();

		/**
		 * The meta object literal for the '<em><b>Voitures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARC_AUTO__VOITURES = eINSTANCE.getParcAuto_Voitures();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARC_AUTO__CAPACITY = eINSTANCE.getParcAuto_Capacity();

		/**
		 * The meta object literal for the '<em><b>Calculer ROI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARC_AUTO___CALCULER_ROI__MVOITURE = eINSTANCE.getParcAuto__CalculerROI__MVoiture();

		/**
		 * The meta object literal for the '{@link com.opcoach.parcauto.impl.MVoitureImpl <em>Voiture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.parcauto.impl.MVoitureImpl
		 * @see com.opcoach.parcauto.impl.MParcautoPackageImpl#getVoiture()
		 * @generated
		 */
		EClass VOITURE = eINSTANCE.getVoiture();

		/**
		 * The meta object literal for the '<em><b>Immatriculation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOITURE__IMMATRICULATION = eINSTANCE.getVoiture_Immatriculation();

	}

} //MParcautoPackage
