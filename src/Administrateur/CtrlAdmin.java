package Administrateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CtrlAdmin extends CtrlAbstract {

	protected CtrlAbstract ctrlAuth;
	
	public CtrlAdmin (ModelAbstract modelRes, AbstractCardLayout ihmAdmin, CtrlAbstract ctrlAuth) {
		super(modelRes, ihmAdmin);
		this.ctrlAuth = ctrlAuth;
		
		((AbstractPanel) ihmAdmin.cardMenu).mainListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				control();			
			}
		});
		
		((PanelMenu) ihmAdmin.cardMenu).deconnexionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controlDeco();
			}
			
		});
		
		((PanelMenu) ihmAdmin.cardMenu).chargerArretsListener(  new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		((PanelMenu) ihmAdmin.cardMenu).chargerLignesListener(  new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		((PanelMenu) ihmAdmin.cardMenu).voirReseauListener (  new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
	}

	@Override
	protected void control() {
		
		if ( !((CtrlAuth)this.ctrlAuth).isAuthentifie() ) {
			this.ihmAdmin.changeToPanel(IhmAdmin.LOGINPANEL);
		}
		
	}
	
	protected void controlDeco() {
		
		((CtrlAuth)this.ctrlAuth).setAuthentifie(false);
		this.ihmAdmin.changeToPanel(IhmAdmin.LOGINPANEL);
		
		// TODO : virer les champs
		
	}
	
	

}
