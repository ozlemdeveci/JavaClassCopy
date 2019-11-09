package com.class14;

public class SplitMethod {
	public static void main(String[] args) {
		
		/*.split
		 * this method splits this string around matches of the given regular expression
		 * split the following string into array of string/work
		 */
		String str="Video provides a powerful way to help you prove your point";
		
		//cant use this
		//System.out.println(str.split(" ")); out is junk
		
		String[] array=str.split(" ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("*********************");
		// how can we find how many sentences are in thge following strin
		String str1="Today is Sunday.its suny day. and we are having java class";
		String[] array2=str1.split("\\.");  //we cant use justfind . 
		System.out.println(array2.length);  //out is showing "3" meaning 3 sentences
		
		for(String string:array2) {
			System.out.println(string.trim()); //we can use trim just there not array2 inside
		//we print all sentences
		}
		
		
		
	}

}
