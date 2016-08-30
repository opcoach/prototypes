/**
 */
package parcauto.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import basemodel.MBasemodelPackage;
import parcauto.MParcAuto;
import parcauto.MParcautoFactory;
import parcauto.MParcautoPackage;
import parcauto.MVoiture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MParcautoPackageImpl extends EPackageImpl implements MParcautoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parcAutoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voitureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see parcauto.MParcautoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MParcautoPackageImpl() {
		super(eNS_URI, MParcautoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MParcautoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MParcautoPackage init() {
		if (isInited) return (MParcautoPackage)EPackage.Registry.INSTANCE.getEPackage(MParcautoPackage.eNS_URI);

		// Obtain or create and register package
		MParcautoPackageImpl theParcautoPackage = (MParcautoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MParcautoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MParcautoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MBasemodelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theParcautoPackage.createPackageContents();

		// Initialize created meta-data
		theParcautoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParcautoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MParcautoPackage.eNS_URI, theParcautoPackage);
		return theParcautoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParcAuto() {
		return parcAutoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParcAuto_Voitures() {
		return (EReference)parcAutoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcAuto_Capacity() {
		return (EAttribute)parcAutoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoiture() {
		return voitureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoiture_Immatriculation() {
		return (EAttribute)voitureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParcautoFactory getParcautoFactory() {
		return (MParcautoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		parcAutoEClass = createEClass(PARC_AUTO);
		createEReference(parcAutoEClass, PARC_AUTO__VOITURES);
		createEAttribute(parcAutoEClass, PARC_AUTO__CAPACITY);

		voitureEClass = createEClass(VOITURE);
		createEAttribute(voitureEClass, VOITURE__IMMATRICULATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MBasemodelPackage theBasemodelPackage = (MBasemodelPackage)EPackage.Registry.INSTANCE.getEPackage(MBasemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parcAutoEClass.getESuperTypes().add(theBasemodelPackage.getBaseObject());
		voitureEClass.getESuperTypes().add(theBasemodelPackage.getBaseObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(parcAutoEClass, MParcAuto.class, "ParcAuto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParcAuto_Voitures(), this.getVoiture(), null, "voitures", null, 0, -1, MParcAuto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcAuto_Capacity(), ecorePackage.getEInt(), "capacity", null, 0, 1, MParcAuto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voitureEClass, MVoiture.class, "Voiture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoiture_Immatriculation(), ecorePackage.getEString(), "Immatriculation", null, 0, 1, MVoiture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MParcautoPackageImpl
