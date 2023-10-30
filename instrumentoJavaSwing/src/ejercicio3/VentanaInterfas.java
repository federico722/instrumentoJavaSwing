package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaInterfas  implements KeyListener, ActionListener{

    JFrame frame;
	private JTextField txtTexto;
	JLabel etiTexto;
	JButton btnVaciar;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInterfas window = new VentanaInterfas();
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
	public VentanaInterfas() {
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
		
		frame.setTitle("VENTANA TECLA Y BORRADO");
		frame.setLocationRelativeTo(null);
		
		txtTexto = new JTextField();
		txtTexto.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtTexto.setBounds(10, 68, 215, 19);
		txtTexto.addKeyListener(this);
		frame.getContentPane().add(txtTexto);
		txtTexto.setColumns(10);
		
		 etiTexto = new JLabel("New label");
		etiTexto.setFont(new Font("Times New Roman", Font.BOLD, 13));
		etiTexto.setBounds(10, 108, 122, 25);
		etiTexto.addKeyListener(this);
		frame.getContentPane().add(etiTexto);
		
	    btnVaciar = new JButton("VACIAR");
		btnVaciar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnVaciar.setBounds(10, 165, 167, 21);
		btnVaciar.addActionListener(this);
		frame.getContentPane().add(btnVaciar);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txtTexto) {
			String text=txtTexto.getText();
			etiTexto.setText(text);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnVaciar == e.getSource()) {
			etiTexto.setText("");
			txtTexto.setText("");
			System.out.println("Borrado exitoso");
		}
		
	}

}
