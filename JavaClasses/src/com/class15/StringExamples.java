package com.class15;

public class StringExamples {
	public static void main(String[] args) {
		//get a character spesific location
		String str="Syntax Technologies Inc";
		char letter=str.charAt(5);   //out just one charcher 'x'
		System.out.println(letter);
		//lengt is 19 but we have 0 1 2... 18 elements so out is expection out of range
	//	System.out.println(str.charAt(str.length()));
		
		System.out.println(str.charAt(str.length()-1));
		
		//get a substring from a String
		//print Syntaxt
		System.out.println(str.substring(0,6));
		
		System.out.println(str.substring(7));
		
		
		
		
	
}}
