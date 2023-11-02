package ejercicio9;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

public class Interfas implements ActionListener{

	 JFrame frame;
	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JLabel lblTercerTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel etiNotaFinal;
	private JLabel lblNotaFinal;
	private JLabel etiResultado;
	private JLabel lblResultado;
	JButton btnCalcular;

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
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtPrimerTrimestre.setBounds(127, 11, 86, 20);
		frame.getContentPane().add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		JLabel lblPrimerTrimestre = new JLabel("Primer Trimestre:");
		lblPrimerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPrimerTrimestre.setBounds(10, 17, 107, 14);
		frame.getContentPane().add(lblPrimerTrimestre);
		
		JLabel lblSegundoTrimestre = new JLabel("Segundo Trimestre:");
		lblSegundoTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSegundoTrimestre.setBounds(10, 48, 119, 20);
		frame.getContentPane().add(lblSegundoTrimestre);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtSegundoTrimestre.setColumns(10);
		txtSegundoTrimestre.setBounds(137, 42, 86, 20);
		frame.getContentPane().add(txtSegundoTrimestre);
		
		lblTercerTrimestre = new JLabel("Segundo Trimestre:");
		lblTercerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblTercerTrimestre.setBounds(10, 90, 119, 20);
		frame.getContentPane().add(lblTercerTrimestre);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtTercerTrimestre.setColumns(10);
		txtTercerTrimestre.setBounds(137, 91, 86, 20);
		frame.getContentPane().add(txtTercerTrimestre);
		
		etiNotaFinal = new JLabel("");
		etiNotaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		etiNotaFinal.setBounds(87, 121, 183, 14);
		frame.getContentPane().add(etiNotaFinal);
		
		lblNotaFinal = new JLabel("Nota:");
		lblNotaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNotaFinal.setBounds(10, 121, 55, 14);
		frame.getContentPane().add(lblNotaFinal);
		
		etiResultado = new JLabel("");
		etiResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		etiResultado.setBounds(111, 146, 313, 14);
		frame.getContentPane().add(etiResultado);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblResultado.setBounds(10, 146, 91, 14);
		frame.getContentPane().add(lblResultado);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(new Color(0, 0, 0));
		btnCalcular.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnCalcular.setBounds(68, 209, 282, 23);
		btnCalcular.addActionListener(this);
		frame.getContentPane().add(btnCalcular);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCalcular) {
			double nota1=Double.parseDouble(txtPrimerTrimestre.getText());
			double nota2=Double.parseDouble(txtSegundoTrimestre.getText());
			double nota3=Double.parseDouble(txtTercerTrimestre.getText());
			double notaFinal=(nota1+nota2+nota3)/3;
			
			etiNotaFinal.setText(""+notaFinal);
			
			if(notaFinal <  5) {
				etiResultado.setText("Resultado: SUSPENSO");
				etiNotaFinal.setForeground(Color.RED);
				etiResultado.setForeground(Color.RED);
				
			}else {
				etiResultado.setText("Resultado: APROBADO");
				etiNotaFinal.setForeground(Color.BLACK);
				etiResultado.setForeground(Color.BLACK);
				
			}
			
		}
		
	}
}
