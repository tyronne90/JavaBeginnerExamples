package com.java.beginner.collection;

import java.util.Set;
import java.util.TreeSet;

public class Test3 {

	public static void main(String[] args) {
		Set<String> name = new TreeSet<>();
		name.add("A");
		name.add("D");
		name.add("B");
		name.add("B");
		name.add("Q");
		name.add("P");
		name.add("");
		name.add("Z");
		
		System.out.println(name);
		
		
	}

}
