package screen;

import display.BatBitmap;
import display.BatDisplay;

public class MenuScreen extends BatScreen {

	BatBitmap box;
	int xOff, yOff;
	
	public MenuScreen() {
		super(true, true);
		box = new BatBitmap(200, 200);
		xOff = (800 - 200)/2;
		yOff = (600 - 200)/2;
		box.clear(-1);
	}

	@Override
	public boolean handleKeyboard() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean handleMouse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void render(BatDisplay display) {
		display.insert(box, xOff, yOff);
	}

	@Override
	public void update(double dt) {
		// TODO Auto-generated method stub
		
	}

}
