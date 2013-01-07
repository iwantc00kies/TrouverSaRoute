package Administrateur;


public abstract class CtrlAbstract {

	protected ModelAbstract model;
	protected AbstractCardLayout ihmAdmin;
	
	public CtrlAbstract(ModelAbstract modelAuth, AbstractCardLayout ihmAdmin) {
		this.model = modelAuth;
		this.ihmAdmin = ihmAdmin;
	}
	
	protected abstract void control();
}
