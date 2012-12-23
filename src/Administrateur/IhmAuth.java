package Administrateur;

import java.awt.BorderLayout;
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

	private JPanel container;
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
		this.setTitle("Authentification");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		//	    initComposant();

		initLogin();
       
		this.setContentPane(container);
		this.setVisible(true);

	}

	private void initLogin() {

		label1 = new JLabel("Username:");
		text1 = new JTextField(15);

		label2 = new JLabel("Password:");
		text2 = new JPasswordField(15);

		SUBMIT=new JButton("SUBMIT");

		container = new JPanel(new GridLayout(3,1));
		container.add(label1);
		container.add(text1);
		container.add(label2);
		container.add(text2);
		container.add(SUBMIT);
		add(container, BorderLayout.CENTER);
		
		SUBMIT.addActionListener(new SubmitListener());

	}

	private void initComposant() {

		JTextField loginTextField = new JTextField(10);
		JPasswordField loginPasswordField = new JPasswordField(10);
		JButton loginButton = new JButton("Ok");

		container.setLayout(layout);
		container.add(new JLabel("Login:"));
		container.add(loginTextField);
		container.add(new JLabel("Password:"));
		container.add(loginPasswordField);
		container.add(loginButton);

		loginButton.addActionListener(new SubmitListener());

	}

	public void setLabel(String message) {
		this.warning = new JLabel ( message);
	}
	
	class SubmitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String value1 = text1.getText();
			String value2 = text2.getText();
			
			if ( controler.doTheyMatch(value1, value2) ) {
				IhmAuthNicolas page=new IhmAuthNicolas();
				page.setVisible(true);
				JLabel label = new JLabel("Welcome:"+value1);
				page.getContentPane().add(label);
			}
			else{
				System.out.println("enter the valid username and password");
				JOptionPane.showMessageDialog(SUBMIT, "Incorrect login or password", "Error", JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	public void update(Observable arg0, Object arg1) {

	}

}
