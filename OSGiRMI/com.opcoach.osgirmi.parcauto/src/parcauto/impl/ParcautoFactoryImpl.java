package parcauto.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import parcauto.ParcAuto;
import parcauto.ParcautoFactory;
import parcauto.Voiture;


// This factory  overrides the generated factory and returns the new generated interfaces
public class ParcautoFactoryImpl extends MParcautoFactoryImpl implements ParcautoFactory
{
	
	public static ParcautoFactory init() {
		
		try {
			Object fact = MParcautoFactoryImpl.init();
			if ((fact != null) && (fact instanceof ParcautoFactory))
					return (ParcautoFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParcautoFactoryImpl(); 
		 }
	
	public ParcAuto createParcAuto()
	{
		ParcAuto result = new ParcAutoImpl();
		return result;
	}
	public Voiture createVoiture()
	{
		Voiture result = new VoitureImpl();
		return result;
	}
}
