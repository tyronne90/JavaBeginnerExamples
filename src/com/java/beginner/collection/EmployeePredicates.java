package com.java.beginner.collection;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static List<Employee> filterAndGetEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate)
				.collect(Collectors.<Employee>toList());
	}
}
