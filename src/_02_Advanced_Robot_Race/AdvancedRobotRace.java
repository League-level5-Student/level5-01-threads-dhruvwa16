package _02_Advanced_Robot_Race;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		Robot blue = new Robot(300,800);
		Robot yellow = new Robot(550,800);
		Robot black = new Robot(800,800);
		Robot green = new Robot(1050,800);
		Robot red = new Robot(1300,800);
		robots[0] = blue;
		robots[1] = yellow;
		robots[2] = black;
		robots[3] = green;
		robots[4] = red;
		int speed = 10;
		for (int i = 0; i < robots.length; i++) {
			robots[i].setSpeed(speed);
			speed--;
		}
		
		Thread b = new Thread(()->blue.move(4000));
		Thread y = new Thread(()->yellow.move(4000));
		Thread bl = new Thread(()->black.move(4000));
		Thread g = new Thread(()->green.move(4000));
		Thread r = new Thread(()->red.move(4000));


		b.start();
		y.start();
		bl.start();
		g.start();
		r.start();
		
	
		
	}
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
}
