// A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the
// weight of the package (in pounds).
// Write a program that prompts the user to enter the weight of the package and display the shipping cost. If
// the weight is greater than 20, display a message “the package cannot be shipped.”

package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter package weight: ");
		double weight = input.nextDouble();
		double price = 0.0; 
		
		if (weight >0 && weight<=1) {
			price = 3.5;
			System.out.println("The shipping cost is $"+ price);
		}
		else if (weight >1 && weight<=3) {
			price = 5.5;
			System.out.println("The shipping cost is $"+ price);
		}
		else if (weight >3 && weight<=10) {
			price = 8.5;
			System.out.println("The shipping cost is $"+ price);
		}
		else if (weight >10 && weight<=20) {
			price = 10;
			System.out.println("The shipping cost is $"+ price);
		}
		else if(weight > 20) {
			System.out.println("The package cannot be shipped");
		}
	}

}