package com.class15;

public class StringManipulation {
 public static void main(String[] args) {
	//string class comes in java lang package 
	 //2 ways to create a String
	 //first way
	 String str="Hello";
	 //second
	 String str1=new String("Hello");
	 System.out.println(str);
	 System.out.println(str1);
	 
	 //inside string have many methos that can be performed on strings;
	 //1)find number of characters inside the string ( .length()  )
	 int length=str.length();
	 System.out.println(length);
	 
	 //2)case converstation methods /functions
	 
	System.out.println(str.toLowerCase());//hello
	System.out.println(str);  //Hello
	str=str.toLowerCase().toUpperCase(); // 
	System.out.println(str); // HELLO
	
	//verify if there if the string is empty
	String myString="";
	boolean isEmpty=myString.isEmpty();
	System.out.println(isEmpty); // true //Empty value
	
	String myString1=null;
	//System.out.println(myString1.isEmpty());  //no value at all //out is expection
	//String myString1; same
	//System.out.println(myString1.isEmpty());
	
	//how to verify existence of characters in the string
	String a="Good evening students";
	boolean exist=a.contains("students");
	System.out.println(exist); //true  (student is true)
	
	System.out.println(a.startsWith("Good"));  //true
	System.out.println(a.endsWith("student"));  //false// for true has to students
	
	
	
	
	 
	 
	 
}
	
}
