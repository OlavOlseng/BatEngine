package gfx;

import java.util.Arrays;

public class BatBitmap {
	
	public final int width, height;
	public int[] pixels;
	
	
	public BatBitmap(int width, int height){
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	public void clear(int color){
		Arrays.fill(pixels, color);
	}
	
	public void insert(BatBitmap b, int x, int y){
	//Fills this bitmap with b, at (x,y)
		int x0 = x;
		int x1 = x0 + b.width; 
		int y0 = y;
		int y1 = y0 + b.height;
		if(x0 < 0) x0 = 0;
		if(y0 < 0) y0 = 0;
		if(x1 > this.width) x1 = this.width;
		if(y1 > this.height) y1 = this.height;
		
		int fillWidth = x1 - x0;
		int tp, sp;
		
		for(int yy = y0; yy < y1; yy++){
			tp = yy * width + x0;
			sp =(yy - y) * b.width + (x0 - x);
			tp -= sp;
			for(int xx = sp; xx < sp + fillWidth; xx++){
				int color = b.pixels[xx];
				if (color < 0) this.pixels[tp + xx] = color;
			}
		}
	}
	
	public void fill(int x, int y, int bw, int bh, int color){
	//Fills in a colored rectangle of width = bw, heigth = bh	
		int x0 = x;
        int x1 = x + bw;
        int y0 = y;
        int y1 = y + bh;
        if (x0 < 0) x0 = 0;
        if (y0 < 0) y0 = 0;
        if (x1 > this.width) x1 = this.width;
        if (y1 > this.height) y1 = this.height;
        int ww = x1 - x0;

        for (int yy = y0; yy < y1; yy++) {
            int tp = yy * this.width + x0;
            for (int xx = 0; xx < ww; xx++) {
                pixels[tp + xx] = color;
            }
        }
    }
	
	public static BatBitmap clip(BatBitmap bm, int x0, int y0, int x1, int y1) {
		int sw = bm.width;
		int sh = bm.height;
		if(x0 < 0) x0 = 0;
		if(y0 < 0) y0 = 0;
		if(x1 > sw) x1 = sw;
		if(y1 > sh) y1 = sh;
		
		int tw = x1 - x0;
		int th = y1 - y0;
		
		BatBitmap cm = new BatBitmap(tw, th);
		
		for (int yy = y0; yy < y0 + th; yy++) {
			int sp = yy*sw + x0;
			int tp = tw*(yy-y0);
			for (int xx = 0; xx < tw; xx++) {
				int col = bm.pixels[sp + xx];
				cm.pixels[tp + xx] = col;
			}
		}
		return cm;
	}
	
}
