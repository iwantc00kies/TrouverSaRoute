package main;

import java.util.LinkedList;


public class Reseau {
	
	private LinkedList<Arret> mesArrets;
	private LinkedList<Ligne> mesLignes;
	
	public Reseau(String cheminLignesCSV, String cheminArretsCSV) {

		chargerCSV(cheminLignesCSV, cheminArretsCSV);
	}
	
	public LinkedList<Ligne> getMesLignes() {
		return mesLignes;
	}

	public void setMesLignes(LinkedList<Ligne> mesLignes) {
		this.mesLignes = mesLignes;
	}

	public LinkedList<Arret> getMesArrets() {
		return mesArrets;
	}

	public void setMesArrets(LinkedList<Arret> mesArrets) {
		this.mesArrets = mesArrets;
	}
		
	
	/** retourne un chemin arbitraire de test entre Aeroport et Troquary **/
	public LinkedList<Arret> testRechercheMeilleurChemin() {
		LinkedList<Arret> meilleurChemin = new LinkedList<Arret>();
		meilleurChemin.add(mesArrets.get(0));
		meilleurChemin.add(mesArrets.get(1));		
		meilleurChemin.add(mesArrets.get(11));	
		meilleurChemin.add(mesArrets.get(12));
		return meilleurChemin;
		// il faudrait les changements aussi...
	}
 
	
	/**
	 * Charge en memoire les fichiers CSV
	 * @param cheminLignesCSV		le chemin vers le fichier de lignes
	 * @param cheminArretsCSV		le chemin vers le fichier d'arrêts
	 */
	public void chargerCSV(String cheminLignesCSV, String cheminArretsCSV) {
			setMesLignes(csv.csvCreerLignes(cheminLignesCSV));
			setMesArrets(csv.csvCreerArrets(cheminArretsCSV));
	}
	
	
}
