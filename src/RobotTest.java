import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * Author : Raghul Karthik
 */

public class RobotTest {
	
	@Test
	void testRobotController() {
		// test initilization of constructor
		RobotController robot = new RobotController(0, 0, 0, 0);
		assertEquals(robot.getCoordinateX(), 0);
		assertEquals(robot.getCoordinateY(), 0);
		assertEquals(robot.getPresentDirection(), 0);
		assertEquals(robot.getUnitFrominitialPosition(), 0);
	}
	
	@Test
	void testValidation() {
		String[] userCommand1 = { "k6", "w2" }; // invalid Commands
		String[] userCommand2 = { "f1", "b2", "l1", "l1", "b1", "f4" }; // valid user input
		String[] userCommand3 = { "f9", "j5" }; // invalid Commands
		String[] userCommand4 = { "s1", "s-2" }; // invalid Commands
		String[] userCommand5 = { "q1", "22" }; // invalid Commands
		boolean IsValidCommand1 = Robot.Validation(userCommand1);
		boolean IsValidCommand2 = Robot.Validation(userCommand2);
		boolean IsValidCommand3 = Robot.Validation(userCommand3);
		boolean IsValidCommand4 = Robot.Validation(userCommand4);
		boolean IsValidCommand5 = Robot.Validation(userCommand5);
		assertEquals(false, IsValidCommand1);
		assertEquals(true, IsValidCommand2);
		assertEquals(false, IsValidCommand3);
		assertEquals(false, IsValidCommand4);
		assertEquals(false, IsValidCommand5);
	}
	@Test
	void testRobotApplication() {
		// initialize the constructor
		RobotController robotController = new RobotController(0, 0, 0, 0);
		String[] testArray = { "f1", "r1", "b2", "l1", "b3"};
		boolean testCommandValid = Robot.Validation(testArray);
		assertEquals(true, testCommandValid);
		Robot.robotMove(testArray, robotController);
		// Test for valid input for coorinates, direction and minimum distance from the initial position.
		assertEquals(robotController.getCoordinateX(), -2);
		assertEquals(robotController.getCoordinateY(), -2);
		assertEquals(robotController.getUnitFrominitialPosition(), 4);
		assertEquals(robotController.getPresentDirection(), 0);
	}

}
