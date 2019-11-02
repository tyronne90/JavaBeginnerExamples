package com.java.beginner.collection;

import java.util.*;

public class ObjectList {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "jane", 23);
		Employee emp2 = new Employee(2, "jack", 24);
		Employee emp3 = new Employee(3, "jim", 25);
		Employee emp4 = new Employee(4, "markov", 23);
		Employee emp5 = new Employee(1, "bill", 23);

		List<Employee> empl = new ArrayList<>();
		empl.add(emp1);
		empl.add(emp2);
		empl.add(emp3);

		List<Employee> empl2 = new ArrayList<>();
		empl2.add(emp4);
		empl2.add(emp5);

//		System.out.println(empl2.size());
//
//		System.out.println(empl.get(0));
//		System.out.println(empl.get(0).getId());

	for(int i=0; i<empl.size(); i++) {
		System.out.println(empl.get(i));
	}
		for(int i=0; i<empl2.size(); i++) {
		System.out.println(empl2.get(i));
	}


		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		

		for(int i=0; i<empl.size(); i++) {
			for(int j=0; j< empl2.size(); j++) {
				System.out.println(" empl " + empl.get(i).getId() + " empl2 " + empl2.get(j).getId());
				if(empl.get(i).getId() == empl2.get(j).getId()) {
					empl2.remove(j);
				}
			}
		}
		    
		for(int i=0; i<empl2.size(); i++) {
		System.out.println(empl2.get(i));
	}


	}

}
