package com.rmisnake.server;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JFrame;
import javax.swing.Timer;

import com.rmisnake.GamePlay;

public class ServerImpl extends UnicastRemoteObject implements ServerInterface{

	protected ServerImpl() throws RemoteException {	}

	@Override
	public void play() throws RemoteException {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame();
		GamePlay gameplay = new GamePlay(); //game
		
		obj.setBounds(10, 10, 905, 700);
		obj.setBackground(Color.DARK_GRAY);
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gameplay);
	}
	

	
	public static void main(String[] args) {
		
	}


}
