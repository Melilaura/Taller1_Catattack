import processing.core.PApplet;
import processing.core.PImage;

public class Hero {
	
	private int posX, posY;
	private PApplet app;
	
	private PImage hero;
	private PImage herodead;

	public Hero(int posX, int posY, int tamX, int tamY, PApplet app) {
		this.posX = posX;
		this.posY = posY;

		hero = app.loadImage("hero1.png");
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

	void drawHero(PApplet app) {
		
		app.imageMode(app.CENTER);
		app.image(hero, 576, 350);
		app.imageMode(app.CORNER);
		
		
		

	}

}
