package gui;

import math.BatTargetBox;

public class BatButton{
	
	protected BatTargetBox bb;
	protected boolean pressed;
	
	public BatButton(int width, int height){
		pressed = false;
		bb = new BatTargetBox(0, 0, width, height);
	}
	
	public void setPosition(int x, int y){
		bb.setPosition(x, y);
	}
	
	public void onPress(){
		pressed = true;
	}
	
	public void onRelease(){
		pressed = false;
	}
	
	public boolean contains(int x, int y){
		return bb.contains(x, y);
	}
	
	
}
