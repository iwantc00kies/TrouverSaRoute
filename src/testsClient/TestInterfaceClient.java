package testsClient;

import java.util.LinkedList;

import main.Arret;
import main.Ligne;
import main.Reseau;
import main.csv;
import Client.InterfaceClient;

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
		
		
		InterfaceClient client =  new InterfaceClient();
		client.chargerArrets(mesArrets);
		
		
		
	}
	
}
