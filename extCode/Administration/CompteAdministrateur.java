package Administration;


public class CompteAdministrateur extends AbstractCompteAdmin {
	
	public CompteAdministrateur(String id, String hashedPassword) {
		setId(id);
		setHashedPassword(hashedPassword);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
	
	public void display() {
		System.out.println("Id: " + id + "\t\t Password: "+hashedPassword);
	}

	public boolean doTheyMatch(String id, String password) {
		if ( ( this.getId().compareTo(id) == 0 ) && ( this.getHashedPassword().compareTo(password) == 0 ) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
