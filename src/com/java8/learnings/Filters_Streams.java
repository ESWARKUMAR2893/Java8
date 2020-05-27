package com.java8.learnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Filters_Streams {

	public static void main(String[] args) {
		
		
		 String[] strArray = new String[] {"one", null, "three", null, "five"};  //Two elements second and fourth are null
	        List<String> elements = new ArrayList<>(Arrays.asList(strArray));
	        System.out.println("# Before Filter");
	        elements.forEach(System.out::println);
	        
	        System.out.println("# Filter to remove nulls ");
	        elements.stream()
	                .filter(Objects::nonNull)       // It will filter null elements
	                //another way is filter(element -> element != null)
	                .forEach(System.out::println);
	        
	        System.out.println("# Print everything in one line ");
		elements.stream().forEach((s) -> System.out.print(s+" "));

		System.out.println("\n# using Filter pure lambda ");
		elements.stream().filter(s -> s!= null).forEach((s) -> System.out.print(s+" "));
		
		
	}
	
	
}
