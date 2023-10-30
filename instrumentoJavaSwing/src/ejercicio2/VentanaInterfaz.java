package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaInterfaz implements ActionListener{

	 JFrame frame;
	private JTextField txtTexto;
	JButton btnTraspasa1;
	JLabel etiTexto1;



	/**
	 * Create the application.
	 */
	public VentanaInterfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("VENTANA TRASPASAR TEXTO");
		frame.setLocationRelativeTo(null);
		
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtTexto.setBounds(44, 109, 346, 19);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("New label");
		etiTexto1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiTexto1.setBounds(44, 160, 158, 26);
		frame.getContentPane().add(etiTexto1);
		
		JLabel etiTexto2 = new JLabel("New label");
		etiTexto2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		etiTexto2.setBounds(212, 160, 178, 26);
		frame.getContentPane().add(etiTexto2);
		
		 btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnTraspasa1.setBounds(44, 234, 126, 34);
		btnTraspasa1.addActionListener(this);
		frame.getContentPane().add(btnTraspasa1);
		
		JButton btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnTraspasa2.setBounds(274, 234, 116, 34);
		frame.getContentPane().add(btnTraspasa2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnTraspasa1==e.getSource()) {
			etiTexto1.setText(txtTexto.getText());
		}
		
	}
}
