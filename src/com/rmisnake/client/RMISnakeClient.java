package com.rmisnake.client;

import java.rmi.Naming;

import com.rmisnake.server.ServerInterface;

public class RMISnakeClient {
	public static void main(String[] args) {
		
		String url = "rmi:///";
		try {
			ServerInterface s = (ServerInterface) Naming.lookup( url + "snake");
			s.play();
		} catch(Exception e) { System.err.println("Error: "+ e); }

	}
}
