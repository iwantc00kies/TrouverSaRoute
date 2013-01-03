package main;

import java.util.LinkedList;


public class main {

	public static void main(String[] args) {
		LinkedList<Ligne> mesLignes;
		
		mesLignes = csv.csvCreerLignes("./files/lignes.csv");
		for(Ligne ligne : mesLignes){
			ligne.Afficher();
		}
		
		LinkedList<Arret> mesArrets;
		mesArrets = csv.csvCreerArrets("./files/stations.csv");
		for(Arret arret : mesArrets){
			arret.Afficher();
		}

	}

}
