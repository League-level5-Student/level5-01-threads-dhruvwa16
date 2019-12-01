package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		Robot blue = new Robot(300,300);
		Robot yellow = new Robot(550,550);
		Robot black = new Robot(800,300);
		Robot green = new Robot(1050,550);
		Robot red = new Robot(1300,300);
		robots[0] = blue;
		robots[1] = yellow;
		robots[2] = black;
		robots[3] = green;
		robots[4] = red;
		for (Robot r: robots) {
			r.setSpeed(10);
			r.penDown();
		}
		Thread b = new Thread(new Runnable() {

			@Override
			public void run() {
				blue.setPenColor(Color.blue);

				// TODO Auto-generated method stub
				int n = 120;
				for (int i = 0; i < n; i++) {
					blue.move(10);
					blue.turn(360/n);
				}
				
			}
			
		});
		Thread y = new Thread(new Runnable() {

			@Override
			public void run() {
				yellow.setPenColor(Color.yellow);
				// TODO Auto-generated method stub
				int n = 120;
				for (int i = 0; i < n; i++) {
					yellow.move(10);
					yellow.turn(360/n);
				}
				
			}
			
		});
		Thread bl = new Thread(new Runnable() {

			@Override
			public void run() {
				black.setPenColor(Color.black);
				// TODO Auto-generated method stub
				int n = 120;
				for (int i = 0; i < n; i++) {
					black.move(10);
					black.turn(360/n);
				}
				
			}
			
		});
		Thread g = new Thread(new Runnable() {

			@Override
			public void run() {
				green.setPenColor(Color.green);
				// TODO Auto-generated method stub
				int n = 120;
				for (int i = 0; i < n; i++) {
					green.move(10);
					green.turn(360/n);
				}
				
			}
			
		});
		Thread r = new Thread(new Runnable() {

			@Override
			public void run() {
				red.setPenColor(Color.red);
				// TODO Auto-generated method stub
				int n = 120;
				for (int i = 0; i < n; i++) {
					red.move(10);
					red.turn(360/n);
				}
				
			}
			
		});

		b.start();
		y.start();
		bl.start();
		g.start();
		r.start();
	}
}

