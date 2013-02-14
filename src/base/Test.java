package base;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import screen.*;
import display.*;

public class Test extends BatGame{
	public static void main(String[] argv){
		Test test = new Test();
		JFrame frame = new JFrame("BatTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(test);
		frame.pack();
		frame.setVisible(true);
		test.init();
	}
	
	public static int WIDTH = 800;
	public static int HEIGHT = 600;
	
	BatDisplay display;
	BatScreenManager scrnMan;
	
	public Test() {
		super(60);
		this.setSize(new Dimension(WIDTH,HEIGHT));
 		
		display = new BatDisplay(Test.WIDTH, Test.HEIGHT);
		
		scrnMan = new BatScreenManager();
	}

	@Override
	public void onTick(double dt) {
		update(dt);
		render(dt);
	}
	
	public void update(double dt) {
		scrnMan.update(dt);
	}
	
	public synchronized void render(double dt) {
		BufferStrategy bs = getBufferStrategy();
		if(bs == null){
			createBufferStrategy(3);
			requestFocus();
			return;
		}
		display.clear(0);
		scrnMan.render(display);
		
		Graphics g = bs.getDrawGraphics();
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.drawImage(display.getGraphics(), 0, 0, WIDTH, HEIGHT, null);
		g.setColor(Color.PINK);
		g.drawString("FPS: " + (1000/(int)dt) , 10, 10);
		bs.show();	
	}
}
