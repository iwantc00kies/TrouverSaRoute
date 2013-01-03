package testsClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import main.Arret;
import main.Ligne;
import main.Reseau;
import main.csv;
import Client.InterfaceClient;
import Client.InterfaceResultatRecherche;

public class TestInterfaceClient {
	

    
    
	
	public static void main(String[] args) {
		LinkedList<Ligne> mesLignes = csv.csvCreerLignes("./files/lignes.csv");
		LinkedList<Arret> mesArrets = csv.csvCreerArrets("./files/stations.csv");
		
		Reseau res = new Reseau();
		res.setMesLignes(mesLignes);	
		res.setMesArrets(mesArrets);
		
		
//		for (Arret arret : res.testRecherche()) {
//			arret.Afficher();
//		}
		
		
		InterfaceClient client =  new InterfaceClient(res);
		client.chargerArrets(res.getMesArrets());
		
		
		// depuis le controlleur normalement
		// decide du comportement des bouttons
		
		client.addSearchButtionActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
		          // when the research button is clicked, we launch a fake research
				LinkedList<Ligne> mesLignes = csv.csvCreerLignes("./files/lignes.csv");
				LinkedList<Arret> mesArrets = csv.csvCreerArrets("./files/stations.csv");
				
				Reseau res = new Reseau();
				res.setMesLignes(mesLignes);	
				res.setMesArrets(mesArrets);
				
		          LinkedList<Arret> resultat = res.testRechercheMeilleurChemin();
		          System.out.println("Affichage du resultat");
		          //visualisation du resultat
		          //creation d'une nouvelle fenetre
		          new InterfaceResultatRecherche(resultat);
			}
		});
		
		
		
	}
	
	 
}
