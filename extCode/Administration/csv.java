package Administration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


import au.com.bytecode.opencsv.CSVReader;
//http://opencsv.sourceforge.net/
//http://sourceforge.net/projects/opencsv/files/latest/download
	
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

	public static LinkedList<CompteAdministrateur> csvCreerComptes(String filePath) {
		
		boolean estPremier = true;
		CompteAdministrateur CompteAdministrateurTmp = null;
		LinkedList<CompteAdministrateur> mesCompteAdministrateurs = new LinkedList<CompteAdministrateur>();
		String delims = "[;]+";	//delimiteur ;
		
		//lire fichier
		List<String[]> mesCompteAdministrateursString = csvRead(filePath);
		if (mesCompteAdministrateursString.isEmpty()){
			System.out.println("Erreur de lecture du fichier");
		}

		// lire les lignes
		for (String[] compte : mesCompteAdministrateursString) {
			// ignorer la premiere ligne du fichier
			if (!estPremier) {
				
				String[] champs = compte[0].split(delims);				//lire les colonnes	
				
				mesCompteAdministrateurs.add(new CompteAdministrateur(champs[0], champs[1]));
				
			}
			estPremier = false;
		}

		return mesCompteAdministrateurs;
	}

	
}