package Administrateur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ModelAuth extends AbstractModelAuth {

	public ModelAuth() {
		super();
	}

	String retrievePasswordOf(String username) { 
		
		String realPassword = null;
		Iterator<CompteAdmin> itr = mesComptes.iterator();
		
		while ( (realPassword == null) && (itr.hasNext()) ) {
			
			CompteAdmin admin = itr.next();
			
			if ( admin.getUsername().compareTo(username) == 0 ) {
				realPassword = admin.getPassword();
			}	
		}
		return realPassword;
	}

}
