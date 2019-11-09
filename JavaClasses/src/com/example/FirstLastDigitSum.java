package com.example;

import java.util.Scanner;

public class FirstLastDigitSum {
	public static void main(String[] args) {
	//*********** repeat that
	//Write a program to find sum of first and last digit
	//The program needs to find the first and the last digit of number, 
	//using a loop and print the sum of the first and the last digit of that number.
	//If the number is negative than the program needs to print "Invalid value"
	//Example output:
	//252    Should print 4, the first digit is 2 and the last is 2 
	//which gives us 2+2 and the sum is 4
	//257    should print 9, the first digit is 2 and the last is 7 
	//which gives us 2+7 and ht sum is 9
	//-10    sould print "Invalid value",  since number is negative and
	//needs to be positive
		Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int number=scan.nextInt();
	int LastDi=number%10;
	int FirstDi=0;
	for(int i=0; i<=number; i++) {
		FirstDi=number%10;
		number=number/10;
	}
	System.out.println(FirstDi);
	System.out.println(LastDi);
	

}}
