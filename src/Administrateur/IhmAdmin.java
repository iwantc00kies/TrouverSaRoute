package Administrateur;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import main.Reseau;

public class IhmAdmin extends AbstractCardLayout {
	
	// Modèles nécessaires à cette interface
	protected ModelAbstract modelRes;
	protected ModelAbstract modelAuth;
	
	// Constantes nécessaire pour le changement de panels
	final static String LOGINPANEL = "Authentification pour administrateur";
	final static String MENUPANEL = "Menu d'administration";
	final static String MODIFRESEAUPANEL = "Modifier le réseau";

	public IhmAdmin(ModelAbstract modelAuth, ModelAbstract modelRes) {
		
		// On renseigne les différents modèles nécessaires
		this.modelAuth 	= modelAuth;
		this.modelRes	= modelRes;
		
		// Création de la fenêtre qui permettra de changer de panels
		JFrame frame = new JFrame("Administration");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // TODO : erreur lorsque l'on a deux fenêtres

		// Ajout de nos différents panels
		addComponentToPane(frame.getContentPane());

		// Affichage de la fenêtre
		frame.pack();
		frame.setVisible(true);
	}

	public void changeToPanel(String panelName) {

		// Pour changer de panels
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, panelName);
	}

	@Override
	public void addComponentToPane(Container pane) {

		// Créations des panels
		cardLogin = new PanelLogin(this, modelAuth);
		cardMenu = new PanelMenu(this, modelRes);
		cardModifReseau = new PanelModifierReseau(this, modelRes);

		// Instanciation du cardLayout pour le changements de panels
		cards = new JPanel(new CardLayout());
		
		// Ajouts des panels avec leur nom : leur identifiant
		cards.add(cardLogin, LOGINPANEL);
		cards.add(cardMenu, MENUPANEL);
		cards.add(cardModifReseau, MODIFRESEAUPANEL);
		
		// Ajout de notre cardlayout dans le panel actuel
		pane.add(cards, BorderLayout.CENTER);
	}
}
