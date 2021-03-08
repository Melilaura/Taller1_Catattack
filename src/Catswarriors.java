import java.util.Iterator;

import processing.core.PApplet;
import processing.core.PImage;

public class Catswarriors {

	public int posX, posY, vida, direccion, velocidad;
	private PImage cat1;
	private PImage cat2;
	private PImage cat3;

	Catswarriors(PApplet app, int posX, int posY) {

		this.posX = posX;
		this.posY = posY;
		this.direccion = 1;
		this.velocidad = velocidad;
		cat1 = app.loadImage("cat1.png");
		cat2 = app.loadImage("cat2.png");
		cat3 = app.loadImage("cat3.png");
		vida = 3;

	}

	public void drawcat1(PApplet app) {

		if (vida == 3) {

			// app.imageMode(app.CENTER);
			app.image(cat1, posX, posY);
			// app.imageMode(app.CORNER);
			catmov1();
		}

	}

	public void drawcat2(PApplet app) {

		if (vida == 3) {

			// app.imageMode(app.CENTER);
			app.image(cat2, posX, posY);
			// app.imageMode(app.CORNER);
			catmov1();
		}
	}

	public void drawcat3(PApplet app) {

		if (vida == 3) {

			// app.imageMode(app.CENTER);
			app.image(cat3, posX, posY);
			// app.imageMode(app.CORNER);
			catmov1();
		}

	}

	public void catmov1() {

		velocidad = 1;
		posY += velocidad;
		
	}

	public void catmov2() {

		velocidad = 3;
		posY += velocidad;
	}

	public void catmov3() {

		velocidad = 5;
		posY += velocidad;

	}
	

	
	
	
	

	public int getPosY() {
		return posY;
	}
	
	public int getPosX() {
		return posX;
	}

	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	

}
