package com.java.beginner.arrays;

public class OneDimensionArrays {

	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

//		System.out.println(a[0]);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println("\n");

		int b[] = new int[5];

		for (int i = 0; i < b.length; i++) {
			b[i] = i;
			System.out.print(b[i] + " ");
		}

		System.out.println("\n");

		int c[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		System.out.println("\n");

		// Ascending and Descending

		System.out.println("Array Sorting :");
		int d[] = { 2, 3, 5, 11, 54, 64, 63, 4, 7, 1, 99, 44 };
		int temp = 0;
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] > d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		System.out.println("Ascending :");
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0; i < d.length; i++) {
			for (int j = i + 1; j < d.length; j++) {
				if (d[i] < d[j]) {
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
				}
			}
		}
		System.out.println("Descending :");
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}

		// for-each loop

		System.out.println("\n");

		System.out.println("For-Each");
		int e[] = { 2, 5, 6, 1, 8, 3, 44, 66, 22 };

		for (int i : e) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		// Find maximum and minimum

		System.out.println("Find maximum and minimum");

		int f[] = { 25, 55, 2, 5, 6, 111, 8, 3, 44, 1, 66, 22 };

		int max = f[0];
		int min = f[0];

		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < f.length; i++) {
			if (f[i] > max) {
				max = f[i];
			}
		}
		System.out.println("Max :" + max);
		
		for (int i = 0; i < f.length; i++) {
			if (f[i] < min) {
				min = f[i];
			}
		}
		System.out.print("Min :" + min);

	}

}
