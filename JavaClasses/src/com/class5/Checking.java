
	package com.class5;
	import java.util.Scanner;
	public class Checking {
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter your age");
	    int age=scan.nextInt();
	    String human = null;
	    if (age>=1 && age<=3) {
	        //System.out.println("you are baby");
	    human="baby";
	    }else if (age>3 && age<=5) {
	        //System.out.println("you are a toddler");
	        human="toddler";
	    }else if(age>5 && age <=12) {
	        //System.out.println("you are a kid");
	        human="teenager";
	    }else if(age>12 && age <=19) {
	        //System.out.println("You are teenager");
	        human="adult";
	    }else if(age>19){
	        //System.out.println("you are an adult");
	    }else {
	        //System.out.println("you are old");
	        human="unknown";
	    }
	    System.out.println("You are " + human);
	}
	}

