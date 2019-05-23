package Intermedikus;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class meni extends JFrame{

	private JButton bupacijenta, bulijekova, bplijekova, bppacijenta, bdokumentacija, bizlaz;
	private JLabel lpozadina;
	
	public meni(String string) {
		super(string);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(450,200,400,400);
		kreirajKomponente();
		dodajKomponente();
		postaviPozicije();
		dugmad();
		
	}
	public void dugmad() {
		bizlaz.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(DISPOSE_ON_CLOSE);
				
			}
			
		});
		
		bupacijenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				unosPacijenta up = new unosPacijenta("Intermedikus- unos pacijenta");
				up.setVisible(true);
				up.setResizable(false);
				dispose();
			}
			
		});
		
		bulijekova.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				unosLijekova ul = new unosLijekova("Intermedikus- unos lijekova");
				ul.setVisible(true);
				ul.setResizable(false);
				
				
				dispose();
				
				
			}
			
		});
		
		bppacijenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				pretragaPacijenta pp = new pretragaPacijenta("Pretraga pacijenata");
				pp.setVisible(true);
				pp.setResizable(false);
				dispose();
				
				
			}
			
		});
		
	}
	
	public void postaviPozicije() {
		
		bupacijenta.setBounds(100, 50, 200, 40);
		bulijekova.setBounds(100, 100, 200, 40);
		bppacijenta.setBounds(100, 150, 200, 40);
		bplijekova.setBounds(100, 200, 200, 40);
		bizlaz.setBounds(100, 250, 200, 40);
		
		lpozadina.setBounds(0,-200,800,800);
	}
	public void dodajKomponente() {
		
		Container kontajner = getContentPane();
		kontajner.setLayout(null);
		
		kontajner.add(bupacijenta);
		kontajner.add(bulijekova);
		kontajner.add(bplijekova);
		kontajner.add(bppacijenta);
		kontajner.add(bdokumentacija);
		kontajner.add(bizlaz);
		
		kontajner.add(lpozadina);
		
	}
	public void kreirajKomponente() {
		
		bupacijenta = new JButton ("Unos pacijenata");
		bulijekova = new JButton ("Unos lijekova");
		bppacijenta = new JButton ("Pretraga pacijenata");
		bplijekova = new JButton ("Pretraga lijekova");
		bdokumentacija = new JButton ("Dokumentacija");
		bizlaz = new JButton ("Izlaz");
		
		lpozadina = new JLabel();
		ImageIcon imgThisImage=new ImageIcon("D:\\intedmedikus\\meni.jpg");
        lpozadina.setIcon(imgThisImage);
	}
	public static void main(String[] args) {
		
		meni ogui = new meni ("Intermedikus meni");
		ogui.setVisible(true);
		ogui.setResizable(false);

	}

}
