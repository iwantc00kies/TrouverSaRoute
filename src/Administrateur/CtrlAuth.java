package Administrateur;

public class CtrlAuth extends AbstractCtrlAuth {

	public CtrlAuth(AbstractModelAuth model) {
		super ( model );
	}

	@Override
	void control() {
		if (this.password != this.realPassword) {
			// TODO
		}
	}

}
