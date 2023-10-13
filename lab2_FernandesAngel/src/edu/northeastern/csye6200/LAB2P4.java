//Write a program that prompts the user to enter a string and displays the number of the uppercase letters in the string.
package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String sentence;
		int numUpper = 0;
		
		System.out.print("Enter a String: ");
		sentence = input.nextLine();
		
		for (int i = 0; i < sentence.length(); i++) {
			char letter = sentence.charAt(i);
			if(Character.isUpperCase(letter)) {
				numUpper++;
			}
		}
		System.out.println("The number of uppercase letters is "+numUpper);
	}

}
