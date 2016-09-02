package com.opcoach.basemodel.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.opcoach.basemodel.BaseObject;
import com.opcoach.basemodel.BasemodelFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class BasemodelFactoryImpl extends MBasemodelFactoryImpl implements BasemodelFactory
{
	
	public static BasemodelFactory init() {
		
		try {
			Object fact = MBasemodelFactoryImpl.init();
			if ((fact != null) && (fact instanceof BasemodelFactory))
					return (BasemodelFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BasemodelFactoryImpl(); 
		 }
	
	public BaseObject createBaseObject()
	{
		BaseObject result = new BaseObjectImpl();
		return result;
	}
}
