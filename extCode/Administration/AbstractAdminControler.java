package Administration;

import java.util.List;

public abstract class AbstractAdminControler {
	
	protected AbstractCompteAdmin compteAdmin;
	protected List<CompteAdministrateur> mesComptes;
	
	public AbstractAdminControler(AbstractCompteAdmin compteAdmin){
		this.compteAdmin = compteAdmin;
	}
	
	abstract void addCompteAdmin();
	abstract void control();

}
