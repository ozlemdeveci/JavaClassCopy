package com.class4;

import java.util.Scanner;

public class Task3 {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("please enter temputure fahrenaiyt");
	int temp=scan.nextInt();
	
	 System.out.println("please enter your city");
	 String cityName=scan.next(); // we use next nextLine if use we have to make first string 
	 
	int cTemp=(temp-32)*5/6;
	System.out.println("The temputure in "+cityName+"  "+cTemp);
}
	
	
}
