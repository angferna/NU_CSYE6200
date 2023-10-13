// Write a program that prompts the user to enter a year and the first three letters of a month name (with
// the first letter in uppercase) and displays the number of days in the month. The year, which should be
// positive, is needed to check for and handle leap years.

package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB2P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year;
		String month3;
		String MONTH;
		int days = 0;
		
		System.out.print("Enter a year: ");
		year = input.nextInt();
		
		System.out.print("Enter the first 3 letters of the month: ");
		month3 = input.next();
		MONTH = month3.toUpperCase();
		
		if(year>0) {
			if (MONTH.equals("JAN") || MONTH.equals("MAR") || MONTH.equals("MAY") || MONTH.equals("JUL") || MONTH.equals("AUG") || MONTH.equals("OCT") || MONTH.equals("DEC")) {
				days = 31;
			}
			else if (MONTH.equals("APR") || MONTH.equals("JUN") || MONTH.equals("SEP") || MONTH.equals("NOV")) {
				days = 30;
			}
			else if (MONTH.equals("FEB")) {
				if (((year%4==0) && (year%100==0)) || (year%400==0)) {
					//leap year
					days = 29;
				}
				else {
					//not leap year
					days = 28;
				}
			}
		} 
		else {
			System.out.println("Not applicable");
		}
		System.out.print(month3+" "+year + " has "+days+" days");
	}
}
