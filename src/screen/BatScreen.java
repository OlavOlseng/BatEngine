package screen;

import math.Vec2;
import display.BatDisplay;

public abstract class BatScreen {
	
	protected Vec2 offset;
	private boolean renderBlock;
	private boolean updateBlock;
	
	public BatScreen(boolean isRenderBlock, boolean isUpdateBlock){
		this.renderBlock = isRenderBlock;
		this.updateBlock = isUpdateBlock;
	}
	
	public boolean isRenderBlock(){
		return renderBlock;
	}
	
	public boolean isUpdateBlock(){
		return updateBlock;
	}
	
	public void setOffset(Vec2 offset){
		this.offset = offset;
	}
	
	public abstract boolean absorbedKeyPress();
	public abstract void handleKeyboard();
	public abstract void render(BatDisplay display);
	public abstract void update(float dt);
	
}
