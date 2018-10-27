# MarsRovers

Description: This is a Mars Rover solution where rovers can be placeed on a matrix and then move with command.

Usage: 
1. This is a spring boot project and can be started with spring-boot:run from eclipse.
2. The project can also be started with App class in package main.java.mars.rovers.app

Tests:
The frist param from scanner is for the matrix X and Y.
Then each pair of params defines both the rover( with X, Y and initial direction) and Command(combination of 'L', 'M' and 'R').

 :: Spring Boot ::        (v1.5.1.RELEASE)

2018-10-27 17:29:00.480  INFO 11956 --- [           main] main.java.mars.rovers.app.App            : Starting App on DESKTOP-4MV3R5N with PID 11956 (C:\Java_Env\eclipse\workspace\MARS_ROVERS\target\classes started by xiang in C:\Java_Env\eclipse\workspace\MARS_ROVERS)
2018-10-27 17:29:00.484  INFO 11956 --- [           main] main.java.mars.rovers.app.App            : No active profile set, falling back to default profiles: default
2018-10-27 17:29:00.573  INFO 11956 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@1d3d3296: startup date [Sat Oct 27 17:29:00 AEDT 2018]; root of context hierarchy
2018-10-27 17:29:01.302  INFO 11956 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
5 5
1 2 N
LMLMLMLMM
1,3:N
3 3 E
MMRMMRMRRM
5,1:E
