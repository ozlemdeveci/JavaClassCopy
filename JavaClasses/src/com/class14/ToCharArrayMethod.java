package com.class14;

public class ToCharArrayMethod {
	public static void main(String[] args) {
		//.toCharArray
		//this method converts this string to a new character array 
		
		String str="Syntax";
		//str.toCharArray();
		//System.out.println(str.toCharArray()); //--print syntax
		
		char[] a= {'e','r','y'};   
		System.out.println(a); //print ery
		
		char[]  array=str.toCharArray();
		for(char i:array) {  //this method writing each word under 
			System.out.println(i);
		}
		
		//different from char
		//char b='w';
		//char c='a';
		//System.out.println(b+c);  //its print 216 we can make char about this sum
		
		
		
		
		
	}

}
