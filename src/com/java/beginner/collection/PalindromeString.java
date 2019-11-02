package com.java.beginner.collection;

public class PalindromeString {
	public static void main(String[] args) {

		String a = "1221";
		String b = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
			System.out.println(b);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}

	}
}
