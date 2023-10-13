package edu.northeastern.csye6200;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Read grades from a file named csye6200.txt.
//  Read up to the first 15 grades in the file.
//  Compute the average of those grades.
//  Print out how far away each grade is from the average (the difference of the grade and the average). 

public class LAB4P1 {
	public static void main(String[] args){
		// TODO: write your code here
		try (Scanner fin = new Scanner(new File("csye6200.txt"))) {
			// process the file here
			double sum = 0;
			double num[] = new double[15];
			for(int i = 0; i<15; i++) {
				num[i] = fin.nextDouble();
				//System.out.println(num[i]);
				sum += num[i];
			}
			double avg = Math.round(sum/15 * 100.0)/ 100.0;
			System.out.println("Grade differences from the average "+avg+":");
			for(int i = 0; i<num.length; i++) {
				double diff = num[i] - avg;
				System.out.println("Grade "+(i+1)+": "+Math.round(diff * 100.0)/ 100.0);
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println("File csye6200.txt not found!");
			System.exit(0);
		}
	}
}
