package br.gleidson.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControleText extends JFrame {
	JButton ok, cancel;
	JTextField jtLogin;
	JPasswordField jpSenha;

	public ControleText() {
		super("Textos e Senhas");

		ok = new JButton("Ok");
		cancel = new JButton("Cancel");
		jtLogin = new JTextField();
		jtLogin.setSize(14, 22);
		jpSenha = new JPasswordField();

		ok.addActionListener(new BotaoOkListener());
		cancel.addActionListener(new BotaoCancelListener());

		setLayout(new GridLayout(3, 2));
		add(new JLabel("Login"));
		add(jtLogin);
		add(new JLabel("Senha"));
		add(jpSenha);
		add(ok);
		add(cancel);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleText();
	}

	class BotaoOkListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (jtLogin.getText().equals("gleidson")
					&& new String(jpSenha.getPassword()).equals("9903")) {
				JOptionPane.showMessageDialog(null, "Acesso Garantido!");
			}

		}
	} // end class BotaoOk

	class BotaoCancelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			jtLogin.setText("");
			jpSenha.setText("");
		}

	}

}
