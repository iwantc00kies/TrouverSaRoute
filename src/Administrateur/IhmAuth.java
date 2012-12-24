package Administrateur;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class IhmAuth extends JFrame implements Observer {
	
	private JPanel loginPanel;	
	private FlowLayout layout = new FlowLayout();
	private JLabel warning;

	/* Pour le login */
	JButton SUBMIT;
	JLabel label1,label2;
	JTextField  text1, text2;
	/* fin pour le login */

	private AbstractCtrlAuth controler;

	public IhmAuth(AbstractCtrlAuth controler) {

		this.controler = controler;
		
		this.setSize(240, 260);
		this.setTitle("Administration");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		setLoginPanel();
       
		this.setContentPane(this.loginPanel);
		this.setVisible(true);

	}

	private void setLoginPanel() {

		label1 = new JLabel("Username:");
		text1 = new JTextField(15);

		label2 = new JLabel("Password:");
		text2 = new JPasswordField(15);

		SUBMIT=new JButton("SUBMIT");

		loginPanel = new JPanel(new GridLayout(3,1));
		loginPanel.add(label1);
		loginPanel.add(text1);
		loginPanel.add(label2);
		loginPanel.add(text2);
		loginPanel.add(SUBMIT);
		add(loginPanel, BorderLayout.CENTER);
		
		SUBMIT.addActionListener(new SubmitListener());

	}

	private void resetPage() {
		this.removeAll();
		System.out.print("resetting...");
		JPanel loginPanel = new JPanel();
		loginPanel.revalidate();
		loginPanel.repaint();
	}

	public void setLabel(String message) {
		this.warning = new JLabel ( message);
	}
	
	class SubmitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String username = text1.getText();
			String password = text2.getText();
			
			if ( controler.doTheyMatch(username, password) ) {
				
				
				resetPage();
				//IhmAuthNicolas page = new IhmAuthNicolas();
				//page.setVisible(true);
				//JLabel label = new JLabel("Welcome:"+username);
				//page.getContentPane().add(label);
				
			}
			else{
				System.out.println("Enter an invalid username and password");
				JOptionPane.showMessageDialog(SUBMIT, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public void update(Observable arg0, Object arg1) {

	}

}
