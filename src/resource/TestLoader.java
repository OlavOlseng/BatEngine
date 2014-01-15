package resource;

import gfx.BatBitmap;

public class TestLoader extends ArtLoader{
	public static final BatBitmap[][] MUMMY = loadSpriteSheet("../res/enemy_mummy.png",40,40);
	public static final BatBitmap[][] LARD = loadSpriteSheet("../res/lord_lard_sheet.png", 32, 32);
	public static final BatBitmap[][] JUMP = loadSpriteSheet("../res/Jump.png", 96, 96);
	public static final BatBitmap[][] SPLODE = loadSpriteSheet("../res/Explosion2.png", 100, 100);
	public static final BatBitmap BOMB = loadSprite("../res/bomb.png");
	//public static final BatBitmap[][] DUDE = loadSpriteSheet("../res/dude4.png", 32, 32);
}
