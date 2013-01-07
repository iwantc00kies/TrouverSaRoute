package main;

import Administrateur.AbstractCardLayout;
import Administrateur.CtrlAbstractAuth;
import Administrateur.CtrlAuth;
import Administrateur.IhmAuth;
import Administrateur.ModelAbstractAuth;
import Administrateur.ModelAuth;
import Client.ClientController;
import Client.InterfaceClient;


public class main {

	public static void main(String[] args) {
		
		
		/// Admin ///
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Instanciation de notre modèle
				ModelAbstractAuth authentification = new ModelAuth();

				// Création du contrôleur
				CtrlAbstractAuth controler = new CtrlAuth(authentification);

				// Création de l'IHM correspondant
				AbstractCardLayout pageAdmin = new IhmAuth(controler);
			}
		});
		
		
		/// Client ///
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				/// Client ///
				// modele 
				Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

				//vue 
				InterfaceClient client =  new InterfaceClient(res);

				//controleur
				ClientController cont = new ClientController(res, client);
				
				//pattern observer/observable
				res.addObserver(client);
			}
		});

	}

}
