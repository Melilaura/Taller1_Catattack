import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Bullet {

	int posX;
	int posY;
	int direccion;
	public PImage bullet;
	
	public Bullet (PApplet app, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.direccion=30;
		
		bullet= app.loadImage("bullet.png");
	}

	void drawBullet(PApplet app) {
		
		app.imageMode(app.CENTER);
		app.image(bullet, posX, posY);
		app.imageMode(app.CORNER);
	}
	
 void movBullet( int heroposX, int heroposY) {
	 
		posY -= direccion;
	}
	
	public int getPosX() {
		return posX;
	}
	
public int getPosY() {
	return posY;
}

}
