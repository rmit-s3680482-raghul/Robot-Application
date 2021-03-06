

import java.util.*;
/*
 * Author : Raghul Karthik
 */
public class Robot {
	private static final String[] availableDirection = { "NORTH", "EAST", "SOUTH", "WEST" }; // Moving direction
	private static final String[] availableMove = { "F", "B", "R", "L" }; // Possible move i
	private static final int startX = 0; // Initialize x coordinates
	private static final int startY = 0; // Initialize y coordinates

	public static void main(String[] args) {
		System.out.println("*******Welcome to Robot Application*******");
		String userInput; 
		String userCommand;
		RobotController robot = new RobotController(0, 0, 0, 0); // Initialize value to the constructor
		Scanner sc = new Scanner(System.in);
		Boolean flag = false;
		//The loops used to user input from CLI
		while (true) {
			System.out.println("Choose from the following commends\n"
					+ "S to enter robot input Commands(A letter F for move forward, "
					+ "B for move backWard, L for turn Left(90deg) and R for turn Right(90deg))\n"
					+ "E for Exit program.\n\n" + "Enter your commands: ");
			userInput = sc.nextLine().toUpperCase();
			// The switch to accept user input functionality.
			switch (userInput) {
			case "S":
				System.out.println("Enter the input Commands :");
				userCommand = sc.nextLine();
				String[] usercommands = userCommand.split(",");
				// The statement used to re-enter the commands if users provides wrong commands.
				if (Validation(usercommands) == false) {
					System.out.println("Invalid Commands, Please Re-enter correct Commands\n\n");
					continue;
				}
				try {
					robotMove(usercommands, robot);
					// It display output to user in the command line.
					System.out.println("\n\nRobot Output:");
					System.out.printf("Robot is " + robot.getUnitFrominitialPosition() + " units from initial point.");
					System.out.printf("\nCurrent robot coordinate is %s,%s \n", robot.getCoordinateX(),
							robot.getCoordinateY());
					System.out.printf("Robot is currently facing %s \n",
							availableDirection[robot.getPresentDirection()] + " direction. \n\n");
					continue;	
				} catch (Exception e) {
					System.err.print(e);
				}
			case "E":
				// It terminate the program.
				System.out.println("Program Terminated");
				flag = true;
				break;
			default:
				System.out.println("invalid command. Please try again!!\n\n");
				continue;
			}
			if (flag == true) {
				break;
			}
		}
		sc.close();
	}

	public static void robotMove(String[] usercommands, RobotController robot) {
		int coordinateX = robot.getCoordinateX();
		int coordinateY = robot.getCoordinateY();
		int direction = robot.getPresentDirection();
		int count = 0;
		String nextPosition;
		String commandType;
		for (int i = 0; i < usercommands.length; i++) {
			nextPosition = usercommands[i];
			commandType = nextPosition.substring(0, 1).toUpperCase();
			count = Integer.valueOf(nextPosition.substring(1));
			switch (commandType) {
			// Turn left 90 degree
			case "L":
				for (int j = 0; j < count; j++) {
					if (direction == 0) {
						direction = availableDirection.length - 1;
					} else {
						direction--;
					}
				}
				break;
				// Turn Right 90 degree
			case "R":
				for (int j = 0; j < count; j++) {
					if (direction == availableDirection.length - 1) {
						direction = 0;
					} else {
						direction++;
					}
				}
				break;
				// Move forward with the specified steps. 
			case "F":
				for (int j = 0; j < count; j++) {
					switch (availableDirection[direction]) {
					case "NORTH":
						coordinateY++;
						break;
					case "EAST":
						coordinateX++;
						break;
					case "SOUTH":
						coordinateY--;
						break;
					case "WEST":
						coordinateX--;
						break;
					}
				}
				break;
				// Move backward with the specific steps.
			case "B":
				for (int j = 0; j < count; j++) {
					switch (availableDirection[direction]) {
					case "NORTH":
						coordinateY--;
						break;
					case "EAST":
						coordinateX--;
						break;
					case "SOUTH":
						coordinateY++;
						break;
					case "WEST":
						coordinateX++;
						break;
					}
				}
				break;
			}
		}
		robot.setCoordinateX(coordinateX); // it set coordinate X after reading the input commands.
		robot.setCoordinateY(coordinateY); // it set coordinate Y after reading the input commands.
		robot.setPresentDirection(direction); // it set direction after reading the input commands.
		// absolute distance calculation to account for negative coordinates
		robot.setUnitFromInitialPosition(Math.abs(startX - coordinateX) + Math.abs(startY - coordinateY));

	}

	public static boolean Validation(String[] usercommands) {
		
		for (int i = 0; i < usercommands.length; i++) {
			// It check for the valid commands and check commands as atleast two values.
			if (usercommands[i].length() < 2 || Arrays.asList(availableMove)
					.contains(Character.toString(usercommands[i].charAt(0)).toUpperCase()) == false) {
				return false;
			}
			for (int j = 1; j < usercommands[i].length(); j++) {
				// The condition to check after the command input, it should have the numeric value.
				if (Character.isDigit(usercommands[i].charAt(j)) == false) {
					return false;
				}
			}
		}
		return true;
	}
}
