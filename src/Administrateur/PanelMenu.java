package Administrateur;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	}
	
	
}
