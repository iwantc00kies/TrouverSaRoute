package Administrateur;

import java.util.ArrayList;

public abstract class ModelAbstractAuth {
	
	protected ArrayList<EntityCompteAdmin> mesComptes = new ArrayList<EntityCompteAdmin>();
	
	public ModelAbstractAuth() {
		
			// Init des comptes
			this.addCompteAdmin( new EntityCompteAdmin("admin", "password" ) );
			
	}
	
	public void addObserver(IhmAuth connexion) {
		// TODO Auto-generated method stub
	}
	
	abstract String retrievePasswordOf(String username);
	
	abstract void addCompteAdmin(EntityCompteAdmin compte);

}
