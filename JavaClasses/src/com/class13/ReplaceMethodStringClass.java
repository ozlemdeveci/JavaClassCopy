package com.class13;

public class ReplaceMethodStringClass {
	public static void main(String[] args) {
		
	
	/*.replace
	 * this method return a new string resulting
	 * from replacing all occurddences of oldChar;
	 * in this string with newChar
	 */
		String str="Hello Dear Dan, how are you, How you been?";
		
		System.out.println(str.replace('n','z'));
		System.out.println("==============");
		System.out.println(str.replace("Dear Dan","Respected Ben"));
        System.out.println(str.replaceFirst("Dan", "Ben"));
        
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", " ");

        System.out.println(replace);
	
	
	
}}
