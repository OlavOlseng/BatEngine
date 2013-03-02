package screen;

import display.BatDisplay;

public abstract class BatScreen {
	
	protected int xOffset, yOffset;
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
	
	public void setOffset(int xOff, int yOff){
		xOffset = xOff;
		yOffset = yOff;
	}
	
	public abstract boolean absorbedKeyPress();
	public abstract void handleKeyboard();
	public abstract void render(BatDisplay display);
	public abstract void update(float dt);
	
}
