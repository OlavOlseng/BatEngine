package math;

public class BatBox {
	
	private float w, h, x0, y0, x1, y1;
	private Vec2 position, offset;
	
	public BatBox(Vec2 position, float w, float h){
		offset = new Vec2();
		this.position = position;
		this.w = w;
		this.h = h;
		updateBB();
	}
	
	public void setPosition(Vec2 position){
		this.position = position;
		updateBB();
	}
	
	public void setOffset(Vec2 offset){
		this.offset = offset;
		updateBB();
	}
	
	public void setSize(float w, float h){
		this.w = w;
		this.h = h;
		updateBB();
	}
	
	private void updateBB(){
		this.x0 = position.x - offset.x;
		this.x0 = position.y - offset.y;
		this.x1 = x0 + w;
		this.y1 = y0 + h;
	}
	
	public boolean contains(float x, float y) {
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

	public float getWidth() {
		return w;
	}

	public float getHeight() {
		return h;
	}

	public float getX0() {
		return x0;
	}

	public float getY0() {
		return y0;
	}
	
	public float getX1() {
		return this.x1;
	}
	
	public float getY1() {
		return this.y1;
	}
	
	public Vec2 getPosition() {
		return position;
	}
	
	public Vec2 getOffset() {
		return offset;
	}
}
