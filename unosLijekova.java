package Intermedikus;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class unosLijekova extends JFrame{

	private JLabel lnaziv, lkolicina, lnacin, lpozadina;
	private JTextField tfnaziv, tfkolicina, tfnacin;
	private JButton bnazad, bunesi;
	
	public unosLijekova (String string) {
		super(string);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450,200,400,400);
		kreirajKomponente();
		dodajKomponente();
		postaviPozicije();
		dugmad();
		
	}
	public void dugmad() {
		
		bnazad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				meni m2 = new meni ("Intermedikus meni");
				m2.setVisible(true);
				m2.setResizable(false);
				dispose();
				
			}
			
		});
		
	}
	public void postaviPozicije() {
		
		bnazad.setBounds(10, 10, 100, 20);
		bunesi.setBounds(180, 300, 100, 40);
		
		lnaziv.setBounds(30, 50, 100, 25);
		tfnaziv.setBounds(130, 50, 150, 25);
		
		lkolicina.setBounds(30, 90, 100, 25);
		tfkolicina.setBounds(130, 90, 150, 25);
		
		lnacin.setBounds(30, 130, 100, 25);
		tfnacin.setBounds(130, 130, 150, 25);
		
		//lpozadina.setBounds(0,-200,800,800);

	}
	public void dodajKomponente() {
		Container kontajner = getContentPane();
		kontajner.setLayout(null);
		
		kontajner.add(lnaziv);
		kontajner.add(lkolicina);
		kontajner.add(lnacin);
		kontajner.add(lpozadina);
		
		kontajner.add(tfnaziv);
		kontajner.add(tfkolicina);
		kontajner.add(tfnacin);
		
		kontajner.add(bnazad);
		kontajner.add(bunesi);
		
		
		
		
	}
	public void kreirajKomponente() {
		
		lnaziv = new JLabel ("Naziv lijeka:");
		lkolicina = new JLabel ("Kolicina:");
		lnacin = new JLabel("Nacin konz.:");
		
		tfnaziv = new JTextField();
		tfkolicina = new JTextField();
		tfnacin = new JTextField();
		
		bnazad = new JButton ();
		bunesi = new JButton("Unesi");
		
		
			ImageIcon imgThisImage1=new ImageIcon("D:\\intedmedikus\\nazad.png");
			
			bnazad.setIcon(imgThisImage1);
		bnazad.setBorder(null);
		lpozadina = new JLabel();
		ImageIcon imgThisImage=new ImageIcon("D:\\intedmedikus\\meni.jpg");
        lpozadina.setIcon(imgThisImage);
	}
	public static void main(String[] args) {
		
		unosLijekova ogui = new unosLijekova("Intermedikus- unos lijekova");
		ogui.setVisible(true);
		ogui.setResizable(false);
		

	}

}
