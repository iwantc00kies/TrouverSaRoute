package test;

import main.Arret;
import main.Ligne;
import main.Reseau;

import org.junit.Test;

import Client.ClientController;
import Client.InterfaceClient;

/**
 * permet de tester le fonctionnement du chargement d'un fichier CSV donne
 *
 */
public class TestLectureAutreReseau {
	
	
	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				// modele 
				Reseau res = new Reseau("./files/lignes_v1.csv", "./files/stations_v1.csv");

				//vue 
				InterfaceClient client =  new InterfaceClient(res);

				//controleur
				ClientController cont = new ClientController(res, client);
				
			}
		});

	}

 

}
