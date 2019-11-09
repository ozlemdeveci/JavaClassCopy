package com.class7;

public class DoWhile {
public static void main(String[] args) {
	//mostly used
	int num=1;
	
	while(num<=7) {
		System.out.println("Hello");
        num++;	
	}
	//rare
	int num1=1;
	do {
		
		System.out.println("Bye");
		num1++;
	}while(num1<=7);
	System.out.println("^^^^^^^^^^^^^^");
	
    int num2=10;
	while(num2<=7) {
		System.out.println("Hello");
        num2++;	
	}
	
	int num3=10;
	do {
		
		System.out.println("Bye");
		num3++;
	}while(num3<=7);
	System.out.println("^^^^^^^^^^^^^^");
	// print give an numbers from 20 to 50 using do while
	
	int even=20; 
	do {
		System.out.println(even);
		even+=2;
	}while(even<=50);
		
	//second way
	int even1=20;
	do {
		if(even1%2==0) {
			System.out.println(even1);
		}even1++;
	}while(even1<=50);
		
		
	}
	
	
}
	
	
	

