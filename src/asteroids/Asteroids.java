package asteroids;

import javax.swing.JFrame;


//This is the main class that implements everything else
public class Asteroids extends JFrame{
  public Asteroids(){
		
		add(new Board());
		//Settings for game screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		setLocationRelativeTo(null); //Where on the screen the game starts; null = center
		setTitle("SUPER MEGA ASTEROIDS");
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args){
		new Asteroids();
	}
}
