package Administrateur;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import main.*;


public class CtrlAdmin extends CtrlAbstract {

	protected CtrlAbstract ctrlAuth;
	protected boolean reseauCharge = false; 

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
				else if (e.getSource() == ((PanelMenu)ihmAdmin.cardMenu).voirReseau) {
					controlVoirReseau();
				}
			}
		});

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

		reseauCharge = true;
	}

	protected void controlVoirReseau() {

		// On ne peut afficher le réseau que s'il a été chargé
		if (reseauCharge) {
			JFrame frame = new JFrame("Vue du réseau");
			frame.setTitle("Resultats de la recherche");

			Container container = frame.getContentPane();
			container.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
			
			container.add(new JLabel("--- Lignes :"));
			for(Ligne l : ((Reseau)model).getLignes()){
				container.add(new JLabel("- "+l.getNom()));
			}
			container.add(new JLabel("--- Arrets :"));
			for(Arret a : ((Reseau)model).getArrets()){
				container.add(new JLabel("- "+a.getNom()));
			}


			frame.pack();
			frame.setVisible(true);
		}
		else {
			JOptionPane.showMessageDialog(null, "Reseau non chargé", "Error", JOptionPane.ERROR_MESSAGE);
		}


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
