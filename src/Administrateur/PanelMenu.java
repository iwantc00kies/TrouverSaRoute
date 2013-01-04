package Administrateur;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelMenu extends AbstractPanel {

	public PanelMenu() {
		super();
		initComposants();
	}

	@Override
	protected void initComposants() {
		this.add(new JTextField("Enter here"));
	}
	

	@Override
	protected void ajoutListeners() {
	}
	
}
