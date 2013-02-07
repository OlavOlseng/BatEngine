package resource;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import base.BatGame;
import display.BatBitmap;

public class ImageLoader {
	
	protected static BatBitmap loadSprite(String string) {
        try {
            BufferedImage bi = ImageIO.read(BatGame.class.getResource(string));

            int w = bi.getWidth();
            int h = bi.getHeight();

            BatBitmap result = new BatBitmap(w, h);
            bi.getRGB(0, 0, w, h, result.pixels, 0, w);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
	
	protected static BatBitmap[][] loadSpriteSheet(String string, int spriteWidth, int spriteHeight) {
		return loadSpriteSheet(string, spriteWidth, spriteHeight, 0, 0);
	}
	protected static BatBitmap[][] loadSpriteSheet(String string, int spriteWidth, int spriteHeight, int bx, int by) {
        try {
            BufferedImage bi = ImageIO.read(BatGame.class.getResource(string));

            int xTiles = (bi.getWidth() - bx) / spriteWidth;
            int yTiles = (bi.getHeight() - by) / spriteHeight;

            BatBitmap[][] result = new BatBitmap[xTiles][yTiles];

            for (int x = 0; x < xTiles; x++) {
                for (int y = 0; y < yTiles; y++) {
                    result[x][y] = new BatBitmap(spriteWidth, spriteHeight);
                    bi.getRGB(bx + x * spriteWidth, by + y * spriteHeight, spriteWidth, spriteHeight, result[x][y].pixels, 0, spriteWidth);
                }
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
