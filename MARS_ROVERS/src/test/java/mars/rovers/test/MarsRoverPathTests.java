package test.java.mars.rovers.test;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import main.java.mars.rovers.app.App;
import main.java.mars.rovers.bo.IMarsRoverBo;
import main.java.mars.rovers.model.Rover;
import main.java.mars.rovers.util.Direction;

@SpringBootTest(classes = {App.class})
public class MarsRoverPathTests extends AbstractTestNGSpringContextTests{
	
	@Autowired
	IMarsRoverBo bo;

	@Test
	public void testSampleTestCases() {
		int[][] matrix = new int[5][5];
		Rover rover1 = bo.moveRover(matrix, 1, 2, Direction.north, "LMLMLMLMM");
		assertEquals(1, rover1.getX());
		assertEquals(3, rover1.getY());
		assertEquals('N', rover1.getDirection().getVal());
		Rover rover2 = bo.moveRover(matrix, 3, 3, Direction.east, "MMRMMRMRRM");
		assertEquals(5, rover2.getX());
		assertEquals(1, rover2.getY());
		assertEquals('E', rover2.getDirection().getVal());
		
	}
}
