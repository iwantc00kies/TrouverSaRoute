package test;

import main.Arret;
import main.Ligne;
import main.Reseau;

import org.junit.Test;

/**
 * permet de tester le fonctionnement du chargement d'un fichier CSV donne
 *
 */
public class TestLectureAutreReseau {

 
	@Test
	public void test() {
		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");
		
		for (Ligne l : res.getLignes()) {
			l.Afficher();
		}
		
		
		for (Arret a : res.getArrets()) {
			a.Afficher();
		}
	}

}
