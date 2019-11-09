package com.class5;

import java.util.Scanner;
// import short cut cntl+shift+O
public class AnotherWays {
	public static void main(String[] args) {
		/*user to enter daily salea
		 * based on the sales range we want to give commission to the person
		 * sale<100 commision10%
		 * 100-200 commision %20
		 * 
		 */
		double salesAmount;
		Scanner scan;
		double commisson;
		scan=new Scanner(System.in);
		System.out.println("plesae enter you sales amount");
		salesAmount=scan.nextDouble();
		
		if(salesAmount<100) {
			commisson=salesAmount*0.1;
		}else if(salesAmount>=100 && salesAmount<=200) {
			commisson=salesAmount*0.2;
		}else if(salesAmount>=200 && salesAmount<500) {
			commisson=salesAmount*0.3;
		}else if(salesAmount>=500) {
			commisson=salesAmount*0.5;
		}
		else {commisson=0;}
		System.out.println("based on value commision is"+commisson);
		
	}
	

}
