package com.class15;

public class StringMethods {
	public static void main(String[] args) {
		//
		String str="java classes at Syntax are awesome";
		str=str.replace("awesome", "great");
		System.out.println(str);
		
		System.out.println(str.replace("Git", "SDLC"));  //no changes value
		str=str.replace("a", "12345%$&");
		System.out.println(str);
		
		//replaceAll--->>> specify regular expression
		//lets remove all special cahrcherts
		str=str.replaceAll("[^a-zA-z0-9]","");
		System.out.println(str);
		
		//split-->
		String myString="java classes at Syntax are awesome";
		String[] array=myString.split("a");   // a dan 7 adet var--8 gosteriyor herzaman 1 fazla
		
		System.out.println(array.length);
		
		
		
	}

}
