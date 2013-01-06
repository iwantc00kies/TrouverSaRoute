package main;

import java.util.Collection;


public interface InterfaceReseau {

	// un reseau doit permettre au minimum qu'on puisse acceder a ses lignes et a ses arrets
	public Collection<Ligne> getLignes();
	public Collection<Arret> getArrets();
	public void setLignes(Collection<Ligne> lignes);
	public void setArrets(Collection<Arret> arrets);
	
}
