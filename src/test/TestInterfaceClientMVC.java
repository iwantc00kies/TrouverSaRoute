package test;

import junit.framework.Assert;
import main.Arret;
import main.Ligne;
import main.Reseau;

import org.junit.Before;
import org.junit.Test;

import Client.ClientController;
import Client.InterfaceClient;

public class TestInterfaceClientMVC {
 
	public static void main(String[] args) {

		// modele 
		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");

		//vue 
		InterfaceClient client =  new InterfaceClient(res);

		//controleur
		ClientController cont = new ClientController(res, client);
		
		res.addObserver(client);
	
		Assert.assertEquals(1, res.countObservers());
		
		// test de modification du réseau (normalement depuis l'interface admin)
		// l'interface (vue) doit se mettre a jour
		res.chargerCSV("./files/lignes_v1.csv", "./files/stations_v1.csv");
		
	}
}
