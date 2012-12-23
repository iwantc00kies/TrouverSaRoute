package Administrateur;

public abstract class AbstractCtrlAuth {

	protected AbstractModelAuth model;
	protected String username;
	protected String password;
	protected String realPassword;
	
	public AbstractCtrlAuth(AbstractModelAuth model) {
		this.model = model;
	}
	
	public void doTheyMatch(String username, String password) {
		this.username = username;
		this.password = password;
		control();
	}
	
	abstract void control();
	
}
