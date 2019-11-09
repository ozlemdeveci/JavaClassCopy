package com.class14;

public class StringRecap {
	public static void main(String[] args) {
		String str=new String("Hello");
		String str3=new String("Hello");
		System.out.println(str==str3); // thats out is"false" because 
		                               //they are different object
		System.out.println("****************");
		
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);//thats true beacuse we didnt create ne object
		
		System.out.println(str);
		String str2=str.replaceAll("hello","bye");
		System.out.println(str2);
		
	}
	

}
