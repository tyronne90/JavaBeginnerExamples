package com.java.beginner.collection;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Test4 {

	public static void main(String[] args) {
		Map<String, String> courses = new TreeMap<>();
		courses.put("SOF", "SOF");
		courses.put("CCC", "CCC");
		courses.put("AAA", "CCC");
		courses.put("AAA", "MMM");
		courses.put("BBB", "BBB");
		courses.put("", "");
		courses.put("", "NET");
		courses.put("", "");
		courses.put("MMW", "");
		courses.put("BMN", "");
		courses.put("DDD", "");
		courses.put("", "NET");
		courses.put("", "MAN");

		System.out.println(courses);

		System.out.println(courses);
		for (Entry<String, String> m : courses.entrySet()) {
			System.out.println(m.getKey() + " --> " + m.getValue());
		}
	}

}
