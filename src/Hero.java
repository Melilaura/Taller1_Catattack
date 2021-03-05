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
		//this.app = app;

	}


	public void drawHero( PApplet app ) {

		hero.resize (0,200);
		app.imageMode(app.CENTER);
		app.image(hero, posX, posY);
		app.imageMode(app.CORNER);
	}
	
	public void mov (int key) {

		if (key == 'a') {
			posX -= 5;
			System.out.println("a, "+posX);

		}else if (key == 'd') {
			posX += 5;
			System.out.println("d "+ posX);

		}

	}




}
