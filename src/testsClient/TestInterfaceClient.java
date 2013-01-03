package testsClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import main.Arret;
import main.Controller;
import main.Ligne;
import main.Reseau;
import main.csv;
import Client.InterfaceClient;
import Client.InterfaceResultatRecherche;

public class TestInterfaceClient {
	

    
    
	
	public static void main(String[] args) {
		
		// modele 

		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

		//vue 
		
		InterfaceClient client =  new InterfaceClient(res);
		client.chargerArrets(res.getMesArrets());
		
		
		
		//controleur
		Controller cont = new Controller(res, client);
		
		
	
		
	}
	
	 
}
