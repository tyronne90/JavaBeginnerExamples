package com.java.beginner.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayTest1 {

	public static void main(String[] args) {
		Integer arr[] = new Integer[10];
		for(int i=0; i<10; i++) {
			arr[i] = i;
		}
				
		ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
		
		Iterator<Integer> arrIt = arrList.iterator();
		
		
		while(arrIt.hasNext()) {
			try {
			if(arrIt.next()%2==0)
				System.out.println(arrIt.next());
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
