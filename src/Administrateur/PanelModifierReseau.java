package Administrateur;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

import main.Reseau;

public class PanelModifierReseau extends AbstractPanel {
	
	public PanelModifierReseau(AbstractCardLayout ihm, ModelAbstract modelRes) {
		super(ihm, modelRes);
	}

	@Override
	protected void initComposants() {
		JPanel myPanel = new JPanel(new GridLayout(3,1));
		myPanel.add(new JTextField("Enter text here"));
		this.add(myPanel);
	}

	@Override
	public void mainListener(ActionListener al) {
		// TODO Auto-generated method stub
		
	}
	

}
