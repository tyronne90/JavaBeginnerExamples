package com.java.beginner.arrays;

public class TwoDimensionArrays {

	
	public static void main(String[] args) {
		
		// Simple 2D Array
		System.out.println("Simple 2D Array : \n ");
		int[][] a = new int[3][3];

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				a[row][col] = col;
				System.out.print(a[row][col] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n");

		//Predefined 2D Array
		System.out.println("Predefined 2D Array : \n");
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print(b[row][col] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n");
		
		// Jagged Array
		System.out.println("Jagged 2D Array : \n");
		int[][] c = {{1,2},{3,4,5},{6,7,8,9}};
		
		for(int row=0; row<c.length; row++) {
			for(int col=0; col<c[row].length; col++) {
				System.out.print(c[row][col] + "\t");
			}
			System.out.println();
		}
		
		

	}
	
}
