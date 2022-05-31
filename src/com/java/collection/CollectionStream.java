package com.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionStream {
	public static void main(String[] args) {
		
		//List collection is used to store data
		
		List<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		
		fruits.add("Apple");
		
		// Stream are used to perform operations Like filtering, mapping, collection result, etc.
		List<String> result = fruits.stream()  // convert list to stream
				.filter(line -> !"Apple".equals(line))
				.collect(Collectors.toList()); // collect the output and covert stream to a List
		result.forEach(System.out::println);
		System.out.println();
		fruits.forEach(System.out::println);
		
	}

}
