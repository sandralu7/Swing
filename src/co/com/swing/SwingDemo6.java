package co.com.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 
 * GridLayout que permite colocar los componentes en una rejilla.
 * 
 * @author sandrarodriguez
 *
 */
public class SwingDemo6 {

	SwingDemo6(){
		
		JFrame ventana = new JFrame ("GridLayout");
		
		//creando la rejilla con 2 filas y 3 columnas
		ventana.setLayout(new GridLayout(2,3));
		Container contenedor = ventana.getContentPane();
		
		contenedor.add(new JButton("Uno"));
		contenedor.add(new JButton ("Dos"));
		contenedor.add(new JButton("Tres"));
		contenedor.add(new JButton("Cuatro"));
		contenedor.add(new JButton("Cinco"));
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setSize(500, 500);
		ventana.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo6();
				
			}
		});

	}

}
