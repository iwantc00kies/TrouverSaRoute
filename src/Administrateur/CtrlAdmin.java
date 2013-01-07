package Administrateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.csv;
import main.*;


public class CtrlAdmin extends CtrlAbstract {

	protected CtrlAbstract ctrlAuth;

	public CtrlAdmin (ModelAbstract modelRes, final AbstractCardLayout ihmAdmin, CtrlAbstract ctrlAuth) {
		super(modelRes, ihmAdmin);
		this.ctrlAuth = ctrlAuth;

		((AbstractPanel) ihmAdmin.cardMenu).actionListeners( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				control();
				if (e.getSource() == ((PanelMenu)ihmAdmin.cardMenu).deconnexion ) {
					controlDeco();
				}
				else if (e.getSource() == ((PanelMenu)ihmAdmin.cardMenu).chargerReseau ) {
					controlChargerReseau();
				}
				//control();			
			}
		});
		/*
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

			}

		});
		 */

	}

	protected void controlChargerReseau() {

		((InterfaceReseau)model).setArrets(
				csv.csvCreerArrets( 
						( (PanelMenu)ihmAdmin.cardMenu).urlArrets.getText() )
				);
		((InterfaceReseau)model).setLignes(
				csv.csvCreerLignes(
						( (PanelMenu)ihmAdmin.cardMenu).urlLignes.getText() ) 
				);
		
		
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
