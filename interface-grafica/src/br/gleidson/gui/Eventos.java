package br.gleidson.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Eventos extends JFrame {
	JButton botao;
	public Eventos() {
		super("Eventos");

		botao = new JButton("Clique Aqui");
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				botao.setText("Foi Clicado");

			}
		});

		getContentPane().add(botao);

		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Eventos();
	}
}
