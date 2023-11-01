package ejercicio10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Interfas  implements ActionListener{

	 JFrame frame;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	JButton btnConcatena;
	JLabel etiTexto;

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
		frame.setBounds(100, 100, 613, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("VENTANA CONCATENAR");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtPalabra1.setBounds(88, 42, 96, 22);
		frame.getContentPane().add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtPalabra2.setBounds(398, 42, 96, 22);
		frame.getContentPane().add(txtPalabra2);
		txtPalabra2.setColumns(10);
		
		JLabel lblPalabra1 = new JLabel("Palabra1:");
		lblPalabra1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPalabra1.setBounds(10, 45, 68, 19);
		frame.getContentPane().add(lblPalabra1);
		
		JLabel lblPalabra = new JLabel("Palabra2:");
		lblPalabra.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPalabra.setBounds(320, 47, 68, 19);
		frame.getContentPane().add(lblPalabra);
		
	    etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiTexto.setBounds(157, 126, 251, 22);
		frame.getContentPane().add(etiTexto);
		
		JLabel lblTexto = new JLabel("TEXTO:");
		lblTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTexto.setBounds(79, 128, 68, 19);
		frame.getContentPane().add(lblTexto);
		
	    btnConcatena = new JButton("CONCATENAR");
		btnConcatena.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnConcatena.setBounds(185, 233, 170, 45);
		btnConcatena.addActionListener(this);
		frame.getContentPane().add(btnConcatena);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConcatena) {
			String palabra1=txtPalabra1.getText();
			String palabra2=txtPalabra2.getText();
			String resultado= palabra1 + palabra2;
			
			etiTexto.setText(resultado);
			
		}
		
	}
}
