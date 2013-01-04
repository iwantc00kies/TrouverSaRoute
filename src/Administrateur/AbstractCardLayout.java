package Administrateur;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public abstract class AbstractCardLayout {
	
	protected JPanel cards; //a panel that uses CardLayout
	
	public AbstractCardLayout() {};
	
	public abstract void changeToPanel(String panelName);

	public abstract void addComponentToPane(Container pane, CtrlAbstractAuth controler);

}
