package com.java.beginner.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {

	public static void main(String[] args) {
		Map<Integer, String> subjects = new HashMap<>();
		subjects.put(1, "Tamil");
		subjects.put(2, "English");
		
		for(Entry<Integer, String> map : subjects.entrySet()) {
			System.out.println(map.getKey() + " -> " + map.getValue());
		}
		
		System.out.println(subjects);
		
		System.out.println();
		
		Map<String, String> courses = new HashMap<>();
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
		for(Entry<String, String> m : courses.entrySet()) {
			System.out.println(m.getKey() + " --> " + m.getValue());
		}
		
		
	}
}
