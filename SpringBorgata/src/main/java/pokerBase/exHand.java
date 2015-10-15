package pokerBase;

import java.io.*;

public class exHand extends Exception {

	private int handStrength;
	
	public exHand(int handStrength) {
		this.handStrength = handStrength;
	}
	
	public int gethandStrength() {
		return handStrength;
	}
}
