package FindPath;

import main.Arret;
import main.InterfaceReseau;
import main.Reseau;

/** Different research algorithms must implement this interface **/
public interface FindBestPath {

	public void findBestPath(Arret depart, Arret arrivee);


}


