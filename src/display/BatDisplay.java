package display;

import gfx.BatBitmap;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import math.Vec2;

public class BatDisplay{
	public static int CLEAR_COLOR = 0; 
	private int height, width;
	protected BufferedImage display;
	protected BatBitmap bmp; 
	
	public BatDisplay(int width, int height) {
		this.width = width;
		this.height = height;
		bmp = new BatBitmap(width, height);
		this.display = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		this.bmp.pixels = ((DataBufferInt)display.getRaster().getDataBuffer()).getData();
	}
	
	public void clear(int color) {
		bmp.clear(color);
	}
	
	public void insert(BatBitmap image, Vec2 position) {
		bmp.insert(image, (int)position.x, (int)position.y);
	}
	
	public void insert(BatBitmap image, Vec2 position, Vec2 offset) {
		bmp.insert(image, (int)(position.x + offset.x), (int)(position.y + offset.y));
	}
	
	public BufferedImage getGraphics() {
		return this.display;
	}
	
	public int[] getPixels(){
		return this.bmp.pixels;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
}
