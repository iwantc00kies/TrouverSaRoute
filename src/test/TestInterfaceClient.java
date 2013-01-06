package test;

import main.Reseau;
import Client.ClientController;
import Client.InterfaceClient;


/** test du bon fonctionnement de l'application (interface client) **/
public class TestInterfaceClient {
	

	public static void main(String[] args) {
		
		// modele 
		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

		//vue 
		InterfaceClient client =  new InterfaceClient(res);
		
		//controleur
		ClientController cont = new ClientController(res, client);
		
		//ensuite test de modification du réseau (normalement depuis l'interface admin)
 
	}
	
	 
}
