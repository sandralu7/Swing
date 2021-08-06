package co.com.swing;

import javax.swing.*;
import java.awt.*;

public class SwingDemo12 {

	public SwingDemo12() {
		
		JFrame ventana = new JFrame ("Formulario");
		
		JPanel paneliz = new JPanel();
		JPanel panelde = new JPanel ();
		JPanel panelab = new JPanel();
		JPanel panelar = new JPanel();
		
		JLabel nombre = new JLabel("Nombre");
		JLabel apellido = new JLabel("Apellido");
		JLabel telefono = new JLabel("Telefono");
		JLabel id = new JLabel("Identificación");
		
		JTextField nombreT1 = new JTextField();
		JTextField apellidoT2 = new JTextField();
		JTextField telefonoT3 = new JTextField();
		JTextField idT4 = new JTextField();
		
		JButton boton1 = new JButton();
		JButton boton2 = new JButton();
		
		ventana.setLayout(new FlowLayout());
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setSize(300, 200);
		
		boton1.setText("Aceptar");
		boton2.setText("Cancelar");
		
		paneliz.setLayout(new GridLayout(4, 1));
		paneliz.add(nombre);
		paneliz.add(apellido);
		paneliz.add(telefono);
		paneliz.add(id);
		
		panelde.setLayout(new GridLayout(4, 1));
		panelde.add(nombreT1);
		panelde.add(apellidoT2);
		panelde.add(telefonoT3);
		panelde.add(idT4);
		
		panelab.setLayout(new FlowLayout());
		panelab.setPreferredSize(new Dimension(200,50));
		panelab.add(boton1);
		panelab.add(boton2);
		
		panelar.setLayout(new GridLayout(1,2));
		panelar.setPreferredSize(new Dimension(250,100));
		panelar.add(paneliz);
		panelar.add(panelde);
		
		JPanel panelCompleto = new JPanel();
		panelCompleto.setLayout(new GridLayout(2,1));
		panelCompleto.add(panelar);
		panelCompleto.add(panelab);
		
		ventana.getContentPane().add(panelCompleto);
		
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo12();
				
			}
		});

	}
}
