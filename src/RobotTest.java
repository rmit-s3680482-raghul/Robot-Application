import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/*
 * Author : Raghul Karthik
 */

public class RobotTest {
	
	@Test
	void testRobotController() {
		RobotController robot = new RobotController(0, 0, 0, 0);
		assertEquals(robot.getCoordinateX(), 0);
		assertEquals(robot.getCoordinateY(), 0);
		assertEquals(robot.getPresentDirection(), 0);
		assertEquals(robot.getUnitFrominitialPosition(), 0);
	}
	
	@Test
	void testValidation() {
		String[] userCommand1 = { "k6", "w2" }; 
		String[] userCommand2 = { "f1", "b2", "l1", "l1", "b1", "f4" }; 
		String[] userCommand3 = { "f9", "j5" }; 
		String[] userCommand4 = { "s1", "s-2" };
		String[] userCommand5 = { "q1", "22" }; 
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
		RobotController robotController = new RobotController(0, 0, 0, 0);
		String[] testArray = { "F1", "R1", "B2", "L1", "B3"};
		boolean testCommandValid = Robot.Validation(testArray);
		assertEquals(true, testCommandValid);
		Robot.robotMove(testArray, robotController);
		assertEquals(robotController.getCoordinateX(), -2);
		assertEquals(robotController.getCoordinateY(), 2);
		assertEquals(robotController.getUnitFrominitialPosition(), 4);
		assertEquals(robotController.getPresentDirection(), 3);
	}

}
