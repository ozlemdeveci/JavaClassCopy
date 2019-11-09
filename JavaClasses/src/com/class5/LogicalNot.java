package com.class5;

public class LogicalNot {
	public static void main(String[] args) {
		boolean b1=!true;
		boolean b2=!false;
		
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;        // tarffic=false !traffic=true,
		if(!traffic) {               //just if inside is true we will write hello
			System.out.println("hello");
		}else {
			System.out.println("bye");
		}
		 boolean isRain=false;
		 if(!isRain) {
			 System.out.println("take an umbrella");
	     }else {System.out.println("dont need an umbrella");}
		
		 //if traffic  late, else on time
		 boolean traffic1=false;        
			if(!traffic1) {               
				System.out.println("will  on time");
			}else {
				System.out.println("late");
			}
		
		//lets compare 2 numbers using not operator
			int num1=10;
			int num2=11;
			if(num1==num2) {System.out.println("numbers are equel");
			}else { System.out.println("number are not equal");
		}
	if(!(num1==2)) {
		System.out.println("number are not equals");
	}else {System.out.println("numbers are equal");
	}
  // if name is not marry  or anna then you are not my sister
	String name="Mary";
	String name2="Anna";
	//true or false--- true add NOT --false
	 if(!(name.equals("mary")|| name.equals("anna"))) {
		 System.out.println("you are not my sister");
	 }else {System.out.println("you are my sister");}
	
	
	
	
}}
