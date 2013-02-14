package screen;

import gui.BatButton;
import gui.BatComponent;

import java.util.ArrayList;

import display.BatBitmap;
import display.BatDisplay;

public class BatMenuScreen extends BatScreen{
	
	protected ArrayList<BatButton> components;
	protected BatBitmap screen;
	public BatMenuScreen(boolean isRenderBlock, boolean isUpdateBlock) {
		super(isRenderBlock, isUpdateBlock);
		// TODO Auto-generated constructor stub
		components = new ArrayList<BatButton>();
		screen = new BatBitmap(800, 600);
	}
	
	public void addComponent(BatButton c){
		components.add(c);
	}
	
	@Override
	public boolean absorbedMouse() {
		return true;
	}

	@Override
	public boolean absorbedKeyPress() {
		return true;
	}

	@Override
	public void handleKeyboard() {
	}

	@Override
	public void handleMouse(int x, int y, int click) {
		for (BatButton c : components) {
			if (c.contains(x, y)){
				c.onHoverOver();
			}
		}
	}

	@Override
	public void render(BatDisplay display) {
		screen.clear(0);
		for (BatButton b : components) {
			screen.insert(b.getGraphics(), b.getX(), b.getY());
		}
		display.insert(this.screen, xOffset, yOffset);
	}

	@Override
	public void update(double dt) {
		// TODO Auto-generated method stub
	}
	
}
