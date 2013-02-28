package asteroids;

import java.awt.Image;
import java.awt.event.KeyEvent;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Ship {
  

	//Position and movement data
	private int dx;
	private int dy;
	private int x;
	private int y;
	private Image shipImage;
	
	private ArrayList missiles;
	
	private final int SHIP_WIDTH = 137;
	private final int SHIP_HEIGHT = 40;
	
	//Image and starting position of ship
	public Ship(){
		//Image for the ship
		ImageIcon ii = new ImageIcon("enterprise.jpg");
		shipImage = ii.getImage();
		missiles = new ArrayList();
		//Initial position
		x = 50;
		y = 300;
	}
	
	public void move(){
		//Left physical boundary
		if (x < 0) x = x + 1;
		//Right physical boundary: Horizontal length - Ship image length
		if (x > (800-SHIP_WIDTH)) x = x - 1;
		//Top physical boundary
		if (y < 0) y = y + 1;
		//Bottom physical boundary: Vertical length - (approx. ship image height)
		if (y > (800-(SHIP_HEIGHT*2))) y = y - 1;
		x += dx;
		y += dy;
	}
	public int getX(){ 				//x is private; outside classes call x through this. 
		return x;
	}
	public int getY(){
		return y;
	}
	public Image getImage(){
		return shipImage;
	}
	public ArrayList getMissiles(){
		return missiles;
	}
	//Key movements - actions on press
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){
			dx = -1;
		}
		if(key == KeyEvent.VK_RIGHT){
			dx = 1;
		}
		if(key == KeyEvent.VK_UP){
			dy = -1;
		}
		if(key == KeyEvent.VK_DOWN){
			dy = 1;
		}
		if(key == KeyEvent.VK_SPACE){
			fire();
		}
	}
	//Firing of missile
	public void fire(){
		missiles.add(new Missile(x + SHIP_WIDTH, y + (SHIP_HEIGHT/2)));
	}
	//Key movements - actions on release
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){
			dx = 0;
		}
		if(key == KeyEvent.VK_RIGHT){
			dx = 0;
		}
		if(key == KeyEvent.VK_UP){
			dy = 0;
		}
		if(key == KeyEvent.VK_DOWN){
			dy = 0;
		}
	}
	
}
