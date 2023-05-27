package Lab;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MemoryGame implements MouseListener ,ActionListener{
	JFrame f;
	JFrame f2;
	JButton b;
	JButton b2;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;
	JLabel l9;
	JLabel l10;
	JLabel l11;
	JLabel l12;
	JLabel l13;
	JLabel l14;
	JLabel l15;
	JLabel l16;
	JLabel l17;
	JLabel l18;
	JLabel l19;
	JLabel l20;
	ImageIcon image;
	Random r = new Random();
	
	int[] randomN = new int[21];
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int ra;
	
	JLabel chosen = new JLabel();
	JLabel chosen2 = new JLabel();
	int count=0;
	int num1 = 0;
	int num2 = 0;
	int countHer=0;
	int countHer2=0;
	int countHer3=0;
	int countHer4=0;
	int countHer5=0;
	int countHer6=0;
	int countHer7=0;
	int countHer8=0;
	int countHer9=0;
	int countHer10=0;
	int countHer11=0;
	int countHer12=0;
	int countHer13=0;
	int countHer14=0;
	int countHer15=0;
	int countHer16=0;
	int countHer17=0;
	int countHer18=0;
	int countHer19=0;
	int countHer20=0;

	public MemoryGame() {
		
		for(int i=1 ; i<=20 ; i++) {
			ra = r.nextInt(10)+1;
			while(deck(ra , arr)!=true) {
				ra = r.nextInt(10)+1;
			}    
			randomN[i] = ra;
		}
		
		f = new JFrame("Memory Game");
		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();
		l10 = new JLabel();
		l11 = new JLabel();
		l12 = new JLabel();
		l13 = new JLabel();
		l14 = new JLabel();
		l15 = new JLabel();
		l16 = new JLabel();
		l17 = new JLabel();
		l18 = new JLabel();
		l19 = new JLabel();
		l20 = new JLabel();
		f2 = new JFrame();
		b = new JButton("Play Again!");
		b2 = new JButton("Exit");
		
		image = new ImageIcon("pic\\back.png");
		l1.setIcon(image);
		l2.setIcon(image);
		l3.setIcon(image);
		l4.setIcon(image);
		l5.setIcon(image);
		l6.setIcon(image);
		l7.setIcon(image);
		l8.setIcon(image);
		l9.setIcon(image);
		l10.setIcon(image);
		l11.setIcon(image);
		l12.setIcon(image);
		l13.setIcon(image);
		l14.setIcon(image);
		l15.setIcon(image);
		l16.setIcon(image);
		l17.setIcon(image);
		l18.setIcon(image);
		l19.setIcon(image);
		l20.setIcon(image);
		
		l1.setBounds(30, 20, 117, 117);
		l2.setBounds(160, 20, 117, 117);
		l3.setBounds(290, 20, 117, 117);
		l4.setBounds(420, 20, 117, 117);
		l5.setBounds(550, 20, 117, 117);
		l6.setBounds(30, 160, 117, 117);
		l7.setBounds(160, 160, 117, 117);
		l8.setBounds(290, 160, 117, 117);
		l9.setBounds(420, 160, 117, 117);
		l10.setBounds(550, 160, 117, 117);
		l11.setBounds(30, 300, 117, 117);
		l12.setBounds(160, 300, 117, 117);
		l13.setBounds(290, 300, 117, 117);
		l14.setBounds(420, 300, 117, 117);
		l15.setBounds(550, 300, 117, 117);
		l16.setBounds(30, 440, 117, 117);
		l17.setBounds(160, 440, 117, 117);
		l18.setBounds(290, 440, 117, 117);
		l19.setBounds(420, 440, 117, 117);
		l20.setBounds(550, 440, 117, 117);
		
		b.setBounds(30,40,100,50);
		b2.setBounds(150,40,70,50);
		
		
		f.setSize(700,600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.getContentPane().setBackground(new Color(230, 220, 250));
		f.setLocationRelativeTo(null);
		f.setVisible(true);
    	
		f2.setUndecorated(true);
		f2.setSize(250,130);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setLayout(null);
		f2.getContentPane().setBackground(new Color(230, 220, 250));
		f2.setLocationRelativeTo(null);
		f2.setVisible(false);
		
		f2.add(b);
		f2.add(b2);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(l16);
		f.add(l17);
		f.add(l18);
		f.add(l19);
		f.add(l20);
		
		l1.addMouseListener(this);
		l2.addMouseListener(this);
		l3.addMouseListener(this);
		l4.addMouseListener(this);
		l5.addMouseListener(this);
		l6.addMouseListener(this);
		l7.addMouseListener(this);
		l8.addMouseListener(this);
		l9.addMouseListener(this);
		l10.addMouseListener(this);
		l11.addMouseListener(this);
		l12.addMouseListener(this);
		l13.addMouseListener(this);
		l14.addMouseListener(this);
		l15.addMouseListener(this);
		l16.addMouseListener(this);
		l17.addMouseListener(this);
		l18.addMouseListener(this);
		l19.addMouseListener(this);
		l20.addMouseListener(this);
		
		b.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
			     
	     if(e.getSource()==l1) {
	    	 countHer++;
	    	 count++;
	    	 if (count==1 && countHer==1) {
	    		 chosen = l1;
	    		 num1 = randomN[1];
	    		 l1.setIcon(new ImageIcon("pic\\"+randomN[1]+".png"));
	    	 }
	    	 if(count==2 && countHer==1) {
	    		 chosen2 = l1;
	    		 num2 = randomN[1];
	    		 l1.setIcon(new ImageIcon("pic\\"+randomN[1]+".png"));
	    	 }
	    	 
	     }
	     if(e.getSource()==l2) {
	    	 countHer2++;
	    	 count++;
	    	 if (count==1 && countHer2==1) {
	    		 chosen = l2;
	    		 num1 = randomN[2];
	    		 l2.setIcon(new ImageIcon("pic\\"+randomN[2]+".png"));
	    	 }
	    	 if(count==2 && countHer2==1) {
	    		 chosen2 = l2;
	    		 num2 = randomN[2];
	    		 l2.setIcon(new ImageIcon("pic\\"+randomN[2]+".png"));
	    	 }
	    	
	    	 
	     }
	     if(e.getSource()==l3) {
	    	 countHer3++;
	    	 count++;
	    	 if (count==1 && countHer3==1) {
	    		 chosen = l3;
	    		 num1 = randomN[3];
	    		 l3.setIcon(new ImageIcon("pic\\"+randomN[3]+".png"));
	    	 }
	    	 if(count==2 && countHer3==1) {
	    		 chosen2 = l3;
	    		 num2 = randomN[3];
	    		 l3.setIcon(new ImageIcon("pic\\"+randomN[3]+".png"));
	    	 }
	    	
	     }
	     if(e.getSource()==l4) {
	    	 countHer4++;
	    	 count++;
	    	 if (count==1 && countHer4==1) {
	    		 chosen = l4;
	    		 num1 = randomN[4];
	    		 l4.setIcon(new ImageIcon("pic\\"+randomN[4]+".png"));
	    	 }
	    	 if(count==2 && countHer4==1) {
	    		 chosen2 = l4;
	    		 num2 = randomN[4];
	    		 l4.setIcon(new ImageIcon("pic\\"+randomN[4]+".png"));
	    	 }
	    	
	     }
	     if(e.getSource()==l5) {
	    	 countHer5++;
	    	 count++;
	    	 if (count==1 && countHer5==1) {
	    		 chosen = l5;
	    		 num1 = randomN[5];
	    		 l5.setIcon(new ImageIcon("pic\\"+randomN[5]+".png"));
	    	 }
	    	 if(count==2 && countHer5==1) {
	    		 chosen2 = l5;
	    		 num2 = randomN[5];
	    		 l5.setIcon(new ImageIcon("pic\\"+randomN[5]+".png"));
	    	 }
	    	 
	     }
	     if(e.getSource()==l6) {
	    	 countHer6++;
	    	 count++;
	    	 if (count==1 && countHer6==1) {
	    		 chosen = l6;
	    		 num1 = randomN[6];
	    		 l6.setIcon(new ImageIcon("pic\\"+randomN[6]+".png"));
	    	 }
	    	 if(count==2 && countHer6==1) {
	    		 chosen2 = l6;
	    		 num2 = randomN[6];
	    		 l6.setIcon(new ImageIcon("pic\\"+randomN[6]+".png"));
	    	 }
	    	 
	     }
	     if(e.getSource()==l7) {
	    	 countHer7++;
	    	 count++;
	    	 if (count==1 && countHer7==1) {
	    		 chosen = l7;
	    		 num1 = randomN[7];
	    		 l7.setIcon(new ImageIcon("pic\\"+randomN[7]+".png"));
	    	 }
	    	 if(count==2 && countHer7==1) {
	    		 chosen2 = l7;
	    		 num2 = randomN[7];
	    		 l7.setIcon(new ImageIcon("pic\\"+randomN[7]+".png"));
	    	 }
	    	
	     }
	     if(e.getSource()==l8) {
	    	 countHer8++;
	    	 count++;
	    	 if (count==1 && countHer8==1) {
	    		 chosen = l8;
	    		 num1 = randomN[8];
	    		 l8.setIcon(new ImageIcon("pic\\"+randomN[8]+".png"));
	    		 
	    	 }
	    	 if(count==2 && countHer8==1) {
	    		 chosen2 = l8;
	    		 num2 = randomN[8];
	    		 l8.setIcon(new ImageIcon("pic\\"+randomN[8]+".png"));
	    	 }
	    	 
	     }
	     if(e.getSource()==l9) {
	    	 countHer9++;
	    	 count++;
	    	 if (count==1 && countHer9==1) {
	    		 chosen = l9;
	    		 num1 = randomN[9];
	    		 l9.setIcon(new ImageIcon("pic\\"+randomN[9]+".png"));
	    	 }
	    	 if(count==2 && countHer9==1) {
	    		 chosen2 = l9;
	    		 num2 = randomN[9];
	    		 l9.setIcon(new ImageIcon("pic\\"+randomN[9]+".png"));
	    	 }
	    	
	     }
	     if(e.getSource()==l10) {
	    	 countHer10++;
	    	 count++;
	    	 if (count==1 && countHer10==1) {
	    		 chosen = l10;
	    		 num1 = randomN[10];
	    		 l10.setIcon(new ImageIcon("pic\\"+randomN[10]+".png"));
	    	 }
	    	 if(count==2 && countHer10==1) {
	    		 chosen2 = l10;
	    		 num2 = randomN[10];
	    		 l10.setIcon(new ImageIcon("pic\\"+randomN[10]+".png"));
	    	 }
	     }
	     if(e.getSource()==l11) {
	    	 countHer11++;
	    	 count++;
	    	 if (count==1 && countHer11==1) {
	    		 chosen = l11;
	    		 num1 = randomN[11];
	    		 l11.setIcon(new ImageIcon("pic\\"+randomN[11]+".png"));
	    	 }
	    	 if(count==2 && countHer11==1) {
	    		 chosen2 = l11;
	    		 num2 = randomN[11];
	    		 l11.setIcon(new ImageIcon("pic\\"+randomN[11]+".png"));
	    	 }
    	 }
	     
	     if(e.getSource()==l12) {
	    	 countHer12++;
	    	 count++;
	    	 if (count==1 && countHer12==1) {
	    		 chosen = l12;
	    		 num1 = randomN[12];
	    		 l12.setIcon(new ImageIcon("pic\\"+randomN[12]+".png"));
	    	 }
	    	 if(count==2 && countHer12==1) {
	    		 chosen2 = l12;
	    		 num2 = randomN[12];
	    		 l12.setIcon(new ImageIcon("pic\\"+randomN[12]+".png"));
	    	 }	 
	     }
	     
	     if(e.getSource()==l13) {
	    	 countHer13++;
	    	 count++;
	    	 if (count==1 && countHer13==1) {
	    		 chosen = l13;
	    		 num1 = randomN[13];
	    		 l13.setIcon(new ImageIcon("pic\\"+randomN[13]+".png"));
	    	 }
	    	 if(count==2 && countHer13==1) {
	    		 chosen2 = l13;
	    		 num2 = randomN[13];
	    		 l13.setIcon(new ImageIcon("pic\\"+randomN[13]+".png"));
	    	 }	    	
	     }
	     
	     if(e.getSource()==l14) {
	    	 countHer14++;
	    	 count++;
	    	 if (count==1 && countHer14==1) {
	    		 chosen = l14;
	    		 num1 = randomN[14];
	    		 l14.setIcon(new ImageIcon("pic\\"+randomN[14]+".png"));
	    	 }
	    	 if(count==2 && countHer14==1) {
	    		 chosen2 = l14;
	    		 num2 = randomN[14];
	    		 l14.setIcon(new ImageIcon("pic\\"+randomN[14]+".png"));
	    	 }	    	
	     }
	     
	     if(e.getSource()==l15) {
	    	 countHer15++;
	    	 count++;
	    	 if (count==1 && countHer15==1) {
	    		 chosen = l15;
	    		 num1 = randomN[15];
	    		 l15.setIcon(new ImageIcon("pic\\"+randomN[15]+".png"));
	    	 }
	    	 if(count==2 && countHer15==1) {
	    		 chosen2 = l15;
	    		 num2 = randomN[15];
	    		 l15.setIcon(new ImageIcon("pic\\"+randomN[15]+".png"));
	    	 }	    	 
	     }
	     
	     if(e.getSource()==l16) {
	    	 countHer16++;
	    	 count++;
	    	 if (count==1 && countHer16==1) {
	    		 chosen = l16;
	    		 num1 = randomN[16];
	    		 l16.setIcon(new ImageIcon("pic\\"+randomN[16]+".png"));
	    	 }
	    	 if(count==2 && countHer16==1) {
	    		 chosen2 = l16;
	    		 num2 = randomN[16];
	    		 l16.setIcon(new ImageIcon("pic\\"+randomN[16]+".png"));
	    	 }	    	 
	     }
	     
	     if(e.getSource()==l17) {
	    	 countHer17++;
	    	 count++;
	    	 if (count==1 && countHer17==1) {
	    		 chosen = l17;
	    		 num1 = randomN[17];
	    		 l17.setIcon(new ImageIcon("pic\\"+randomN[17]+".png"));
	    	 }
	    	 if(count==2 && countHer17==1) {
	    		 chosen2 = l17;
	    		 num2 = randomN[17];
	    		 l17.setIcon(new ImageIcon("pic\\"+randomN[17]+".png"));
	    	 }	    	
	     }
	     
	     if(e.getSource()==l18) {
	    	 countHer18++;
	    	 count++;
	    	 if (count==1 && countHer18==1) {
	    		 chosen = l18;
	    		 num1 = randomN[18];
	    		 l18.setIcon(new ImageIcon("pic\\"+randomN[18]+".png"));
	    		 
	    	 }
	    	 if(count==2 && countHer18==1) {
	    		 chosen2 = l18;
	    		 num2 = randomN[18];
	    		 l18.setIcon(new ImageIcon("pic\\"+randomN[18]+".png"));
	    	 }	    	 
	     }
	     
	     if(e.getSource()==l19) {
	    	 countHer19++;
	    	 count++;
	    	 if (count==1 && countHer19==1) {
	    		 chosen = l19;
	    		 num1 = randomN[19];
	    		 l19.setIcon(new ImageIcon("pic\\"+randomN[19]+".png"));
	    	 }
	    	 if(count==2 && countHer19==1) {
	    		 chosen2 = l19;
	    		 num2 = randomN[19];
	    		 l19.setIcon(new ImageIcon("pic\\"+randomN[19]+".png"));
	    	 }	    	
	     }
	     
	     if(e.getSource()==l20) {
	    	 countHer20++;
	    	 count++;
	    	 if (count==1 && countHer20==1) {
	    		 chosen = l20;
	    		 num1 = randomN[20];
	    		 l20.setIcon(new ImageIcon("pic\\"+randomN[20]+".png"));
	    	 }
	    	 if(count==2 && countHer20==1) {
	    		 chosen2 = l20;
	    		 num2 = randomN[20];
	    		 l20.setIcon(new ImageIcon("pic\\"+randomN[20]+".png"));
	    	 }   	 
	     }
	
	     
	     if(count==3) {
	    	 if(num1!=num2) {
	    		 chosen.setIcon(new ImageIcon("pic\\back.png"));
    		     chosen2.setIcon(new ImageIcon("pic\\back.png"));
	    	 }
    		 count=0;
    		 num1 =0;
    		 num2 =21;
    		 countHer=0; countHer2=0;  countHer3=0; countHer4=0; countHer5=0; countHer6=0; countHer7=0;
    		 countHer8=0; countHer9=0; countHer10=0; countHer11=0; countHer12=0; countHer13=0; countHer14=0;
    		 countHer15=0; countHer16=0; countHer17=0; countHer18=0; countHer19=0; countHer20=0;
    	 }
	     if (num1==num2) {
	    	 chosen.setEnabled(false);
	    	 chosen2.setEnabled(false);
	     }
	     if(l1.isEnabled()==false && l2.isEnabled()==false && l3.isEnabled()==false && l4.isEnabled()==false && l5.isEnabled()==false && l6.isEnabled()==false &&
	    		 l7.isEnabled()==false && l8.isEnabled()==false && l9.isEnabled()==false && l10.isEnabled()==false && l11.isEnabled()==false && l12.isEnabled()==false &&
	    		 l13.isEnabled()==false && l14.isEnabled()==false && l15.isEnabled()==false && l16.isEnabled()==false && l17.isEnabled()==false && l18.isEnabled()==false &&
	    		 l19.isEnabled()==false && l20.isEnabled()==false ) {
	    	 count=0;
    		 num1 =0;
    		 num2 =21;
    		 countHer=0; countHer2=0;  countHer3=0; countHer4=0; countHer5=0; countHer6=0; countHer7=0;
    		 countHer8=0; countHer9=0; countHer10=0; countHer11=0; countHer12=0; countHer13=0; countHer14=0;
    		 countHer15=0; countHer16=0; countHer17=0; countHer18=0; countHer19=0; countHer20=0;
    		 arr.removeAll(arr);
    		 
	    	 f2.setVisible(true);
			 
	     }
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			f.dispose();
			f2.dispose();
			new MemoryGame();
		}
		if(e.getSource()==b2) {
			f.dispose();
			f2.dispose();
		}
		
	}
	public boolean deck(int num,ArrayList<Integer> arr) {
		if (arr.contains(num)) {
			int occurrences = Collections.frequency(arr, num);
			if(occurrences<2) {
				arr.add(num);
				return true;
			}
			return false;
		}
		else {
			arr.add(num);
		}
		return true;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
