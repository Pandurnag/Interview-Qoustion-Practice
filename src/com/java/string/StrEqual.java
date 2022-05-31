package com.java.string;

public class StrEqual {
    public static void main(String[] args) {
        String s1 = "hello";//scp 
        String s2 = new String("hello");//heap memory
        String s3 = "hello";//scp
        
        //== operator and equals() method
        if (s1 == s2) {
            System.out.println("s1 and s2 equal");
        } else {
            System.out.println("s1 and s2 not equal");
        }
        
        //JVM string is present in scp
        //return s3
        
        if (s1 == s3) {
            System.out.println("s1 and s3 equal");
        } else {
            System.out.println("s1 and s3 not equal");
        }
    }
}