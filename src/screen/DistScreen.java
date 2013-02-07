package screen;

import java.awt.Color;
import java.util.Random;

import display.BatBitmap;
import display.BatDisplay;

public class DistScreen extends BatScreen{
	Random rand = new Random();
	BatBitmap box;
	int xOff, yOff;
	
	public DistScreen() {
		super(false, false);
		box = new BatBitmap(400, 300);
		xOff = 400;
		yOff = 300;
		
	}
	
	@Override
	public void update(double dt) {
		Color c;
		for(int i = 0; i < box.pixels.length; i++){
			c = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
			if(c.getRGB() > -1500000){
				box.pixels[i] = c.getRGB();
			}else{
				box.pixels[i] = 0;
			}
		}
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
		// TODO Auto-generated method stub
		display.insert(box, xOff, yOff);
		
	}
	
	

}
