package Administrateur;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Reseau;

public class PanelModifierReseau extends AbstractPanel {

	private Reseau model;
	
	public PanelModifierReseau(IhmAdmin ihmAdmin, CtrlAbstract controler,
			Reseau res) {
		super(ihmAdmin, controler);
		this.model = res;
	}

	@Override
	protected void initComposants() {
		JPanel myPanel = new JPanel(new GridLayout(3,1));
		myPanel.add(new JTextField("Enter text here"));
		this.add(myPanel);
	}

	@Override
	protected void ajoutListeners() {
		// TODO Auto-generated method stub
		
	}

}
