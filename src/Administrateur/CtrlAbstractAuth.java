package Administrateur;


public abstract class CtrlAbstractAuth {

	protected ModelAbstractAuth model;
	protected String username;
	protected String password;
	protected String realPassword;
	
	public CtrlAbstractAuth(ModelAbstractAuth model) {
		this.model = model;
	}
	
	public boolean doTheyMatch(String username, String password) {
		this.username 		= username;
		this.password 		= password;
		this.realPassword 	= model.retrievePasswordOf(username);
		return control();
	}
	
	abstract boolean control();
	
}
