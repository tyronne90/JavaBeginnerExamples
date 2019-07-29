package com.java.beginner.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {

//		List<int[]> numberList = Arrays.asList(new int[] {1,2,3,4,5,6,7,8});
		TreeSet<Integer> numberTree = new TreeSet<>();
		numberTree.add(1);
		numberTree.add(2);
		numberTree.add(34);
		numberTree.add(234);
		numberTree.add(3);
		
		System.out.println();
		System.out.println(numberTree);
				
		
		System.out.println();
		System.out.println("Descending Order : ");
		Iterator<Integer> descOrder = numberTree.descendingIterator();
		while (descOrder.hasNext()) {
			System.out.print(descOrder.next() + " ");
			
		}
		
		System.out.println("\n");
		System.out.println("Minimum Value: " + numberTree.pollFirst());
		System.out.println("Maximum Value: " + numberTree.pollLast());
		
		
		
		
	}
}
