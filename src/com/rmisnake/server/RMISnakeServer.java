package com.rmisnake.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMISnakeServer {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			System.out.println("Server created");
		} catch(RemoteException e) {}
		try {
			ServerImpl s1 = new ServerImpl();
			Naming.rebind("snake", s1);
		} catch(Exception e) { System.out.println("Error: "+e); }
		
	}
}
