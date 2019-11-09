package com.demoC2;

import java.util.Scanner;

public class betterCalculater {
public static void main(String[] args) {
	// int a=10;
	// int b=12;
	 
	// String name1="jhon";
	//		 String name2="john";
	// System.out.println(a==b);
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your fisrt number");
	int num1=scan.nextInt();
	
	System.out.println("Enter in operator  :");
	String operator=scan.next();
	
	System.out.println("enter your second  number");
	int num2=scan.nextInt();
	
	 if(operator.equals("+")) {System.out.println(num1+num2);}
	 else if(operator.equals("-")) {System.out.println(num1-num2);}
	 else if(operator.equals("/")) {System.out.println(num1/num2);}
	 else if(operator.equals("*")) {System.out.println(num1*num2);}
	 else {System.out.println("invali operator or number entered");}
	
	scan.close(); //we have to close what we open the system in
	
}
}
