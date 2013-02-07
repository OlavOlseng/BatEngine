package screen;

import resource.ImageLoader;
import display.BatBitmap;
import display.BatDisplay;

public class BombScreen extends BatScreen{
	
	double cumTime = 0;
	BatBitmap bomb;
	int x, y;
	public BombScreen() {
		super(false, false);
		bomb = ImageLoader.load("/LOLCAT.png");
		x = bomb.width/2; 
		y = bomb.height/2 - 20;
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
		display.insert(bomb, x + Math.sin(cumTime)*5, y - Math.cos(cumTime)*5);
	}

	@Override
	public void update(double dt) {
		cumTime += dt;
	}

}
