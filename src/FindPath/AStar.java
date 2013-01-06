package FindPath;

import java.util.Collection;
import java.util.LinkedList;

import main.Arret;
import main.InterfaceReseau;
import main.Ligne;
import main.Reseau;
import main.arretHelper;

/** implements A-Star algorithm **/
public class AStar implements FindBestPath {
	private Reseau monReseau;
	private LinkedList<Arret> mesArrets;
	private LinkedList<Ligne> mesLignes;
	
 
	/**
	 * 
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
