package co.com.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Usar el contenedor JPanel. No tiene un aspecto visual pero puede contener otros elementos.
 * 
 * FlowLayout: Distribuye los componentes de izquierda a derecha ó de arriba hacia abajo.
 * @author sandrarodriguez
 *
 */
public class SwingDemo5 {
	
	SwingDemo5(){
		
		JFrame ventana =  new JFrame("Flow Layout");
		
		Container contenedor = ventana.getContentPane();
		
		JPanel panel = new JPanel();
		
		panel.add(new JButton("Uno"));
		panel.add(new JButton("Dos"));
		panel.add(new JButton("Tres"));
		panel.add(new JButton("Cuatro"));
		panel.add(new JButton("Cinco"));
		contenedor.add(panel);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setSize(200, 200);
		ventana.setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo5();
				
			}
		});

	}

}
