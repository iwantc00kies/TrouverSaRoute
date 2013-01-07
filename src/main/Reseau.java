package main;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

import Administrateur.ModelAbstract;
import FindPath.AStar;
import FindPath.FindBestPath;


public class Reseau extends ModelAbstract implements InterfaceReseau{

	private LinkedList<Arret> mesArrets;
	private LinkedList<Ligne> mesLignes;
	private FindBestPath rechercheChemin;


	///  getters and setters   ///

	public LinkedList<Ligne> getLignes() {
		return mesLignes;
	}

	public void setLignes(Collection<Ligne> mesLignes) {
		this.mesLignes = (LinkedList<Ligne>) mesLignes;
	}

	public LinkedList<Arret> getArrets() {
		return mesArrets;
	}

	public void setArrets(Collection<Arret> mesArrets) {
		this.mesArrets = (LinkedList<Arret>) mesArrets;
		setChanged();
		notifyObservers();		// le reseau a change, on notifie les vues
	}


	/**
	 * Construct a new network
	 * @param cheminLignesCSV
	 * @param cheminArretsCSV
	 */
	public Reseau(String cheminLignesCSV, String cheminArretsCSV) {
		chargerCSV(cheminLignesCSV, cheminArretsCSV);
		majArretsSuivants();
		rechercheChemin= new AStar(this);
	}


	public Reseau() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Recherche un chemin entre deux Arrets
	 * @param depart		le nom de l'arret de depart
	 * @param Arrivee		le nom de l'arret d'arrivee
	 */
	public void findPath(String depart, String Arrivee){
		Arret ArretDepart = null;
		Arret ArretArrivee = null;
		try {
			ArretDepart = arretHelper.getArretbyName(depart, this.mesArrets);
			ArretArrivee = arretHelper.getArretbyName(depart, this.mesArrets);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if(ArretDepart == null || ArretArrivee == null){
			System.out.println("Arrets introuvables");
		}
		else {
			rechercheChemin.findBestPath(ArretDepart, ArretArrivee);
		}
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
		setLignes(csv.csvCreerLignes(cheminLignesCSV));
		setArrets(csv.csvCreerArrets(cheminArretsCSV));
	}

	/**
	 * Met a jour les arrets suivants de chaque arret
	 */
	public void majArretsSuivants() {
		for (Ligne ligne : mesLignes) {
			LinkedList<Arret> arrets = ligne.getArrets();
			for (int i=0 ; i<arrets.size()-1 ; i++) {
				Arret arretToUpdate;
				try {
					arretToUpdate = arretHelper.getArretbyName(arrets.get(i).getNom(), this.mesArrets);
					arretToUpdate.addArretSuivant(arrets.get(i+1));
				} catch (Exception e) {
					System.out.println(arrets.get(i).getNom());
					for (Arret a : mesArrets) {
						System.out.println(a.getNom());
					}
					e.printStackTrace();
				}
			}
		}

		notifyObservers();		// le reseau a change, on notifie les vues
	}



	/**
	 * Met a jour les arrets precedents de chaque arret
	 */
	public void majArretsPrecedents() {
		for (Ligne ligne : mesLignes) {
			LinkedList<Arret> arrets = ligne.getArrets();
			for (int i=0 ; i<arrets.size() ; i++) {
				Arret arretToUpdate;
				try {
					arretToUpdate = arretHelper.getArretbyName(arrets.get(i).getNom(), this.mesArrets);
					try{
						arretToUpdate.addArretSuivant(arrets.get(i+1));
					}
					catch (Exception e) {}
					try{
						arretToUpdate.addArretPrecedant(arrets.get(i-1));
					}
					catch (Exception e) {}
				} catch (Exception e) {
					System.out.println(arrets.get(i).getNom());
					for (Arret a : mesArrets) {
						System.out.println(a.getNom());
					}
					e.printStackTrace();
				}
			}
		}
	}



}
