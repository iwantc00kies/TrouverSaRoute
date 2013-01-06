package test;

import main.Reseau;
import Administrateur.AbstractCardLayout;
import Administrateur.CtrlAbstractAuth;
import Administrateur.CtrlAuth;
import Administrateur.IhmAuth;
import Administrateur.ModelAbstractAuth;
import Administrateur.ModelAuth;
import Client.ClientController;
import Client.InterfaceClient;


/** test du bon fonctionnement de l'application (interface client) **/
public class TestInterfaceClient {


	public static void main(String[] args) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				// modele 
				Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

				//vue 
				InterfaceClient client =  new InterfaceClient(res);

				//controleur
				ClientController cont = new ClientController(res, client);
				
				//ensuite test de modification du réseau (normalement depuis l'interface admin)
				// l'interface (vue) doit se mettre a jour
				
			}
		});

	}


	







}
