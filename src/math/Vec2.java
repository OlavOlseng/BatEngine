package math;

public class Vec2 {
	
	public float x, y;
	
	public Vec2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public Vec2() {
		this.x = 0;
		this.y = 0;
	}
	
	public void scale(float s) {
		x *= s;
		y *= s;
	}

	public float length() {
		return (float)Math.sqrt(Math.pow(x,2) + Math.pow(x,2));
	}
	
	public void normalize() {
		float len = length();
		x /= len;
		y /= len;
	}

	public void inverse() {
		this.x = -this.x;
		this.y = -this.y;
	}
	
	public Vec2 getNormal() {
		return new Vec2(y, -x);
	}
	
	public static Vec2 add(Vec2 vec1, Vec2 vec2) {
		return new Vec2(vec1.x + vec2.x, vec1.y + vec2.y);
	}
	
	public static Vec2 sub(Vec2 vec1, Vec2 vec2) {
		return new Vec2(vec1.x - vec2.x, vec1.y - vec2.y);
	}
	
	public static float dot( Vec2 vec1, Vec2 vec2) {
		return vec1.x * vec2.x + vec1.y * vec2.y;
	}
	
}
