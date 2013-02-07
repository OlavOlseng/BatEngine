package screen;

import resource.ImageLoader;
import resource.TestLoader;
import display.BatBitmap;
import display.BatDisplay;

public class BombScreen extends BatScreen{
	
	double cumTime = 0;
	BatBitmap bomb;
	BatBitmap[][] mummy;
	int cx, cy, mx, my;
	int mumnum = 0;
	
	public BombScreen() {
		super(true, false);
		bomb = TestLoader.LOLCAT;
		mummy = TestLoader.LARD;
		cx = (800 - bomb.width)/2; 
		cy = (600 - bomb.height)/2;
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
		for (int x = 5; x < 800; x += 40){
			for (int y = 5; y < 600; y+= 40){
				display.insert(mummy[(int) ((cumTime/100)%(mummy.length))][(int) ((cumTime/(100*6))%(mummy[0].length))], x, y);
			}
		}
		display.insert(bomb, cx + Math.sin(cumTime/10)*3, cy - Math.cos(cumTime/10)*3);
	}

	@Override
	public void update(double dt) {
		cumTime += dt;
	}

}
