package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import Client.InterfaceClient;
import Client.InterfaceResultatRecherche;


/** le controlleur de l'application **/
public class Controller {
	private Reseau modeleReseau;
	private InterfaceClient vueClient;
	
	/** Constructor 
	 * @param client 
	 * @param res **/
	public Controller(Reseau reseau, InterfaceClient client) {
		this.modeleReseau = reseau;
		this.vueClient = client;
		
		// comportement du bouton Rechercher de la vue client
		vueClient.addSearchButtionActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		          // when the research button is clicked, we launch a fake research
		          //creation d'une nouvelle fenetre pour visualiser le resultat
		          new InterfaceResultatRecherche(modeleReseau.testRechercheMeilleurChemin());
			}
		});
		
		// a faire : 
		// lorsque l'admin change les arrets/lignes
		// le controlleur est prevenu et recharge les arrets du client
		// 
		
		
		
	}

}
