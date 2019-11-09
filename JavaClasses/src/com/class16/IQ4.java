package com.class16;

public class IQ4 {
	public static void main(String[] args) {
		//find out the part of the string from a string
		//waht is substring
		//find number of words a string
		String str="Today is very cold outside";
		String substring=str.substring(0, 5);
		System.out.println(substring);
		
		/*step1 split based on the space --> array of string
		 * step2 find the lengt of an array
		 */
		String[] words=str.split(" ");
		System.out.println(words.length);
		
	}

}
