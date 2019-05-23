package Intermedikus;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame{

	public JLabel lusername, lsifra, lpass, pozadina;
	public JTextField tfusername, tfsifra;
	public JPasswordField psifra;
	
	String username="intermedikus";
	String sifra="sifra123";
	
	
	public login(String string) {
		super(string);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450,200,400,400);
		
		kreirajKomponente();
		dodajKomponente();
		postaviPozicije();
		dugmad();
		
		
	}
	private void dugmad() {
		psifra.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				/*char []pass = psifra.getPassword();
				pass.toString();
				tfsifra.setText(pass.toString());
				*/
				
				String sifre;
				sifre=String.valueOf(psifra.getPassword());
				tfsifra.setText(""+sifre);
				System.out.println(""+tfsifra.getText());
				System.out.println(""+sifre);
				if(		tfusername.getText().equalsIgnoreCase("intermedikus")&&
						tfsifra.getText().equals("sifra123")){
					meni m1 = new meni("Meni- intermedikus");
					m1.setVisible(true);
					m1.setResizable(false);
				}else {
					JOptionPane.showMessageDialog(login.this, "Netacna sifra!", "Greska!", JOptionPane.ERROR_MESSAGE);

				}
						
					
				
				
			}
			
		});
		
	}
	public void postaviPozicije() {
		
		lusername.setBounds(30, 220, 100, 25);
		tfusername.setBounds(130, 220, 150, 25);
		
		lsifra.setBounds(30, 260, 100, 25);
		psifra.setBounds(130, 260, 150, 25);
	//	psifra.setBounds(30,30,100,25);
	//	lpass.setBounds(30, 70, 100, 25);
		pozadina.setBounds(0,-200,800,800);
		
	}
	public void dodajKomponente() {
		Container kontajner = getContentPane();
		kontajner.setLayout(null);
		
		kontajner.add(lusername);
		kontajner.add(lsifra);
		
		kontajner.add(tfusername);
		kontajner.add(tfsifra);
		kontajner.add(psifra);
		kontajner.add(lpass);
		kontajner.add(pozadina);
		
	}
	public void kreirajKomponente() {
		
		lusername = new JLabel ("User name:");
		lsifra = new JLabel ("Password:");
		
		tfusername = new JTextField();
		tfsifra = new JTextField();
		
		psifra = new JPasswordField(30);
		lpass= new JLabel();
		lpass.setLabelFor(psifra);
		pozadina = new JLabel();
		
        ImageIcon imgThisImage=new ImageIcon("D:\\intedmedikus\\stetoskop.jpg");
        pozadina.setIcon(imgThisImage);
       

	}
	public static void main(String[] args)  {
		
		login ogui = new login ("Intermedikus");
		ogui.setVisible(true);
		ogui.setResizable(false);
	
		/*
		ogui.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("C:\\Users\\Kostadinovic\\Desktop\\intedmedikus\\ikona.jpg")));
		*/
		
		ImageIcon ikona = new ImageIcon("C:\\Users\\Kostadinovic\\Desktop\\intedmedikus\\ikona.jpg");
		ogui.setIconImage(ikona.getImage());
		
	/*
		ImageIcon ikona = new ImageIcon("C:\\Users\\Kostadinovic\\Desktop\\intedmedikus\\stetoskop.jpg\"");

		ogui.setIconImage(ikona);
		*/
	}

}
