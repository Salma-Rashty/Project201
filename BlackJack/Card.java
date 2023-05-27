package Lab;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Card extends BlackJack {
	

	public static  void newPCard(int count) {
		int n = count*40;
		num1 = ra.nextInt(13);
		num2 = ra.nextInt(4);
		while(new Deck().deck(s+cards[num1]+cardsSymbol[num2]+s3 , array)!=true) {
			num1 = ra.nextInt(13);
			num2 = ra.nextInt(4);	
		}
		lnew = new JLabel(new ImageIcon(s+cards[num1]+cardsSymbol[num2]+s3) );
		lnew.setBounds(140+n,210,100,110);
		f.add(lnew);
		String cnew = cards[num1];
		score=new Hand().Score(cnew,score);
		lscore.setText("Your score: "+score);
		
	}
	
	public static void newDCard(int count2) {
		int n = count2*40;
		num1 = ra.nextInt(13);
		num2 = ra.nextInt(4);
		while(new Deck().deck(s+cards[num1]+cardsSymbol[num2]+s3 , array)!=true) {
			num1 = ra.nextInt(13);
			num2 = ra.nextInt(4);	
		}
		lnew = new JLabel(new ImageIcon(s+cards[num1]+cardsSymbol[num2]+s3) );
		lnew.setBounds(140+n,80,100,110);
		f.add(lnew);
		String cnew = cards[num1];
		
		score2= new Hand().Score(cnew,score2);
		lscore2.setText("Your score: "+score2);
		
	}

}
