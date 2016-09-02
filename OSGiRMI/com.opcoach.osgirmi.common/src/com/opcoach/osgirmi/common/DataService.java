package com.opcoach.osgirmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.opcoach.parcauto.ParcAuto;
import com.opcoach.parcauto.Voiture;

public interface DataService extends Remote {
	
	public static final String RMI_ID = "DataService";

	Voiture getVoiture(long id) throws RemoteException;
	
	ParcAuto getParcAuto() throws RemoteException;
}
