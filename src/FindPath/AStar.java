package FindPath;

import java.util.LinkedList;

import main.Arret;
import main.Ligne;
import main.Reseau;

/** implements A-Star algorithm **/
public class AStar<Node, Arc> implements FindBestPath {
	
	private Reseau monReseau;
	private LinkedList<Arret> mesArrets;
	private LinkedList<Ligne> mesLignes;
	
 
	/**
	 * Initialise l'algorithme AStar
	 * @param reseau		le reseau 
	 */
	public AStar (Reseau reseau){
		// l'algorithme A-Star doit connaitre les arrets adjacents
		this.monReseau = (Reseau) reseau;
		mesLignes =  reseau.getLignes();
		mesArrets =  reseau.getArrets();

	}
	
	@Override
	public void findBestPath(Arret depart, Arret arrivee) {
		 throw new UnsupportedOperationException("not implemented yet");	
	}
 
}
