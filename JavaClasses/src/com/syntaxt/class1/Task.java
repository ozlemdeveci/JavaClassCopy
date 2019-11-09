package com.syntaxt.class1;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		/*
		* Create a boolean variable workDay and assign tru
		e create
		int variable day and
		* assign it to 1 As long as it is workDay print
		and
		increase
		* day. Once day is 6 print
		*/
		
	//boolean workDay = true;
	//	int day = 1;
	//	while (workDay) {
	//	if (day == 6 || day==7) {
	//	workDay = false;
	//	System.out.println("I do not need a day of anymore");
	//	}else {
	//System.out.println("I need a day off");
		//}
		//day++;
		//}

	     //	Task One	
		/* print only even numbers from 1 to 20 */
		int i=1;
		while ( i<=20) {
			if(i%2==0) {
				System.out.println(i);
			}i++;
			}
		
		
		//Task Two
		// how to print numbers from
		 //  5 to 25 inclusive all in 1 line with s between?	
		int n=5;
		while(	n<25) {
			System.out.print(n+" ");
			n++;}
				 
		 //Task Three 
		/* Prompt the user to ask the name 
		 * 3 times and print "Hello____" 
		 *
		 * */
		String name;
		 Scanner scan;
		Scanner scan=new Scanner(System.in);
		 name=scan.next();
		 int a=1;
		 while(a<3) {
		 System.out.println("Please enter your name");
		 System.out.println("Hello"+ name);
		 a++;}
	}}


