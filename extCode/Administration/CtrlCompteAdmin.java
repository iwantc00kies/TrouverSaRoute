package Administration;

import java.util.LinkedList;


public class CtrlCompteAdmin {
	
	//private List<CompteAdministrateur> mesComptes;
	private LinkedList<CompteAdministrateur> mesComptes;
	
	public CtrlCompteAdmin(String filePath) {
		this.mesComptes = csv.csvCreerComptes(filePath);
	}
	
	public boolean doesItMatch(String id, String password) {
		
		for (CompteAdministrateur compte : mesComptes) {
			if ( (compte.getId().compareTo(id) == 0) && ( compte.getHashedPassword().compareTo(password) == 0 ) ) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
}
