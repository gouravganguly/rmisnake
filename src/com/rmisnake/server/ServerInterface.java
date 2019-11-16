package com.rmisnake.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInterface extends Remote{
	public void play() throws RemoteException; //play method

	
}
