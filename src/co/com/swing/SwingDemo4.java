package co.com.swing;
import javax.swing.*;
import java.awt.*;

public class SwingDemo4 {
	SwingDemo4(){
		
		JFrame ventana = new JFrame("FlowLayout");
		Container contenedor = ventana.getContentPane();
		
		contenedor.setLayout(new FlowLayout());
		
		JButton boton1 = new JButton("Uno");
		JButton boton2 = new JButton("Dos");
		JButton boton3 = new JButton("Tres");
		JButton boton4 = new JButton("Cuatro");
		JButton boton5 = new JButton("Cinco");
		
		contenedor.add(boton1);
		contenedor.add(boton2);
		contenedor.add(boton3);
		contenedor.add(boton4);
		contenedor.add(boton5);
		
		ventana.setSize(200, 200);
		ventana.setVisible(true);
	}
	

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo4();
				
			}
		});

	}

}
