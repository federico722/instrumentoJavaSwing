package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Ventana implements ActionListener {

	 JFrame frame;
	 JButton btnVisuNombre;
	 JButton btnOcultarNombre;
	 JLabel etiNombre;
	 JLabel etiCiudad;
	 JButton btnOcultarCiudad;
	 JButton btnVisuCiudad;
	 
	

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		etiNombre = new JLabel("FEDERICO");
		etiNombre.setFont(new Font("Times New Roman", Font.BOLD, 14));
		etiNombre.setBounds(93, 68, 79, 14);
		frame.getContentPane().add(etiNombre);
		
		etiCiudad = new JLabel("ARMENIA");
		etiCiudad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		etiCiudad.setBounds(262, 68, 79, 14);
		frame.getContentPane().add(etiCiudad);
		
	    btnOcultarNombre = new JButton("OCULTAR NOMBRE");
		btnOcultarNombre.setBounds(10, 156, 162, 39);
		btnOcultarNombre.addActionListener(this);
		frame.getContentPane().add(btnOcultarNombre);
		
	    btnVisuNombre = new JButton("VISUALIZAR NOMBRE");
		btnVisuNombre.setBounds(262, 156, 162, 39);
		btnVisuNombre.addActionListener(this);
		frame.getContentPane().add(btnVisuNombre);
		
		btnOcultarCiudad = new JButton("OCULTAR CIUDAD");
		btnOcultarCiudad.setBounds(10, 211, 162, 39);
		btnOcultarCiudad.addActionListener(this);
		frame.getContentPane().add(btnOcultarCiudad);
		
		btnVisuCiudad = new JButton("VISUALIZAR CIUDAD");
		btnVisuCiudad.setBounds(262, 206, 162, 39);
		btnVisuCiudad.addActionListener(this);
		frame.getContentPane().add(btnVisuCiudad);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnOcultarNombre==e.getSource() ) {
			etiNombre.setVisible(false);
		}else if(btnVisuNombre==e.getSource()) {
			etiNombre.setVisible(true);
		}else if(btnOcultarCiudad==e.getSource()) {
			etiCiudad.setVisible(false);
		}else if(btnVisuCiudad==e.getSource()) {
			etiCiudad.setVisible(true);
		}
		
	}
	
	
    
}
