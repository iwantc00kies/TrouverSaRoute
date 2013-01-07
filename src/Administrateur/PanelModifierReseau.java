package Administrateur;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelModifierReseau extends AbstractPanel {

	public PanelModifierReseau(AbstractCardLayout ihm,
			CtrlAbstract controlerClass) {
		super(ihm, controlerClass);
		// TODO Auto-generated constructor stub
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
