package test;

import main.Reseau;

import org.junit.Before;
import org.junit.Test;

import Client.ClientController;
import Client.InterfaceClient;

public class TestInterfaceClientMVC {
	private Reseau res;
 
	@Before
	public void setUp() throws Exception {
		// modele 
		res = new Reseau("./files/lignes.csv", "./files/stations.csv");

		//vue 
		InterfaceClient client =  new InterfaceClient(res);

		//controleur
		ClientController cont = new ClientController(res, client);
		

	}

 
	/**
	 * Essaie de voir si les modifications du reseau sont bien repercutees
	 */
	@Test
	public void testPattern() {

		// test de modification du réseau (normalement depuis l'interface admin)
		// l'interface (vue) doit se mettre a jour
		res.chargerCSV("", "");
	}

}
