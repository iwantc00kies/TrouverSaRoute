package Administrateur;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Reseau;
import main.csv;

public class PanelMenu extends AbstractPanel implements ActionListener {

	private JButton chargerArrets;
	private JTextField urlArrets;
	private JButton chargerLignes;
	private JTextField urlLignes;
	private JButton voirReseau;
	private JButton modifierReseau;
	private JButton deconnexion;

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
		urlArrets = new JTextField("Copier chemin du fichier csv");
		
		//chargerArrets = new JFileChooser();
		
		// Pour le fichier de lignes
		chargerLignes = new JButton("Parcourir");
		chargerLignes.addActionListener(this);
		fcLignes = new JFileChooser();
		urlLignes = new JTextField("Copier chemin du fichier csv");
		
		
		//voirReseau = new JButton("Voir le réseau");
		modifierReseau = new JButton("Charger le réseau");
		deconnexion = new JButton("Deconnection");

		JPanel menuAdmin = new JPanel(new GridLayout(5,2));
		menuAdmin.add(chargerArrets);
		menuAdmin.add(urlArrets);
		menuAdmin.add(chargerLignes);
		menuAdmin.add(urlLignes);
		menuAdmin.add(modifierReseau);
		menuAdmin.add(deconnexion);

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
	
	/* Dans le controleur
	@Override
	protected void ajoutListeners() {

		this.chargerArrets.addActionListener( new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Arrets en chargement...");
				model.setArrets(csv.csvCreerArrets(urlArrets.getText()));
				isArretsCharges = true;
				System.out.println("Terminé");
			}

		});

		this.chargerLignes.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Lignes en chargement...");
				model.setLignes(csv.csvCreerLignes(urlLignes.getText()));
				isLignesChargees = true;
				System.out.println("Terminé");
			}
		});

		this.voirReseau.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (isArretsCharges && isLignesChargees) {

					JFrame afficherReseau = new JFrame();

				}

			}

		});

		this.modifierReseau.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.changeToPanel(IhmAdmin.MODIFRESEAUPANEL);
			}

		});
	}
	 */

	@Override
	public void actionListeners(ActionListener actionListener) {
		this.deconnexion.addActionListener(actionListener);
		this.urlArrets.addActionListener(actionListener);
		this.urlLignes.addActionListener(actionListener);
	}
/*
	public void deconnexionListener(ActionListener actionListener) {
		this.deconnexion.addActionListener(actionListener);
	}

	public void chargerArretsListener(ActionListener actionListener) {
		//this.deconnexion.addActionListener(actionListener);
	}

	public void chargerLignesListener(ActionListener actionListener) {
		//this.deconnexion.addActionListener(actionListener);

	}

	public void voirReseauListener(ActionListener actionListener) {
		// this.deconnexion.addActionListener(actionListener);

	}
	*/
}
