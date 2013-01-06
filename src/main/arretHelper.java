package main;

import java.util.Collection;


/**
 * Une classe contenant des methodes statiques relatives aux arrets
 *
 */
public class arretHelper {
	
	/**
	 * Recherche un arret par son nom
	 * @param name			le nom de l'arrêt
	 * @param arrets		la collection contenant l'arret
	 * @return				l'arret recherche
	 * @throws Exception	Exception "Arret inexistant" si l'arrêt n'est pas dans la liste
	 */
	public static Arret getArretbyName(String name, Collection<? extends Arret> arrets) throws Exception {
		for (Arret a : arrets) {
			if(a.getNom().equals(name)){
				return a;
			}
		}
		throw new Exception("Arret inexistant : " + name);
	}
	
}
