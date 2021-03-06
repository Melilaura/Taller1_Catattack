import processing.core.PApplet;
import processing.core.PImage;

public class Bullet {

	private int posX, posY;
	private PApplet app;

	public PImage bullet;
	

	public Bullet (PApplet app, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		
		bullet= app.loadImage("bullet.png");
		
	}


	public void drawBullet(PApplet app) {

		//bullet.resize(0, 200);
		app.imageMode(app.CENTER);
		app.image(bullet, posX, posY);
		app.imageMode(app.CORNER);
	}
	
	public void movBullet(int heroX, int heroY) {

		posY -= 5;

	}

}
