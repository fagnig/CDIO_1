package spil;
import desktop_resources.GUI;

public class Controller {
	private int currentPlayer;
	Spiller players[];

	public void updateGUI( int[] face) {
		GUI.setDice(face[0], face[1]);
	}
	
	public void init(int playerCount) {
		GUI.setDice(2, 2);
		
		for(int i = 0; i>=playerCount; i++){
			Spiller nySpiller = new Spiller();
			
			players[i] = nySpiller;
		}
	}
	
	public Spiller getCurrentPlayer() {
		return players[currentPlayer];
	}
	
	public void controlTurn() {
		boolean win = getCurrentPlayer().playTurn();
		updateGUI(getCurrentPlayer().getCup().getFaceValues());
		if (win) {
			//GUI
		}
		if (!getCurrentPlayer().getCup().getEns()) {
			if (currentPlayer == players.length -1) {
				currentPlayer = 0;
			} else {
				currentPlayer++;
			}
		}
	}
}
