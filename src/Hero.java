import processing.core.PApplet;
import processing.core.PImage;

public class Hero {

	private int posX, posY;
	private PApplet app;

	public PImage hero;
	public PImage herodead;

	public Hero(PApplet app) {
		this.posX = 576;
		this.posY = 350;
		hero= app.loadImage("hero1.png");
		herodead = app.loadImage("hero2.png");
		this.app = app;

	}

	
	public void movHero(int tecla) {

		if (tecla == 'a') {
			posX -= 5;

		}
		if (tecla == 'd') {
			posY += 5;

		}

	}
	
	public void drawHero(PApplet app, int posX, int posY ) {

		app.imageMode(app.CENTER);
		app.image(hero, posX, posY);
		app.imageMode(app.CORNER);
	}

	public void drawHerodead(PApplet app) {

		app.imageMode(app.CENTER);
		app.image(herodead, posX, posY);
		app.imageMode(app.CORNER);
	}



}
