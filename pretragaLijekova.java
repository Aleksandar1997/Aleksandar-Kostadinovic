package Intermedikus;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class pretragaLijekova extends JFrame{

	private JLabel lnaziv, lkolicina, lnacin, lpozadina;
	private JTextField tfnaziv, tfkolicina, tfnacin;
	private JButton bnazad;
	
	
	public pretragaLijekova (String string) {
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
			public void actionPerformed(ActionEvent e) {
				meni m3 = new meni ("Intermedikus meni");
				m3.setVisible(true);
				m3.setResizable(false);
				dispose();
				
			}
		});
		
		tfnaziv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
			
		});
			
		
	}
	public void postaviPozicije() {

		bnazad.setBounds(10, 10, 100, 20);
		
		
		lnaziv.setBounds(30, 50, 100, 25);
		tfnaziv.setBounds(130, 50, 150, 25);
		
		lkolicina.setBounds(30, 90, 100, 25);
		tfkolicina.setBounds(130, 90, 150, 25);
		
		lnacin.setBounds(30, 130, 100, 25);
		tfnacin.setBounds(130, 130, 150, 25);
	}
	public void dodajKomponente() {

		Container kontajner = getContentPane();
		kontajner.setLayout(null);
		
		kontajner.add(lnaziv);
		kontajner.add(lkolicina);
		kontajner.add(lnacin);
	
		
		kontajner.add(tfnaziv);
		kontajner.add(tfkolicina);
		kontajner.add(tfnacin);
		
		kontajner.add(bnazad);
	}
	public void kreirajKomponente() {
		lnaziv = new JLabel ("Naziv lijeka:");
		lkolicina = new JLabel ("Kolicina:");
		lnacin = new JLabel("Nacin konz.:");
		
		tfnaziv = new JTextField();
		tfkolicina = new JTextField("//////////////");
		tfnacin = new JTextField("//////////////");
		bnazad = new JButton ();

		ImageIcon imgThisImage1=new ImageIcon("D:\\intedmedikus\\nazad.png");
		
		bnazad.setIcon(imgThisImage1);
	bnazad.setBorder(null);
		
	}
	public static void main(String[] args) {
		
		pretragaLijekova ogui = new pretragaLijekova ("Pretraga lijekova");
		ogui.setVisible(true);
		ogui.setResizable(false);
		

	}

}
