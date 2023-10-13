package edu.northeastern.csye6200;

import java.util.Arrays;

public class LAB3P3 {
	public static void main(String[] args) {
		// TODO: write your code here
		
		int[] numbers = {1,1,2,3,3,4,5};
		
		System.out.println("Original nums: " + Arrays.toString(numbers));
		System.out.println("Unique nums: " + removeDuplicates(numbers));
	}

	public static int removeDuplicates(int[] nums) {
		// TODO: write your code here
		int uniquecount = 1;
		//starting at 1 because i dont want an out of bounds error
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[i-1]) {
				//swapping numbers while increasing unique count so they are ordered
				nums[uniquecount] = nums[i];
				uniquecount++;
			}
		}
		
		for (int i = uniquecount; i < nums.length; i++) { //remaining elements to 0
	        nums[i] = 0;
	    }
		
		System.out.println("Final nums: "+Arrays.toString(nums));
		return uniquecount; //update the return value rather than return 0
	}
}

