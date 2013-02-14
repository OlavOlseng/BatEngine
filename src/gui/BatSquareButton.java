package gui;

import java.awt.Color;

import display.BatBitmap;
import math.BatBox;

public class BatSquareButton implements BatButton {
	
	protected BatBitmap image;
	private BatBox bb;
	private String label;
	
	public BatSquareButton(int width, int height, String label) {
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
		System.out.println("getting hovered");
		image.clear(Color.PINK.getRGB());
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
	
}
