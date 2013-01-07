package Administrateur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ModelAuth extends ModelAbstract {

	protected ArrayList<EntityCompteAdmin> mesComptes = new ArrayList<EntityCompteAdmin>();
	
	public ModelAuth() {
		super();
	}

	String retrievePasswordOf(String username) { 
		
		String realPassword = "";
		Iterator<EntityCompteAdmin> itr = mesComptes.iterator();
		
		while ( (realPassword.isEmpty()) && (itr.hasNext()) ) {
			
			EntityCompteAdmin admin = itr.next();
			
			if ( admin.getUsername().compareTo(username) == 0 ) {
				realPassword = admin.getPassword();
			}	
		}
		return realPassword;
	}

	void addCompteAdmin(EntityCompteAdmin compte) {
		this.mesComptes.add( compte );
		
	}

}
