package com.java.beginner.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<>();
		
		names.put(1, "Jothi");
		
			
		String arrNames[] = {"John", "Doe", "Jack", "Rose", "Emily", "Clerk", "Bill"};
		
		for(int i=0; i<arrNames.length; i++) {
			names.put(i, arrNames[i]);
		}
		System.out.println(names);
		
		names.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

	
		String arrNames1[] = {"John", "Doe", "Jack", "Rose", "Emily", "Clerk", "Bill"};
		Map<Integer, String> names1 = new HashMap<>();
		System.out.println("\n");
		for(int i=0; i<arrNames1.length; i++) {
			names1.put(i+10, arrNames1[i]);
		}
		System.out.println(names1);
		
		System.out.println("\n");
		String subjectName[] = {"English", "Tamil", "ICT", "Physics"};  
		String subjectId[] = {"ENG", "TAM", "IT", "PHY"};  
		
		Map<String, String> listSubjects = new HashMap<>();
		
		for(int i=0; i<subjectId.length; i++) {
			listSubjects.put(subjectId[i], subjectName[i]);

		}
		System.out.println(listSubjects);
		
		
		System.out.println();
		
		for(Map.Entry<String, String> m : listSubjects.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		

		
	}

}
