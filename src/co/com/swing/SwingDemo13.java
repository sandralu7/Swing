package co.com.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingDemo13 {
	
	private JFrame ventana;
	private JLabel bienvenidos, numero1, numero2;
	private JTextField texto1, texto2;
	private JButton boton1, boton2;
	
	public SwingDemo13() {
		
		ventana = new JFrame("Ventana Suma");
		
		bienvenidos = new JLabel("Bienvenidos");
		numero1 = new JLabel("Numero 1");
		numero2 = new JLabel("Numero 2");
		
		texto1 = new JTextField(10);
		texto2 = new JTextField(10);
		
		boton1 = new JButton("Sumar");
		boton2 = new JButton("Salir");
		
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "La suma es: " + sumar());
				
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		ventana.setLayout(new FlowLayout());
		ventana.setSize(500,500);
		
		ventana.getContentPane().add(bienvenidos);
		ventana.getContentPane().add(numero1);
		ventana.getContentPane().add(texto1);
		ventana.getContentPane().add(numero2);
		ventana.getContentPane().add(texto2);
		ventana.getContentPane().add(boton1);
		ventana.getContentPane().add(boton2);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public int sumar () {
		
		try {
			int num1= Integer.parseInt(texto1.getText());
			int num2= Integer.parseInt(texto2.getText());
			
			int res = num1 + num2;
			return res;
			
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error de lectura de datos");
			return 0;
		}
		
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo13();
				
			}
		});

	}

}
