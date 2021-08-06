import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Ex3 extends JFrame {

	private JPanel contentPane;
	private JRadioButton option;
	private JRadioButton option1;
	private JRadioButton option2;
	private JLabel etiqueta;
	private JLabel etiqueta2;
	private JLabel etiqueta3;
	private JCheckBox chbox;
	private JCheckBox chbox2;
	private JCheckBox chbox3;
	private JComboBox comboBox;
	private JButton boton;
	private String resultados="Sistema operativo ";

	
	 
	public Ex3() {
		/*RADIO BUTTON*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
	
		setVisible(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta=new JLabel("Escoge S.O");
		etiqueta.setBounds(35,15,200,23);
		contentPane.add(etiqueta);
		
		
		option=new JRadioButton("Windows", true);
		option.setBounds(35,40,200,23);
		contentPane.add(option);
		
		option1=new JRadioButton("Linux", false);
		option1.setBounds(35,60,200,23);
		contentPane.add(option1);
		
		option2=new JRadioButton("Mac", false);
		option2.setBounds(35,80,200,23);
		contentPane.add(option2);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(option);
		bgroup.add(option1);
		bgroup.add(option2);
		
		/*CHECKBOX*/
		
		etiqueta2=new JLabel("Elige tu especialidad");
		etiqueta2.setBounds(35,120,200,23);
		contentPane.add(etiqueta2);
		
		chbox = new JCheckBox("Programación",true);
		chbox.setBounds(35,140,200,23);
		contentPane.add(chbox);
		
		chbox2 = new JCheckBox("Diseño Gráfico",false);
		chbox2.setBounds(35,160,200,23);
		contentPane.add(chbox2);
		
		chbox3 = new JCheckBox("Administración",false);
		chbox3.setBounds(35,180,200,23);
		contentPane.add(chbox3);
		
		etiqueta3=new JLabel("Indica las horas dedicadas al ordenador");
		etiqueta3.setBounds(35,220,250,23);
		contentPane.add(etiqueta3);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(35,240,50,23);
		contentPane.add(comboBox);
		comboBox.addItem("0");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		comboBox.addItem("7");
		comboBox.addItem("8");
		comboBox.addItem("9");
		comboBox.addItem("10");
		
		boton = new JButton("Enviar");
		contentPane.add(boton);
		boton.setBounds(35,280,90,23);
		
		
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(option.isSelected()) {
				resultados +="Windows";
				}
				else if(option1.isSelected()) {
					resultados +="Linux";
					}
				else if(option2.isSelected()) {
					resultados +="Mac";
					}
				
				resultados+="\nEspecialidad: ";
				
				if(chbox.isSelected()) {
					resultados +="Programación ";
					}
				if(chbox2.isSelected()) {
						resultados +="Diseño gráfico ";
					}
				if(chbox3.isSelected()) {
						resultados +="Administración ";
					}
				
			
				resultados+="\nHoras dedicadas al ordenador: "+comboBox.getSelectedItem();
				
				JOptionPane.showMessageDialog(null, resultados);
			}
		});
		
	}

}
