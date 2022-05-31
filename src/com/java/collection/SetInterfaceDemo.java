package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
	
	public static void main(String[] args) {
		   
		   duplicateValueDemo();
		
	}

	   private static void duplicateValueDemo() {
		   Set<String> set = new HashSet();
		           set.add("element1");
		           set.add("element1");
		           set.add("element23");
		           set.add("element3");
		           set.add("element4");
		           set.add("element5");
		           set.add("element6");
		           set.add("element8");
		           set.add("element10");
		           set.add("element9");
		           set.add("element10");
		           
		           // null values
		           
		           set.add(null);
		           set.add(null);
		           set.add(null);
		           
		           System.out.println(set);
	   }
	}



