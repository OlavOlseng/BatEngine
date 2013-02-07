package screen;

import java.util.LinkedList;

import display.BatDisplay;

public class BatScreenManager {
	
	LinkedList<BatScreen> scrns;
	LinkedList<BatScreen> toRender;
	LinkedList<BatScreen> toUpdate;
	
	public BatScreenManager(){
		scrns = new LinkedList<BatScreen>();
		toRender = new LinkedList<BatScreen>();
		toUpdate= new LinkedList<BatScreen>();
	}
	
	public void pushScreen(BatScreen scrn){
		scrns.push(scrn);
		setToRender();
		setToUpdate();
	}
	
	public BatScreen popScreen(){
		if(scrns.isEmpty())
			return null;
		BatScreen scrn = scrns.pop();
		setToRender();
		setToUpdate();
		return scrn;
	}
	
	private void setToRender(){
		toRender.clear();
		for (BatScreen scrn : scrns) {
			toRender.push(scrn);
			if(scrn.isRenderBlock()){
				return;
			}
		}
	}
	
	private void setToUpdate(){
		toUpdate.clear();
		for (BatScreen scrn : scrns) {
			toUpdate.push(scrn);
			if(scrn.isUpdateBlock()){
				return;
			}
		}
	}
	
	public void render(BatDisplay display){
		for (BatScreen scrn : toRender) {
			scrn.render(display);
		}
	}

	public void update(double dt){
		for (BatScreen scrn : toUpdate) {
			scrn.update(dt);
		}
	}
	
	public void handleKeyPress(){
		for (BatScreen scrn : toRender) {
			if(scrn.handleKeyboard())
				return;
		}
	}
	
	public void handleMousePress(){
		for (BatScreen scrn : toRender) {
			if(scrn.handleMouse())
				return;
		}
	}
}
