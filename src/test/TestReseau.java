package test;

import main.Arret;
import main.Ligne;
import main.Reseau;
import org.junit.Test;

public class TestReseau {

	
	@Test
	public void test() {
		// modele 
		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");
		
		for(Ligne l : res.getLignes()){
			l.Afficher();
		}
		System.out.println("\n\n");
		for(Arret a : res.getArrets()){
			a.Afficher();
		}
 
		//res.findPath("Aeroport", "Gare");
		
	}

}
