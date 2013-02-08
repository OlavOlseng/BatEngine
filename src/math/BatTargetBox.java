package math;

public class BatTargetBox {
	int w, h, x0, y0, x1, y1;
	
	public BatTargetBox(int x0, int y0, int w, int h){
		this.x0 = x0;
		this.y0 = y0;
		this.w = w;
		this.h = h;
		updateBB();
	}
	
	public void setPosition(int x0, int y0){
		this.x0 = x0;
		this.y0 = y0;
		updateBB();
	}
	
	public void setSize(int w, int h){
		this.w = w;
		this.h = h;
		updateBB();
	}
	
	private void updateBB(){
		this.x1 = x0 + w;
		this.y1 = y0 + h;
	}
	
	public boolean contains(int x, int y){
		return (x < x1 && x > x0 && y > y0 && y < y1);	
	}
	
	public int[] getBB(){
		int[] a = {x0, y0, w, h}; 
		return a;
	}

	public int getWidth() {
		return w;
	}

	public int getHeight() {
		return h;
	}

	public int getX0() {
		return x0;
	}

	public int getY0() {
		return y0;
	}
}
