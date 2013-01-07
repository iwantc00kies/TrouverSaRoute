package Administrateur;


public abstract class CtrlAbstract {

	protected ModelAbstract modelAuth;
	protected ModelAbstract modelRes;
	protected AbstractCardLayout ihmAdmin;
	
	public CtrlAbstract(ModelAbstract modelAuth, ModelAbstract modelRes, AbstractCardLayout ihmAdmin) {
		this.modelAuth = modelAuth;
		this.modelRes = modelRes;
		this.ihmAdmin = ihmAdmin;
	}
	
}
