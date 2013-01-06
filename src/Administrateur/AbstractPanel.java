package Administrateur;

import javax.swing.JPanel;

public abstract class AbstractPanel extends JPanel {
	
	protected AbstractCardLayout cardLayout;
	protected String nextPanel;
	protected CtrlAbstractAuth controler;  
	
	
	protected abstract void initComposants();
	
	protected abstract void ajoutListeners();
	
}
