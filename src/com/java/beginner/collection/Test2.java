package com.java.beginner.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		
		Set<String> name = new HashSet<>();
		name.add("A");
		name.add("D");
		name.add("B");
		name.add("B");
		name.add("Q");
		name.add("P");
		name.add("");
		name.add("Z");
		
		System.out.println(name);
		
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		if(name.contains("Hello")) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
		
	}
}
