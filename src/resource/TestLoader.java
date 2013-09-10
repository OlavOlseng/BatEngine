package resource;

import gfx.BatBitmap;

public class TestLoader extends ArtLoader{
	public static final BatBitmap[][] MUMMY = loadSpriteSheet("/enemy_mummy.png",40,40);
	public static final BatBitmap[][] LARD = loadSpriteSheet("/lord_lard_sheet.png", 32, 32);
	public static final BatBitmap[][] JUMP = loadSpriteSheet("/Jump.png", 96, 96);
	public static final BatBitmap[][] SPLODE = loadSpriteSheet("/Explosion2.png", 100, 100);
	public static final BatBitmap BOMB = loadSprite("/bomb.png");
	public static final BatBitmap[][] DUDE = loadSpriteSheet("/dude4.png", 32, 32);
}
