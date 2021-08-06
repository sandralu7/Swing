package co.com.swing;

import javax.swing.*;
import java.awt.*;


public class SwingDemo8 {

	SwingDemo8(){
		
		JFrame ventana = new JFrame ("Box Layout");
		Container contenedor = ventana.getContentPane();
		contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));
		
		JButton button = new JButton("Uno");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		contenedor.add(button);
		
		JButton button2 = new JButton("Dos");
		button2.setAlignmentX(Component.CENTER_ALIGNMENT);
		contenedor.add(button2);
		
		JButton button3 = new JButton("Tres");
		button3.setAlignmentX(Component.CENTER_ALIGNMENT);
		contenedor.add(button3);
		
		JButton button4 = new JButton("Cuatro");
		button4.setAlignmentX(Component.CENTER_ALIGNMENT);
		contenedor.add(button4);
		
		JButton button5 = new JButton("Cinco");
		button5.setAlignmentX(Component.CENTER_ALIGNMENT);
		contenedor.add(button5);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ventana.setSize(400, 400);
		ventana.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo8();
				
			}
		});
		
		

	}

}
