package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
		driveDirect(800, 2000);
		sleep(1850);
		driveDirect(1000, 1000);
		sleep(2000);
		driveDirect(800, 1000);
	}

	public void loop() {
	
	}
}
