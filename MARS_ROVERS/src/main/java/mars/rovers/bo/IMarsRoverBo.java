package main.java.mars.rovers.bo;

import main.java.mars.rovers.model.Rover;

public interface IMarsRoverBo {
	
	Rover moveRover(int[][] matrix, int x, int y, char direction, String moveCommand);
}
