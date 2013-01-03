package Client;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Arret;


/** classe affichant le resultat de la recherche passee en parametres **/
public class InterfaceResultatRecherche extends JFrame {

	public InterfaceResultatRecherche(LinkedList<Arret> resultat){

		// parametres generaux
		 
		setTitle("Resultats de la recherche");
		setSize(resultat.size()*200, 200);		// change la taille en fonction du nombre de resultats
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container panel = this.getContentPane();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		for (Arret arret : resultat) {
			panel.add(new JLabel(arret.getString()));
		}

		
		// eventuellement JGraph
		
		pack();
		setVisible(true);
	}



}
