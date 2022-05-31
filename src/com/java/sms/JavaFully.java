package com.java.sms;

public class JavaFully {
	private static String message = "hello";
	public static void main(String[] args) {
		
		// calling message instance variable without object
		System.out.println(message);
		
		// calling demo static method without object
		demo();
		
	}
	private static String demo() {
		return "hello from method";
		
		
	}

}
