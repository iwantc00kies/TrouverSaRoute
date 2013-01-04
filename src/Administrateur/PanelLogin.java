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

public class PanelLogin extends AbstractPanel implements ActionListener { 

	private JButton submit;
	private JTextField userText;
	private JPasswordField passwordField;


	public PanelLogin(AbstractCardLayout ihmAuth, String menuPanel,
			CtrlAbstractAuth controlerClass) {
		this.cardLayout 	= ihmAuth;
		this.nextPanel 		= menuPanel;
		this.controler 		= controlerClass;

		initComposants();

		ajoutListeners();
	}

	protected void initComposants() {

		// El�ments de la page
		JLabel userLabel = new JLabel("Username:");
		userText = new JTextField(15);

		JLabel passwordLabel = new JLabel("Password:");
		passwordField = new JPasswordField(15);

		submit = new JButton("Submit");

		// Insertion dans un panel de forme ad�quate - TODO s�rement autre m�thode
		JPanel loginPanel = new JPanel(new GridLayout(3,1));
		loginPanel.add(userLabel);
		loginPanel.add(userText);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordField);
		loginPanel.add(submit);

		// L'ajouter dans notre panel actuel
		this.add(loginPanel, BorderLayout.CENTER);
	}

	protected void ajoutListeners() {

		// Ajout des �couteurs
		this.submit.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String username = userText.getText();
		String password = passwordField.getText();

		if ( this.controler.doTheyMatch(username, password) ) {
		//if ( true ) {
			this.cardLayout.changeToPanel(nextPanel);

		}
		else{
			System.out.println("Enter an invalid username and password");
			JOptionPane.showMessageDialog(submit, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

}
