
public final class Robot {
		private int x;
		private int y;
		Direction direction;
		
		public Robot(int x, int y, Direction direction) {
			this.x = x; 
			this.y = y;
			this.direction = direction;
		}
		public Direction getDirection() {
			return direction;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public void turnLeft() {
			if (direction.equals(Direction.UP)) {
				direction = Direction.LEFT;
			} else if (direction.equals(Direction.LEFT)) {
				direction = Direction.DOWN;
			} else if (direction.equals(Direction.DOWN)) {
				direction = Direction.RIGHT;
			} else {
				direction = Direction.UP;
			}
		}
		public void turnRight() {
			if (direction.equals(Direction.UP)) {
				direction = Direction.UP;
			} else if (direction.equals(Direction.LEFT)) {
				direction = Direction.UP;
			} else if (direction.equals(Direction.DOWN)) {
				direction = Direction.LEFT;
			} else {
				direction = Direction.DOWN;
			}		
		}
		public void stepForward() {
			if (direction.equals(Direction.UP)) {
				y++;
			} else if (direction.equals(Direction.DOWN)) {
				y--;
			} else if (direction.equals(Direction.RIGHT)) {
				x++;
			} else {
				x--;
			}
		}

}
