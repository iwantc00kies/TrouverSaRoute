package Administrateur;


public class CtrlAuth extends CtrlAbstract {

	protected String username;
	protected String password;
	protected String realPassword;
	
	public CtrlAuth(ModelAbstract model) {
		super ( model );
	}

	@Override
	boolean control() {
		
		return (this.password.compareTo(this.realPassword) == 0 );
		
	}

	@Override
	boolean doTheyMatch(String username, String password) {
	
		this.username 		= username;
		this.password 		= password;
		this.realPassword 	= model.retrievePasswordOf(username);
		return control();

	}

}
