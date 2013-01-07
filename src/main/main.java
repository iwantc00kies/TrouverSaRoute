package main;

import Administrateur.AbstractCardLayout;
import Administrateur.CtrlAbstract;
import Administrateur.CtrlAuth;
import Administrateur.IhmAdmin;
import Administrateur.ModelAbstract;
import Administrateur.ModelAuth;
import Client.ClientController;
import Client.InterfaceClient;


public class main {

	public static void main(String[] args) {
		
		
		/// Admin ///
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				// Instanciation de notre modèle
				ModelAbstract model = new ModelAuth();

				// Création du contrôleur
				CtrlAbstract controler = new CtrlAuth(model);

				// Création de l'IHM correspondant
				AbstractCardLayout pageAdmin = new IhmAdmin(model, controler);
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
