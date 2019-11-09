package com.class13;

import java.util.Scanner;

public class PrintInMiddle {
	public static void main(String[] args) {
	//Create a String and if the String is not empty perform the following: 
	//if the String has an odd number of characters and has 3 or more characters, 
	//print the character in the middle of the String.
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		if(!(word.isEmpty())) {
			if(word.length()%2==1 && word.length()>=3) {
				System.out.println(word.charAt(word.length()/2));
			}
		}
		
		
	}

}
