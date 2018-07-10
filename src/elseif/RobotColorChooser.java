//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Mettaton = new Robot("mini");
		Mettaton.penDown();
		Mettaton.setSpeed(10);
		Mettaton.setPenWidth(15);
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < i+1; i++) {
		String color = JOptionPane.showInputDialog("What color out of 'ROYGBIV' would you like the robot to draw with?");
		if(color.equalsIgnoreCase("red")) {
			Mettaton.setPenColor(Color.red);
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
		}else if(color.equalsIgnoreCase("orange")) {
			Mettaton.setPenColor(Color.orange);
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
		}else if(color.equalsIgnoreCase("yellow")) {
			Mettaton.setPenColor(Color.yellow);
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
		}else if(color.equalsIgnoreCase("green")) {
			Mettaton.setPenColor(Color.green);
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
		}else if(color.equalsIgnoreCase("blue")) {
			Mettaton.setPenColor(Color.blue);
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
		}else if(color.equalsIgnoreCase("indigo")) {
			Mettaton.setPenColor(new Color(148,87,235));
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
		}else if(color.equalsIgnoreCase("violet")) {
			Mettaton.setPenColor(new Color(238,130,238));
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
		}else {
			Mettaton.setRandomPenColor();
			
			for (int u = 0; u < 4; u++) {
				Mettaton.move(100);
				Mettaton.turn(90);
			}
			}
		}
		}
		}
		//5. Use an if/else statement to set the pen color that the user requested
		
	

		
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		

