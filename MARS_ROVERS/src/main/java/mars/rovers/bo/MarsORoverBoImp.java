package main.java.mars.rovers.bo;

import org.springframework.stereotype.Component;

import main.java.mars.rovers.model.Rover;

@Component
public class MarsORoverBoImp extends AbstractMarsRoverBo implements IMarsRoverBo {

	@Override
	public Rover moveRover(int[][] matrix, int x, int y, char direction, String moveCommand) {
		Rover rover = new Rover(x, y, df.getInitDirectionModel(direction));
		char[] commands = moveCommand.toCharArray();
		for (char command : commands) {
			roverMover.moveRover(rover, command, matrix);
		}
		return rover;
	}

}
