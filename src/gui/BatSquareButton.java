package gui;

import gfx.BatBitmap;

import java.awt.Color;

import math.BatBox;

public class BatSquareButton implements BatButton {
	
	protected BatBitmap image;
	private BatBox bb;
	private String label;
	private boolean hovered, pressed;
	
	public BatSquareButton(int width, int height, String label) {
		hovered = false;
		image = new BatBitmap(width, height);
		image.clear(Color.WHITE.getRGB());
		bb = new BatBox(0, 0, width, height);
		this.label = label;
	}
	
	public BatSquareButton(int width, int height) {
		this(width, height, "");
	}
	
	public void setGraphics(BatBitmap image) {
		this.image = image;
	}
	
	
	@Override
	public void setPosition(int x, int y) {
		bb.setPosition(x, y);
	}
	
	@Override
	public int getX() {
		return bb.getX0();
	}
	@Override
	public int getY() {
		return bb.getY0();
	}
	
	@Override
	public boolean contains(int x, int y) {
		return bb.contains(x, y);
	}
	
	@Override
	public void onPress() {
		
	}
	
	@Override
	public void onRelease() {
		
	}
	
	@Override
	public void onHoverOver() {
		hovered = true;
	}
	
	@Override
	public int getWidth() {
		return bb.getWidth();
	}
	@Override
	public int getHeight() {
		return bb.getHeight();
	}

	@Override
	public BatBitmap getGraphics() {
		return image;
	}

	@Override
	public void update(double dt) {
		if (hovered) {
			image.clear(Color.pink.getRGB());
		} else {
			image.clear(Color.white.getRGB());
		}
		hovered = false;
	}
	
}
