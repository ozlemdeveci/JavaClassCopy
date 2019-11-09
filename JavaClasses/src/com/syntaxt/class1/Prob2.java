package com.syntaxt.class1;

public class Prob2 {
public static void main(String[] args) {
	//Write a program to find if the largest Number of three numbers
    //Print out  System.out.println("Largest number is " + largestNumber);
     // Must use if then a else if and lastly else 
	
	int num1 = 2; 
	int num2 = 2; 
	int num3 = 3;
	if (num1>num2 && num1>num3) {
		System.out.println("Largest number is " + num1);
	}else if (num2>num1 && num2>num3) {
		System.out.println("Largest number is " + num2);
	}else {
		System.out.println("Largest number is " + num3);
	}
}
}
