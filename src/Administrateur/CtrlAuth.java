package Administrateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.Reseau;


public class CtrlAuth extends CtrlAbstract {
	

	public CtrlAuth(ModelAbstract modelAuth, ModelAbstract modelRes, AbstractCardLayout ihmAdmin) {
		super(modelAuth, modelRes, ihmAdmin);
		
		String username = ((PanelLogin) ihmAdmin.cardLogin).getUserText().getText();
		
		// Comportement du bouton de login
		((AbstractPanel) ihmAdmin.cardLogin).ajoutListeners( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				test();
				
			}
			
		});
			
	}
	
	protected void test() {
		this.ihmAdmin.changeToPanel(IhmAdmin.MENUPANEL);
	}
	
/*
	boolean control() {
		return (this.password.compareTo(this.realPassword) == 0 );
	}

	boolean doTheyMatch(String username, String password) {
	
		this.username 		= username;
		this.password 		= password;
		this.realPassword 	= model.retrievePasswordOf(username);
		return control();

	}
*/
}
