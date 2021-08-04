package co.com.swing;

import javax.swing.*;
import java.awt.*;

public class SwingDemo2 {
	
	SwingDemo2(){
		
		JFrame ventana = new JFrame("BorderLayout");
		Container container = ventana.getContentPane();
		
		JButton boton1 = new JButton("BorderLayout.CENTER");
		JButton boton2 = new JButton("BorderLayout.NORTH");
		JButton boton3 = new JButton("BorderLayout.SOUTH");
		JButton boton4 = new JButton("BorderLayout.EAST");
		JButton boton5 = new JButton("BorderLayout.WEST");
		
		container.add(boton1, BorderLayout.CENTER);
		container.add(boton2, BorderLayout.NORTH);
		container.add(boton3, BorderLayout.SOUTH);
		container.add(boton4, BorderLayout.EAST);
		container.add(boton5, BorderLayout.WEST);
		
		ventana.setSize(500, 500);
		ventana.setVisible(true);
		
	}
	

	public static void main(String[] args) {
	
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo2();
				
			}
		});

	}

}
