import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.MaskFormatter;

class LayOutNulo extends JFrame{
	public LayOutNulo(){
		getContentPane().setLayout(null);//Layout nulo
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(650,475);	
		setTitle("Actividad");
		setLocationRelativeTo(null);
		
		JLabel label1=new JLabel("The Classic Form includes all visible fields for");
		label1.setBounds(0, 0,300,40);
		add(label1);
		JLabel label2=new JLabel("this list");
		label2.setBounds(0,10,50,50);
		add(label2);
		
		JLabel label3=new JLabel("FORM OPTIONS");
		label3.setBounds(0, 30, 100, 50);
		add(label3);
		
		JCheckBox check1=new JCheckBox("Incluide for you form");
		check1.setBounds(0, 60, 150, 50);
		add(check1);
		
		JTextField caja1=new JTextField("Suscribe to our mailing list",100);
		caja1.setBounds(0, 110, 200, 20);
		add(caja1);
		
		ButtonGroup bg=new ButtonGroup();
		JRadioButton radio1=new JRadioButton("Only required fields");
		JRadioButton radio2=new JRadioButton("All fields");
		
		bg.add(radio1);
		radio1.setBounds(0, 150, 150, 20);add(radio1);
		
		bg.add(radio2);
		radio2.setBounds(0, 170, 100, 20);add(radio2);
		
		JLabel label4=new JLabel("Edit requiered in the form builder");
		label4.setBounds(0, 180, 190, 50);add(label4);
		
		JCheckBox check2=new JCheckBox("interest group fields");
		JCheckBox check3=new JCheckBox("required field indicators");
		check2.setBounds(0, 220, 150, 20);add(check2);
		
		check3.setBounds(0, 240, 150, 20);add(check3);
		
		JLabel label5=new JLabel("Set form width");
		label5.setBounds(0, 270, 125, 20);add(label5);
		
		JTextField caja2=new JTextField(100);
		caja2.setBounds(0, 290, 125, 20);add(caja2);
		
		JLabel label6=new JLabel("Enhance your form");
		label6.setBounds(0, 310, 125, 20);add(label6);
		
		JCheckBox check4=new JCheckBox("enable evil popup mode");
		JCheckBox check5=new JCheckBox("disable all JavaScrip");
		JCheckBox check6=new JCheckBox("incluide archive link");
		JCheckBox check7=new JCheckBox("incluide MonkeyRewards link");
		
		check4.setBounds(0, 330, 200, 20);add(check4);
		check5.setBounds(0, 350, 200, 20);add(check5);
		check6.setBounds(0, 370, 200, 20);add(check6);
		check7.setBounds(0, 390, 200, 20);add(check7);
		
		//-----------------------------------------
		JLabel label7=new JLabel("Email Adress");
		label7.setBounds(300, 10, 125, 20);add(label7);
		
		MaskFormatter formatter=null;
		try {
			formatter=new MaskFormatter("@outlook.com");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JFormattedTextField ftf = new JFormattedTextField(formatter);
		ftf.setBounds(300,30,300,20);add(ftf);
		//JTextField caja3=new JTextField(100);
		//caja3.setBounds(300,30,300,20);add(caja3);
		
		JButton boton=new JButton();
		//boton.setText("Suscribe");
		//boton.setBackground(Color.GRAY);
		boton.setBounds(300, 140, 200, 25);
		ImageIcon icono=new ImageIcon("boton.png");
		boton.setIcon(new ImageIcon(icono.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
		add(boton);
		
		JLabel label8=new JLabel("Indicates required *");
		label8.setBounds(500, 0, 125, 20);add(label8);
		
		JLabel label9=new JLabel("First Name");
		label9.setBounds(300, 50, 125, 20);add(label9);
		
		JTextField caja4=new JTextField(100);
		caja4.setBounds(300,70,300,20);add(caja4);
		
		JLabel label10=new JLabel("Last Name");
		label10.setBounds(300, 90, 125, 20);add(label10);
		
		JTextField caja5=new JTextField(100);
		caja5.setBounds(300,110,300,20);add(caja5);
		
		JLabel label11=new JLabel("Copy/Paste onto your site");
		label11.setBounds(300, 175, 125, 20);add(label11);

		JTextArea escribir=new JTextArea("Escribe aqui...",10,10);
		JScrollPane scroll=new JScrollPane(escribir);
		scroll.setBounds(300, 200, 300, 200);
		add(scroll);
		setVisible(true);
	}
}
public class Prueba {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LayOutNulo();
				
			}
		});

	}

}

