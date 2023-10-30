package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Interfas implements ActionListener{

    JFrame frame;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	JLabel txtFrase;
	JButton btnAceptar;
	JButton btnDesactivar;
	JButton btnActivar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfas window = new Interfas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfas() {
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
		
		frame.setTitle("DESACTIVAR COMPONENTES GRAFICAS");
		frame.setLocationRelativeTo(null);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtNombre.setBounds(69, 23, 96, 19);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNombre.setBounds(10, 24, 50, 19);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblCiudad.setBounds(10, 66, 50, 19);
		frame.getContentPane().add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(69, 66, 96, 19);
		frame.getContentPane().add(txtCiudad);
		
	    txtFrase = new JLabel("FRASE:");
		txtFrase.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtFrase.setBounds(10, 111, 399, 19);
		frame.getContentPane().add(txtFrase);
		
	    btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnAceptar.setBounds(45, 178, 90, 29);
		btnAceptar.addActionListener(this);
		frame.getContentPane().add(btnAceptar);
		
	    btnDesactivar = new JButton("DESACTIVAR");
		btnDesactivar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnDesactivar.setBounds(163, 178, 133, 29);
		btnDesactivar.addActionListener(this);
		frame.getContentPane().add(btnDesactivar);
		
		btnActivar = new JButton("ACTIVAR");
		btnActivar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnActivar.setBounds(319, 178, 90, 29);
		btnActivar.addActionListener(this);
		frame.getContentPane().add(btnActivar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnAceptar== e.getSource()) {
			String nombre= txtNombre.getText();
			String ciudad= txtCiudad.getText();
			String mensaje="Usted se llama "+ nombre +" y vive en "+ ciudad + ".";
			txtFrase.setText(mensaje);
		} else if(e.getSource()== btnDesactivar) {
			txtNombre.setEnabled(false);
			txtCiudad.setEnabled(false);
			
		}else if(e.getSource() == btnActivar) {
			txtNombre.setEnabled(true);
			txtCiudad.setEnabled(true);
		}
		
	}

}
