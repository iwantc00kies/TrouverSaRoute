package Administrateur;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		// Instanciation de notre modèle
	    AbstractModelAuth authentification = new ModelAuth();
	    
	    // Création du contrôleur
	    AbstractCtrlAuth controler = new CtrlAuth(authentification);
	    
	    // Création de l'IHM correspondant
	    IhmAuth connexion = new IhmAuth(controler);

	    // Ajout de la fenêtre comme observer de notre modèle
	    authentification.addObserver(connexion);
		
	}

}
