package ejercicio11;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Interfas  implements MouseListener, ActionListener{

    JFrame frame;
	private JTextField txtNumero;
	JButton btnBorrar;
	JLabel etiNueve;
	JLabel etiOcho;
	JLabel etiSiete;
	JLabel etiSeis;
	JLabel etiCinco;
	JLabel etiCuatro;
	JLabel etiTres;
	JLabel etiDos;
	JLabel etiUna;

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
		frame.setBounds(100, 100, 577, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("VENTANA AGREGAR NUMEROS ");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		etiUna = new JLabel("1");
		etiUna.setHorizontalAlignment(SwingConstants.CENTER);
		etiUna.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiUna.setBounds(10, 26, 81, 21);
		etiUna.addMouseListener(this);
		frame.getContentPane().add(etiUna);
		
		 etiDos = new JLabel("2");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiDos.setBounds(101, 26, 81, 21);
		etiDos.addMouseListener(this);
		frame.getContentPane().add(etiDos);
		
		etiTres = new JLabel("3");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiTres.setBounds(192, 26, 81, 21);
		etiTres.addMouseListener(this);
		frame.getContentPane().add(etiTres);
		
		etiCuatro = new JLabel("4");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiCuatro.setBounds(283, 26, 81, 21);
		etiCuatro.addMouseListener(this);
		frame.getContentPane().add(etiCuatro);
		
		etiCinco = new JLabel("5");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiCinco.setBounds(374, 26, 81, 21);
		etiCinco.addMouseListener(this);
		frame.getContentPane().add(etiCinco);
		
		etiSeis = new JLabel("6");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiSeis.setBounds(465, 26, 81, 21);
		etiSeis.addMouseListener(this);
		frame.getContentPane().add(etiSeis);
		
		etiSiete = new JLabel("7");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiSiete.setBounds(10, 75, 81, 21);
		etiSiete.addMouseListener(this);
		frame.getContentPane().add(etiSiete);
		
		etiOcho = new JLabel("8");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiOcho.setBounds(101, 75, 81, 21);
		etiOcho.addMouseListener(this);
		frame.getContentPane().add(etiOcho);
		
	    etiNueve = new JLabel("9");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		etiNueve.setBounds(192, 75, 81, 21);
		etiNueve.addMouseListener(this);
		frame.getContentPane().add(etiNueve);
		
		txtNumero = new JTextField();
		txtNumero.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtNumero.setBounds(20, 254, 526, 63);
		frame.getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		 btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnBorrar.setBounds(101, 327, 333, 40);
		btnBorrar.addActionListener(this);
		frame.getContentPane().add(btnBorrar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()== etiUna) {
	        txtNumero.setText(txtNumero.getText() + "1");

		}else if(e.getSource()==etiDos) {
	        txtNumero.setText(txtNumero.getText() + "2");

		}else if(e.getSource()==etiTres) {
	        txtNumero.setText(txtNumero.getText() + "3");

		}else if(e.getSource()==etiCuatro) {
	        txtNumero.setText(txtNumero.getText() + "4");

		}else if(e.getSource()==etiCinco) {
	        txtNumero.setText(txtNumero.getText() + "5");

		}else if(e.getSource()==etiSeis) {
	        txtNumero.setText(txtNumero.getText() + "6");

		}else if(e.getSource()==etiSiete) {
	        txtNumero.setText(txtNumero.getText() + "7");

		}else if(e.getSource()==etiOcho) {
	        txtNumero.setText(txtNumero.getText() + "8");

		}else if(e.getSource()==etiNueve) {
	        txtNumero.setText(txtNumero.getText() + "9");

		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnBorrar) {
        	txtNumero.setText("");
        }	
	}
}
