package br.gleidson.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ControleLabel extends JFrame {
JLabel simples;
JLabel elaborado;
JLabel imagem;
	public ControleLabel() {
		setTitle("Label");

		simples = new JLabel("Label Simples");
		simples.setToolTipText("Passou o mouse: Tool Tipo");
		setLayout(new FlowLayout());

		elaborado = new JLabel("Label Elaborado");
		Font fonte = new Font("times new roman", Font.BOLD, 13);
		elaborado.setFont(fonte);
		elaborado.setForeground(Color.RED);
		elaborado.setIcon(new ImageIcon(this.getClass().getResource(
				"/imagens/joystick1.png")));
		
		
		imagem = new JLabel(new ImageIcon(this.getClass().getResource(
				"/imagens/joystick1.png")));

	
		getContentPane().add(simples);
		getContentPane().add(elaborado);
		getContentPane().add(imagem);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ControleLabel();
	}
}
