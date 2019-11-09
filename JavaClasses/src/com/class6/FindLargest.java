package com.class6;

import java.util.Scanner;

public class FindLargest { //problem eger 1 ve 3esitse sikinti
public static void main(String[] args) {
	//to find largest of three double values using if-else and logical
	// operators provided by a user(numbers must be distinct
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter 3 distinct for numbers "); 
	        double num1=scan.nextDouble();
			double num2=scan.nextDouble();
			double num3=scan.nextDouble();
	if(num1!=num2 || num1!=num3) {
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Largest num is = "+num1);
			}else {
				System.out.println("largest num is = "+num3);
			}
	   }else {
		   if(num2>num3) {
			   System.out.println("largest num is =" +num2);
		   }else {
			   System.out.println("largest number is ="+ num3);
		   }
	    }
	}else {
		System.out.println("numbers are equals");
	}
		   }
	
	
	
	
	
}
