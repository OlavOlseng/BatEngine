package resource;

import display.BatBitmap;

public class TestLoader extends ImageLoader{
	public static final BatBitmap LOLCAT= loadSprite("/LOLCAT.png");
	public static final BatBitmap[][] MUMMY = loadSpriteSheet("/enemy_mummy.png",40,40);
	public static final BatBitmap[][] LARD = loadSpriteSheet("/lord_lard_sheet.png", 32, 32);
}
