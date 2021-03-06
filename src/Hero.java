import java.util.ArrayList;
import java.util.Set;

import processing.core.PApplet;
import processing.core.PImage;

public class Hero {

	private int posX, posY;
	private PApplet app;

	public PImage hero;
	public PImage herodead;

	Bullet bullet;
	
	public ArrayList<Bullet> listaBullet;
	
	

	public Hero(PApplet app, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		hero = app.loadImage("hero1.png");
		herodead = app.loadImage("hero2.png");
		
		listaBullet = new ArrayList<Bullet>();
	}

	public void drawHero(PApplet app) {

		hero.resize(0, 200);
		app.imageMode(app.CENTER);
		app.image(hero, posX, posY);
		app.imageMode(app.CORNER);

		if (bullet != null) {
		for (int i = 0; i < listaBullet.size(); i++) {
			 
				listaBullet.get(i).drawBullet(app);
				listaBullet.get(i).movBullet(posX, posY);

		}
	
	}
	}
	public void heroMov(PApplet app) {

		posX = app.mouseX;

		if (posX < 0) {
			posX = 20;
		}

		if (posX > 1152) {
			posX = 1132;
		}

	}

	void shot(PApplet app) {
		
		listaBullet.add(new Bullet(app, posX, posY));
		bullet = new Bullet(app, posX, posY);
		
	
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
