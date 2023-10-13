package edu.northeastern.csye6200;

public class LAB4P3 {
	public static void main(String[] args) {
		// TODO: write your code here
		// Create two points
		MyDataPoint point1 = new MyDataPoint();
		MyDataPoint point2 = new MyDataPoint(10, 30.5);
		double p1 = 10;
		double p2 = 30.5;

		// Display the distance between point1 and point2
		System.out.println("The distance between (" 
				+ point1.getX() + ", " + point1.getY() + ") and ("
				+ point2.getX() + ", " + point2.getY() + ") is (using one point's distance method): " 
				+ point1.distance(p1,p2));
		System.out.println("The distance between (" 
				+ point1.getX() + ", " + point1.getY() + ") and ("
				+ point2.getX() + ", " + point2.getY() + ") is (using MyDataPoint class's distance method): " 
				+ point1.distance(point2));
	}
}

class MyDataPoint {
	// TODO: write your code here
//  Design a class named MyDataPoint to represent a point with x- and y-coordinates. The class contains:
//	• The data fields x and y that represent the coordinates with getter methods.
//	• A no-arg constructor that creates a point (0, 0).
//	• A constructor that constructs a point with specified coordinates.
//	• A method named distance that returns the distance from this point to a specified point of the MyDataPoint type.
//	• A method named distance that returns the distance from this point to another point with specified x- and y-coordinates.
//	Write a test program that creates the two data points (0, 0) and (10, 30.5) and displays the distance between them. 
//  Please print out the distance by using two different approaches, i.e. from one point’s distance method and from MyDataPoint class’s distance method respectively.
	
	//	Expected results:
	//	The distance is (using one point's distance method): 32.09750769140807
	//	The distance is (using MyDataPoint class's distance method): 32.09750769140807
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	MyDataPoint() {
		this(0,0);
	}
	
	MyDataPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyDataPoint myDataPoint){
		return Math.sqrt(Math.pow(myDataPoint.getX() - x, 2) +  Math.pow(myDataPoint.getY() - y, 2));
	}
	
	public double distance(double point1, double point2){
		return distance (new MyDataPoint(point1,point2));
	}
	
}
