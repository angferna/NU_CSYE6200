package edu.northeastern.csye6200;

//• An int data field named value that stores the int value represented by this object.
//• A constructor that creates a MyInteger object for the specified int value.
//• A getter method that returns the int value.
//• The methods isEven(), isOdd(), and isPrime() that return true if the value in this object is
//  even, odd, or prime, respectively.
//• The static methods isEven(int), isOdd(int), and isPrime(int) that return true if the
//  specified value is even, odd, or prime, respectively.
//• The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that
//  return true if the specified value is even, odd, or prime, respectively.
//• The methods equals(int) and equals(MyInteger) that return true if the value in this object is
//  equal to the specified value.
//• A static method parseInt(char[]) that converts an array of numeric characters to an int value.
//• A static method parseInt(String) that converts a string into an int value.

public class LAB5P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		MyInteger n1 = new MyInteger(7);
		MyInteger n2 = new MyInteger(24);

		System.out.println("n1 is even? " + MyInteger.isEven(n1));
		System.out.println("n1 is prime? " + MyInteger.isPrime(n1));
		System.out.println("15 is prime? " + MyInteger.isPrime(15));
		System.out.println("parseInt(char[]) for { '4', '3', '7', '8' } = " + MyInteger.parseInt(new char[] { '4', '3', '7', '8' }));
		System.out.println("parseInt(String) for \"4378\" = " + MyInteger.parseInt("4378"));
		System.out.println("n2 is odd? " + MyInteger.isOdd(n2));
		System.out.println("45 is odd? " + MyInteger.isOdd(45));
		System.out.println("n1 is equal to n2? " + n1.equals(n2));
		System.out.println("n1 is equal to 5? " + n1.equals(5));
	}
}

class MyInteger {

	// TODO: write your code here
	int value;

	public int getValue() {
		// TODO: write your code here
		return value;
	}

	public MyInteger(int value) {
		// TODO: write your code here
		this.value = value;
	}

	public boolean isEven() {
		// TODO: write your code here
		if (value % 2 == 0)
			return true;
		return false;
	}

	public static boolean isEven(int n) {
		// TODO: write your code here
		if (n % 2 == 0)
			return true;
		return false;
	}

	public static boolean isEven(MyInteger o) {
		// TODO: write your code here
		return o.isEven();
	}

	public boolean isOdd() {
		// TODO: write your code here
		if (value % 2 != 0)
			return true;
		return false;
	}

	public static boolean isOdd(int n) {
		// TODO: write your code here
		if (n % 2 != 0)
			return true;
		return false;
	}

	public static boolean isOdd(MyInteger n) {
		// TODO: write your code here
		return n.isOdd();
	}

	public boolean isPrime() {
		// TODO: write your code here
		if (value <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int num) {
		// TODO: write your code here
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(MyInteger o) {
		// TODO: write your code here
		return o.isPrime();
	}

	public boolean equals(int anotherNum) {
		// TODO: write your code here
		if (value == anotherNum)
			return true;
		return false;
	}

	public boolean equals(MyInteger o) {
		// TODO: write your code here
		if (o.equals(value))
			return true;
		return false;
	}

	public static int parseInt(char[] numbers) {
		// numbers consists of digit characters.
		// For example, if numbers is {'1', '2', '5'}, the return value
		// should be 125. Please note that
		// numbers[0] is '1'
		// numbers[1] is '2'
		// numbers[2] is '5'

		// TODO: write your code here
		int output = 0;
		for (int i = 0; i < numbers.length; i++) {
			output = output * 10 + ((char) numbers[i] - '0');
		}
		return output;
	}

	public static int parseInt(String s) {
		// s consists of digit characters.
		// For example, if s is "125", the return value
		// should be 125.

		// TODO: write your code here
		int output = 0;
		for (int i = 0; i < s.length(); i++) {
			output = output * 10 + s.charAt(i) - '0';
		}
		return output;
	}
}