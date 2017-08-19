import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(10);

		// 3. Put the robot's pen down
		r2d2.penDown();
		// 6. Make the robot move as fast as possible
		r2d2.setSpeed(10);
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4; i++) {
			r2d2.setRandomPenColor();
			r2d2.setPenWidth(10);
			// 2. Move your robot 200 pixels
			r2d2.move(200);
			// 4. Turn the robot 90 degrees to the right (90 degrees)
			r2d2.turn(90);
		}

		r2d2.move(200);
		r2d2.turn(45);
		r2d2.move(150);
		r2d2.turn(90);
		r2d2.move(150);
		r2d2.sparkle();

	}
}