package com.class15;

public class IQ1 {
	public static void main(String[] args) {
		//Q1; write a program to swap 2 numbers without a temporary
		//variable?
		int a=10;
		int b=20;
		a=a+b;  //30
		b=a-b; //30-20=10
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		String str1="Hello";
		String str2="Bye";
		//str1=str1+str2;// HelloBye
		//str2=str1.substring(0,5); //Hello
		//str1=str1.substring(5); //Bye
		//System.out.println("str1="+str1);
		//System.out.println("str2="+str2);
		//garanty way
		str1=str1+str2;// HelloBye
		str2=str1.substring(0,str1.length()-str2.length()); //Hello
		str1=str1.substring(str2.length()); //Bye
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		
		
		
		
		
		
	}

}
