package com.class5;

import java.util.Scanner;

public class LogiacalAndScanner {
public static void main(String[] args) {
	// ask user to enter age
	//if age is from 1to 3 you are baby
	// from 3-5 you are tolder
	// 5-12 you are kid
	// 12-19 you are teenager
	// if age>20 you are an adult
	//different writing
	int age;
	Scanner ages;
	
	 ages=new Scanner(System.in);
	System.out.println("how old are you?");
	age=ages.nextInt();
	
	if(age>=1 && age<=3) {System.out.println("you are baby");
	}else if(age>3 && age<=5) {System.out.println("you are tolder");
	}else if(age>5 && age<=12) {System.out.println("kid");
	}else if (age>12 && age<=19 ) {System.out.println("teenage");
	}else if(age>=20) {System.out.println("adult");
	}else if(age<1) {System.out.println("you are too small");
	}else {System.out.println("you dont know how to write your age ");}
	
	
	
}
}
