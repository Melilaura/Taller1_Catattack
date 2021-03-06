import java.util.Set;

import processing.core.PApplet;
import processing.core.PImage;

public class Hero {

	private int posX, posY;
	private PApplet app;

	public PImage hero;
	public PImage herodead;

	public Hero(PApplet app, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		hero= app.loadImage("hero1.png");
		herodead = app.loadImage("hero2.png");
	}


	public void drawHero(PApplet app) {

		hero.resize(0, 200);
		app.imageMode(app.CENTER);
		app.image(hero, posX, posY);
		app.imageMode(app.CORNER);
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
