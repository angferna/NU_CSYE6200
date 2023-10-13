//Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. 
// Your program should prompt the user to enter the amount of water in kilograms and the initial and 
// final temperatures of the water. The formula to compute the energy is:
// 𝑄 = 𝑀 ∗ (𝑓𝑖𝑛𝑎𝑙𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑒 − 𝑖𝑛𝑖𝑡𝑖𝑎𝑙𝑇𝑒𝑚𝑝𝑒𝑟𝑎𝑡𝑢𝑟𝑒) ∗ 4184
// where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.

package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double waterkg = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialtemp = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finaltemp = input.nextDouble();
		
		double energy = waterkg * (finaltemp - initialtemp) * 4184;
		
		System.out.println("The energy needed is "+ energy);

	}

}
