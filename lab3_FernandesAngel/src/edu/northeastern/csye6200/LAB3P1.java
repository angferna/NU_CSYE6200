package edu.northeastern.csye6200;

import java.util.Scanner;

//1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, add
//   up the two digits to get a single-digit number.
//2. Now add all single-digit numbers from Step 1.
//   4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
//3. Add all digits in the odd places from right to left in the card number.
//   6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
//4. Sum the results from Step 2 and Step 3.
//   37 + 38 = 75
//5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For
//   example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.


public class LAB3P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter card number: ");
		long card =  input.nextLong();
		
		int validity;
		
		if (isValid(card) == true) {
			validity = (sumOfDoubleEvenPlace(card) + sumOfOddPlace(card));
			//System.out.println("Validity is "+validity);
			if(validity%10 == 0) {
				System.out.println(card + " is valid");
			}
			else System.out.println(card + " is invalid");
		}
		else System.out.println(card + " is invalid");
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		// TODO: write your code here
		int length = getSize(number);
		long prefix1 = getPrefix(number, 1); //Visas, MasterCard & Discover
		long prefix2 = getPrefix(number, 2); //American Express
		
		if(length >= 13 && length <= 16) {
			if(prefix1 == 4 || prefix1 == 5 || prefix1 == 6) {
				if(prefixMatched(number, (int) prefix1) == true ) {
					//System.out.println("Prefix is "+prefix1);
					return true;
				}
			}
			else if(prefix2 == 37) {
				if(prefixMatched(number, (int) prefix2) == true ) {
					//System.out.println("Prefix is "+prefix2);
					return true;
				}
			}
			return false;
		}
		return false;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		// TODO: write your code here
		//right to left
		String num = Long.toString(number);
		int sumofDoubleEven = 0;
		int digits;
		for(int i=getSize(number)-1; i>=0; i--) {
			if ((getSize(number) - i) % 2 == 0) { //make sure it is every second digit
				digits = Character.getNumericValue(num.charAt(i))*2;
				//System.out.println(digits/2+" is "+digits+" at index "+i);
				sumofDoubleEven += getDigit(digits);
			}
		}
		//System.out.println("Sum of double even digits is "+sumofDoubleEven);
		return sumofDoubleEven;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of
	 * the two digits
	 */
	public static int getDigit(int number) {
		// TODO: write your code here
		int size = Integer.toString(number).length();
		if(size == 2) {
			return ((number%10)+(number/10));
		}
		return number;
	}

	/** Return sum of odd place digits in number from right to left*/
	public static int sumOfOddPlace(long number) {
		// TODO: write your code here
		String num = Long.toString(number);
		int sumofOddDigits = 0;
		for(int i=getSize(number)-1; i>=0; i=i-2) {
			sumofOddDigits += Character.getNumericValue(num.charAt(i));
		}
		//System.out.println("Sum of odd digits is "+sumofOddDigits);
		return sumofOddDigits;
	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		// TODO: write your code here
		String num = Long.toString(number);
		String dstring = Integer.toString(d);
		if(num.startsWith(dstring)) {
			//System.out.println("Prefixed match true");
			return true;
		}
		return false;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {
		// TODO: write your code here
		String dstring = Long.toString(d);
		int size = dstring.length();
		return size;
	}

	/**
	 * Return the first k number of digits from number. If the number of digits
	 * in number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		// TODO: write your code here
		String num = Long.toString(number);
		String firstkdigits = "";
		for(int i=0; i<k; i++) {
			firstkdigits+=num.charAt(i);
		}
		Long firstk = Long.parseLong(firstkdigits);
		return firstk;
	}
}
