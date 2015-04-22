package br.gleidson.gui;

import java.util.Stack;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ControleTextArea extends JFrame {
	public ControleTextArea() {

	}

	public static void main(String[] args) {
		String s = "";

		Stack<String> pilha = new Stack<>();
		pilha.add("1");
		pilha.add("+");
		pilha.add("1");
		while (!pilha.isEmpty()) {
			s += pilha.pop();
		}
		System.out.println(Integer.parseInt(s));

	}
}
