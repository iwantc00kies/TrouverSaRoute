package Administrateur;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Arret;

public class AffichageReseau extends JFrame {

	AffichageReseau() {
	
		// parametres generaux

		setTitle("Affichage du réseau");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container panel = this.getContentPane();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
	}

}
