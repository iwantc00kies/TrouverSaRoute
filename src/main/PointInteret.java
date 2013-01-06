package main;

public class PointInteret extends Arret{
	PointInteret(String nom) {
		super(nom);
	}
	private String nomSite;
	private String descriptif;
	
	///  getters and setters   ///
	
	public String getNomSite() {
		return nomSite;
	}
	public void setNomSite(String nomSite) {
		this.nomSite = nomSite;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

}
