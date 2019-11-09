package com.class3;

public class RealationalOperators {
	
	public static void main(String [] args) {
		// relational &equality operators > >= < <= == !=
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2); 
		System.out.println(num1<num2);
		System.out.println("******");
		double d=1.99;
		double d1=2.99;
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
	    boolean b3=d!=d1;
	 System.out.println(b1); //true
	 System.out.println(b2); //false
	System.out.println(b3); //true
	System.out.println("########");
	int a=20;
	int c=30;
	// if number a is bigger tahn numberb
	// i wan to print a is larger than b
	 if (a> c) {
		 System.out.println("a is larger than c");
	 }else {System.out.println("a is smaller than c");
		 }
	//the result of relations &equality is Boolean value true false
	 //during run time based on the condition 
	
	//if9bbolean experesssion) eksik !!!!!

	int num4=99;
	int num5=100;
	if(num4==num5) { System.out.println("Number are equal");}
	else { System.out.println("number are not equal");
} 
	boolean  val=false;
	if(val) // if value true val==true
	{System.out.println("Hello");}
	else { System.out.println("Bye");}
	
	boolean isRain=false;
	//if it is raining i will take umbrellla otherwise i go to for awalk 
	
	if(isRain) {//isRain==true
		System.out.println("i will take umbrella");}
	else { System.out.println("i go  for a walk ");
		
	}
	}
	
}
