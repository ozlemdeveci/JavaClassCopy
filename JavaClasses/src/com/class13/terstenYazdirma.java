package com.class13;

public class terstenYazdirma {
	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		String day="Sunday";
		for(int s=day.length()-1; s>=0; s--) {
			System.out.print(day.charAt(s));
		}
		//or
		//for(int j=day.length(); j>0; j--) {
		//	System.out.print(day.charAt(j));
		//}
		
	}

}
