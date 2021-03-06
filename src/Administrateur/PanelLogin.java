package Administrateur;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelLogin extends AbstractPanel { 

	// Éléments que l'on va manipuler en dehors de la classe (notamment le contrôleur)
	private JButton submit;
	private JTextField userText;
	private JPasswordField passwordField;

	public PanelLogin(AbstractCardLayout ihm, ModelAbstract modelAuth) {
		super(ihm, modelAuth);
	}
	
	public JButton getSubmit() {
		return submit;
	}

	public JTextField getUserText() {
		return userText;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	protected void initComposants() {

		// Eléments de la page
		JLabel userLabel = new JLabel("Username:");
		userText = new JTextField(15);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordField = new JPasswordField(15);

		submit = new JButton("Submit");

		// Ajout des éléments dans un panel arrangé
		JPanel loginPanel = new JPanel(new GridLayout(3,1));
		loginPanel.add(userLabel);
		loginPanel.add(userText);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordField);
		loginPanel.add(submit);

		// Ajout du panel dans la class
		this.add(loginPanel, BorderLayout.CENTER);
	}
	
	public void actionListeners(ActionListener al) {
		this.submit.addActionListener(al);
	}
	
}
