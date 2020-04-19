package ufogame;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import view.GameFrameWork;
import view.IKeyboardListener;
import view.ITickableListener;
import view.Message;

public class Game implements ITickableListener, IKeyboardListener {

	// Idea: we want to have multiple instances of an ufo and of a projectile
	private ArrayList<Projectile> projectiles = new ArrayList<>();
	private ArrayList<Ufo> ufos = new ArrayList<>();
	// private Ufo [] ufos = new Ufo[10];
	// private Projectile [] projectiles = new Projectile[30];
	private Ship ship;
	private int screenWidth = 1000;
	private int screenHeight = 700;
	private GameFrameWork frameWork = new GameFrameWork();
	private int score = 0;
	private Message scoreBox = new Message("Score:" + score, 750, 620, 35, new Color(0, 255, 200));
	private Message gameEnd = new Message("Level 1", 370, 620, 40, new Color(255, 0, 0));

	/**
	 * Initiates everything for the game. Multiple ufos and a ship are created.
	 */
	public void init() {
		frameWork.setSize(screenWidth, screenHeight);
		frameWork.setBackground(new Background("01Vorlesung/assets/Valley.png"));

		frameWork.addMessage(scoreBox);
		frameWork.addMessage(gameEnd);

		ship = new Ship(2 * screenWidth / 5, 4 * screenHeight / 6, screenWidth / 8, screenWidth / 8,
				"01Vorlesung/assets/N.png");
		frameWork.addGameObject(ship);

		Ufo ufo = new Ufo(-20, screenHeight / 5, screenWidth / 11, screenWidth / 11, 6,
				"01Vorlesung/assets/Sasukee.png");
		ufos.add(ufo);
		frameWork.addGameObject(ufo);

		for (int i = 1; i < 15; i++) {
			ufos.add(new Ufo(ufos.get(i - 1).getX() - 250, ufos.get(0).getY(), ufos.get(0).getWidth(),
					ufos.get(0).getHeight(), ufos.get(0).getSpeed(), ufos.get(0).getImagePath()));
			frameWork.addGameObject(ufos.get(i));
		}
		frameWork.addTick(this);
		frameWork.addIKeyInput(this);

	}

	public void shoot() {
		// create a projectile
		Projectile projectile = new Projectile(ship.getX(), ship.getY(), 2 * ship.getWidth() / 3,
				2 * ship.getWidth() / 3, 15, "01Vorlesung/assets/Rasengan2.jpg");
		projectiles.add(projectile);
		frameWork.addGameObject(projectile);

//		for(int i = 0; i < 1000; i++) {
//			projectiles.add(projectile);
//		}
//		
//		for(Projectile p : projectiles) {
//			System.out.println(p.getImagePath());
//		}
		// Variante Array
		// projectiles[0] = projectile;

		// projectiles.get(0).getWidth();
		// Variante Array
		// projectiles[0].getWidth();

		// projectiles.size();
		// Variante Array
		// projectiles.lenght
	}

	// Aufgabe 2 (MEIN FELHER)
//		public boolean checkCollision(Ufo ufo, Projectile p) {
//			
//			for(int j=0; j < ufos.size(); j++) {
//				for(int i=0; i < projectiles.size(); i++) {	
//						if(ufos.get(j).getX() < (projectiles.get(i).getX() + projectiles.get(i).getWidth())&&
//				(ufos.get(j).getY() < (projectiles.get(i).getY() + projectiles.get(i).getHeight()))&&
//				((ufos.get(j).getX() + ufos.get(j).getWidth()) > (projectiles.get(i).getX()))&&
//				((ufos.get(j).getY() + ufos.get(j).getHeight()) > (projectiles.get(i).getY()))
//				){
//							frameWork.removeGameObject(ufos.get(j));
//							ufos.remove(j); 
//							frameWork.removeGameObject(projectiles.get(i));
//							projectiles.remove(i);
//							return true;
//						}
//						
//					}
//				
//				} 
//			return false;
//		}

	// Aufgabe 2
	public boolean checkCollided(Ufo ufo, Projectile projectile) {

		if (ufo.getX() < (projectile.getX() + projectile.getWidth())
				&& (ufo.getY() < (projectile.getY() + projectile.getHeight()))
				&& ((ufo.getX() + ufo.getWidth()) > (projectile.getX()))
				&& ((ufo.getY() + ufo.getHeight()) > (projectile.getY()))) {

			return true;
		}

		return false;
	}

//MEIN FEHLER
//	@Override
//	public void tick(long elapsedTime) {
//		//GameLoop
//		
//		
//		for(Ufo ufo : ufos) {
//			
//			ufo.move();
//		}
//			if(ufos.get(0).getX() > screenWidth) {
//				frameWork.removeGameObject(ufos.get(0));
//				ufos.remove(0);
//				ufos.add(new Ufo(ufos.get(ufos.size()-1).getX() - 200, ufos.get(0).getY(), ufos.get(0).getWidth(), 
//                    ufos.get(0).getHeight(), ufos.get(0).getSpeed(), ufos.get(0).getImagePath()));
//				
//				frameWork.addGameObject(ufos.get(ufos.size()-1));
//			}
//			for(Projectile p : projectiles) {
//				p.move();
//			}
//			for(Ufo ufo : ufos) {
//				for(Projectile p: projectiles) {
//					if(checkCollision(ufo, p)==true) {
//						ufo.setCollided(true);
//						p.setCollided(true);	
//					}
//				}
//			}
//			
//			for(Projectile p : projectiles) {
//				if(p.isCollided()) {
//					p.setCollided(false);
//					frameWork.removeGameObject(p);
//				
//				}
//			}
//			for(Ufo ufo : ufos) {
//				if(ufo.isCollided()) {
//					ufo.setCollided(false);
//					frameWork.removeGameObject(ufo);
//					
//				}
//				
//			}
//			for(Projectile p : projectiles) {
//				if(p.isCollided()==true) {
//					frameWork.removeGameObject(p);
//				
//				}
//			}
//			for(Ufo ufo : ufos) {
//				if(ufo.isCollided()==true) {
//					frameWork.removeGameObject(ufo);
//					
//				}
//				
//			}
//		
//			private void checkCollision() {

//Aufgabe 3
	private void checkCollision() {
		for (Ufo ufo : ufos) {
			for (Projectile p : projectiles) {
				if (checkCollided (ufo, p)) {
					frameWork.removeGameObject(ufo);
					ufos.remove(ufo);
					frameWork.removeGameObject(p);
					projectiles.remove(p);
					score += 1;
					ufos.add(new Ufo(ufos.get(ufos.size() - 1).getX() - 200, ufos.get(0).getY(), ufos.get(0).getWidth(),
							ufos.get(0).getHeight(), ufos.get(0).getSpeed(), ufos.get(0).getImagePath()));

					frameWork.addGameObject(ufos.get(ufos.size() - 1));
					scoreBox.setMessage("Score:" + score);
					frameWork.addMessage(scoreBox);
					int level1 =15;
					if (score == level1) {
						gameEnd.setMessage("Level 1 geschafft!");

					}

					return; // wenn man was aus der for schleife nimmt, dann musss return
				}
			}
		}

	}

	@Override
	public void tick(long elapsedTime) {
		// GameLoop

		for (Ufo ufo : ufos) {

			ufo.move();
		}
		if (ufos.get(0).getX() > screenWidth) {
			frameWork.removeGameObject(ufos.get(0));
			ufos.remove(0);
			ufos.add(new Ufo(ufos.get(ufos.size() - 1).getX() - 200, ufos.get(0).getY(), ufos.get(0).getWidth(),
					ufos.get(0).getHeight(), ufos.get(0).getSpeed(), ufos.get(0).getImagePath()));

			frameWork.addGameObject(ufos.get(ufos.size() - 1));
		}
		for (Projectile p : projectiles) {
			p.move();
		}
		checkCollision();

		// Aufgabe 1
		if(!projectiles.isEmpty()) {
			if (projectiles.get(0).getY() < 0) {
				frameWork.removeGameObject(projectiles.get(0));
				projectiles.remove(0); // Objekt aus ArrayList entfernen bei Index 0

			}
		}
	}

	@Override
	public int[] getKeys() {
		int[] keys = { KeyEvent.VK_SPACE };
		return keys;
	}

	@Override
	public void keyDown(int key) {
		shoot();

	}
}
