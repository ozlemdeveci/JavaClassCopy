package com.class9;

import java.util.Scanner;

public class Homework2 {
public static void main(String[] args) {
	//Write a program that reads a range of integers
	//(start and end point), provided by a user and then from
	//that range prints the sum of the even and odd integers.
     Scanner scan=new Scanner(System.in);
     System.out.println("enter start number");
     int firstN=scan.nextInt();
     System.out.println("enter ending number");
     int secondN=scan.nextInt();
     
     int start;
     int end;
     if (firstN<secondN) {
    	 start=firstN;
         end=secondN;
     }else { 
    	 start=secondN;
    	 end=firstN;
     }
     int even=0;
     int odd=0;
     if(start<=end) {
       for( int i= start; i<=end; i++) {
    	 if(i%2==0) {
    		 even=even+i;
    	 }else {
    		 odd=odd+i;
    	 }
     }
     System.out.println("the sum of the even number "+even);
     System.out.println("the sum of the odd number "+odd);
     
     }
	//Write a guessing game where the user has to
	//guess a secret number between 1 and 20. After every guess input,
	//the program tells the user whether their number was too 
	//large or too small. The program will keep asking the user
	//to enter the number until he finds the correct number. 
    // When the correct answer is found the system should display
     //“Congratulations!!. You got it!”
     Scanner scan1;
     int secretNum, guessNum;
     
     scan1=new Scanner(System.in);
     secretNum=12;
     
     do { 
    	 System.out.println("Please guess my number 1 to 20");
    	 guessNum=scan1.nextInt();
    	 if(guessNum<secretNum) {
    		 System.out.println("yor number is small");
    	 }else if (guessNum>secretNum){
    		 System.out.println("your number is large");
    
     }while(guessNum!=secretNum);{
    	 System.out.println("congralition you got it");
     }
     
     
     
     
}
	
	
	
	
}
