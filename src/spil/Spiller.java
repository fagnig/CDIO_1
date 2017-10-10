package spil;

public class Spiller {
	private int id;
	private boolean beastMode;
	private static int playerCount;
	private Cup cup = new Cup();
	
	private int point = 0;
	
	
	public Spiller() {
		id = playerCount;
		playerCount++;
	}
	
	public int getPlayerCount() {
		return playerCount;
	}
	
	public boolean playTurn() {
		cup.kast();
		if (cup.getEns() == true && cup.getSum() == 12) {
			if (beastMode = true) {
				return true;
			}
			beastMode = true;
		} else {
			beastMode = false;
		}
		if (point >= 40 && cup.getEns()) {
			return true;
		}
		point = point + cup.getSum();
		if (cup.getEns() == true && cup.getSum() == 0) {
			point = 0;
		}
		return false;
	}
	
	public int getID() {
		return id;
	}
	
	public Cup getCup() {
		return cup;
	}
}
