package FindPath;

import java.util.Collection;
import java.util.LinkedList;

import main.Arret;
import main.Ligne;
import main.Reseau;

/** implements A-Star algorithm **/
public class AStar implements FindBestPath {

	@Override
	public void findBestPath(Reseau res) {



	}


	/**
	 *  Met a jour les arrets suivant de chaque arret
	 * @param lignes	collection de lignes (lignes du graphe)
	 * @param arrets	collection d'arrets (noeuds du graphe)
	 */
	public void majArretsSuivants(Collection<? extends Ligne> lignes, Collection<? extends Arret> arrets) {
		for (Ligne ligne : lignes) {
			LinkedList<Arret> arretsLigne = ligne.getArrets();
			for (int i=0 ; i<arrets.size()-1 ; i++) {
				Arret arretToUpdate;
				try {
					arretToUpdate = getArretbyName(arretsLigne.get(i).getNom(), arrets);
					arretToUpdate.addArretSuivant(arretsLigne.get(i+1));
				} catch (Exception e) {
					System.out.println("Erreur de coherence dans les donnees d'entree ?");
					e.printStackTrace();
				}
			}
		}
	}


	/**
	 * Recherche un arret par son nom dans une collection quelconque - O(n)
	 * @param name			le nom de l'arrêt
	 * @return				l'arret recherche
	 * @throws Exception	Exception "Arret inexistant" si l'arrêt n'est pas dans la collection
	 */
	private Arret getArretbyName(String name ,  Collection<? extends Arret> arrets) throws Exception {
		for (Arret a : arrets) {
			if(a.getNom().equals(name)){
				return a;
			}
		}
		throw new Exception("Arret inexistant");
	}

}
