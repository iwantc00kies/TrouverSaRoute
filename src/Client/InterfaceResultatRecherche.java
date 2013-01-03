package Client;

import java.awt.Container;
import java.util.LinkedList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Arret;


/** classe affichant le resultat de la recherche passee en parametres **/
public class InterfaceResultatRecherche extends JFrame {


	/**
	 * Affiche une nouvelle fenetre avec les arrets contenus dans resultat
	 * @param depart 		le nom de l'arret de depart
	 * @param arrivee 		le nom de l'arret d'arrivee
	 * @param resultat		le resultat a afficher dans la fenetre
	 */
	public InterfaceResultatRecherche(LinkedList<Arret> resultat){

		// parametres generaux
		 
		setTitle("Resultats de la recherche");
		setSize(resultat.size()*200, 400);		// change la taille en fonction du nombre de resultats
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container panel = this.getContentPane();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("Depart : " + resultat.getFirst().getString() + "          Arrivée : " +  resultat.getLast().getString()));
		for (Arret arret : resultat) {
			panel.add(new JLabel(arret.getString()));
		}

		
		// eventuellement JGraph
		
		pack();
		setVisible(true);
	}



}
