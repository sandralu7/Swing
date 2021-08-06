package co.com.swing;

import javax.swing.*;
import java.awt.*;


/**
 * BoxLayout permite colocar los elementos verticalmente u horizontalmente.
 * @author sandrarodriguez
 *
 */
public class SwingDemo7 {
	
	SwingDemo7(){
		
		JFrame ventana = new JFrame("BoxLayout");
		Container contenedor = ventana.getContentPane();
		
		//Indicar el contenedor y el eje para ubicar los componentes
		contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
		
		contenedor.add(new JButton("Uno"));
		contenedor.add(new JButton("Dos"));
		contenedor.add(new JButton("Tres"));
		contenedor.add(new JButton("Cuatro"));
		contenedor.add(new JButton("Cinco"));
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setSize(400, 400);
		ventana.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo7();
				
			}
		});
	}

}
