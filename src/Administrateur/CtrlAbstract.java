package Administrateur;


public abstract class CtrlAbstract {

	protected ModelAbstract model;
	
	public CtrlAbstract(ModelAbstract model) {
		this.model = model;
	}
	
	abstract boolean doTheyMatch(String username, String password);
	abstract boolean control();
	
}
