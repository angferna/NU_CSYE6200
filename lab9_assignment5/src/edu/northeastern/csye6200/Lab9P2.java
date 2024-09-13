 package edu.northeastern.csye6200;

public class Lab9P2 {
	public static void main(String[] args) {
		// TODO: write your code here
		GeometricObject[] objects = {
                new Square(2),
                new Circle(5),
                new Square(5),
                new Rectangle(3, 4),
                new Square(4.5)
        };

        for (GeometricObject object : objects) {
            System.out.printf("Area is %.2f%n", object.getArea());

            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }

            System.out.println();
        }
	}
}

interface Colorable {
	// TODO: write your code here
	void howToColor();
}

class Square extends GeometricObject implements Colorable {

	// TODO: write your code here
	double side;
	
	public Square(double side) {
        this.side = side;
	}
	
	@Override
	public double getArea() {
		// TODO: write your code here
		return side*side;
	}

	@Override
	public double getPerimeter() {
		// TODO: write your code here
		return 4*side;
	}
	
	public void howToColor() {
        System.out.println("Color all four sides");
    }

}
