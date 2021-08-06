package co.com.swing;

import javax.swing.*;
import java.awt.*;


public class SwingDemo11 {
	
	public SwingDemo11(){
		
		JFrame ventana = new JFrame ("Menú");
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("Archivo");
		JMenu m2 = new JMenu("Ayuda");
		mb.add(m1);
		mb.add(m2);
		JMenuItem item1 = new JMenuItem("Abrir");
		JMenuItem item2 = new JMenuItem("Guardar como");
		m1.add(item1);
		m1.add(item2);
		
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel ("Introducir texto");
		JTextField tf = new JTextField(10);
		JButton enviar = new JButton("Enviar");
		JButton restablecer = new JButton("Restablecer");
		
		panel.add(label);
		panel.add(tf);
		panel.add(enviar);
		panel.add(restablecer);
		
		JTextArea ta = new JTextArea();
		
		Container contenedor  = ventana.getContentPane();
		
		ventana.getContentPane().add(BorderLayout.SOUTH, panel);
		ventana.getContentPane().add(BorderLayout.NORTH, mb);
		ventana.getContentPane().add(BorderLayout.CENTER, ta);
		
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(500, 500);
		ventana.setVisible(true);
		
		
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo11();
				
			}
		});

	}

}
