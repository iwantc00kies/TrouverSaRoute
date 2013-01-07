package Administrateur;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Reseau;
import main.csv;

public class PanelMenu extends AbstractPanel {

	private Reseau model;
	
	private JButton chargerArrets;
	private JTextField urlArrets;
	private JButton chargerLignes;
	private JTextField urlLignes;
	private JButton voirReseau;
	private JButton modifierReseau;

	private boolean isArretsCharges = false;
	private boolean isLignesChargees = false;

	public PanelMenu(IhmAdmin ihmAdmin, CtrlAbstract controler, Reseau res) {
		super(ihmAdmin, controler);
		this.model = res;
	}

	@Override
	protected void initComposants() {

		// Éléments de la page
		chargerArrets = new JButton("Charger CSV arrets");
		urlArrets = new JTextField("Copier chemin du fichier csv");
		chargerLignes = new JButton("Charger CSV lignes");
		urlLignes = new JTextField("Copier chemin du fichier csv");
		voirReseau = new JButton("Voir le réseau");
		modifierReseau = new JButton("Modifier le réseau");

		JPanel menuAdmin = new JPanel(new GridLayout(3,2));
		menuAdmin.add(chargerArrets);
		menuAdmin.add(urlArrets);
		menuAdmin.add(chargerLignes);
		menuAdmin.add(urlLignes);
		menuAdmin.add(modifierReseau);
		menuAdmin.add(modifierReseau);
		
		this.add(menuAdmin);

	}


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
}
