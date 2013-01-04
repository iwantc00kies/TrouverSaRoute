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


public class IhmAuth extends AbstractCardLayout {
	
	JPanel cards; //a panel that uses CardLayout
	
	final static String LOGINPANEL = "Authentification pour administrateur";
	final static String MENUPANEL = "Menu d'administration";

	
	// TODO : essayer de faire fonctionner avec un private controler ici!
	
	public IhmAuth() {
		
	}
	
	public IhmAuth(CtrlAbstractAuth controler) {
		this.createAndShowGUI(controler);
	}

	//public static void createAndShowGUI(CtrlAbstractAuth controler) {
	public void createAndShowGUI(CtrlAbstractAuth controler) {
		
		//Create and set up the window.
		JFrame frame = new JFrame("CardLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create and set up the content pane.
		AbstractCardLayout demo = new IhmAuth();
		demo.addComponentToPane(frame.getContentPane(), controler);

		//Display the window.
		frame.pack();
		frame.setVisible(true);
		
	}

	public void changeToPanel(String panelName) {
		CardLayout cl = (CardLayout)(cards.getLayout());
	        cl.show(cards, panelName);
	}

	@Override
	public void addComponentToPane(Container pane, CtrlAbstractAuth controler) {

		//Create the "cards".
		JPanel cardLogin = new PanelLogin(this, MENUPANEL, controler);
		JPanel cardMenu = new PanelMenu();

		//Create the panel that contains the "cards".
		cards = new JPanel(new CardLayout());
		cards.add(cardLogin, LOGINPANEL);
		cards.add(cardMenu, MENUPANEL);

	        pane.add(cards, BorderLayout.CENTER);
	}

}
