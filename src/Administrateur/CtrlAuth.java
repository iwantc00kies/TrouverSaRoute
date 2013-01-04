package Administrateur;


public class CtrlAuth extends CtrlAbstractAuth {

	public CtrlAuth(ModelAbstractAuth model) {
		super ( model );
	}

	@Override
	boolean control() {
		
		return (this.password.compareTo(this.realPassword) == 0 );
		
	}

}
