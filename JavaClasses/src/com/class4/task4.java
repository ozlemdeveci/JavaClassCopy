package com.class4;

import java.util.Scanner;

public class task4 {
public static void main(String[] args) {
	
	Scanner loan=new Scanner( System.in);
	
	System.out.println("If you are looking loan,how much you need?");
  int money=loan.nextInt();
  if (money<200000) {System.out.println("we can lend your money with good finance");}
  else {System.out.println("Your price too high please check other options!");}
	
}
	
	/*you are loan specialist and you need to ask user what is the amount of loan
	 * is needed
	 * if loan is less then 200000 then you would lend the money
	 * otherwise you would reject the clint
	 * 
	 * 
	 * 
	 */
}
