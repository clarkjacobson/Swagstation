package asteroids;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.ImageIcon;

public class Board extends JPanel implements ActionListener {
  
	private Timer timer;
	private Ship ship;
	
	public Board(){
		
		// Properties of the board
		addKeyListener(new TAdapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		setDoubleBuffered(true);
		
		ship = new Ship();
		
		timer = new Timer(5, this); // reacts every 5 m.s.
		timer.start();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		//Draws state of ship
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(ship.getImage(), ship.getX(),ship.getY(),this);
		//Draws state of missiles
		ArrayList ms = ship.getMissiles();
		for (int i = 0; i < ms.size(); i++){
			Missile m = (Missile) ms.get(i);
			g2d.drawImage(m.getImage(), m.getX(), m.getY(), this);
		}
		
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
	}
	
	public void actionPerformed(ActionEvent e){
		//Missiles are removed if out of bounds
		ArrayList ms = ship.getMissiles();
		for (int i = 0; i < ms.size(); i++){
			Missile m = (Missile) ms.get(i);
			if (m.isVisible()) m.move();
			else ms.remove(i);
		}
		ship.move();
		repaint();
	}
	// Relay actions on board to actions for ship
	private class TAdapter extends KeyAdapter {
		public void keyReleased(KeyEvent e){
			ship.keyReleased(e);
		}
		public void keyPressed(KeyEvent e){
			ship.keyPressed(e);
		}
	}
	
}
