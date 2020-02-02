
/*
 * Author : Raghul Karthik
 */
public class RobotController {
	private int coordinateX;
	private int coordinateY;
	private int presentDirection;
	private int unitFromInitialPosition;
	
	public RobotController(int coordinateX, int coordinateY, int presentDirection, int unitFromInitialPosition) {
		// initialize the constructor
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.presentDirection = presentDirection;
		this.unitFromInitialPosition = unitFromInitialPosition;
	}
	
	public int getCoordinateX() {
		return this.coordinateX;
	}
	
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	
	public int getCoordinateY() {
		return this.coordinateY;
	}
	
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	
	public int getPresentDirection() {
		return this.presentDirection;
	}
	
	public void setPresentDirection(int presentDirection) {
		this.presentDirection = presentDirection;
	}
	
	public int getUnitFrominitialPosition() {
		return this.unitFromInitialPosition;
	}
	
	public void setUnitFromInitialPosition(int unitFromInitialPosition) {
		this.unitFromInitialPosition = unitFromInitialPosition;
	}
}
