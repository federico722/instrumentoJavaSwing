package ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;

public class Interfas implements MouseListener{

    JFrame frame;
	JLabel etiOcultar;
	JLabel etiPal4;
	JLabel etiPal3;
	JLabel etiPal2;
	JLabel etiPal1;



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
		frame.setBounds(100, 100, 488, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		etiPal1 = new JLabel("etiPal1");
		etiPal1.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiPal1.setBounds(46, 10, 76, 23);
		frame.getContentPane().add(etiPal1);
		
		etiPal2 = new JLabel("etiPal2");
		etiPal2.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiPal2.setBounds(192, 10, 76, 23);
		frame.getContentPane().add(etiPal2);
		
		etiPal3 = new JLabel("etiPal3");
		etiPal3.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiPal3.setBounds(349, 10, 76, 23);
		frame.getContentPane().add(etiPal3);
		
	    etiPal4 = new JLabel("etiPal4");
		etiPal4.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiPal4.setBounds(192, 68, 76, 23);
		frame.getContentPane().add(etiPal4);
		
		etiOcultar = new JLabel("ETIOCULTAR");
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		etiOcultar.setBounds(46, 144, 379, 23);
		etiOcultar.addMouseListener(this);
		frame.getContentPane().add(etiOcultar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		etiPal1.setVisible(false);
		etiPal2.setVisible(false);
		etiPal3.setVisible(false);
		etiPal4.setVisible(false);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		etiPal1.setVisible(true);
		etiPal2.setVisible(true);
		etiPal3.setVisible(true);
		etiPal4.setVisible(true);

		
	}

}
