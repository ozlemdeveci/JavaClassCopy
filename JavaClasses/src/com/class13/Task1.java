package com.class13;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		//Using to maniulation in java changing something
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your class day:: ");
		String day=scanner.nextLine();
		if(day.equals("Saturday")) {// two way day.toLowercase().equals
			                        //or day.ignoraCase().equals
			System.out.println("Saturday is your Java Class");
		}else if(day.equals("Sunday")) {
			System.out.println("Sunday is your Git class");
		}else if(day.equals("Tuesday")) {
			System.out.println("Tuesday is your SDLC class");
		}else if(day.equals("Thursday")) {
			System.out.println("Thursday is your Manual Testing  class");
		}else if{
			System.out.println();
		}
		
		
		scanner.close();
	}

}
