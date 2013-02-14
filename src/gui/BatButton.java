package gui;


public interface BatButton {
	
	public abstract void setPosition(int x, int y);
	
	public abstract int getX();
	
	public abstract int getY();
	
	public abstract void onPress();
	
	public abstract void onRelease();
	
	public abstract void onHoverOver();
	
}
