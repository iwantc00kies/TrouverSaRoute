package Client;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.Arret;
import main.Reseau;


/**
 * L'interface client, qui est une vue du réseau
 *
 */
public class InterfaceClient extends JFrame  implements Observer{

	/**
	 * generated serialID
	 */
	private static final long serialVersionUID = -5998576006995849054L;

	private Reseau reseauModel;

	private Container panel;
	private JPanel centerPanel = new JPanel();
	private JButton searchButton = new JButton("Rechercher");
	private JLabel titre = new JLabel("Interface Client");
	private JLabel labelDepart= new JLabel("Arrêt de départ");
	private JLabel labelArrivee= new JLabel("Arrêt d'arrivée");	

	private JComboBox choixDepart = new JComboBox();
	private JComboBox choixArrivee = new JComboBox();


	/**
	 * 
	 * @return le nom de l'arret de depart
	 */
	public String getChoixDepart() {
		return (String) choixDepart.getSelectedItem();
	}

	/**
	 * 
	 * @return le nom de l'arret d'arrivee
	 */
	public String getChoixArrivee() {
		return (String) choixArrivee.getSelectedItem();
	}


	/**
	 * Constructeur de le vue InterfaceClient
	 * @param reseau		le modele dont on cette classe est la vue
	 */
	public InterfaceClient(Reseau reseau) {
		//reseau : le réseau dont on veut suivre les modifications
		// patern observer/observable 
		this.reseauModel = reseau;

		initialiserFenetre();
		chargerArrets(reseauModel.getArrets());

		//rendu visible a la fin   
		setVisible(true);
	}


	/**
	 * Initialise les composants et le layout de la classe
	 */
	private void initialiserFenetre() {

		// parametres generaux
		setTitle("Interface Client");
		setSize(500, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		panel = this.getContentPane();

		panel.add(titre, BorderLayout.NORTH);

		// choix des stations de depart/arrivee
		centerPanel.setLayout(new GridLayout(0,2));		// 2 col, unlimited rows
		centerPanel.add(labelDepart);
		centerPanel.add(labelArrivee);
		centerPanel.add(choixDepart);
		centerPanel.add(choixArrivee);
		panel.add(centerPanel, BorderLayout.CENTER);

		// bouton de recherche
		panel.add(searchButton, BorderLayout.SOUTH);
	}




	/** Charge une liste d'arrêts dans les ComboBox
	 * @param Arrets		la liste des arrets 
	 * **/
	public void chargerArrets(LinkedList<Arret> Arrets) {
		// on charge tous les arrets comme choix de depart/arrivee
		for(Arret arret : Arrets) {
			choixDepart.addItem(arret.getNom());
			choixArrivee.addItem(arret.getNom());
		}
	}


	/** Ajoute un ActionListener au boutton "Rechercher"
	 * @param sal		l'instance d'ActionListener a ajouter
	 * **/
	public void addSearchButtionActionListener(ActionListener sal) {
		this.searchButton.addActionListener(sal);
	}

	/**
	 * methode appelee par l'observable lorsqu'un changement arrive
	 */
	@Override
	public void update(Observable arg0, Object arg1) {
		// le reseau a change, on met a jour la liste des arrets
		chargerArrets(((Reseau) arg0).getArrets());
		//chargerArrets(reseauModel.getArrets());
	}

}