package Client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Administrateur.ModelAbstract;
import main.Reseau;



/** le controlleur de l'application **/
public class ClientController {
	private Reseau modeleReseau;
	private InterfaceClient vueClient;
	
	/** Constructor 
	 * @param client 
	 * @param res **/
	public ClientController(ModelAbstract modelRes, InterfaceClient client) {
		this.modeleReseau = (Reseau) modelRes;
		this.vueClient = client;
		
		// comportement du bouton Rechercher de la vue client
		vueClient.addSearchButtionActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		          // when the research button is clicked, we launch a fake research
		          // creation d'une nouvelle fenetre pour visualiser le resultat
		          new InterfaceResultatRecherche(modeleReseau.testRechercheMeilleurChemin());
			}
		});	
		
	}

}
