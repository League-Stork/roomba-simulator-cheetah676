package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		int b = 500;
		int y = 1000;
		for (int i = 0; i < 2; i++) {
			driveDirect(1000, 1000);
			sleep(800);
			driveDirect(b, y);
			sleep(500);
			b += 500;
			y -= 500;
		}
		driveDirect(1000, 1000);
		sleep(850);
		driveDirect(500, 1000);
		sleep(500);
		driveDirect(1000, 1000);
		sleep(700);
		driveDirect(1000, 500);
		sleep(500);
		driveDirect(1000, 1000);
	}

	public void loop() {

	}
}
