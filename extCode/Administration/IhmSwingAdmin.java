package Administration;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class IhmSwingAdmin extends JFrame implements Observer {

	private JPanel container = new JPanel();
	
	private AbstractAdminControler controler;
	
	public IhmSwingAdmin(AbstractAdminControler controler) {
	    
		this.setSize(240, 260);
	    this.setTitle("Connexion administrateur");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    //initComposant();                
	    this.controler = controler;                
	    this.setContentPane(container);
	    this.setVisible(true);
	    
		this.controler = controler;
	}
	
	public void update(String str) {

	}

}
