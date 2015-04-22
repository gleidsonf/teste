package br.gleidson.gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControleCheck extends JFrame {
	JTextField texto;
	JCheckBox negrito;
	JCheckBox italico;

	public ControleCheck() {
		setTitle("Controle Check");
		setLayout(new FlowLayout());
		texto = new JTextField("Francisco Gleidson da Silva Ferreira", 20);
		texto.setEditable(false);

		negrito = new JCheckBox("Negrito");
		negrito.addItemListener(new CheckBoxListener());
		italico = new JCheckBox("Itálico");
		italico.addItemListener(new CheckBoxListener());

		add(texto);
		add(negrito);
		add(italico);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);

	}

	class CheckBoxListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (negrito.isSelected() && italico.isSelected()) {
				texto.setFont(new Font("arial", Font.BOLD | Font.ITALIC, 12));

			} else if (negrito.isSelected()) {
				texto.setFont(new Font("arial", Font.BOLD, 12));

			} else if (italico.isSelected()) {
				texto.setFont(new Font("arial", Font.ITALIC, 12));

			} else

			if (!negrito.isSelected() || !italico.isSelected()) {
				texto.setFont(new Font("arial", Font.PLAIN, 12));

			} else if (!negrito.isSelected() && !italico.isSelected()) {
				texto.setFont(new Font("arial", Font.PLAIN, 12));

			}
		}

	}

	public static void main(String[] args) {
		new ControleCheck();
	}

}
