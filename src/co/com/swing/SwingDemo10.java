package co.com.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingDemo10 {
	
	SwingDemo10(){
		
		JFrame ventana = new JFrame("Formulario Swing");
		Container contenedor  = ventana.getContentPane();
		
		JPanel panelNorte = new JPanel();
		contenedor.add(panelNorte, BorderLayout.CENTER);
		
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JTextField texto = new JTextField(20);
		
		ActionListener a1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = ((JButton) e.getSource()).getText();
				texto.setText(nombre + " Pulsado"); 
				
			}
		};
		
		boton1.addActionListener(a1);
		boton1.setToolTipText("Soy el Boton 1");
		panelNorte.add(boton1);
		
		boton2.addActionListener(a1);
		boton2.setToolTipText("Soy el Boton 2");
		panelNorte.add(boton2);
		
		texto.setToolTipText("Soy un campo de texto");
		panelNorte.add(texto);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.pack();
		ventana.setVisible(true);
		
		
		
		
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo10();
				
			}
		});

	}

}
