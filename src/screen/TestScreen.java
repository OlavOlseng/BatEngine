package screen;

import resource.TestLoader;
import gfx.BatAnimation;
import gfx.BatAnimation.AnimType;
import gfx.BatBitmap;
import display.BatDisplay;

public class TestScreen extends BatScreen {
	
	int bx, by;
	float cumDt = 0;
	
	BatAnimation lard;
	BatAnimation jump;
	BatBitmap bomb;
	
	public TestScreen() {
		super(true, true);
		// TODO Auto-generated constructor stub
		lard = new BatAnimation(TestLoader.LARD, 15, AnimType.LOOP);
		lard.setState(10);
		jump = new BatAnimation(TestLoader.SPLODE, 30, AnimType.ONE_SHOT);
		bomb = TestLoader.BOMB;
		
		bx = 400;
		by = 400;
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
		// TODO Auto-generated method stub
	}

	@Override
	public void update(float dt) {
		lard.stepAnimation(dt);
		if( cumDt > 1000)
			jump.stepAnimation(dt);
		cumDt += dt;
		
	}
}
