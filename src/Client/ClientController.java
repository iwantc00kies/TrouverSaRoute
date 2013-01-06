package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import main.Reseau;



/** le controlleur de l'application **/
public class ClientController {
	private Reseau modeleReseau;
	private InterfaceClient vueClient;
	
	/** Constructor 
	 * @param client 
	 * @param res **/
	public ClientController(Reseau reseau, InterfaceClient client) {
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
		// lorsque l'admin change les arrets/lignes sur son interface
		// le controlleur est prevenu et recharge les arrets du client
		// 
		
		
		
	}

}