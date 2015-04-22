package br.gleidson.joguinho;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ContainerDeJanelas extends JFrame {
	public ContainerDeJanelas() {

		add(new Fase());
		setTitle("Jogo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContainerDeJanelas();
		
	}
}
