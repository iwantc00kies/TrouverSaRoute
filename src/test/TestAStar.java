package test;

import main.Arret;
import main.Reseau;

import org.junit.Test;
import exception.NotImplementedException;
import FindPath.AStar;

public class TestAStar {


	/**
	 * Comme l'algorithme de recherche n'est pas implemente ce code doit lancer une exception
	 * de type NotImplementedException
	 */
	@Test(expected=NotImplementedException.class)
	public void test() {
		
		AStar a = new AStar(new Reseau("./files/lignes.csv", "./files/stations.csv"));
		Arret a1 = new Arret("ArretTest1");
		Arret a2 = new Arret("ArretTest2");
		a.findBestPath(a1,a2);
	}

}
