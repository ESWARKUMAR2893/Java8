package com.java8.learnings;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class more_Streams {

	
	
	public static void main(String[] args) {
		
		
		Collection<String> e = Arrays.asList("hello","world");
		
		 e.stream().forEach((s)->System.out.print(s+" "));
		
		System.out.println("-----------------------------------------");
		 
		Stream<String> stream = Stream.of("hello","is","works");
		
		stream.forEach(System.out::println);
		
		System.out.println("-----------------------------------------");

		Stream<List<String>> stream1 = Stream.of(Arrays.asList("hello","world"));
		 
		stream1.forEach(System.out::println);
		
		
		
		System.out.println("-----------------------------------------");

		int[] it = new int[] {11,3,4,56,6};
		
		
		IntStream intStrem = Arrays.stream(it);
		
		intStrem.forEach(s->System.out.print(s+" "));
		
		System.out.println("\n-----------------------------------------\n");
		
		Stream<String> streamempty = Stream.empty();
		streamempty.forEach(System.out::println);
		

		System.out.println("\n-----------------------------------------\n");
		
		// creating from existing array 
		 
		
        IntStream intStreamAdd = Arrays.stream(it);
		
		
		//intStreamAdd.forEach(s -> System.out.println(s+" "));
		
		
		
		System.out.println("\n-----------------------------------------\n");

		
        // creating from  a part of an array:

		IntStream intStreamPart = Arrays.stream(it,1,3);
		
		
		intStreamPart.forEach(s -> System.out.println(s+" "));
		
		System.out.println("\n-----------------------------------------\n");

		
		//Filetering and displaying 
		
		
		/*
		 * A Stream should be operated on 
		 * (invoking an intermediate or terminal stream operation) only once. 
		 * A Stream implementation may throw IllegalStateException if it detects that the Stream is being reused.
		 */
		
		
		//intStreamAdd.filter(s -> s%2==0).forEach(s -> System.out.println(s+" "));
		
		
    //OptionalInt and finding Max no in int array 		
 		
 	OptionalInt max_no= intStreamAdd.max();
	
	 if(max_no.isPresent())
	 	System.out.println(max_no.getAsInt());
		
		
	 // OptionalDouble and finding average 
		
	 int[] i = {12,3,5,6,78,9,3};
	 
	 
	  IntStream intS = IntStream.of(i);
  
	  OptionalDouble optD = intS.average();
	  System.out.println(optD.getAsDouble());
		
	  
	  
		
		
	}
}
