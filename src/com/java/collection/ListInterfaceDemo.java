package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
	
   public static void main(String[] args) {
	   
	   duplicateValueDemo();
	
}

   private static void duplicateValueDemo() {
	   List<String> list = new ArrayList<>();
			   list.add("element1");
	           list.add("element1");
	           list.add("element20");
	           list.add("element3");
	           list.add("element4");
	           list.add("element5");
	           list.add("element62");
	           list.add("element7");
	           list.add("element8");
	           list.add("element9");
	           list.add("element10");
	           
	           // null values
	           
	           list.add(null);
	           list.add(null);
	           list.add(null);
	           
	           
	           System.out.println(list);
   }
}
