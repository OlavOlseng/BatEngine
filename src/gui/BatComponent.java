package gui;

import gfx.BatBitmap;

public interface BatComponent {
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public boolean contains(int x, int y);
	public void update(double dt);
	public BatBitmap getGraphics();
}
