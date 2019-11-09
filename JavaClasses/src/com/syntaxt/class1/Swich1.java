package com.syntaxt.class1;

import java.util.Scanner;

public class Swich1 {
	public static void main(String[] args) {
		//Write a program that will use a switch
		//statement to display what month we're in.	
		 
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a month");
        
        String month=scan.nextLine();
        String monthName;
        switch(month) {
        
		 case "January":
			 monthName="We are in january";
		     break;
		 case "February":
			 monthName="We are in February ";
		     break;
		 case "March":
			 monthName="We are in March ";
	     break;
		 case "May":
			 monthName="We are in May";
	     break;
		 case "June":
			 monthName="We are in June";
	     break;
		 case "July":
			 monthName="We are in July ";
	     break;
		 case "August":
			 monthName="We are in August ";
	     break;
		 case "September":
			 monthName="We are in September";
	     break;
		 case "October":
			 monthName="We are in October";
	     break;
		 case "November":
		 monthName="We are in November";
	     break;
		 case "December":
			 monthName="We are in  December";
	     break;
		 default:
			 monthName= "Invalid month";
	}

}}
