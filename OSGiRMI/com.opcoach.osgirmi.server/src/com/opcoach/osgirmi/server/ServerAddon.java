package com.opcoach.osgirmi.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import com.opcoach.osgirmi.common.DataService;

public class ServerAddon {

	@PostConstruct
	public void initClient(IEclipseContext ctx) {

	
		startService(ctx);
	}
	
	/**
	 * Start the RMI server and publish the DataService Sample
	 * 
	 * @throws RemoteException
	 * @throws AlreadyBoundException
	 */
	private void startService(IEclipseContext ctx) {
		// Get the DataService reference (actually defined as a component in
		// this plugin)

		try {
			Bundle b = FrameworkUtil.getBundle(DataService.class);
			
			BundleContext bundleContext = b.getBundleContext();
			ServiceReference<DataService> ref = bundleContext.getServiceReference(DataService.class);
			DataService ds = bundleContext.getService(ref);

			DataService dsStub = (DataService) UnicastRemoteObject.exportObject(ds, 0);

			// Bind the remote object's stub in the registry
			Registry registry = LocateRegistry.getRegistry();
			registry.bind(DataService.RMI_ID, dsStub);
			
			// Delcare this dataservice in E4 context
			ctx.set(DataService.class, ds);

			System.err.println("Server ready with this car park : " + ds.getParcAuto().getName());
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}

	}



}
