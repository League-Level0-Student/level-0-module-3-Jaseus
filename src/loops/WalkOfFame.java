
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import javax.swing.text.html.MinimalHTMLWriter;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.miniaturize();
		rob.setSpeed(50);
		rob.setAngle(90);
		rob.setX(50);
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		
		
		while (true) {
			rob.penDown();
		
		// 2. Make the robot draw a star shape. Hint: 144.
		for (int j = 0; j < 5; j++) {
			rob.turn(144);
			rob.move(30);
		}
		rob.penUp();
		rob.setAngle(90);
		rob.move(50);
		}
		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
