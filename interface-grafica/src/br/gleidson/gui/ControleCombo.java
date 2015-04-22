package br.gleidson.gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ControleCombo extends JFrame {
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("/imagens/imagem1.jpg")),
			new ImageIcon(getClass().getResource("/imagens/imagem2.jpg")),
			new ImageIcon(getClass().getResource("/imagens/imagem3.jpg")),
			new ImageIcon(getClass().getResource("/imagens/imagem4.jpg")) };

	public ControleCombo() {
		setTitle("Album de Fotos");
		setLayout(new BorderLayout());
		combo = new JComboBox<String>();
		combo.setFont(new Font("arial", Font.PLAIN, 26));
		combo.addItem("Arára");
		combo.addItem("Papagaio");
		combo.addItem("Gato");
		combo.addItem("Mar");
		combo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					label.setIcon(imagens[combo.getSelectedIndex()]);
				}
			}
		});

		label = new JLabel(imagens[0]);

		getContentPane().add(combo, BorderLayout.NORTH);
		getContentPane().add(label, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 640);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleCombo();
	}
}
