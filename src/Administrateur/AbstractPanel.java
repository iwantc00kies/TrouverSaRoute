package Administrateur;

import javax.swing.JPanel;

public abstract class AbstractPanel extends JPanel {
	
	protected AbstractCardLayout cardLayout;
	protected CtrlAbstract controler; 
	
	public AbstractPanel(AbstractCardLayout ihm, CtrlAbstract controlerClass) {
		this.cardLayout 	= ihm;
		this.controler 		= controlerClass;

		initComposants();
		ajoutListeners();
	}
	
	protected abstract void initComposants();
	protected abstract void ajoutListeners();
	
}
