/**
 */
package com.opcoach.basemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.opcoach.basemodel.MBasemodelFactory
 * @model kind="package"
 * @generated
 */
public interface MBasemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "basemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.opcoach.basemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MBasemodelPackage eINSTANCE = com.opcoach.basemodel.impl.MBasemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.opcoach.basemodel.impl.MBaseObjectImpl <em>Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.opcoach.basemodel.impl.MBaseObjectImpl
	 * @see com.opcoach.basemodel.impl.MBasemodelPackageImpl#getBaseObject()
	 * @generated
	 */
	int BASE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Last Update Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__LAST_UPDATE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Remote Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.rmi.RemoteException
	 * @see com.opcoach.basemodel.impl.MBasemodelPackageImpl#getRemoteException()
	 * @generated
	 */
	int REMOTE_EXCEPTION = 1;


	/**
	 * Returns the meta object for class '{@link com.opcoach.basemodel.MBaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Object</em>'.
	 * @see com.opcoach.basemodel.MBaseObject
	 * @generated
	 */
	EClass getBaseObject();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.basemodel.MBaseObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.opcoach.basemodel.MBaseObject#getId()
	 * @see #getBaseObject()
	 * @generated
	 */
	EAttribute getBaseObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.basemodel.MBaseObject#getLastUpdateDate <em>Last Update Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update Date</em>'.
	 * @see com.opcoach.basemodel.MBaseObject#getLastUpdateDate()
	 * @see #getBaseObject()
	 * @generated
	 */
	EAttribute getBaseObject_LastUpdateDate();

	/**
	 * Returns the meta object for the attribute '{@link com.opcoach.basemodel.MBaseObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.opcoach.basemodel.MBaseObject#getName()
	 * @see #getBaseObject()
	 * @generated
	 */
	EAttribute getBaseObject_Name();

	/**
	 * Returns the meta object for data type '{@link java.rmi.RemoteException <em>Remote Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Remote Exception</em>'.
	 * @see java.rmi.RemoteException
	 * @model instanceClass="java.rmi.RemoteException"
	 * @generated
	 */
	EDataType getRemoteException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MBasemodelFactory getBasemodelFactory();

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
		 * The meta object literal for the '{@link com.opcoach.basemodel.impl.MBaseObjectImpl <em>Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.opcoach.basemodel.impl.MBaseObjectImpl
		 * @see com.opcoach.basemodel.impl.MBasemodelPackageImpl#getBaseObject()
		 * @generated
		 */
		EClass BASE_OBJECT = eINSTANCE.getBaseObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECT__ID = eINSTANCE.getBaseObject_Id();

		/**
		 * The meta object literal for the '<em><b>Last Update Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECT__LAST_UPDATE_DATE = eINSTANCE.getBaseObject_LastUpdateDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_OBJECT__NAME = eINSTANCE.getBaseObject_Name();

		/**
		 * The meta object literal for the '<em>Remote Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.rmi.RemoteException
		 * @see com.opcoach.basemodel.impl.MBasemodelPackageImpl#getRemoteException()
		 * @generated
		 */
		EDataType REMOTE_EXCEPTION = eINSTANCE.getRemoteException();

	}

} //MBasemodelPackage
