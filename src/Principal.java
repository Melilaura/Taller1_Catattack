import processing.core.PApplet;
import processing.core.PImage;

public class Principal extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PApplet.main("Principal");

	}

	@Override
	public void settings() {
		size(1152, 700);

	}

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
	
	//timer
	
	int s, m,h;

	@Override
	public void setup() {

		// LOAD IMAGES------------------------------------------
		// load images wall
		instructions = loadImage("instrucciones.png");
		menu = loadImage("menu.png");
		resume = loadImage("resume.png");
		game = loadImage("juego.png");


		// VARIABLES----------------------------------------------

		estado = 1;

		// MENU
		// button play
		x1 = 412;
		y1 = 360;
		x2 = 687;
		y2 = 430;

		// button instructions
		x3 = 412;
		y3 = 448;
		x4 = 687;
		y4 = 510;

		// INSTRUCTIONS
		// button return
		x5 = 21;
		y5 = 594;
		x6 = 296;
		y6 = 677;

		// button play
		x7 = 857;
		y7 = 594;
		x8 = 1130;
		y8 = 677;

		// RESUME
		// button menu
		x9 = 842;
		y9 = 570;
		x10 = 1116;
		y10 = 653;

		// button return
		x9 = 452;
		y9 = 570;
		x10 = 726;
		y10 = 653;

		// ------------------------------------------------
		
		//TIMER
		
		s=0;
		m=0;
		h=0;
		
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
			
			//TIMER-----------
			textSize(35);
			
			if(s<=59) {
				s= s+1;
				text(h+" : " +m,750,40);
				
			} else {
				m=m+1;
				s=0;
			//	text(h+" : "+m,757,9);
				
			}if(m<=59) {
			
				
			} else {
				h=h+1;
				m=0;
			//	text(h+" : "+m,757,9);
				
			}				
			
			
			
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
	
	@Override
	public void mouseDragged() {
		
	}

}
