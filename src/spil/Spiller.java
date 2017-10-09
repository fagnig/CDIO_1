package spil;

public class Spiller {
	private int id;
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
	
	public void playTurn() {
		
	}
	
	
	
}
