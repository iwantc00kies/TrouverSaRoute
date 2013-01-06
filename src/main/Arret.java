package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class Arret {

	protected int numero;
	protected String nom;
	protected LinkedList<String> lignes;
	protected WGS84 coord ;
	protected boolean estAccessible;	
	protected boolean estAbrite;
	protected String mobilier;
	protected int codeCommune;
	protected ArrayList<Arret> arretSuivants = new ArrayList<Arret>(1);
	protected ArrayList<Arret> arretPrecedant = new ArrayList<Arret>(1);
	
	protected Arret(String nom) {
		setNom(nom);
		lignes = new LinkedList<String>();
		coord = new WGS84();
	}

	public void setEstAccessible(String estAccessible) {
		final String[] ok = new String[] {"O","o","Oui","oui", "y", "Y", "Yes", "yes"};

		if(Arrays.asList(ok).contains(estAccessible)) {
			this.estAccessible = true;
		}
		else {
			this.estAccessible = false;
		}
	}

	/**
	 * Affiche la description de l'arrêt
	 */
	public void Afficher(){
		System.out.println("Numero : " + numero + " \t\tNom : " + nom + "\t\t coordonnees : " + coord.toString());
		System.out.println("Accessible : " + estAccessible + " \t\tAbrite : " + estAbrite + " \t\t Mobilier : " + mobilier + " \t\t codeCommune : " + codeCommune);	
		System.out.println("\t\t\tLigne:");
		for(String ligne : lignes){
			System.out.println("\t\t\t\t : "+ ligne);
		}
		if(arretSuivants.size()==0){
			System.out.println("\t\t\t Terminus");
		}
		else{
			System.out.println("\t\t\tArrets suivants:");
			for(Arret a : arretSuivants){
				System.out.println("\t\t\t\t - "+ a.getNom());
			}
		}

	}

	/**
	 * Retourne une chaine correspondant a la maniere d'afficher l'arret
	 * @return		le nom de l'arret
	 */
	public String getString() {
		return (nom);
	}

	/**
	 * Calcule la distance euclidienne entre deux arrets
	 * @param a		le deuxieme arret
	 * @return		la distance entre deux arrets
	 */
	public double distance(Arret a) {
		double xB = Double.valueOf(this.coord.x);
		double yB = Double.valueOf(this.coord.y);
		double xA = Double.valueOf(a.coord.x);
		double yA = Double.valueOf(a.coord.y);	
		return Math.sqrt( Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2) );
	}

	
	
	/**
	 * Ajoute un arret à la liste des arrets suivants. Ceci est necessaire pour l'algorithme de recherche.
	 * @param arret 	l'arret suivant a ajouter 
	 */
	public void addArretSuivant(Arret arret) {
		this.arretSuivants.add(arret);
	}
	
	/**
	 * Ajoute un arret à la liste des arrets precedant. Ceci est necessaire pour l'algorithme de recherche.
	 * @param arret		l'arret precedent a ajouter 
	 */
	public void addArretPrecedant(Arret arret) {
		this.arretPrecedant.add(arret);
	}
	
 
	
	/// getters and setters ///
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public WGS84 getCoord() {
		return coord;
	}

	public void setCoord(WGS84 coord) {
		this.coord = coord;
	}

	public boolean isEstAbrite() {
		return estAbrite;
	}

	public void setEstAbrite(boolean estAbrite) {
		this.estAbrite = estAbrite;
	}

	public boolean isEstAccessible() {
		return estAccessible;
	}

	public void setEstAccessible(boolean estAccessible) {
		this.estAccessible = estAccessible;
	}

	public String getMobilier() {
		return mobilier;
	}

	public void setMobilier(String mobilier) {
		this.mobilier = mobilier;
	}

	public int getCodeCommune() {
		return codeCommune;
	}

	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	public LinkedList<String> getLignes() {
		return lignes;
	}

	public void setLignes(LinkedList<String> lignes) {
		this.lignes = lignes;
	}






}