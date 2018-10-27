package main.java.mars.rovers.app;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import main.java.mars.rovers.bo.IMarsRoverBo;
import main.java.mars.rovers.model.Rover;

@SpringBootApplication
@ComponentScan(basePackages = { "main.java" })
public class App implements CommandLineRunner {

	@Autowired
	IMarsRoverBo bo;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please input matrix as format 'X Y'");
		String matrixS = sc.nextLine();
		while(matrixS.length() <= 1) {
			System.out.println("Wrong format, Please input as format 'X Y'");
			matrixS = sc.nextLine();
		}	
		String[] matrixDef = matrixS.split(" ");
		int[][] matrix = new int[Integer.valueOf(matrixDef[0])][Integer.valueOf(matrixDef[1])];

		while (true) {
			System.out.println("Please input rover as format 'X Y Direction('N', 'E', 'S' or 'W')");
			String roverS = sc.nextLine();
			while(roverS.length() < 5) {
				System.out.println("Wrong format, Please input as format 'X Y Direction('N', 'E', 'S' or 'W')");
				roverS = sc.nextLine();
			}	
			String[] roverDef = roverS.split(" ");
			System.out.println("Please input commands as format eg 'LMLMLMLMM'");
			String moveCommand = sc.nextLine();
			while(moveCommand.length() == 0) {
				System.out.println("Wrong format, Please input as format eg 'LMLMLMLMM'");
				moveCommand = sc.nextLine();
			}	
			Rover rover = bo.moveRover(matrix, Integer.valueOf(roverDef[0]), Integer.valueOf(roverDef[1]),
					roverDef[2].charAt(0), moveCommand);
			System.out.println("Rover has been moved to "+rover.getX() + " " + rover.getY() + " " + rover.getDirection().getVal());
		}
	}

}
