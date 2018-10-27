# MarsRovers

Description: This is a Mars Rover solution where rovers can be placeed on a matrix and then move with command.

Usage: 
1. This is a spring boot project and can be started with spring-boot:run from eclipse.
2. The project can also be started with App class in package main.java.mars.rovers.app

Tests:
1. The frist param from scanner is for the matrix X and Y.
2. Then each pair of params defines both the rover( with X, Y and initial direction) and Command(combination of 'L', 'M' and 'R').
3. A testng test class is in package test.java.mars.rovers.test

Sample data input/output:
1. Please input matrix as format 'X Y'
2. 5 5
3. Please input rover as format 'X Y Direction('N', 'E', 'S' or 'W')
4. 1 2 N
5. Please input commands as format eg 'LMLMLMLMM'
6. LMLMLMLMM
7. Rover has been moved to 1 3 N
