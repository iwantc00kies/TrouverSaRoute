package Administrateur;

import java.util.ArrayList;

public abstract class ModelAbstract {
	
	protected ArrayList<EntityCompteAdmin> mesComptes = new ArrayList<EntityCompteAdmin>();
	
	public ModelAbstract() {
		
			// Init des comptes
			this.addCompteAdmin( new EntityCompteAdmin("admin", "password" ) );
			
	}
	
	abstract String retrievePasswordOf(String username);
	
	abstract void addCompteAdmin(EntityCompteAdmin compte);

}
