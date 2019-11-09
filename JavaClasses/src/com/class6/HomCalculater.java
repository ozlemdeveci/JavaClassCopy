package com.class6;

import java.util.Scanner;

public class HomCalculater {
public static void main(String[] args) {
	//using sacnner class create calculater allow user to enter 2 number
	//and operator dolrt islem provide user
	
		Scanner scan=new Scanner(System.in);
		int num1,num2;
		char operator;
		int result = 0;
		
		System.out.println("Enter first number");
		
		num1=scan.nextInt();
		System.out.println("Enter second number");
		
		num2=scan.nextInt();
		System.out.println("Please enter your operator");
		
		operator=scan.next().charAt(0);
		
		switch(operator) {
		
		case '+':
			result=num1+num2;
			break;
			
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
				System.out.println("invalid");
			break;
		}
		System.out.println("result= " +result );
	}

}