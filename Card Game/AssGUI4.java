package Lab;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.util.Random;

public class AssGUI4  implements ActionListener{
	JFrame f;
	JFrame fNote;
	JButton b;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel lNote;
	JLabel li2;
	JLabel li3;
	JRadioButton rb1;
	JRadioButton rb2;
	JRadioButton rb3;
	JRadioButton rb4;
	ButtonGroup bg;
	JComboBox cb;
	ImageIcon image;
	BufferedImage buffImage[];
	Random ra = new Random();
	int num1;
	int num2;
	int score = 10;
	String s1 = "";
	String s2 = "";
	
	public AssGUI4(){
		f = new JFrame("Card Game");
		b = new JButton("Check!");
		l1 = new JLabel("Your Score: 10");
		l2 = new JLabel("Player's Card");
		l3 = new JLabel("Computer's Card");
		l4 = new JLabel();
		lNote = new JLabel();
		rb1 = new JRadioButton("Club");
		rb2 = new JRadioButton("Diamond");
		rb3 = new JRadioButton("Spade");
		rb4 = new JRadioButton("Heart");
		bg = new ButtonGroup();
		String[] cards = {"ace","2","3","4","5","6","7","8","9","10","Jack","queen","king"};
		cb = new JComboBox(cards);
		li2 = new JLabel();
		li3 = new JLabel();
		
		image = new ImageIcon("back.jpg");
		li2.setIcon(image);
		li3.setIcon(image);
		
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		
		f.setVisible(true);
		f.setSize(350,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.getContentPane().setBackground(new Color(30, 140, 0));
		f.setLocationRelativeTo(null); 
		
		b.setBounds(150,300,100,20);
		l1.setBounds(120,10,100,20);
		l2.setBounds(90,240,100,20);
		l3.setBounds(200,240,100,20);
		l4.setBounds(150,270,60,20);
		lNote.setBounds(70,30,70,20);
		li2.setBounds(90,110,100,120);
		li3.setBounds(200,110,100,120);
		rb1.setBounds(90,40,100,20);
		rb2.setBounds(90,80,100,20);
		rb3.setBounds(200,40,100,20);
		rb4.setBounds(200,80,100,20);
		cb.setBounds(25,40,60,20);
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		f.add(b);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(rb1);
		f.add(rb2);
		f.add(rb3);
		f.add(rb4);
		f.add(cb);
		f.add(li2);
		f.add(li3);
		
		b.addActionListener(this);
		rb1.addActionListener(this);
		rb2.addActionListener(this);
		rb3.addActionListener(this);
		rb4.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "Cards\\";
		String s3 = ".jpg";
		String[] cards = {"ace","2","3","4","5","6","7","8","9","10","Jack","queen","king"};
		String[] cardsSymbol = {"c","d","s","h"}; 
		num1 = ra.nextInt(13);
		num2 = ra.nextInt(4);
		
		s2 = cb.getSelectedItem().toString();
		
		if(e.getSource()==rb1) {
			s1="c";	
			li2.setIcon(new ImageIcon(s+s2+s1+s3));
		}
		if(e.getSource()==rb2) {
			s1="d";	
			li2.setIcon(new ImageIcon(s+s2+s1+s3));
		}
		if(e.getSource()==rb3) {
			s1="s";	
			li2.setIcon(new ImageIcon(s+s2+s1+s3));
		}
		if(e.getSource()==rb4) {
			s1="h";	
			li2.setIcon(new ImageIcon(s+s2+s1+s3));
		}

		if(e.getSource()==b) {
			li3.setIcon(new ImageIcon(s+cards[num1]+cardsSymbol[num2]+s3));
			
			
			if (s1 == cardsSymbol[num2] && s2 == cards[num1]) {
				score+=10;
				l1.setText("Your Score: "+ score);	
			}
			else if (s1 == cardsSymbol[num2]) {
				score+=3;
				l1.setText("Your Score: "+ score);
			}
			else if (s2 == cards[num1]) {
				score+=5;
				l1.setText("Your Score: "+ score);
			}
			else {
				score--;
				l1.setText("Your Score: "+ score);
			}
			if (score<=0) {
				l4.setText("you have Lost");	
				b.setEnabled(false);
				
				fNote = new JFrame("Note");
				lNote.setText("you loss");
				
				fNote.setUndecorated(true);
				fNote.setVisible(true);
				fNote.setSize(200,80);
				fNote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fNote.setLayout(null);
				fNote.getContentPane().setBackground(new Color(200, 0, 0));
				lNote.setForeground(Color.white);
				fNote.add(lNote);
				fNote.setLocationRelativeTo(null); 
			}
			if (score>=25) {
				l4.setText("you won");	
				b.setEnabled(false);
				
				fNote = new JFrame("Note");
				lNote.setText("you won");
				
				fNote.setUndecorated(true);
				fNote.setVisible(true);
				fNote.setSize(200,80);
				fNote.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fNote.setLayout(null);
				fNote.getContentPane().setBackground(new Color(0, 220, 0));
				lNote.setForeground(Color.WHITE);
				fNote.add(lNote);
				fNote.setLocationRelativeTo(null); 
			}
		}
	}	
}
