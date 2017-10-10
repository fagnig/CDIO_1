package spil;



public class Spiller {
	private int id;
	private static int playerCount;
	private Cup cup;
	
	private int point = 0;
	private boolean beastMode = false;
	
	
	public Spiller() {
		id = playerCount;
		cup = new Cup();
		playerCount++;
	}
	
	public int getPlayerCount() {
		return playerCount;
	}
	
	public boolean isBeast() {
		return(cup.getEns() && cup.getSum() == 12 && beastMode);
	}
	
	public boolean playTurn() {
		cup.kast();
		
		//Beastmode
		if(cup.getEns() && cup.getSum() == 12) {
			beastMode = true;
		}
		else {
			//Spilleren slog ikke 2 6'ere, så sæt til false
			beastMode = false;
		}
		//Hvis spilleren slår 2 1'ere og har mindre end 40 point, sættes score til 0.
		if(cup.getEns() && point < 40 && cup.getSum()==2)
			point = 0;
		else
			point += cup.getSum();	
		
		
		return cup.getEns();
	}
	
	public int getPoints() {
		return point;
	}
	
	
}
