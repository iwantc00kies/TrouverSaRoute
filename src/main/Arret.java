package main;

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


	Arret(String nom) {
		setNom(nom);
		lignes = new LinkedList<String>();
		coord = new WGS84();
	}

	public void setEstAccessible(String estAccessible) {
		final String[] ok = new String[] {"O","o","Oui","oui", "y", "Y", "Yes", "yes", "ok", "OK"};

		if(Arrays.asList(ok).contains(estAccessible)) {
			this.estAccessible = true;
		}
		else {
			this.estAccessible = false;
		}
	}


	public void Afficher(){
		System.out.println("Numero : " + numero + " \t\tNom : " + nom + "\t\t coordonnees : " + coord.toString());
		System.out.println("Accessible : " + estAccessible + " \t\tAbrite : " + estAbrite + " \t\t Mobilier : " + mobilier + " \t\t codeCommune : " + codeCommune);	
		System.out.println("\t\t\tArrets:");
		for(String ligne : lignes){
			System.out.println("\t\t\t  " + ligne);
		}
	}

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
