package br.gleidson.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class Janela extends JFrame {
	private JButton botao;
	public Janela() {
		super("Janela Principal");
		setLayout(new BorderLayout());
		
		
	//	botao.setSize(60, 50);
		setLayout(new BorderLayout(5,5));
		Container c = new Panel();
		c.setLayout(new GridLayout(4,1));
		c.add(new JButton("OK"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Setup"));
		c.add(new JButton("Help"));
		add(c, BorderLayout.EAST);
		
		
	
		add(new JButton("5"), BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setResizable(false);
		setVisible(true);
	
	}

	
	
}
