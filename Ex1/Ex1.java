
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.*;

public class Ex1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel etiqueta;
	private JButton boton;
	/**
	 * Launch the application.

	/**
	 * Create the frame.
	 */
	public Ex1() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		/*---------*/
		
		
		ventana ventana = new ventana();
		
		addWindowListener(ventana);
		
		
		
		
		
		
		
		
		/*----------*/
		
		etiqueta=new JLabel("Entra un nombre");
		etiqueta.setBounds(20,10,100,100);
		contentPane.add(etiqueta);
		
		
		textField = new JTextField();
		textField.setBounds(20,70,150,20);
		contentPane.add(textField);
		
		boton = new JButton("Saludar");
		contentPane.add(boton);
		boton.setBounds(20,90,100,20);
		
		
	
		
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Buenos días, "+textField.getText());
			}
		});
		
	}	
	class ventana implements WindowListener {
		   
	 

	    public void windowClosed( WindowEvent evt ) {
	        System.out.println( "Ventana cerrada" );
	        
	      
	        }

	    public void windowIconified( WindowEvent evt ) {
	        System.out.println( "Ventana minimizada" );  
	      
	        
	        }

	    public void windowOpened( WindowEvent evt ) {
	        System.out.println( "Ventana abierta" );
	        
	        }

	    public void windowClosing( WindowEvent evt ) {
	        System.out.println( "Cerrando ventana..." );
	     
	        }

	    public void windowDeiconified( WindowEvent evt ) {
	        System.out.println( "Ventana maximizada" );
	        }

	    public void windowActivated( WindowEvent evt ) {
	        System.out.println( "Ventana activada" );
	        }

	    public void windowDeactivated( WindowEvent evt ) {
	        System.out.println( "Ventana desactivada" );
	        }

	    }
		
}	


