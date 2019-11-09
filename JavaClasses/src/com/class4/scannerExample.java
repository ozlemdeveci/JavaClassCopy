package com.class4;

import java.util.Scanner;

public class scannerExample {
public static void main(String[] args) {
	/*scanner is a class in java that will allow us to take an input from auser
	 * scanner will help us to make our program more interractive
	 * chose scannerbig harf after choose import  utl for bringing class
	 */
     Scanner scan=new Scanner(System.in);  //ENABLE OUT
     System.out.println("PLEASE ENTER ANY NUMBER");
     	/*nextInt(); -->for numbers
     	 * nextLine();   Strings
     	 * nextDouble();  -> double 
     	 * hit scan after came nextInt for number
     	 */
	   int number =scan.nextInt();  //kullanicinin  NUMARA girmesi icin olaN KOD
	   System.out.println("Entered number is "+number);
	   
	   System.out.println("###########");
	
	   Scanner input=new Scanner(System.in);
			   System.out.println("Please enter your name");
			    String name=input.nextLine();
			    System.out.println("Good afternoon "+name+"!");
	
}
}
