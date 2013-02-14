package gui;

import display.BatBitmap;

public interface BatComponent {
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public boolean contains(int x, int y);
	public BatBitmap getGraphics();
}
