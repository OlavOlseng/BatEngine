package screen;

import display.BatDisplay;

public abstract class BatScreen {
	
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
	
	public abstract boolean handleKeyboard();
	public abstract boolean handleMouse();
	public abstract void render(BatDisplay display);
	public abstract void update(double dt);
	
}
