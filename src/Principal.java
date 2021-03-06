import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class Principal extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PApplet.main("Principal");

	}

	Hero hero;

	private ArrayList<Catswarriors> listaGatos1;

	Catswarriors kitty;

	// IMAGES
	// wall
	PImage instructions;
	PImage menu;
	PImage resume;
	PImage game;

	// -------------------------------------------------------

	// VARIABLES

	int estado;

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

	@Override
	public void settings() {
		size(1152, 700);

	}

	@Override
	public void setup() {

		// LOAD IMAGES------------------------------------------
		// load images wall
		instructions = loadImage("instrucciones.png");
		menu = loadImage("menu.png");
		resume = loadImage("resume.png");
		game = loadImage("juego.png");

		// VARIABLES----------------------------------------------

		estado = 3;

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

		hero = new Hero(this, 576, 600);
		kitty = new Catswarriors(this, 576, 100);

		listaGatos1 = new ArrayList<Catswarriors>();

		// --------------------------------------------------
		frameRate(20);
		score = 40;

	}

	@Override
	public void draw() {

		background(74, 86, 71);

		// menu
		if (estado == 1) {
			imageMode(CENTER);
			image(menu, 576, 350);
			imageMode(CORNER);
		}

		if (estado == 2) {
			imageMode(CENTER);
			image(instructions, 576, 350);
			imageMode(CORNER);
		}

		if (estado == 3) {
			imageMode(CENTER);
			image(game, 576, 350);
			imageMode(CORNER);

			// TIMER------------------------------------------------------

			textSize(35);

			if (s <= 59) {
				s = s + 1;
				text(h + " : " + m, 935, 40);
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

			// HERO

			hero.drawHero(this);
			kitty.drawcat3(this);
			kitty.catmov();

			initWarriors();
			drawWarriors();

		}

		if (estado == 4) {
			imageMode(CENTER);
			image(resume, 576, 350);
			imageMode(CORNER);
		}

	}

	@Override
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

		// BUTTONS RESUME

		if (estado == 4) {
			if (mouseX > x9 && mouseX < x10 && mouseY > y9 && mouseY < y10) {
				estado = 1;
			}

			if (mouseX > x11 && mouseX < x12 && mouseY > y11 && mouseY < y12) {
				estado = 3;
			}
		}

	}

	public void keyPressed() {
		if (estado == 3) {
			hero.mov(key);
		}
	}

	private void initWarriors() {
		if (frameCount == 40) {
			listaGatos1.add(new Catswarriors(this, (int) random(20, 1140), 100));
			System.out.println(listaGatos1.size());
			frameCount = 0;
		}
	}

	public void drawWarriors() {

		if (score == 0) {
			for (int i = 0; i < listaGatos1.size(); i++) {
				listaGatos1.get(i).drawcat1(this);
				listaGatos1.get(i).catmov();
			}
		}

		if (score == 20) {

			for (int i = 0; i < listaGatos1.size(); i++) {
				listaGatos1.get(i).drawcat2(this);
				listaGatos1.get(i).catmov();

			}

		}

		if (score == 40) {

			for (int i = 0; i < listaGatos1.size(); i++) {
				listaGatos1.get(i).drawcat3(this);
				listaGatos1.get(i).catmov();

			}

		}

	}
}
