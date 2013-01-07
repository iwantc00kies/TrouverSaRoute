package Administrateur;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Reseau;
import main.csv;

public class PanelMenu extends AbstractPanel implements ActionListener {

	private JButton chargerArrets;
	protected JTextField urlArrets;
	private JButton chargerLignes;
	protected JTextField urlLignes;
	protected JButton voirReseau;
	protected JButton chargerReseau;
	protected JButton deconnexion;

	private JFileChooser fcArrets;
	private JFileChooser fcLignes;

	public PanelMenu(AbstractCardLayout ihm, ModelAbstract modelRes) {
		super(ihm, modelRes);
	}

	@Override
	protected void initComposants() {

		// Éléments de la page
		
		// Pour le fichier des arrêts, le bouton pour déclencher le parcours
		chargerArrets = new JButton("Parcourir...");
		// L'action associé
		chargerArrets.addActionListener(this);
		// Le fileChooser associé
		fcArrets = new JFileChooser();
		// Le champs correspondant au chemin
		urlArrets = new JTextField("ou copier chemin");
		
		// Pour le fichier de lignes
		chargerLignes = new JButton("Parcourir...");
		chargerLignes.addActionListener(this);
		fcLignes = new JFileChooser();
		urlLignes = new JTextField("ou copier chemin");
		
		voirReseau = new JButton("Voir le réseau");
		chargerReseau = new JButton("Charger le réseau");
		deconnexion = new JButton("Déconnection");

		// Chargement des éléments dans un panel personnalisé
		JPanel menuAdmin = new JPanel(new GridLayout(3,1));
		menuAdmin.add(new JLabel("Arrêts :"));
		menuAdmin.add(chargerArrets);
		menuAdmin.add(urlArrets);
		menuAdmin.add(new JLabel("Lignes :"));
		menuAdmin.add(chargerLignes);
		menuAdmin.add(urlLignes);
		menuAdmin.add(chargerReseau);
		menuAdmin.add(voirReseau);
		menuAdmin.add(deconnexion);

		// Chargement de ce panel dans notre class
		this.add(menuAdmin);
	}

	public void actionPerformed(ActionEvent e) {

		// On teste pour voir s'il s'agit des arrêts
		if (e.getSource() == chargerArrets) {
			int returnVal = fcArrets.showOpenDialog(PanelMenu.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fcArrets.getSelectedFile();
				urlArrets.setText(file.getAbsolutePath());
			} else {
				System.out.println("Parcours de fichier annulé.");
			}
		}
		// Il ne peut s'agir que des lignes
		else {
			int returnVal = fcLignes.showOpenDialog(PanelMenu.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fcLignes.getSelectedFile();
				urlLignes.setText(file.getAbsolutePath());
			} else {
				System.out.println("Parcours de fichier annulé.");
			}
		}
	}

	@Override
	public void actionListeners(ActionListener actionListener) {
		this.deconnexion.addActionListener(actionListener);
		this.chargerReseau.addActionListener(actionListener);
		this.voirReseau.addActionListener(actionListener);
	}
}
