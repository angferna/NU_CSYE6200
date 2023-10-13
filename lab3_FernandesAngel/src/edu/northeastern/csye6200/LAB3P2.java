package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB3P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of values: ");
		int size =  input.nextInt();
		int[] numbers = new int[size];
		
		System.out.print("Enter the "+size+" numbers: ");
		// make sure all digits inputed are put into the array
		for(int i = 0; i<size; i++) {
			numbers[i] =  input.nextInt();
		}
		
		if(isConsecutiveFour(numbers)) {
			System.out.println("The list has consecutive fours");
			}
		else System.out.println("The list has no consecutive fours");
		}

	public static boolean isConsecutiveFour(int[] values) {
		// TODO: write your code here
		int count = 1; //count for consecutives
		for(int i = 0; i<values.length-1; i++) { //index = length-1
			if(values[i] == values[i+1]) { //checks values at index i and i+1
				count++;
				if(count == 4) {
					return true;
				}
			}
			else {
				count = 1;
			}
		}
		return false;
	}
}

