package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB4P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation linearequation = new LinearEquation(a, b, c, d, e, f);
		
		if (linearequation.isSolvable()) {
			System.out.println("x is " + linearequation.getX() +
				" and y is " + linearequation.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}
}

class LinearEquation {
//	• Private data fields a, b, c, d, e, and f.
//	• A constructor with the arguments for a, b, c, d, e, and f.
//	• Six getter methods for a, b, c, d, e, and f.
//	• A method named isSolvable() that returns true if ad - bc is not 0.
//	• Methods getX() and getY() that return the solution for the equation.
	// TODO: write your code here
	private double a, b, c, d, e, f;
	
	public LinearEquation (double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		if (((a * d) - (b * c)) != 0) {
			return true;
		}
		return false;
	}
	
	public double getX() {
		return ((e * d) - (b * f))/((a * d) - (b * c));
	}

	public double getY() {
		return ((a * f) - (e * c))/((a * d) - (b * c));
	}
}