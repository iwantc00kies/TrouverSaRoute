package Administrateur;

public class CtrlAuth extends AbstractCtrlAuth {

	public CtrlAuth(AbstractModelAuth model) {
		super ( model );
	}

	@Override
	boolean control() {
		
		return ( this.password.compareTo(this.realPassword) == 0 );
		
	}

}
