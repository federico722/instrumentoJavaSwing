package ejercicio8;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Interfas implements ActionListener{

	JFrame frame;
	JButton btnAzul;
	JLabel etiTexto;
	JButton btnRojo;
	JButton btnVerde;
	JButton btnFondoAzul;
	JButton btnFondoRojo;
	JButton btnFondoVerde;
	JButton btnTransparente;
	JButton btnOpaca;
	

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
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 574, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("VENTANA COLORES");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		etiTexto = new JLabel("Paganini Violinista del diablo ");
		etiTexto.setBackground(new Color(240, 240, 240));
		etiTexto.setForeground(new Color(0, 0, 0));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		etiTexto.setBounds(10, 10, 540, 54);
		frame.getContentPane().add(etiTexto);
		
	    btnAzul = new JButton("AZUL");
		btnAzul.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnAzul.setBounds(10, 134, 132, 32);
		btnAzul.addActionListener(this);
		frame.getContentPane().add(btnAzul);
		
		btnRojo = new JButton("ROJO");
		btnRojo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnRojo.setBounds(189, 134, 140, 32);
		btnRojo.addActionListener(this);
		frame.getContentPane().add(btnRojo);
		
		btnVerde = new JButton("VERDE");
		btnVerde.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnVerde.setBounds(394, 134, 156, 32);
		btnVerde.addActionListener(this);
		frame.getContentPane().add(btnVerde);
		
		btnFondoAzul = new JButton("FONDO AZUL");
		btnFondoAzul.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnFondoAzul.setBounds(10, 176, 132, 32);
		btnFondoAzul.addActionListener(this);
		frame.getContentPane().add(btnFondoAzul);
		
		btnFondoRojo = new JButton("FONDO ROJO");
		btnFondoRojo.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnFondoRojo.setBounds(189, 176, 140, 32);
		btnFondoRojo.addActionListener(this);
		frame.getContentPane().add(btnFondoRojo);
		
		btnFondoVerde = new JButton("FONDO VERDE");
		btnFondoVerde.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnFondoVerde.setBounds(394, 176, 156, 32);
		btnFondoVerde.addActionListener(this);
		frame.getContentPane().add(btnFondoVerde);
		
		btnTransparente = new JButton("TRANSPARENTE");
		btnTransparente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTransparente.setBounds(89, 218, 156, 32);
		btnTransparente.addActionListener(this);
		frame.getContentPane().add(btnTransparente);
		
	    btnOpaca = new JButton("OPACA");
		btnOpaca.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnOpaca.setBounds(288, 218, 156, 32);
		btnOpaca.addActionListener(this);
		frame.getContentPane().add(btnOpaca);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAzul) {
			etiTexto.setForeground(Color.BLUE);
		}else if(e.getSource()==btnRojo) {
			etiTexto.setForeground(Color.RED);
		}else if(e.getSource()==btnVerde) {
			etiTexto.setForeground(Color.GREEN);
		}else if(e.getSource()==btnFondoAzul) {
			etiTexto.setBackground(Color.BLUE);
		}else if(e.getSource()==btnFondoRojo) {
			etiTexto.setBackground(Color.RED);
		}else if(e.getSource()==btnFondoVerde) {
			etiTexto.setBackground(Color.GREEN);
		}else if(e.getSource()==btnTransparente) {
			etiTexto.setOpaque(false);
		}else if(e.getSource()==btnOpaca) {
			etiTexto.setOpaque(true);
		}
		
	}
}
