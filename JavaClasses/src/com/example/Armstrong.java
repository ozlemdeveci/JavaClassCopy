package com.example;
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
	//3.Write a program to determine  whether given number is Armstrong number or not?
	//�Armstrong number is a number that is equal to the sum of cubes of its digits.�
	//		Examples	Input=153		Output= true
	//		            Input=155	    Output=false
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=scan.nextInt();
	int num1=num;
	int sum=0;
	int digit=0;
	int a;
	int b=0;
	for(int i=0; i<=num; i++) {
if(num>10) {
			b=num%10;
			digit=b*b*b;
			num=num/10;
			sum=sum+digit;	
}
if(num<10) {
	       b=num;
	       digit=b*b*b;
	       num=num/10;
		   sum=sum+digit;
}}   	System.out.println(sum);
		boolean result=true;
		if (sum==num1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}	
}
}
