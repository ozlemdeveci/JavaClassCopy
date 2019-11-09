package com.class4;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		
	
	/*you are DMV representative and you need to ask costumer their age
	 * if they are 18 and older you will issue a driver licence to them
	 * otherwise you will offer them to get a learners permit
	 * 
	 */
	Scanner ages=new  Scanner(System.in);
	System.out.println("Hi i am DMV representative, Can i ask your age?");
	int age=ages.nextInt();
	if (age>=18) {System.out.println("you can get driver licence");}
	else {System.out.println("i can help about taking a learners permit");}
	
	
	
	}
}
