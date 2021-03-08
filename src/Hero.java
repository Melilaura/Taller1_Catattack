import java.util.ArrayList;
import java.util.Set;
import processing.core.PApplet;
import processing.core.PImage;

public class Hero {

	private PApplet app;
	public int posX, posY, coolDown, d;
	public PImage hero, bullet;
	private ArrayList<Bullet> bullets;

	public Hero(PApplet app) {
		this.app = app;
		this.posX = 576;
		this.posY = 500;
		this.coolDown=0;

		hero = app.loadImage("./data/hero1.png");

		bullets = new ArrayList<>();

	}

	void drawHero(PApplet app) {

		hero.resize(0, 200);
		app.image(hero, posX, posY);

	}

	public void heroMov(PApplet app) {

		posX = app.mouseX;

		if (posX < 0) {
			posX = 20;
		} else if (posX > 1020) {
			posX = 1020;
		}
	}

	public void generateBullet() {
		if (coolDown == 0) {
			Bullet bullet = new Bullet(app, posX, posY);
			bullets.add(bullet);

		}

	}

	public void shootBullet() {

		for (int i = 0; i < bullets.size(); i++) {
			// bullets.get(i).setVisible(true);

			bullets.get(i).drawBullet();
			bullets.get(i).moveBullet();

		}
	}

	public void eliminateBullet() {
		for (int i = 0; i < bullets.size(); i++) {
			if (bullets.get(i).getY() < 0) {
				bullets.remove(i);
			}

		}

	}

	public ArrayList<Bullet> getBullets() {
		return bullets;

	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

}
