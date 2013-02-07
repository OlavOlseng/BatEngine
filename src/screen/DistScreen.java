package screen;

import java.awt.Color;
import java.util.Random;

public class DistScreen extends TestScreen{
	Random rand = new Random();
	public DistScreen(double d) {
		super(Color.WHITE, d);
	}
	
	@Override
	public void update(double dt) {
		super.update(dt);
		Color c;
		for(int i = 0; i < box.pixels.length; i++){
			c = new Color(rand.nextInt(256), rand.nextInt(256),rand.nextInt(256));
			box.pixels[i] = c.getRGB();
		}
	}
	
	

}
