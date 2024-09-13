package edu.northeastern.csye6200;

// Write a program that uses a bar chart to display the percentages of the overall grade represented by 
// project, exams, assignments, and the attendance, as shown in Figure 1. 
// Suppose that project takes 35 percent and is displayed in blue, exams take 30 percent and are displayed in green,
// assignments take 30 percent and are displayed in red, and the attendance takes 5 percent and is displayed in orange. 
// Please use the JavaFX Rectangle class to display the bars.

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class LAB8P2 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO: write your code here
		Pane pane = new Pane();
		
		int projectPct = 35;
		int examsPct = 30;
		int assignmentsPct = 30;
		int attendancePct = 5;
		
		int totalHgt = 5;
		int projectHgt = totalHgt * projectPct;
		int examsHgt = totalHgt * examsPct;
		int assignmentsHgt = totalHgt * assignmentsPct;
		int attendanceHgt= totalHgt * attendancePct;
		
		int width = 100;
		int paneHgt = 225;
		int paneWidth = 525;
		int xpos = 25;
		int ypos = paneHgt;
		
		Rectangle projectRect = new Rectangle(xpos, ypos - projectHgt, width, projectHgt);
        projectRect.setFill(Color.BLUE);
        Text projectText = new Text(xpos, ypos - projectHgt - 5, "Project -- " + projectPct + "%");
	    
        Rectangle examsRect = new Rectangle(xpos+125, ypos - examsHgt, width, examsHgt);
        examsRect.setFill(Color.GREEN);
        Text examsText = new Text(xpos+125, ypos - examsHgt - 5, "Exams -- " + examsPct + "%");
        
        Rectangle assignmentsRect = new Rectangle(xpos+250, ypos - assignmentsHgt, width, assignmentsHgt);
        assignmentsRect.setFill(Color.RED);
        Text assignmentsText = new Text(xpos+250, ypos - assignmentsHgt - 5, "Assignments -- " + assignmentsPct + "%");
	    
        Rectangle attendanceRect = new Rectangle(xpos+375, ypos - attendanceHgt, width, attendanceHgt);
        attendanceRect.setFill(Color.ORANGE);
        Text attendanceText = new Text(xpos+375, ypos - attendanceHgt - 5, "Attendance —- " + attendancePct + "%");
        
        pane.getChildren().addAll(projectRect, projectText, examsRect, examsText, assignmentsRect, assignmentsText, attendanceRect, attendanceText);

        Scene scene = new Scene(pane, paneWidth, paneHgt);
        
        primaryStage.setTitle("Lab8_Problem2");
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}

	/**
	 * The main method is only needed for the IDE with limited JavaFX support.
	 * Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		// TODO: write your code here
		launch(args);
	}

	
}