package display;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class BatDisplay extends BatBitmap {
	public static int CLEAR_COLOR = 0; 
	
	protected BufferedImage display;
	
	public BatDisplay(int width, int height) {
		super(width, height);
		this.display = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		this.pixels = ((DataBufferInt)display.getRaster().getDataBuffer()).getData();
	}
	
	@Override
	public void insert(BatBitmap b, int x, int y){
		super.insert(b, x, y);
	}
	
	public void insert(BatBitmap b, double x, double y){
		super.insert(b, (int)x, (int)y);
	}
	
	@Override
	public void fill(int x, int y, int bw, int bh, int color){
		super.fill(x, y, bw, bh, color);
	}
	
	public BufferedImage getGraphics() {
		return this.display;
	}
	
	public int[] getPixels(){
		return this.pixels;
	}
}
