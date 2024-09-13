// Write a program that displays a 10-by-10 square matrix.
// Each element in the matrix is either 0 or 1, randomly generated. 
// Display each number centered in a text field. 
// Use TextField’s setText method to set value 0 or 1 as a string

package edu.northeastern.csye6200;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.Random;

public class LAB8P3 extends Application {
	
	@Override 
	 public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        Scene scene = new Scene(gridPane,275,260);

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField textField = new TextField();
                textField.setText(Integer.toString(random.nextInt(2)));
                textField.setEditable(false);
                gridPane.add(textField, j, i);
            }
        }
        primaryStage.setTitle("Lab8_Problem3 - Extra Credit");
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