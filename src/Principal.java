import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Principal extends PApplet {

	public static void main(String[] args) {

		PApplet.main("Principal");

	}

	Hero hero;

	private ArrayList<Catswarriors> listaGatos1;
	private ArrayList<Catswarriors> listaGatos2;
	private ArrayList<Catswarriors> listaGatos3;

	// IMAGES
	// wall
	PImage instructions;
	PImage menu;
	PImage resume;
	PImage game;

	// -------------------------------------------------------

	// VARIABLES

	int estado;
	boolean lose;

	// menu buttons

	int x1, y1; // button play
	int x2, y2;

	int x3, y3; // button instructions
	int x4, y4;

	// instructions buttons

	int x5, y5; // button play
	int x6, y6;

	int x7, y7; // button return
	int x8, y8;

	// resume buttons

	int x9, y9; // button again
	int x10, y10;

	int x11, y11; // button menu
	int x12, y12;

	// timer

	int s, m, h;

	// score

	int score;

	public void settings() {
		size(1152, 700);

	}

	public void setup() {

		// LOAD IMAGES------------------------------------------
		// load images wall
		instructions = loadImage("instrucciones.png");
		menu = loadImage("menu.png");
		resume = loadImage("resume.png");
		game = loadImage("juego.png");

		// VARIABLES----------------------------------------------

		estado = 3;
		lose = false;

		// MENU
		// button play
		x1 = 369;
		y1 = 614;
		x2 = 562;
		y2 = 673;

		// button instructions
		x3 = 589;
		y3 = 614;
		x4 = 782;
		y4 = 673;

		// INSTRUCTIONS
		// button return
		x5 = 922;
		y5 = 611;
		x6 = 1115;
		y6 = 671;

		// button play
		x7 = 479;
		y7 = 611;
		x8 = 672;
		y8 = 670;

		// RESUME
		// button menu
		x9 = 481;
		y9 = 620;
		x10 = 1111;
		y10 = 679;

		// button return
		x9 = 481;
		y9 = 620;
		x10 = 674;
		y10 = 679;

		// ------------------------------------------------

		// TIMER

		s = 0;
		m = 0;
		h = 0;

		// ---------------------------------------------------

		hero = new Hero(this);
		// bullet = new Bullet(this,0,0);

		listaGatos1 = new ArrayList<Catswarriors>();
		listaGatos2 = new ArrayList<Catswarriors>();
		listaGatos3 = new ArrayList<Catswarriors>();

		// bullets = new ArrayList <>();

		// --------------------------------------------------

		score = 0;

	}

	public void draw() {

		background(74, 86, 71);

		// menu
		if (estado == 1) {
			imageMode(CENTER);
			image(menu, 576, 350);
			imageMode(CORNER);
			// lose=false;

		}

		if (estado == 2) {
			imageMode(CENTER);
			image(instructions, 576, 350);
			imageMode(CORNER);
			// lose=false;
		}

		if (estado == 3) {
			imageMode(CENTER);
			image(game, 576, 350);
			imageMode(CORNER);

			// TIMER------------------------------------------------------

			textSize(35);

			if (s <= 59) {
				s = s + 1;
				text(h + " : " + m, 935, 42);
			} else {
				m = m + 1;
				s = 0;
			}
			if (m <= 59) {

			} else {
				h = h + 1;
				m = 0;

			}

			// ------------------------------------------------------

			// TIMER------------------------------------------------------

			textSize(35);

			text(score, 127, 42);

			// ------------------------------------------------------

			// HERO

			hero.drawHero(this);
			hero.heroMov(this);

			initWarriors();
			drawWarriors();
			removeWarriors();

			if (lose == true) {

				estado = 4;

			}

		}

		if (estado == 4) {
			imageMode(CENTER);
			image(resume, 576, 350);
			imageMode(CORNER);

			textSize(50);
			text(h + " : " + m, 520, 455);
			noFill();

		}

	}

	public void mousePressed() {
		// BUTTONS MENU
		if (estado == 1) {
			// play
			if (mouseX > x1 && mouseX < x2 && mouseY > y1 && mouseY < y2) {
				estado = 3;
			}
			// instructions
			if (mouseX > x3 && mouseX < x4 && mouseY > y3 && mouseY < y4) {
				estado = 2;
			}
		}
		// BUTTONS INSTRUCTIONS
		if (estado == 2) {
			if (mouseX > x5 && mouseX < x6 && mouseY > y5 && mouseY < y6) {
				estado = 1;
			}

			if (mouseX > x7 && mouseX < x8 && mouseY > y7 && mouseY < y8) {
				estado = 3;
			}
		}

		if (estado == 3) {
			// hero.generateBullet();
			// hero.shootBullet();
			pressedShot();
		}

		// BUTTONS RESUME
		if (estado == 4) {
			if (mouseX > x9 && mouseX < x10 && mouseY > y9 && mouseY < y10) {
				estado = 1;

				exit();

			}

		}

	}

	public void pressedShot() {

		// GATO 1
		if (m<=20) {
			for (int i = 0; i < listaGatos1.size(); i++) {
				if (dist(mouseX, mouseY, listaGatos1.get(i).getPosX() + 70, listaGatos1.get(i).getPosY() + 95) < 40) {

					stroke(77, 133, 69);
					strokeWeight(10);
					line(hero.getPosX() + 65, hero.getPosY() + 93, listaGatos1.get(i).getPosX() + 65, listaGatos1.get(i).getPosY() + 93);

					System.out.println("yas this time :D");
					listaGatos1.remove(i);
					score += 10;
				}

			}

		}

		// GATO 2
		if (m>=21 && m<=50) {
			for (int i = 0; i < listaGatos2.size(); i++) {
				if (dist(mouseX, mouseY, listaGatos2.get(i).getPosX() + 70, listaGatos2.get(i).getPosY() + 95) < 40) {

					stroke(77, 133, 69);
					strokeWeight(10);
					line(hero.getPosX() + 65, hero.getPosY() + 93, listaGatos2.get(i).getPosX() + 65,
							listaGatos2.get(i).getPosY() + 93);

					System.out.println("yas this time :D");
					listaGatos2.remove(i);
					score += 10;
				}

			}

		}

		// GATO 3
		if (h > 1) {
			for (int i = 0; i < listaGatos3.size(); i++) {
				if (dist(mouseX, mouseY, listaGatos3.get(i).getPosX() + 70, listaGatos3.get(i).getPosY() + 95) < 40) {

					stroke(77, 133, 69);
					strokeWeight(10);
					line(hero.getPosX() + 65, hero.getPosY() + 93, listaGatos3.get(i).getPosX() + 65,
							listaGatos3.get(i).getPosY() + 93);

					System.out.println("yas this time :D");
					listaGatos3.remove(i);
					score += 10;
				}

			}

		}

	}

	private void initWarriors() {
		// GATO 1

		if (m<=20) {
			
			frameRate(60);
			if (frameCount == 60) {
				listaGatos1.add(new Catswarriors(this, (int) random(50, 1000), 100));
				frameCount = 0;
			}
		}
		// GATO 2

		if (m>=21 && m<=50) {
			
			frameRate(120);
			if (frameCount == 60) {
				listaGatos2.add(new Catswarriors(this, (int) random(50, 1000), 100));
				frameCount = 0;
			}
		}
		// GATO 3

		if (h > 1) {
			frameRate(60);
			if (frameCount == 60) {
				listaGatos3.add(new Catswarriors(this, (int) random(50, 1000), 100));
				frameCount = 0;
			}
		}
	}

	public void drawWarriors() {

		if (m<=20) {
			for (int i = 0; i < listaGatos1.size(); i++) {
				listaGatos1.get(i).drawcat1(this);
			}
		}

		if (m>=21 && m<=60) {
			for (int i = 0; i < listaGatos2.size(); i++) {
				listaGatos2.get(i).drawcat2(this);
			}
		}

		if (h > 1) {
			for (int i = 0; i < listaGatos3.size(); i++) {
				listaGatos3.get(i).drawcat3(this);
			}
		}
	}

	private void removeWarriors() {

		if (m<=20) {
			for (int i = 0; i < listaGatos1.size(); i++) {

				if (listaGatos1.get(i).getPosY() >= 500) {

					System.out.println(":D");
					lose = true;
					listaGatos1.remove(i);
				}

			}
		}

		if (m>=21 && m<=60) {
			for (int i = 0; i < listaGatos2.size(); i++) {

				if (listaGatos2.get(i).getPosY() >= 500) {

					System.out.println(":D");
					lose = true;
					listaGatos2.remove(i);
				}

			}
		}

		if (h > 1) {
			for (int i = 0; i < listaGatos3.size(); i++) {

				if (listaGatos3.get(i).getPosY() >= 500) {

					System.out.println(":D");
					lose = true;
					listaGatos3.remove(i);
				}

			}
		}
	}

}
