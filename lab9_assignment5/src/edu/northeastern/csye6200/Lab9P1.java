package edu.northeastern.csye6200;

public class Lab9P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		Octagon oct1 = new Octagon();
		System.out.printf("Area is %.2f %n",oct1.getArea());
		System.out.printf("Perimeter is %.1f %n",oct1.getPerimeter());
		Octagon oct2 = null;
		try {
			oct2 = (Octagon) oct1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("Compare the methods "+oct1.compareTo(oct2));
	}
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

	// TODO: write your code here
	double side = 9;
	
	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {  
            return 0;
        }
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (2+4/Math.sqrt(2))*side*side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8*side;
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
