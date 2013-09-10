package screen;

import java.util.Random;

import javax.xml.ws.Dispatch;

import math.Vec2;
import resource.TestLoader;
import gfx.BatAnimation;
import gfx.BatAnimation.AnimType;
import gfx.BatBitmap;
import display.BatDisplay;

public class TestScreen extends BatScreen {
	
	int bx, by;
	float cumDt = 0;
	int st = 0;
	BatAnimation lard;
	BatAnimation jump;
	BatAnimation dude;
	BatBitmap bomb;
	Vec2 position;
	
	
	public TestScreen() {
		super(true, true);
		// TODO Auto-generated constructor stub
		lard = new BatAnimation(TestLoader.LARD, 15, AnimType.LOOP);
		lard.setState(st);
		jump = new BatAnimation(TestLoader.SPLODE, 60, AnimType.LOOP);
		bomb = TestLoader.BOMB;
		dude = new BatAnimation(TestLoader.DUDE, 20, AnimType.LOOP);
		position = new Vec2(400,400);
	}

	@Override
	public boolean absorbedKeyPress() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void handleKeyboard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(BatDisplay display) {
		if(!jump.isFinished())
			display.insert(jump.getGraphics(), position);
		
		display.insert(dude.getGraphics(), new Vec2(400,300));
		Random rand = new Random();
		
		
		display.insert(bomb, new Vec2(300, 200));
		if(!lard.isFinished()){
			float xx  = (float) (200 - Math.sin(cumDt/1000)*200);
			float yy = (float) (200 + Math.cos(cumDt/1000)*200);
			display.insert(lard.getGraphics(), new Vec2(xx,yy) );
		}
	}

	@Override
	public void update(float dt) {
		lard.stepAnimation(dt);
		jump.stepAnimation(dt);
		dude.stepAnimation(dt);
		
		cumDt += dt;
		
	}
}
