package com.class4;

import java.util.Scanner;

public class ScannerPractice {
 public static void main(String[] args) {
	 
	 // ask user to enteer 2 number and then compare
	 //which is larger
	 Scanner numara=new Scanner(System.in);
	 System.out.println("Please enter your first number");
	  int num1=numara.nextInt();
	  
	  System.out.println("please enter your second number");
      int num2=numara.nextInt();
      
      if(num1>num2) {System.out.println(num1+" larger than "+num2);}
      else if(num1==num2) {System.out.println(num1+" equel "+num2);}
      else {System.out.println(num1+" smaller than "+num2);}
      
    
	 
	 
}
}
