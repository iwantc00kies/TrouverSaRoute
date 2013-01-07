package Administrateur;

import java.util.ArrayList;

public abstract class ModelAbstract {
	
	protected ArrayList<EntityCompteAdmin> mesComptes = new ArrayList<EntityCompteAdmin>();
	
	public ModelAbstract() {
		
			// Init des comptes
			this.addCompteAdmin( new EntityCompteAdmin("admin", "password" ) );
			
	}
	
	public void addObserver(IhmAdmin connexion) {
		// TODO Auto-generated method stub
	}
	
	abstract String retrievePasswordOf(String username);
	
	abstract void addCompteAdmin(EntityCompteAdmin compte);

}
