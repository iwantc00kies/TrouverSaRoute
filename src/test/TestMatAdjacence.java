package test;

import java.util.LinkedList;

import main.Arret;
import main.Ligne;
import main.csv;

import org.junit.Test;

import FindPath.Djikstra;

public class TestMatAdjacence {



	@Test
	public void test() {
		LinkedList<Ligne> mesLignes =csv.csvCreerLignes("./files/lignes.csv");
		LinkedList<Arret> mesArrets= csv.csvCreerArrets("./files/stations.csv");
		Djikstra d = new Djikstra(mesArrets, mesLignes);
		d.afficheMatriceArcsOrientes();
		// cette matrice indique la distance à l'arrêt suivant pour un arrêt donné
	}

}
