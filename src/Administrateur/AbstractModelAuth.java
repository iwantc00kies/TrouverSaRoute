package Administrateur;

import java.util.ArrayList;

public abstract class AbstractModelAuth {
	
	protected ArrayList<CompteAdmin> mesComptes = new ArrayList<CompteAdmin>();
	
	public AbstractModelAuth() {
		
			// Init des comptes
			this.mesComptes.add( new CompteAdmin("admin", "password" ) );
			
	}
	
	public void addObserver(IhmAuth connexion) {
		// TODO Auto-generated method stub
	}
	
	abstract String retrievePasswordOf(String username);

}
