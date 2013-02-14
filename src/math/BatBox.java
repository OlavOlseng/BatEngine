package math;

public class BatBox {
	
	private int w, h, x0, y0, x1, y1;
	
	public BatBox(int x0, int y0, int w, int h){
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
	
	public boolean contains(int x, int y) {
		return (x <= x1 && x >= x0 && y >= y0 && y <= y1);	
	}

	public boolean contains(BatBox b) {
		boolean b0,b1,b2,b3;
		b0 = this.contains(b.x0, b.y0);
		b1 = this.contains(b.x0, b.y1);
		b2 = this.contains(b.x1, b.y0);
		b3 = this.contains(b.x1, b.y1);
		return (b0 && b1 && b2 && b3);
	}
	
	public boolean intersects(BatBox bb){
		return(!( this.x0 > bb.x1
				|| this.x1 < bb.x0
				|| this.y0 > bb.y1
				|| this.y1 < bb.y0 ));
		
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
	
	public int getX1() {
		return this.x1;
	}
	
	public int getY1() {
		return this.y1;
	}
}
