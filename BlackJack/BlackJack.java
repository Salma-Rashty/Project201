package Lab;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.util.Random;

public class BlackJack implements ActionListener {
	static JFrame f;
	JButton deal;
	JButton hit;
	JButton stay;
	JButton playAgain;
	JLabel l1;
	JLabel l2;
	JLabel lresult;
	int count = 0;
	int count2 = 0;
	ImageIcon image;
	static JLabel lnew;
	static JLabel lscore;
	static JLabel lscore2;
	static Random ra = new Random();
	static String[] cards = {"ace","2","3","4","5","6","7","8","9","10","Jack","queen","king"};
	static String[] cardsSymbol = {"c","d","s","h"};
	static int num1;
	static int num2;
	static String s = "Cards\\";
	static String s3 = ".jpg";
	static String c2 = "";
	static ArrayList<String> array = new ArrayList<String>();
	static int score = 0;
	static int score2 = 0;
	
	public BlackJack() {
		
		f = new JFrame("BlackJack Card Game");
		deal = new JButton("Deal");
		hit = new JButton("Hit");
		stay = new JButton("Stay");
		playAgain = new JButton("PlayAgain");
		l1 = new JLabel("Dealer Cards");
		l2 = new JLabel("Player Cards");
		lresult = new JLabel();
		lscore = new JLabel("Your total: 0");
		lscore2 = new JLabel("Dealer total: 0");
		
		
		l1.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC, 20));
		l2.setFont(new Font("TimesRoman", Font.BOLD+Font.ITALIC , 20));
		lresult.setFont(new Font("courier", Font.BOLD, 70));
		lscore.setFont(new Font("courier", Font.BOLD, 20));
		lscore2.setFont(new Font("courier", Font.BOLD, 20));
		
		
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.getContentPane().setBackground(new Color(30, 140, 0));
		f.setLocationRelativeTo(null);
		
		deal.setBounds(50,400,70,30);
		hit.setBounds(140,400,70,30);
		stay.setBounds(230,400,70,30);
		playAgain.setBounds(320,400,90,30);
		l1.setBounds(20,100,150,25);
		l2.setBounds(20,250,150,25);
		lresult.setBounds(90,150,400,100);
		lscore.setBounds(170,340,200,30);
		lscore2.setBounds(170,30,200,30);
		
		f.add(deal);
		f.add(hit);
		f.add(stay);
		f.add(playAgain);
		f.add(l1);
		f.add(l2);
		f.add(lresult);
		f.add(lscore);
		f.add(lscore2);
		
		
		deal.addActionListener(this);
		hit.addActionListener(this);
		stay.addActionListener(this);
		playAgain.addActionListener(this);
		hit.setEnabled(false);
		stay.setEnabled(false);
		playAgain.setEnabled(false);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)   {

		if(e.getSource()==deal) {
			deal.setEnabled(false);
			hit.setEnabled(true);
			stay.setEnabled(true);
			
			Card.newDCard(count2);
			count2++;
			Card.newPCard(count);
			count++;
			Card.newPCard(count);
			count++;	
		}
		
		
		if(e.getSource()==hit) {
			Card.newPCard(count);
			count++;
		}
		
		
		if(e.getSource()==stay) {
			playAgain.setEnabled(true);
			deal.setEnabled(false);
			hit.setEnabled(false);
			stay.setEnabled(false);

			Card.newDCard(count2);
			count2++;
			while(score2<=16) {
				Card.newDCard(count2);
				count2++;
			}
			if(score2>21) {
				lresult.setText("You won");
				lresult.setForeground(new Color(0, 220, 0));
			}
			else if(score<score2) {
				lresult.setText("You lost");
				lresult.setForeground(new Color(200, 0, 0));
			}
			if(score2<score) {
				lresult.setText("You won");
				lresult.setForeground(new Color(0, 220, 0));
			}
			if(score==score2) {
				lresult.setText("<<tie>>");
				lresult.setForeground(Color.black);
			}
		}
		
		if (e.getSource()==playAgain) {
			 f.dispose();
			 new BlackJack();
			 score = 0;
			 score2 = 0;
			 array.removeAll(array);
		}
		
		if(score==21) {
			lresult.setText("You won");
			playAgain.setEnabled(true);
			deal.setEnabled(false);
			hit.setEnabled(false);
			stay.setEnabled(false);
			lresult.setForeground(new Color(0, 220, 0));
		}
		if(score>21) {
			lresult.setText("You lost");
			playAgain.setEnabled(true);
			deal.setEnabled(false);
			hit.setEnabled(false);
			stay.setEnabled(false);
			lresult.setForeground(new Color(200, 0, 0));
		}	
		
	}
	

}
