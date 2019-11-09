package com.example;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	//.Write a program to calculate the factorial of a given number. (8!=?)
	//Example
	//Input=8;
	//Output= 40320
		Scanner num=new Scanner(System.in);
		System.out.println("PLease enter a number for finding factorial");
		int number=num.nextInt();
		int factoriel=1;
		if(number<=0) {
			System.out.println("invalid number");
		}else {
			for (int i = 1; i <= number; i++) {
				factoriel=factoriel*i;
			}
		}
		
	System.out.println("enter number is:"+number+" factoriel is: "+factoriel);

}
}