import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class Bullet {

	private PApplet app;
	public int X, Y, speed;
	public boolean visible;
	private PImage bullet;

	public Bullet(PApplet app, int X, int Y) {
		
		bullet = app.loadImage("./data/bullet.png");
		this.app=app;
		this.X = X;
		this.Y = Y;
		this.speed = 30;
		visible = true;
		
	}

	public void drawBullet() {
		
		if (visible == true) {
			
			app.image(bullet, X, Y,100,100);
		}

	}

	public void moveBullet() {
		
		Y -= speed;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}
	

	
	

}

