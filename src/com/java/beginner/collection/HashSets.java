package com.java.beginner.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSets {
	public static void main(String[] args) {
		String names[] = {"Jack", "Rose", "Jill", "Bill", "Clerk", "Jane", "Doe", "Doe"};
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		
		System.out.println();
		List<String> nameList = new ArrayList<>(Arrays.asList(names));
		
		Set<String> nameSet = new HashSet<>(nameList);
		
		System.out.println(nameSet);
		
	}
}

