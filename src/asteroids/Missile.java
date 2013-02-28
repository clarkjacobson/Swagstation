package asteroids;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Missile {
  
	private int x, y;
	private Image image;
	boolean visible;
	//Set numbers for board size and missile speed
	private final int BOARD_WIDTH = 800;
	private final int MISSILE_SPEED = 2;
	
	public Missile(int x, int y){
		
		ImageIcon ii = new ImageIcon("missile.jpg");
		image = ii.getImage();
		visible = true;
		this.x = x;
		this.y = y;
	}
	
	public Image getImage(){
		return image;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	//Tracks if missile is out of bounds
	public boolean isVisible(){
		return visible;
	}
	//Constant horizontal movement; out of bounds if past board
	public void move(){
		x += MISSILE_SPEED;
		if (x > BOARD_WIDTH) visible = false;
	}

}
