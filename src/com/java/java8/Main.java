package com.java.java8;

interface Printable{
	
	default void m1() {
		
	}
	
	static void m2() {
		
	}
	
	void print(String str);
}

public class Main {
	public static void main(String[] args) {
	Printable lambdaPrintable =(msg) ->	System.out.println(msg);
	lambdaPrintable.print("Hello World!");
	}

}
