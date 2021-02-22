package com.collections.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToList {
	
	public static void main(String[] args) {
		int []a= {1,3,2,4,6,5};
		Integer [] i= {1,3,2,4,6,5};
		String [] s= {"A","B","C"};
		
		
IntStream stream = Arrays.stream(a);
 Stream<Integer> boxed = Arrays.stream(a).boxed();
 List<Integer> collect = Arrays.stream(a).boxed().collect(Collectors.toList());

	      List<Integer> asList2 = Arrays.asList(i); 
	      List<String> asList3 = Arrays.asList(s);
	      List<String> asList33 = Arrays.asList(s.clone());
	      
	      //Exception in thread "main" java.lang.UnsupportedOperationException
	      //asList3.add("S");
	      
	      
	      System.out.println(asList2);
	      System.out.println(collect);
	}
	

}
