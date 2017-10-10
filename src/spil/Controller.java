package spil;

public class Controller {
	private int currentPlayer;
	Spiller players[];

	public void updateGUI() {
		
	}
	
	public void init(int playerCount) {
		for(int i = 0; i>=playerCount; i++){
			Spiller nySpiller = new Spiller();
			
			players[i] = nySpiller;
		}
	}
	
	public Spiller getCurrentPlayer() {
		return players[currentPlayer];
	}
	
	public void controlTurn() {
		
	}
}
