package main;

import java.util.Collection;

/**
 * Definit les methodes qu'un reseau doit implementer
 *
 */
public interface InterfaceReseau {

	// un reseau doit permettre au minimum qu'on puisse acceder a ses lignes et a ses arrets
	// cependant on ne choisit pas d'implementation particuliere.
	// Les lignes et les arrets doivent juste pouvoir etre vus comme des collections
	public Collection<Ligne> getLignes();
	public Collection<Arret> getArrets();
	public void setLignes(Collection<Ligne> lignes);
	public void setArrets(Collection<Arret> arrets);
	
}
