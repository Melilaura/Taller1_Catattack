import processing.core.PApplet;
import processing.core.PImage;

public class Catswarriors {

	private int posX, posY, vida, direccion, velocidad;
	private PApplet app;
	private boolean isMov;

	private PImage cat1;
	private PImage cat2;
	private PImage cat3;

	Catswarriors(PApplet app, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.velocidad = velocidad;
		cat1 = app.loadImage("cat1.png");
		cat2 = app.loadImage("cat2.png");
		cat3 = app.loadImage("cat3.png");
		vida = 1;
		isMov = true;

	}

	public void drawcat1(PApplet app) {

		app.imageMode(app.CENTER);
		app.image(cat1, posX, posY);
		app.imageMode(app.CORNER);

		velocidad = 1;

	}

	public void drawcat2(PApplet app) {

		app.imageMode(app.CENTER);
		app.image(cat2, posX, posY);
		app.imageMode(app.CORNER);

		velocidad = 2;
	}

	public void drawcat3(PApplet app) {

		app.imageMode(app.CENTER);
		app.image(cat3, posX, posY);
		app.imageMode(app.CORNER);

		velocidad = 3;
	}

	public void catmov() {

		

			posY += velocidad;

		

	}

	
}


