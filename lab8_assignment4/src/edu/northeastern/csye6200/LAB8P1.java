package edu.northeastern.csye6200;

import java.util.Scanner;
import java.util.Random;

// Write a program that randomly fills in 0-9 into an n × m matrix, prints the matrix, and finds the rows and columns with the largest value. 
// You can use different approaches to solve this problem.
// For example, you can use two-dimensional arrays to store randomly generated data and ArrayList for saving the indices.
// Expected results:
// Enter the number of rows: 4
// Enter the number of columns: 6
// The array content is:
// 7 9 6 0 4 3
// 0 4 8 4 8 2
// 2 1 1 4 5 2
// 7 3 5 9 6 0
// The index of the largest row: 3
// The index of the largest column: 4

public class LAB8P1 {
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		int seed = 22; //Optional: set seed to create repeatable results
		rnd.setSeed(seed);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();
        
        System.out.println();

        int[][] matrix = new int[numRows][numCols];

        System.out.println("The array content is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
            	matrix[i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();

        int largestRowIndex = findLargestRow(matrix);
        int largestColumnIndex = findLargestColumn(matrix);

        System.out.println("The index of the largest row: " + largestRowIndex);
        System.out.println("The index of the largest column: " + largestColumnIndex);

        scanner.close();
	}

	public static int sumRow(int row[]) {
		// TODO: write your code here
		int sum = 0;
		int length = row.length;
		for(int i=0; i<length; i++) {
			sum += row[i];
		}
		return sum;
	}

	public static int sumColumn(int matrix[][], int column) {
		// TODO: write your code here
		int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        return sum;
	}
	
	private static int findLargestRow(int[][] matrix) {
		// TODO Auto-generated method stub
		int sum = 0;
		int index = 0;
		for(int i=0; i<matrix.length; i++) {
			if(sumRow(matrix[i])>sum) {
				sum = sumRow(matrix[i]);
				index =  i;
			}
		}
		
		return index;
	}
	
	private static int findLargestColumn(int[][] matrix) {
		// TODO Auto-generated method stub
		int sum = 0;
		int index = 0;
		for(int i=1; i<matrix[0].length; i++) {
			if(sumColumn(matrix,i)>sum) {
				sum = sumColumn(matrix,i);
				index =  i;
			}
		}
		
		return index;
	}

}
