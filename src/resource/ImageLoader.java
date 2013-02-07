package resource;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import base.BatGame;
import display.BatBitmap;



public class ImageLoader {
	public static BatBitmap load(String string) {
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
}
