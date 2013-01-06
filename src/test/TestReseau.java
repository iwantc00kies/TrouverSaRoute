package test;

import static org.junit.Assert.*;

import java.util.LinkedList;

import main.Arret;
import main.Ligne;
import main.Reseau;
import main.csv;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestReseau {

	
	@Test
	public void test() {
		// modele 
		Reseau res = new Reseau("./files/lignes.csv", "./files/stations.csv");
		
		
		
		for(Ligne l : res.getMesLignes()){
			l.Afficher();
		}
		System.out.println("\n\n");
		for(Arret a : res.getMesArrets()){
			a.Afficher();
		}
 
		
		
	}

}
