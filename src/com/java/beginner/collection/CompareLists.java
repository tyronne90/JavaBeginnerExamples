package com.java.beginner.collection;

import java.util.*;

public class CompareLists {
public static void main(String[] args) {
	String[] s1 = {"a","b", "c", "d", "e", "f", "g"};
	String[] s2 = {"a","b", "cc", "d", "e", "f", "gg", "h"};
	
	Collection<String> collectionOne = new ArrayList<>(Arrays.asList(s1));
    Collection<String> colectionTwo = new ArrayList<>(Arrays.asList(s2));


    List<String> sourceList = new ArrayList<>(collectionOne);
    List<String> destinationList = new ArrayList<>(colectionTwo);


    sourceList.removeAll( colectionTwo );
    destinationList.removeAll( collectionOne );

    System.out.println( sourceList );
    System.out.println( destinationList );
    
    
    
}
}
