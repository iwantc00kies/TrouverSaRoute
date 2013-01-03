package main;

import java.util.LinkedList;


public class Reseau {
	
	private LinkedList<Arret> mesArrets;
	private LinkedList<Ligne> mesLignes;
	
	public Reseau() {
		setMesArrets(new LinkedList<Arret>());
		setMesLignes(new LinkedList<Ligne>());
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
		
	public void meilleurChemin() {
		
	}
	
	// retourne un chemin arbitraire de test entre Aeroport et Troquary
	public LinkedList<Arret> testRecherche() {
		LinkedList<Arret> meilleurChemin = new LinkedList<Arret>();
		meilleurChemin.add(mesArrets.get(0));
		meilleurChemin.add(mesArrets.get(1));		
		meilleurChemin.add(mesArrets.get(11));	
		meilleurChemin.add(mesArrets.get(12));
		return meilleurChemin;
	}
 
	
	
}
