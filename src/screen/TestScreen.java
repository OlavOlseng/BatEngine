package screen;

import java.awt.Color;

import display.BatBitmap;
import display.BatDisplay;

public class TestScreen extends BatScreen{
	
	BatBitmap box = new BatBitmap(100, 100); 
	double cumTime = 0;
	double boxX = 100, boxY = 100;
	double dir;
	
	public TestScreen(Color c, double d) {
		super(false, false);
		box.fill(0, 0, 100, 100, c.getRGB());
		this.dir = d;
	}

	@Override
	public boolean handleKeyboard() {
		return false;
	}

	@Override
	public boolean handleMouse() {
		return false;
	}

	@Override
	public void render(BatDisplay display) {
		display.insert(box, boxX, boxY);
	}

	@Override
	public void update(double dt) {
		cumTime += dir*dt/1000;
		boxX = Math.sin(cumTime)*dir*300 + 350;
		boxY = -Math.cos(cumTime)*dir*250 + 250;
	}
}
