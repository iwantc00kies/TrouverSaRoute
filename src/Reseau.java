import java.util.Collections;
import java.util.LinkedList;


public class Reseau {
	
	private LinkedList<Arret> mesArrets;
	private LinkedList<Ligne> mesLignes;
	
	Reseau() {
		setMesArrets(new LinkedList<Arret>(null));
		setMesLignes(new LinkedList<Ligne>(null));
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
	
	
	void chargerLigne(String fichier) {
		csv.csvRead("/users/elo/nha/Documents/TSR/lignes.csv");
		
	}
	
	void modifier() {
		
	}

	void A_Star() {
		
	
	}

	
	
}
