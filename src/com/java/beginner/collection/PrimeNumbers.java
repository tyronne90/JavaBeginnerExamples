package com.java.beginner.collection;

public class PrimeNumbers {
	public static void main(String[] args) {

		// Get prime numbers
//		for (int i = 1; i < 15; i++) {
//			int c=0;
//			for(int j=i; j>=1; j--) {
//				if(i%j==0)
//					c=c+1;
//			}
//			if(c==2) {
//				System.out.println(i);
//			}
//		}
		
		int n=6;
		for (int i = n; i < n+1; i++) {
			int c=0;
			for(int j=i; j>=1; j--) {
				if(i%j==0)
					c=c+1;
			}
			if(c==2) {
				System.out.println(i + " is prime");
			}else {
				System.out.println("not prime");
			}
		}
		
		
	}
}

//i%j==0

//2%2=0
//2%1=0
//
//3%3=0
//3%2=1
//3%1=0
//
//4%4=0
//4%3=1
//4%2=0
//4%1=0
//
//5%5=0
//5%4=1
//5%3=1
//5%2=1
//5%1=0