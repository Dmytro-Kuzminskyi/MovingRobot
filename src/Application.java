import java.lang.Math;
public class Application {

	public static void main(String[] args) {		
		Robot robot = new Robot(5, -2, Direction.RIGHT);
		moveRobot(robot, -5, 2);
		System.out.println("X = " + robot.getX() +", Y = " + robot.getY());
	}

	private static void moveRobot(Robot robot, int toX, int toY) {
		int distX = Math.abs(toX - robot.getX());
		int distY = Math.abs(toY - robot.getY());
		Direction direction = robot.getDirection();
		if (robot.getX() > toX) {
			while (distX != 0) {
				while (!direction.equals(Direction.LEFT)) {
					robot.turnLeft();
					direction = robot.getDirection();
				}
				robot.stepForward();
				distX--;
			}
		}
		if (robot.getX() < toX) {
			while (distX != 0) {
				while (!direction.equals(Direction.RIGHT)) {
					robot.turnRight();
					direction = robot.getDirection();
				}
				robot.stepForward();
				distX--;
			}
		}
		if (robot.getY() > toY) {
			while (distY != 0) {
				while (!direction.equals(Direction.DOWN)) {
					robot.turnLeft();
					direction = robot.getDirection();
				}
				robot.stepForward();
				distY--;
			}
		}
		if (robot.getY() < toY) {
			while (distY != 0) {
				while (!direction.equals(Direction.UP)) {
					robot.turnRight();
					direction = robot.getDirection();
				}
				robot.stepForward();
				distY--;
			}
		}
	}
}
