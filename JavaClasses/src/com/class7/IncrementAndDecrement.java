package com.class7;

public class IncrementAndDecrement {
	public static void main(String[] args) {
	
	int a=10;
	a=a+1;  //assigment 11
	a+=1;  //shorhand assigment 12
	 System.out.println(a); //12
	a++;// increment operator
	System.out.println(a); //13
	
	System.out.println("******************");
	int b=10;
	 b-=1; //9
	 b--; // decremment operator 8
             // increment$decrement operators can be used
	         //only with variables;
	 System.out.println(b);
	
	int c=23;
	c++;
	//1++ ;  --> ERROR compiler error invalid argument
	System.out.println(c);
}
}