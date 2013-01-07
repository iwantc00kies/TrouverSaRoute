package Administrateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import main.Reseau;


public class CtrlAuth extends CtrlAbstract {
	
	private boolean isAuthentifie = false;

	public CtrlAuth(ModelAbstract modelAuth, AbstractCardLayout ihmAdmin) {
		super(modelAuth, ihmAdmin);
		
		// Comportement du bouton de login
		((AbstractPanel) ihmAdmin.cardLogin).ajoutListeners( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				control();
			}
			
		});
			
	}
	
	protected void control() {
		
		String username = ((PanelLogin) ihmAdmin.cardLogin).getUserText().getText();
		String password = ((PanelLogin) ihmAdmin.cardLogin).getPasswordField().getText();

		if( doTheyMatch(username, password) ) {
			isAuthentifie = true;
			this.ihmAdmin.changeToPanel(IhmAdmin.MENUPANEL);
		}
		else {
			System.out.println("Enter an invalid username and password");
			authentificationEchouee();
		}
	}
	
	protected void authentificationReussie() {

	}
	
	protected void authentificationEchouee() {
		JOptionPane.showMessageDialog(null, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	boolean doTheyMatch(String username, String password) {
		
		String realPassword = ((ModelAuth) model).retrievePasswordOf(username);
		
		return (password.compareTo(realPassword) == 0 );
	}
	
}
