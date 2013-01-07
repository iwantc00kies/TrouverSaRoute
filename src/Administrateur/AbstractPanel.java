package Administrateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public abstract class AbstractPanel extends JPanel  {
	
	protected AbstractCardLayout cardLayout;
	protected ModelAbstract model; 
	
	public AbstractPanel(AbstractCardLayout ihm, ModelAbstract model) {
		this.cardLayout 	= ihm;
		this.model			= model;

		initComposants();
	
	}
	
	protected abstract void initComposants();
	
	public abstract void actionListeners(ActionListener al);
	
}
