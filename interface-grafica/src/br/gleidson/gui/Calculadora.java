package br.gleidson.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	JTextField visor;
	JButton btNumero1;
	JButton btNumero2;
	JButton btNumero3;
	JButton btNumero4;
	JButton btNumero5;
	JButton btNumero6;
	JButton btNumero7;
	JButton btNumero8;
	JButton btNumero9;
	JButton btNumero0;
	JButton btAdicao;
	JButton btSubtracao;
	JButton btDivisao;
	JButton btMultiplicacao;
	JButton btIgual;
	JButton btPonto;
	Stack<String> StackCaracter;
	Stack<Integer> StackNumeros;
	String valor;

	public Calculadora() {
		visor = new JTextField(10);
		visor.setEditable(false);
		visor.setBackground(Color.WHITE);
		visor.setHorizontalAlignment(JTextField.RIGHT);
		visor.setFont(new Font("arial", Font.PLAIN, 26));
		btNumero1 = new JButton("1");
		btNumero2 = new JButton("2");
		btNumero3 = new JButton("3");
		btNumero4 = new JButton("4");
		btNumero5 = new JButton("5");
		btNumero6 = new JButton("6");
		btNumero7 = new JButton("7");
		btNumero8 = new JButton("8");
		btNumero9 = new JButton("9");
		btNumero0 = new JButton("0");
		btAdicao = new JButton("+");
		btSubtracao = new JButton("-");
		btDivisao = new JButton("/");
		btMultiplicacao = new JButton("*");
		btIgual = new JButton("=");
		btPonto = new JButton(".");
		valor = "";

		StackCaracter = new Stack<String>();
		StackNumeros = new Stack<>();
		btNumero1.addActionListener(new BotaoNumero1());
		btNumero2.addActionListener(new BotaoNumero2());
		btNumero3.addActionListener(new BotaoNumero3());
		btNumero4.addActionListener(new BotaoNumero4());
		btNumero5.addActionListener(new BotaoNumero5());
		btNumero6.addActionListener(new BotaoNumero6());
		btNumero7.addActionListener(new BotaoNumero7());
		btNumero8.addActionListener(new BotaoNumero8());
		btNumero9.addActionListener(new BotaoNumero9());
		btNumero0.addActionListener(new BotaoNumero0());
		btPonto.addActionListener(new BotaoPonto());
		btAdicao.addActionListener(new BotaoAdicao());
		btSubtracao.addActionListener(new BotaoSubtracao());
		btMultiplicacao.addActionListener(new BotaoMultiplicacao());
		btDivisao.addActionListener(new BotaoDivisao());
		btIgual.addActionListener(new BotaoIgual());

		setTitle("Calculadora");
		setLayout(new BorderLayout(0, 5));
		getContentPane().add(visor, BorderLayout.NORTH);

		Container c = new Panel();
		c.setLayout(new GridLayout(4, 4, 5, 5));

		// 1 linha
		c.add(btNumero7);
		c.add(btNumero8);
		c.add(btNumero9);
		c.add(btDivisao);
		// 2 linha
		c.add(btNumero4);
		c.add(btNumero5);
		c.add(btNumero6);
		c.add(btMultiplicacao);
		// 3 linha
		c.add(btNumero1);
		c.add(btNumero2);
		c.add(btNumero3);
		c.add(btSubtracao);
		// 4 linha
		c.add(btNumero0);
		c.add(btPonto);
		c.add(btIgual);
		c.add(btAdicao);
		add(c, BorderLayout.CENTER);

		setSize(300, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	class BotaoNumero1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(1);
			if (visor.getText().equals("")) {
				visor.setText("1");
			} else {
				visor.setText(visor.getText() + "1");
			}

		}

	} // end class botao numero 1

	class BotaoNumero2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(2);
			if (visor.getText().equals("")) {
				visor.setText("2");
			} else {
				visor.setText(visor.getText() + "2");
			}

		}

	}

	class BotaoNumero3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(3);
			if (visor.getText().equals("")) {
				visor.setText("3");
			} else {
				visor.setText(visor.getText() + "3");
			}

		}

	}

	class BotaoNumero4 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(4);
			if (visor.getText().equals("")) {
				visor.setText("4");
			} else {
				visor.setText(visor.getText() + "4");
			}

		}

	}

	class BotaoNumero5 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(5);
			if (visor.getText().equals("")) {
				visor.setText("5");
			} else {
				visor.setText(visor.getText() + "5");
			}

		}

	}

	class BotaoNumero6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(6);
			if (visor.getText().equals("")) {
				visor.setText("6");
			} else {
				visor.setText(visor.getText() + "6");
			}

		}

	}

	class BotaoNumero7 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(7);
			if (visor.getText().equals("")) {
				visor.setText("7");
			} else {
				visor.setText(visor.getText() + "7");
			}

		}

	}

	class BotaoNumero8 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(8);
			if (visor.getText().equals("")) {
				visor.setText("8");
			} else {
				visor.setText(visor.getText() + "8");
			}

		}

	}

	class BotaoNumero9 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(9);
			if (visor.getText().equals("")) {
				visor.setText("9");
			} else {
				visor.setText(visor.getText() + "9");
			}

		}

	}

	class BotaoNumero0 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackNumeros.push(0);
			if (visor.getText().equals("")) {
				visor.setText("0");
			} else {
				visor.setText(visor.getText() + "0");
			}

		}

	}

	class BotaoIgual implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Integer resultado = 0;
			while (!StackNumeros.isEmpty()) {
				if (StackCaracter.peek().equals("+")) {
					resultado = StackNumeros.pop() + StackNumeros.pop();
					StackCaracter.pop();
				} else if (StackCaracter.peek().equals("-")) {

					StackCaracter.pop();
				} else if (StackCaracter.peek().equals("*")) {

					StackCaracter.pop();
				} else if (StackCaracter.peek().equals("/")) {

					StackCaracter.pop();
				} else if (StackCaracter.isEmpty()) {
					visor.setText(StackNumeros.peek().toString());
					StackNumeros.pop();
				}
			}
			visor.setText(resultado.toString());
		}
	} // end class botao igual

	class BotaoAdicao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			StackCaracter.push("+");
			if (visor.getText().equals("")) {
				visor.setText("+");
			} else {
				visor.setText(visor.getText() + "+");
			}
		}
	}

	class BotaoSubtracao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {

			StackCaracter.push("-");
			if (visor.getText().equals("")) {
				visor.setText("-");
			} else {
				visor.setText(visor.getText() + "-");
			}

		}

	}

	class BotaoMultiplicacao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			StackCaracter.push("*");
			if (visor.getText().equals("")) {
				visor.setText("*");
			} else {
				visor.setText(visor.getText() + "*");
			}
		}

	}

	class BotaoDivisao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			StackCaracter.push("/");
			if (visor.getText().equals("")) {
				visor.setText("/");
			} else {
				visor.setText(visor.getText() + "/");
			}
		}

	}

	class BotaoPonto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (visor.getText().equals("")) {
				visor.setText("0.");
			} else {
				visor.setText(visor.getText() + ".");
			}

		}

	}

	public static void main(String[] args) {

		new Calculadora();
	}
}
