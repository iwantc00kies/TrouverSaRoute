package Administrateur;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.csv;

public class PanelMenu extends AbstractPanel {

	private JButton chargerArrets;
	private JTextField urlArrets;
	private JButton chargerLignes;
	private JTextField urlLignes;
	private JButton modifierReseau;

	public PanelMenu(AbstractCardLayout ihm, CtrlAbstract controlerClass) {
		super(ihm, controlerClass);
	}

	@Override
	protected void initComposants() {

		// Éléments de la page
		chargerArrets = new JButton("Charger CSV arrets");
		urlArrets = new JTextField("Copier chemin du fichier csv");
		chargerLignes = new JButton("Charger CSV lignes");
		urlLignes = new JTextField("Copier chemin du fichier csv");
		modifierReseau = new JButton("Modifier le réseau");

		JPanel menuAdmin = new JPanel(new GridLayout(3,2));
		menuAdmin.add(chargerArrets);
		menuAdmin.add(urlArrets);
		menuAdmin.add(chargerLignes);
		menuAdmin.add(urlLignes);
		menuAdmin.add(modifierReseau);

		this.add(menuAdmin);

	}


	@Override
	protected void ajoutListeners() {
		
		this.chargerArrets.addActionListener( new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Arrets en chargements...");
				csv.csvCreerArrets(urlArrets.getText());
				System.out.println("Terminé");
			}
			
		});
		
		this.chargerLignes.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Lignes en chargements...");
				csv.csvCreerLignes(urlLignes.getText());
				System.out.println("Terminé");
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
