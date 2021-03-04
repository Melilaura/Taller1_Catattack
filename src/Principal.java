import processing.core.PApplet;
import processing.core.PImage;

public class Principal extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PApplet.main("Principal");		
			
	}
	
	@Override
	public void settings() {
	 size(1152, 700);
	 
	}
	
	// wall
	PImage instructions;
	PImage menu;
	PImage resume;
	PImage game;
	
	// characters
	// hero
	PImage hero;
	PImage herodead;
	
	// cats
	
	PImage cat1;
	PImage cat1dead;
	
	PImage cat2;
	PImage cat2dead;
	
	PImage cat3;
	PImage cat3dead;
	
	// bullet
	
	PImage bullet;
	
	
	//botones
	
	



	@Override
	public void setup() {
		
		// load images wall
		instructions = loadImage("instrucciones.png");
		menu = loadImage("menu.png");
		resume = loadImage("resume.png");
		game = loadImage("juego.png");
		
		// load images characters
		// hero
		hero= loadImage("hero1.png");
		herodead= loadImage("hero2.png");
		
		// load images cats
		
		cat1 = loadImage("cat1.png");
		cat1dead = loadImage("cat1b.png");
		
		cat2 = loadImage("cat2.png");
		cat2dead = loadImage("cat2b.png");
		
		cat3 = loadImage("cat3.png");
		cat3dead = loadImage("cat3b.png");
		
		// load image bullet
		
		bullet = loadImage("bullet.png") ;
	}
	
	
	@Override
	public void draw() {
		
		background(74, 86, 71);
		
		//imageMode(CENTER);
		//image(menu, 576, 350);
		//imageMode(CORNER); 
		
		//imageMode(CENTER);
		//image(instructions, 576, 350);
		//imageMode(CORNER);
		
		
		
		//imageMode(CENTER);
		//image(game, 576, 350);
		//imageMode(CORNER);
		
		
		imageMode(CENTER);
		image(resume, 576, 350);
		imageMode(CORNER);
		
	}
	
	

}
