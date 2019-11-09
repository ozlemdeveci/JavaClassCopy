package com.class5;
import java.util.Scanner;
public class task {
	
	public static void main(String[] args) {
		//Write a program that will print whether it is
		//a weekend or weekday. If any day from 1-5 → output “It is a weekday”, 
		//anyday from 6-7 → output “It is a weekend”,
		//any other day → output “Invalid day”


//Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
//short (under 5 feet)
//medium(5 to 6 feet)
//tall (6 feet and over)
		
	int day=3;
	if(day==1 || day==2 || day==3 || day==4 || day==5) {
		System.out.println("Its weekday!");
	}else if(day==6 || day==7) {
		System.out.println("its weekend!");
	}else {System.out.println("its valid day :(");}
	
	Scanner height=new Scanner(System.in);
	System.out.println("what is your height?");
	 int he=height.nextInt();
	 if(he<5) {
		 System.out.println("short");
	 }else if(5<=he && he<6){System.out.println("medium");
	 }else if(he>=6) {System.out.println("tall");
	 }else {System.out.println("valid code");}

	
	
	
	
	
	}
}

