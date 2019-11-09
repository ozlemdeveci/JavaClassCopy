package com.class4; 

public class NestedIfPractice {
 public static void main(String[] args) {
	 boolean isFriday=true;
	 int day=14;
	 
	 //if today is friday only day i want to
	 //checkit day is 13
	 
	 if(isFriday) {
		 System.out.println("Today is friday");
		 
			 if (day==13) {
    	 System.out.println("i will watch scary movie");
		 }else {
			 System.out.println("I will watch comedy");
		 }
	 }else { System.out.println("Today is not friday");
		 
	 }	
}}
