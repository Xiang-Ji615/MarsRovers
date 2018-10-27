package main.java.mars.rovers.util;

import org.springframework.stereotype.Component;

import main.java.mars.rovers.model.Rover;

@Component
public class RoverMoverImp extends AbstractRoverMover implements IRoverMover {

//	private static RoverMoverImp instance;
//
//	static Object locker = new Object();
//
//	public static RoverMoverImp getInstance() {
//		synchronized (locker) {
//			if (instance == null)
//				instance = new RoverMoverImp();
//		}
//		return instance;
//	}
//
//	private RoverMoverImp() {
//
//	}

	@Override
	public void moveRover(Rover rover, char command, int[][] matrix) {
		if (!getNextDirection(rover, command)) {
//			System.out.println("Moving:" + rover.getX() + "," + rover.getY() + ":" + rover.getDirection().getVal());
			switch (rover.getDirection().getVal()) {
			case Direction.north:
				if (rover.getY() < matrix.length)
					rover.setY(rover.getY() + 1);
				break;
			case Direction.south:
				if (rover.getY() > 0)
					rover.setY(rover.getY() - 1);
				break;
			case Direction.east:
				if (rover.getX() < matrix[0].length)
					rover.setX(rover.getX() + 1);
				break;
			case Direction.west:
				if (rover.getX() > 0)
					rover.setX(rover.getX() - 1);
				break;
			default:
				break;
			}
		}
	}

}
