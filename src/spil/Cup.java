package spil;

import java.util.Random;

public class Cup {
	private static Random randGen;
	private boolean isDouble;
	private int[] values = new int[2];
	
	public int[] kast() {
		values[0] = randGen.nextInt(6)+1;
		values[1] = randGen.nextInt(6)+1;
		if(values[0]==values[1])
			isDouble = true;
		else
			isDouble = false;
		return values;
	}
	
	public int getSum() {
		return values[0] + values[1];
	}
	public boolean getResult() {
		return true;
	}
	}
