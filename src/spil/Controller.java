package spil;

import java.util.Random;
import java.io.Console;

import desktop_resources.GUI;

public class Controller {
	private Spiller[] player = new Spiller[2];
	private int currentTurn;
	private boolean matchPoint = false;
	
	
	public void go() {
		//.playTurn returnerer Cup.getEns(), og er derfor
		//SAND når spilleren skal tildeles en ekstra tur.
		//turen går altså kun videre når denne metode
		//returnerer "false"!
		while(true) {
			GUI.getUserButtonPressed("Spiller "+(currentTurn+1)+", ryst den!", "okay så");
			if(!player[currentTurn].playTurn()) {
				//Spilleren slog ikke en double
				currentTurn = (currentTurn+1) % player.length;
			} else if(player[currentTurn].getPoints()>=40) {
				//Spilleren slog en double og det er matchpoint, så spilleren hvis tur det er pt har derfor vundet.
				playerWon(currentTurn+1);
				break;
			} else if(player[currentTurn].isBeast()) {
				//Spilleren slog en dobbelt, så vi kalder metoden isBeast
				//som returner true hvis sidste slag var 2 6'ere, og dette slag også er 2 6'ere.
				playerWon(currentTurn+1);
			}
			GUI.displayChanceCard("Spiller 1 har: " + player[0].getPoints() + " point . . .  . "
								+ "Spiller 2 har: " + player[1].getPoints() + " point\n"
								+ "");
			
		}
	}
	
	public void playerWon(int id) {
		GUI.displayChanceCard("Spiller " + id + " har vundet!");
		if(GUI.getUserLeftButtonPressed("Spil igen?", "JA!", "slet mig lige")) {
			init();
		} else {
			System.exit(0);
		}
	}
	
	public Controller() {

	}
	
	public void init() {
		player[0] = new Spiller();
		player[1] = new Spiller();
		currentTurn = 0;
		GUI.addPlayer("1", 1000);
		GUI.addPlayer("2", 1000);
		
		go();
	}
	
	public static void main(String [] args) {
		Random g = new Random();
		Controller c = new Controller();
		c.init();
		
	}
	
}