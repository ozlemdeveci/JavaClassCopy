package com.demoC2;

public class javaIfElse {
	public static void main(String[] args) {
		
		
		boolean isSelected=false;
		
		if(isSelected) {
			System.out.println("enter text to text box");
		}else {
			System.out.println("click on the checkbox");
			System.out.println("enter text to text box");
		}
		
		int num=23;
		if (num < 100) {
		         if (num >= 10) {
		             System.out.println("Its a two digit number");
		         }
		     } else if (num < 1000) {
		         if (num >= 100) {
		             System.out.println("Its a three digit number");
		         }
		     } else if (num < 10000) {
		         if(num >= 1000) {
		             System.out.println("Its a four digit number");
		         }
		     } else if (num < 100000) {
		         if(num >= 10000) {
		             System.out.println("Its a five digit number");
		         }
		     } else {
		         System.out.println("number is not between 1 & 99999");
		     }
		
		
	}
	
	

}
