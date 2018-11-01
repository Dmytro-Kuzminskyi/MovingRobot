
public class Application {

	public static void main(String[] args) {		
		Robot robot = new Robot(-56546, 54245, Direction.RIGHT);
		moveRobot(robot, 523, -534);
		System.out.println("X = " + robot.getX() +", Y = " + robot.getY());
	}

	private static void moveRobot(Robot robot, int toX, int toY) {
		while (robot.getX() != toX) {
	        if (toX - robot.getX() > 0) {
	             if (robot.getDirection().equals(Direction.UP)) {
	                 robot.turnRight();
	                     while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             } else if (robot.getDirection().equals(Direction.LEFT)) {
	                 robot.turnRight();
	                 robot.turnRight();
	                     while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             } else if (robot.getDirection().equals(Direction.DOWN)) {
	                 robot.turnLeft();
	                     while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             } else {
	                 while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             }
	        }
	                 
	        if (toX - robot.getX() < 0) {
	             if (robot.getDirection().equals(Direction.UP)) {
	                 robot.turnLeft();
	                     while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             } else if (robot.getDirection().equals(Direction.RIGHT)) {
	                 robot.turnLeft();
	                 robot.turnLeft();
	                     while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             } else if (robot.getDirection().equals(Direction.DOWN)) {
	                 robot.turnRight();
	                     while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             } else {
	                 while (robot.getX() != toX) {
	                         robot.stepForward();
	                     }
	             }
	        }
		}
	        while (robot.getY() != toY) {
	        if (toY - robot.getY() > 0) {
	            if (robot.getDirection().equals(Direction.UP)) {
	                robot.turnRight();
	                robot.turnRight();
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }
	            } else if (robot.getDirection().equals(Direction.LEFT)) {
	                robot.turnLeft();
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }
	            } else if (robot.getDirection().equals(Direction.RIGHT)) {
	                robot.turnRight();
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }           
	            } else {
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }
	            }
	        }
	        
	        if (toY - robot.getY() < 0) {
	            if (robot.getDirection().equals(Direction.DOWN)) {
	                robot.turnRight();
	                robot.turnRight();
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }
	            } else if (robot.getDirection().equals(Direction.LEFT)) {
	                robot.turnRight();
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }
	            } else if (robot.getDirection().equals(Direction.RIGHT)) {
	                robot.turnLeft();
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }           
	            } else {
	                while (robot.getY() != toY) {
	                         robot.stepForward();
	                     }
	            }
	        }
	    }
	}
}
