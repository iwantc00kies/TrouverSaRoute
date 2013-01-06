package main;

import java.util.LinkedList;


public class Reseau {

	private LinkedList<Arret> mesArrets;
	private LinkedList<Ligne> mesLignes;

	public Reseau(String cheminLignesCSV, String cheminArretsCSV) {

		chargerCSV(cheminLignesCSV, cheminArretsCSV);
		majArretsSuivants();
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

	/**
	 * Met a jour les arrets suivant de chaque arret
	 */
	public void majArretsSuivants() {
		for (Ligne ligne : mesLignes) {
			LinkedList<Arret> arrets = ligne.getArrets();
			for (int i=0 ; i<arrets.size()-1 ; i++) {
				Arret arretToUpdate;
				try {
					arretToUpdate = getArretbyName(arrets.get(i).getNom());
					arretToUpdate.addArretSuivant(arrets.get(i+1));
				} catch (Exception e) {
					System.out.println("Erreur de coherence dans les donnees d'entree ?");
					e.printStackTrace();
				}
			}
		}

	}
	
	
	/**
	 * Recherche un arret par son nom
	 * @param name			le nom de l'arrêt
	 * @return				l'arret recherche
	 * @throws Exception	Exception "Arret inexistant" si l'arrêt n'est pas dans la liste
	 */
	private Arret getArretbyName(String name) throws Exception {
		for (Arret a : mesArrets) {
			if(a.getNom().equals(name)){
				return a;
			}
		}
		throw new Exception("Arret inexistant");
	}
}
