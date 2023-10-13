package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB1P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// 1 yard = 3 feet, and 1 foot = 12 inches
		System.out.print("Enter number of yards: ");
		int yard =  input.nextInt();
		int inchY = yard * 3 * 12;
		
		System.out.print("Enter number of feet: ");
		int feet =  input.nextInt();
		int inchF = feet * 12;
		
		System.out.print("Enter number of inches: ");
		int inch =  input.nextInt();
		
		int inches = inchY + inchF + inch;
		
		System.out.print("Total number of inches: " + inches);
		
	}

}
