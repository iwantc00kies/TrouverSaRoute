package main;

import java.util.LinkedList;

import Client.ClientController;
import Client.InterfaceClient;


public class main {

	public static void main(String[] args) {
		
		
		// modele 
		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

		//vue 
		InterfaceClient client =  new InterfaceClient(res);
		
		//controleur
		ClientController cont = new ClientController(res, client);
		
		
		for(Ligne l : res.getLignes()){
			l.Afficher();
		}
		System.out.println("\n\n");
		for(Arret a : res.getArrets()){
			a.Afficher();
		}
	 
		
		

	}

}
