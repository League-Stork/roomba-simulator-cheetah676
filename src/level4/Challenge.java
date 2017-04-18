package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(800, 2000);
		sleep(1000);
		driveDirect(1500, 1500);
		sleep(7000);
		driveDirect(2000, 800);
		sleep(2300);
		driveDirect(800, 2000);
		sleep(2000);
		driveDirect(2000, 700);
		sleep(1000);
		driveDirect(800, 2000);
	}

	public void loop() {

	}
}
