package com.syntaxt.class1;

import java.util.Scanner;

public class DoW {
	public static void main(String[] args) {
		   //  Task One
        //Write a program using a do while loop
         //  to print out all odd number from 0 15 
		int odd=1;
		do {
			if(odd%2==1) {
				System.out.println(odd);
			} odd++;
		}while(odd<=15);
		
		
	    //   Task Two
	  //  *keep asking user to pay for candy until
	   // entered price is not equal to 3
	   //  *after user got a write amount print 
	    //"Please enjoy your candy"
		//  
		Scanner scan=new Scanner(System.in);
		int pay = 0;
		do {
			if(pay==3) {
				System.out.println("please enter price");
				pay=scan.nextInt();
			}}while(pay!=3);
				System.out.println("enjoy the candy");
			
		
        
	
		}
}
