package com.class7;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
	/*You need ask user to pay for coffee
     * You need to keep asking user to pay for it untill
     * entered price is equal=5;
     * After user paid then say "Enjoy your coffee!"
     */
	Scanner scan=new Scanner(System.in);
	int price;
	do {
		System.out.println("Please pay for your coffee");
		price=scan.nextInt();
	}while(price!=5); {
		System.out.println("Enjoy your coffee");
	} 
	
	System.out.println("SECOND WAYYYY");
	  
	int price1;
	    System.out.println("please pay your tea");
	    price1=scan.nextInt();
	    while(price1!=5) {
		System.out.println("pay your tea");
		price1=scan.nextInt();
	}
	    System.out.println("enjoy your coffee");
	
	}

}
