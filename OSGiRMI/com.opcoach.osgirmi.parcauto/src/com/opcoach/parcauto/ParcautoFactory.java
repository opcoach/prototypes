package com.opcoach.parcauto;

import com.opcoach.parcauto.impl.ParcautoFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface ParcautoFactory extends MParcautoFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	ParcautoFactory eINSTANCE = ParcautoFactoryImpl.init();
				
	public ParcAuto createParcAuto();
	public Voiture createVoiture();
}
