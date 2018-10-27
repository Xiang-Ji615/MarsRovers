package main.java.mars.rovers.bo;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.mars.rovers.util.DirectionFactory;
import main.java.mars.rovers.util.IRoverMover;

public abstract class AbstractMarsRoverBo {
	
	@Autowired
	protected DirectionFactory df;

	@Autowired
	protected IRoverMover roverMover;
}
