package spil;
import desktop_resources.GUI;

public class Controller {
	private int currentPlayer = 0;
	Spiller players[] = new Spiller[2];

	public void updateGUI( int[] face) {
		GUI.setDice(face[0], face[1]);
	}
	
	public void init(int playerCount) {
		for(int i = 0; i>playerCount; i++){
			players[i] = new Spiller();
		}
	}
	
	public Spiller getCurrentPlayer() {
		return players[currentPlayer];
	}
	
	public int getCurrentPlayerID() {
		return currentPlayer;
	}
	
	public void controlTurn() {
		boolean win = getCurrentPlayer().playTurn();
		updateGUI(getCurrentPlayer().getCup().getFaceValues());
		if (win) {
			GUI.showMessage("der var nogen der vandt");
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
