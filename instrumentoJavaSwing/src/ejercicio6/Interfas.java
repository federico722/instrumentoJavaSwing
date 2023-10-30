package ejercicio6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class Interfas  implements ActionListener,MouseListener{

	private JFrame frame;
	JButton btnAchicar;
	JButton btnAgrandar;
	JButton btnCentro;
	JButton btnEsquina;
	JLabel etiNombre;

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
		frame.setBounds(100, 100, 570, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setTitle("EVENTOS DE POSICIONAMIENTO Y MOUSE");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
	    etiNombre = new JLabel("FEDERICO");
		etiNombre.setBackground(new Color(0, 0, 255));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		etiNombre.setBounds(202, 39, 139, 24);
		//falta color 
		etiNombre.setBackground(Color.CYAN);
		frame.getContentPane().add(etiNombre);
		
		btnEsquina = new JButton("ESQUINA");
		btnEsquina.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnEsquina.setBounds(10, 243, 116, 29);
		btnEsquina.addActionListener(this);
		
		frame.getContentPane().add(btnEsquina);
		
		btnCentro = new JButton("CENTRO");
		btnCentro.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnCentro.setBounds(430, 243, 116, 29);
		btnCentro.addActionListener(this);
		
		frame.getContentPane().add(btnCentro);
		
		btnAgrandar = new JButton("AGRANDAR");
		btnAgrandar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnAgrandar.setBounds(290, 243, 116, 29);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		frame.getContentPane().add(btnAgrandar);
		
		 btnAchicar = new JButton("ACHICAR");
		btnAchicar.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnAchicar.setBounds(146, 243, 116, 29);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		frame.getContentPane().add(btnAchicar);
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
		
	 if(e.getSource()==btnAchicar) {
        btnAchicar.setSize(btnAchicar.getWidth() + 10, btnAchicar.getHeight() + 10); 
        	 }else if(e.getSource()==btnAgrandar) {
        	        btnAgrandar.setSize(btnAgrandar.getWidth() + 10, btnAgrandar.getHeight() + 10); 

        	 }
	}
	@Override
	public void mouseExited(MouseEvent e) {
		

	 if(e.getSource()==btnAchicar) {
           btnAchicar.setSize(btnAchicar.getWidth() - 10, btnAchicar.getHeight() - 10); 

		}else if(e.getSource()== btnAgrandar) {
	           btnAgrandar.setSize(btnAgrandar.getWidth() - 10, btnAgrandar.getHeight() - 10); 

		}
		
	}
	
	

	

	@Override
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnEsquina) {
			etiNombre.setLocation(0,0);
		} else if(e.getSource()==btnCentro) {
			
			int x= (frame.getWidth() - etiNombre.getWidth()) / 2;
			int y=(frame.getHeight() - etiNombre.getHeight()) / 2;
			
			etiNombre.setLocation(x,y);
		} else if(e.getSource()==btnAgrandar) {
			Font font = etiNombre.getFont();
	        etiNombre.setFont(new Font(font.getName(), font.getStyle(), font.getSize() + 10));
		} else if(e.getSource()==btnAchicar) {
			Font font = etiNombre.getFont();
	        etiNombre.setFont(new Font(font.getName(), font.getStyle(), font.getSize() - 10));
		}
		
	}
}
