package edu.northeastern.csye6200;

public class Rectangle extends GeometricObject {

	// TODO: write your code here
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(length + breadth);
	}

}
