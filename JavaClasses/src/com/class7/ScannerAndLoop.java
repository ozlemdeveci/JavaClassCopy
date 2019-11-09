package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		//ask user enter game 5 time
		//and our out put should be "good afternoon+name
		 Scanner scan=new Scanner (System.in);
		 int i=1;
		 while(i<6) {
		System.out.println("Please enter your name");
		String name=scan.nextLine();
		 
		System.out.println("Good afternoon "+ name);
		i++;
		 }
		
		
		
	}

}
