package com.opcoach.basemodel;

import com.opcoach.basemodel.impl.BasemodelFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface BasemodelFactory extends MBasemodelFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	BasemodelFactory eINSTANCE = BasemodelFactoryImpl.init();
				
	public BaseObject createBaseObject();
}
