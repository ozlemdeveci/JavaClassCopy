package com.class13;

public class Recap2 {
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		System.out.println(str1.equals(str2));  //true
		System.out.println(str1==str2);      //true
		
		System.out.println("<<<<<<<<<<");
		String str3=new String("Bye"); //these two is new object
		String str4=new String("Bye");
		
		System.out.println(str3.equals(str4));  //true
		System.out.println(str3==str4);  //these are two diff obj so out is false
		//we cant compare 2 differen object we declare str3=new string...
	    // they are new string declare so in different place in mmemory
	System.out.println("starts/endswith");
	
	String str5="Today is Saturday";
	System.out.println(str5.startsWith("Today"));  //->true if we write; today-->false
	System.out.println(str5.endsWith("day")); //--->true
	
	System.out.println("Concat");
	System.out.println(str5.concat( "and we have java class"));
	
	System.out.println("***trime****");
	String str6="  it is  sunny   ";
	System.out.println("before trimming: "+str6);
	System.out.println(str6.trim());
	
	System.out.println("****IndexOf and charAt****");
	String str7="Tomorrow we will be done with String Manipulation";
	System.out.println(str7.indexOf('e'));  // e nerde? 10 da
	System.out.println(str7.indexOf('E'));  // out is -1 because we dont bhave upper E
	System.out.println(str7.indexOf('e',11));  //e 10 da ama sonraki nerde?
	System.out.println(str7.indexOf("we"));
	System.out.println(" ..........Charrrrrrrrr");
	System.out.println(str7.charAt(10));
	//System.out.println(str7.charAt(2, 8));
	
	
	
	
	
	}

}
