package FindPath;

import main.Arret;

/** Different research algorithms must implement this interface **/
public interface FindBestPath {

	/**
	 * recherche un chemin entre deux noeuds d'un reseau
	 * @param depart		le point de depart (un noeurd du reseau)
	 * @param arrivee		le point d'arrivee (un noeud du reseau)
	 */
	public void findBestPath(Arret depart, Arret arrivee);


}


