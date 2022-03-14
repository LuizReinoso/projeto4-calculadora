package br.com.bruno.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class calculadora extends JFrame{

	public calculadora() {
		
		organizarLayout();
		
		setSize(232, 322);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	

	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		
		teclado teclado = new teclado();
		add(teclado, BorderLayout.CENTER);
	}



	public static void main(String[] args) {
		new calculadora();
	}
}
