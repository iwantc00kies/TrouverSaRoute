package Administrateur;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import main.Reseau;

public abstract class AbstractCardLayout {
	
	protected JPanel cards; //a panel that uses CardLayout
	protected Reseau res;
	protected ModelAbstract model;
	protected CtrlAbstract controler;
	
	public AbstractCardLayout() {};
	
	public abstract void changeToPanel(String panelName);

	public abstract void addComponentToPane(Container pane);

}
