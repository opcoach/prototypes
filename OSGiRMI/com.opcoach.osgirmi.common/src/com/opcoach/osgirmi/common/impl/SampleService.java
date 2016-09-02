package com.opcoach.osgirmi.common.impl;

import java.rmi.RemoteException;

import org.osgi.service.component.annotations.Component;

import com.opcoach.osgirmi.common.DataService;
import com.opcoach.parcauto.ParcAuto;
import com.opcoach.parcauto.ParcautoFactory;
import com.opcoach.parcauto.Voiture;

@Component(name = "com.opcoach.osgirmi.common.DataService", enabled = true)
public class SampleService implements DataService {
	
	// Private default parcAuto
	private ParcAuto parc = null;

	public SampleService() {
		System.out.println("Starting sample service");
		createSampleData();

	}

	private void createSampleData() {
		ParcautoFactory f = ParcautoFactory.eINSTANCE;
		parc = f.createParcAuto();
		parc.setId(1000L);
		parc.setName("Default ParcAuto");

		Voiture v = f.createVoiture();
		v.setId(1L);
		v.setName("Renault");
		v.setImmatriculation("9999 XY 31");
		parc.getVoitures().add(v);

		v = f.createVoiture();
		v.setId(2L);
		v.setName("Peugeot");
		v.setImmatriculation("1000 ZZ 31");
		parc.getVoitures().add(v);

		v = f.createVoiture();
		v.setId(1L);
		v.setName("Bmw");
		v.setImmatriculation("2000 ZZ 31");
		parc.getVoitures().add(v);
	}

	@Override
	public Voiture getVoiture(long id) throws RemoteException {
		return parc.getVoitures().get(0);
	}

	@Override
	public ParcAuto getParcAuto() throws RemoteException {
		// TODO Auto-generated method stub
		return parc;
	}
	
	@Override
	public String toString() {
		return  "The car park named '" + parc.getName() + "' contains " + parc.getVoitures().size() + " cars.";
	}

}
