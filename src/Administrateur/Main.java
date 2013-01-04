package Administrateur;

import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//AbstractCardLayout.createAndShowGUI(controler);
				//IhmAuth.createAndShowGUI();
				startApplication();
			}
		});

	}

	protected static void startApplication() {

		// Instanciation de notre modèle
		ModelAbstractAuth authentification = new ModelAuth();

		// Création du contrôleur
		CtrlAbstractAuth controler = new CtrlAuth(authentification);

		// Création de l'IHM correspondant
		AbstractCardLayout pageAdmin = new IhmAuth(controler);


	}

}
