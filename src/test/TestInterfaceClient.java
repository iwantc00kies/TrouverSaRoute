package test;

import main.Controller;
import main.Reseau;
import Client.InterfaceClient;


/** test du bon fonctionnement de l'application (interface client) **/
public class TestInterfaceClient {
	

	public static void main(String[] args) {
		
		// modele 
		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

		//vue 
		InterfaceClient client =  new InterfaceClient(res);
		
		//controleur
		Controller cont = new Controller(res, client);
		
		//ensuite test de modification du réseau (normalement depuis l'interface admin)
 
	}
	
	 
}
