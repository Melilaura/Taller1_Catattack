import processing.core.PApplet;
import processing.core.PImage;

public class Catswarriors {
	
	private int posX, posY, x, y, vida, direccion;
	private PApplet app;
	private boolean isMov;
	
	private PImage cat1;
	private PImage cat2;
	private PImage cat3;
	
	
	Catswarriors () {
		this.posX = posX;
		this.posY = posY;
		vida = 1;
		isMov = true;

	}
	
	
public void drawcat1() {
	
	app.imageMode(app.CENTER);
	app.image(cat1, posX, posY);
	app.imageMode(app.CORNER);
}

public void drawcat2 () {
	
	app.imageMode(app.CENTER);
	app.image(cat2, posX, posY);
	app.imageMode(app.CORNER);
}

public void drawcat3() {
	
	app.imageMode(app.CENTER);
	app.image(cat3, posX, posY);
	app.imageMode(app.CORNER);
}
	
public void catmov() {

	if (isMov) {

		posY += 2 * direccion;

		if (posY >= 700 ) {

			direccion = -direccion;
			System.out.println("bum");

		}

	}

}
	
	
	
	
	
}
