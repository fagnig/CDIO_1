package spil;

import java.util.Random;

public class Cup {
	private static Random randGen;
	private boolean isDouble;
	//private boolean beastMode;
	private int[] values = new int[2];
	
	public int[] kast() {
		roll();
		if(values[0]==values[1]) {
			isDouble = true;
		} else {
			isDouble = false;
		}
		return values;
	}
	
	public int getSum() {
		return values[0] + values[1];
	}
	
	/*public boolean getBeast() {
		return beastMode;
	}*/
	
	public boolean getEns() {
		return isDouble;
	}
	
	public void roll() {
		values[0] = randGen.nextInt(6)+1;
		values[1] = randGen.nextInt(6)+1;
	}
	
	public int[] getFaceValues() {
		return values;
	}
}
