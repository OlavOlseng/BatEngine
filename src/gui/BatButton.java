package gui;


public interface BatButton extends BatComponent {
	
	public void setPosition(int x, int y);
	
	public void onPress();
	
	public void onRelease();
	
	public void onHoverOver();
	
}
