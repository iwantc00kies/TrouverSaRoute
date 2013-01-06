package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import au.com.bytecode.opencsv.CSVReader;		//http://opencsv.sourceforge.net/


	
public class csv {

	static List<String[]> csvRead(String filePath){
		CSVReader reader = null;

		try {
			reader = new CSVReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur de lecture du fichier " + filePath);
		}

		List<String[]> myEntries = null;

		try {
			myEntries = reader.readAll();
		} catch (IOException e) {
			System.out.println("Erreur2 de lecture du fichier " + filePath);
		}

		return myEntries;
	}

	// cree une liste chainee de lignes
	public static LinkedList<Ligne> csvCreerLignes(String filePath){

		boolean estPremier = true;


		String noLigne = "";
		String noLignePrec = "";
		Ligne ligneTmp = new Ligne();
		LinkedList<Ligne> mesLignes = new LinkedList<Ligne>();

		
		String delims = "[	]+";	//delimiteur tabulation

		
		//lire fichier
		List<String[]> mesLignesString = csvRead(filePath);

		if (mesLignesString.isEmpty()){
			System.out.println("Erreur de lecture du fichier");
		}


		// lire les lignes
		for (String[] ligne : mesLignesString) {

			// ignorer la premiere ligne du fichier
			if (!estPremier) {

				
				String[] champs = ligne[0].split(delims);				//lire les colonnes	
				noLignePrec	= noLigne;									// sauvegarde le numero de ligne precedant
				noLigne	= champs[0];									// sauvegarde le numero de ligne
				
				// si la ligne de bus change (A, B, C...)
				if (!noLigne.equals(noLignePrec)) {	
					mesLignes.add(ligneTmp);
					ligneTmp = new Ligne();
					ligneTmp.setNumero(champs[0]); 							//Numéro de ligne
					ligneTmp.setNom(champs[1]);								//nom
					ligneTmp.getArrets().add(new Arret(champs[2]));			//arret				
					ligneTmp.setType(champs[3]);	//type (Bus)
				}
				else {
					//sinon on ajoute juste un arret a la ligne courante
					ligneTmp.getArrets().add(new Arret(champs[2]));			//arret
				}	
			}
			estPremier = false;
		}
		mesLignes.add(ligneTmp);
		mesLignes.removeFirst();

		return mesLignes;
	}


	//cree une liste chainee d'arrets
	public static LinkedList<Arret> csvCreerArrets(String filePath){

		boolean estPremier = true;
		Arret arretTmp = null;
		LinkedList<Arret> mesArrets = new LinkedList<Arret>();
		String delims = "[;]+";	//delimiteur ;
		
		//lire fichier
		List<String[]> mesArretsString = csvRead(filePath);
		if (mesArretsString.isEmpty()){
			System.out.println("Erreur de lecture du fichier");
		}


		// lire les lignes
		for (String[] ligne : mesArretsString) {
			// ignorer la premiere ligne du fichier
			if (!estPremier) {
				String[] champs = ligne[0].split(delims);				//lire les colonnes	
				arretTmp = new Arret(champs[1]);
				arretTmp.numero = Integer.valueOf(champs[0]);
				for (String l : champs[2].toString().split(" ")) {
					arretTmp.lignes.add(l);
				}
				arretTmp.coord.x = champs[3];
				arretTmp.coord.y = champs[4];
				arretTmp.setEstAccessible(champs[5].trim().toLowerCase());
				arretTmp.mobilier = champs[6];
				arretTmp.codeCommune = Integer.valueOf(champs[7]);
				mesArrets.add(arretTmp);
			}
			estPremier = false;
		}

		return mesArrets;
	}

	
	
	
}