/**
 */
package com.opcoach.parcauto.impl;

import com.opcoach.parcauto.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MParcautoFactoryImpl extends EFactoryImpl implements MParcautoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MParcautoFactory init() {
		try {
			MParcautoFactory theParcautoFactory = (MParcautoFactory)EPackage.Registry.INSTANCE.getEFactory(MParcautoPackage.eNS_URI);
			if (theParcautoFactory != null) {
				return theParcautoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MParcautoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParcautoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MParcautoPackage.PARC_AUTO: return createParcAuto();
			case MParcautoPackage.VOITURE: return createVoiture();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParcAuto createParcAuto() {
		MParcAutoImpl parcAuto = new MParcAutoImpl();
		return parcAuto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MVoiture createVoiture() {
		MVoitureImpl voiture = new MVoitureImpl();
		return voiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParcautoPackage getParcautoPackage() {
		return (MParcautoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MParcautoPackage getPackage() {
		return MParcautoPackage.eINSTANCE;
	}

} //MParcautoFactoryImpl
