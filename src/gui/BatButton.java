package gui;

import screen.Renderable;

public interface BatButton extends Renderable{
	
	public abstract void setPosition(int x, int y);
	
	public abstract void onPress();
	
	public abstract void onRelease();
	
	public abstract void onHoverOver();
	
}
