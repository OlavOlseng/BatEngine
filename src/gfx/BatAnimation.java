package gfx;

import math.Vec2;

public class BatAnimation {
	
	private int frames, states;
	private float delay;
	private BatBitmap[][] sheet;
	private int currentFrame, currentState;
	private float fps;
	private boolean oneShot;
	private boolean finished;

	public enum AnimType {
		ONE_SHOT, LOOP;
	}
	
	public BatAnimation(BatBitmap[][] spriteSheet, int fps, AnimType animType){
		finished = false;
		
		this.states = spriteSheet[0].length;
		this.frames = spriteSheet.length;
		this.sheet = spriteSheet;
		
		currentFrame = 0;
		currentState = 0;
		delay = 0;
		setFps(fps);
		
		switch(animType) {
		case ONE_SHOT:
			oneShot = true;
			break;
		default:
			oneShot = false;
		}
	}
	
	public boolean isFinished() {
		return finished;
	}
	
	public void setFps(int fps) {
		this.fps = 1000.0f/fps;
	}
	
	public BatBitmap getGraphics() {
		return sheet[currentFrame][currentState];
	}
	
	public void stepAnimation(float dt) {
		delay += dt;
		while (delay > fps) {
			delay -= fps;
			incFrame();
		}
	}
	
	private void incFrame() {
		if (!finished)
			currentFrame++;
		if(currentFrame >= frames) {
			if (oneShot) {
				finished = true;
			} 
			else {
				currentFrame %= frames;
			}
		}
	}
	
	public int getNumStates() {
		return states;
	}
	
	public void setState(int state) {
		this.currentState = state;
		this.currentFrame = 0;
	}
}
