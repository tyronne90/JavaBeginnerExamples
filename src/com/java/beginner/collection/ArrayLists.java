package com.java.beginner.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {

		// List declaration and initialization
		System.out.println("List declaration and initialization");
		List<String> names = new ArrayList<>();

		names.add("abc"); // 0
		names.add("pqr"); // 1
		names.add("xyz"); // 2

		System.out.println(names);

		System.out.println("\n");

		// Set Values for List
		System.out.print("Set Values in List -> ");
		List<String> setNames = new ArrayList<>();

		setNames.add("abc"); // 0
		setNames.add("pqr"); // 1
		setNames.add("xyz"); // 2

		System.out.println(setNames);

		setNames.set(2, "Tyron");

		System.out.println(setNames);

		System.out.println("\n");

		// Remove Values for List
		System.out.print("Remove Values in List -> ");
		List<String> removeNames = new ArrayList<>();

		removeNames.add("abc"); // 0
		removeNames.add("pqr"); // 1
		removeNames.add("xyz"); // 2

		System.out.println(removeNames);

		removeNames.remove(1);

		System.out.println(removeNames);

		// Iterating String ArrayList
		System.out.println("\n");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "Z", "Q", "R", "T"));

		Iterator<String> iterator = list.iterator();

		System.out.println("List iterate string elements : ");

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println();
		System.out.println("Sort list: ");
		Collections.sort(list);
		System.out.println(list);

		// Iterating Integer ArrayList
		System.out.println("\n");
//		ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		ArrayList<Integer> digits = new ArrayList<>();
		digits.add(1);
		digits.add(2);

		Iterator<Integer> intIterator = digits.iterator();
		System.out.println("List iterate integer elements : ");
		while (intIterator.hasNext()) {
			System.out.print(intIterator.next() + " ");
		}

		System.out.println("\n");
		System.out.println("Output ArrayList in For-Each : ");
		ArrayList<String> listNames = new ArrayList<String>();
		listNames.add("A");
		listNames.add("B");
		listNames.add("C");
		listNames.add("D");

		listNames.forEach(System.out::print);

	}
}
