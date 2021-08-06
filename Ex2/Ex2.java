import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel etiqueta;
	private JButton boton;
	private JLabel etiqueta2;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		etiqueta=new JLabel("Escribe el titulo de una pelicula");
		etiqueta.setBounds(20,10,200,100);
		contentPane.add(etiqueta);
		
		
		textField = new JTextField();
		textField.setBounds(20,70,150,20);
		contentPane.add(textField);
		
		boton = new JButton("Saludar");
		contentPane.add(boton);
		boton.setBounds(20,90,100,20);
		
		etiqueta2=new JLabel("Peliculas");
		etiqueta2.setBounds(300,10,100,100);
		contentPane.add(etiqueta2);
		
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(300,70,150,20);
		contentPane.add(comboBox);
		comboBox.addItem("Harry Potter y el prisionero de Azkaban");
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBox.addItem(textField.getText());
			}
		});
	}

}
