package Client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Arret;
import main.Reseau;

public class InterfaceClient extends JFrame implements PropertyChangeListener {

 
	private JPanel centerPanel = new JPanel();
	private JButton searchButton = new JButton("Rechercher");
	//private JButton quitButton = new JButton("Quitter");
	private JComboBox choixDepart = new JComboBox();
	private JComboBox choixArrivee = new JComboBox();
	private JLabel titre = new JLabel("Interface Client");
	private JLabel labelDepart= new JLabel("Arrêt de départ");
	private JLabel labelArrivee= new JLabel("Arrêt d'arrivée");	
   

	public InterfaceClient() {
		//reseau : le réseau dont on veut suivre les notifications (pattern observer / observable)

		initialiserFenetre();

		// notifié par le réseau
		//reseau.addChangeListener(this);

		//rendu visible a la fin   
		setVisible(true);
	}

	private void initialiserFenetre() {

		// parametres generaux
		setTitle("Interface Client");
		setSize(500, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container pane = this.getContentPane();

		pane.add(titre, BorderLayout.NORTH);
 
		// choix des stations de depart/arrivee
		centerPanel.setLayout(new GridLayout(0,2));		// 2 col, unlimited rows
		centerPanel.add(labelDepart);
		centerPanel.add(labelArrivee);
		centerPanel.add(choixDepart);
		centerPanel.add(choixArrivee);
		pane.add(centerPanel, BorderLayout.CENTER);

		// bouton de recherche
		pane.add(searchButton, BorderLayout.SOUTH);
		
		// eventuellement JGraph
	}


	@Override
	public void propertyChange(PropertyChangeEvent event) {
		// TODO
		// le réseau a changé
		System.out.println("Changed property: " + event.getPropertyName() + " old:"
				+ event.getOldValue() + " new: " + event.getNewValue());

		// on recharge le réseau ( la liste des arrêts )
	}



	public void chargerArrets(LinkedList<Arret> Arrets) {
		// on charge tous les arrets comme choix de depart/arrivee
		for(Arret arret : Arrets) {
			choixDepart.addItem(arret.getNom());
			choixArrivee.addItem(arret.getNom());
		}
	}


	public void lierAuReseau(Reseau res){
		// notifié par le réseau
		//res.addChangeListener(this);
	}


}