package main.java.mars.rovers.model;

public class Rover {
	int x;
	int y;
	DirectionModel direction;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public DirectionModel getDirection() {
		return direction;
	}

	public void setDirection(DirectionModel direction) {
		this.direction = direction;
	}

	public Rover(int x, int y, DirectionModel direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

}
