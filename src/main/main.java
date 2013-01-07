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

	public static void main(String[] args) {
		
		
		/// Admin ///
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				// Instanciation des modèles
				ModelAbstract modelAuth = new ModelAuth();
				ModelAbstract modelRes 	= new Reseau();

				// Création de l'IHM correspondant avec les différents modèles nécessaires
				AbstractCardLayout ihmAdmin = new IhmAdmin(modelAuth, modelRes);

				// Création du contrôleur pour la partie authentification
				CtrlAbstract controlerAuth = new CtrlAuth(modelAuth, ihmAdmin);
				
				// Création du contrôleur pour la partie administrateur
				CtrlAbstract controlerAdmin = new CtrlAdmin(modelRes, ihmAdmin, controlerAuth);
			}
		});
		
		
		/// Client ///
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				/// Client ///
				// modele 
				Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

				/*
				//vue 
				InterfaceClient client =  new InterfaceClient(res);

				//controleur
				ClientController cont = new ClientController(res, client);
				
				//pattern observer/observable
				res.addObserver(client);*/
			}
		});

	}

}
