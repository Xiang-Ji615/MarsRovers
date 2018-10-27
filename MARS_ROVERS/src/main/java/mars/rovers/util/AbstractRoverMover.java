package main.java.mars.rovers.util;

import main.java.mars.rovers.model.Rover;

public abstract class AbstractRoverMover {

	public AbstractRoverMover() {

	}

	protected boolean getNextDirection(Rover rover, char directionAction) {
		if (directionAction == Command.left) {
			rover.setDirection(rover.getDirection().getPrev());
			return true;
		} else if (directionAction == Command.right) {
			rover.setDirection(rover.getDirection().getNext());
			return true;
		}
		return false;
	}
}
