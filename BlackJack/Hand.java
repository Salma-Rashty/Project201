package Lab;

public class Hand {
	

	public int Score(String c, int score) {
		
		if (c=="Jack" || c=="queen" || c=="king") {
			score+=10;
		}
		else if (c=="ace") {
			if(score+11>21) {
				score+=1;
			}
			else {
				score+=11;
			}
		}
		else {
			score+= Integer.parseInt(c);
		}
		return score;
	}

}
