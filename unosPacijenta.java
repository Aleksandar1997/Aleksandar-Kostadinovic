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

public class unosPacijenta extends JFrame {

	private JLabel lime, lprezime, lbrkartona, ltelefon, lgodrodjenja, ladresa, lpozadina;
	private JTextField tfime, tfprezime, tfbrkartona, tftelefon, tfgodrodjenja, tfadresa;
	private JButton bnazad, bunesi;
	
	public unosPacijenta(String string) {
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
				
				meni m1 = new meni ("Intermedikus- meni");
				m1.setVisible(true);
				m1.setResizable(false);
				dispose();
			}
			
		});
		
		
		bunesi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}
	public void postaviPozicije() {
		
		
		lime.setBounds(30, 50, 100, 25);
		tfime.setBounds(130, 50, 150, 25);
		
		lprezime.setBounds(30, 90, 100, 25);
		tfprezime.setBounds(130, 90, 150, 25);
		
		lbrkartona.setBounds(30, 130, 100, 25);
		tfbrkartona.setBounds(130, 130, 150, 25);
		
		ltelefon.setBounds(30, 170, 100, 25);
		tftelefon.setBounds(130, 170, 150, 25);
		
		lgodrodjenja.setBounds(30, 210, 100, 25);
		tfgodrodjenja.setBounds(130, 210, 150, 25);
		
		ladresa.setBounds(30, 250, 100, 25);
		tfadresa.setBounds(130, 250, 150, 25);
		
		bnazad.setBounds(10, 10, 100, 20);
		bunesi.setBounds(180, 300, 100, 40);
		
		// lpozadina.setBounds(0,-200,800,800);
	}
	public void dodajKomponente() {
		
		Container kontajner = getContentPane();
		kontajner.setLayout(null);
		
		kontajner.add(lime);
		kontajner.add(lprezime);
		kontajner.add(lbrkartona);
		kontajner.add(ltelefon);
		kontajner.add(lgodrodjenja);
		kontajner.add(ladresa);
		kontajner.add(lpozadina);
		
		kontajner.add(tfime);
		kontajner.add(tfprezime);
		kontajner.add(tfbrkartona);
		kontajner.add(tftelefon);
		kontajner.add(tfgodrodjenja);
		kontajner.add(tfadresa);
		
		kontajner.add(bnazad);
		kontajner.add(bunesi);
	}
	public void kreirajKomponente() {
		
		lime = new JLabel ("Ime:");
		lprezime = new JLabel ("Prezime:");
		lbrkartona = new JLabel ("Broj kartona:");
		ltelefon = new JLabel ("Telefon:");
		lgodrodjenja = new JLabel ("Godina rodjenja:");
		ladresa = new JLabel ("Adresa:");
		lpozadina = new JLabel();
		ImageIcon imgThisImage=new ImageIcon("D:\\intedmedikus\\unosl.jpg");
        lpozadina.setIcon(imgThisImage);
        
       
		
        tfime = new JTextField();
        tfprezime = new JTextField();
        tfbrkartona = new JTextField();
        tftelefon = new JTextField();
        tfgodrodjenja = new JTextField();
        tfadresa = new JTextField();
        
        bnazad = new JButton();
        bunesi = new JButton ("Unesi");
        ImageIcon imgThisImage2=new ImageIcon("D:\\intedmedikus\\nazad.png");
		bnazad.setBorder(null);
		bnazad.setIcon(imgThisImage2);
		
	}
	public static void main(String[] args) {
		
		unosPacijenta ogui = new unosPacijenta("Intermedikus- unos pacijenta");
		ogui.setVisible(true);
		ogui.setResizable(false);

	}

}
