package main.java.mars.rovers.util;

import main.java.mars.rovers.model.Rover;

public interface IRoverMover {

	void moveRover(Rover rover, char command, int[][] matrix);
}
