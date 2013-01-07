package main;

import Administrateur.AbstractCardLayout;
import Administrateur.CtrlAbstract;
import Administrateur.CtrlAdmin;
import Administrateur.CtrlAuth;
import Administrateur.IhmAdmin;
import Administrateur.ModelAbstract;
import Administrateur.ModelAuth;
import Client.ClientController;
import Client.InterfaceClient;


public class main {

	

	static ModelAbstract modelRes;

	
	
	public static void main(String[] args) {
			
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				
				
				// modele 
				modelRes = new Reseau("./files/lignes.csv", "./files/stations.csv");

				
				
				/// Client ///
				
				//vue client
				InterfaceClient client =  new InterfaceClient(modelRes);

				//controleur client
				ClientController cont = new ClientController(modelRes, client);
				
				//pattern observer/observable 
				modelRes.addObserver(client);
				
				
				
				/// Admin ///
				
				// Instanciation des modèles
				ModelAbstract modelAuth = new ModelAuth();

				// Création de l'IHM correspondant avec les différents modèles nécessaires
				AbstractCardLayout ihmAdmin = new IhmAdmin(modelAuth, modelRes);

				// Création du contrôleur pour la partie authentification
				CtrlAbstract controlerAuth = new CtrlAuth(modelAuth, ihmAdmin);
				
				// Création du contrôleur pour la partie administrateur
				CtrlAbstract controlerAdmin = new CtrlAdmin(modelRes, ihmAdmin, controlerAuth);
			}
		});

		
		
		
	}

}
