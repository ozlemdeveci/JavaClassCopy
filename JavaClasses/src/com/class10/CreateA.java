package com.class10;

public class CreateA {
public static void main(String[] args) {
	// create an array of chars and store gardes into it; A, B, C , D ,E ,F.
	//then print a grade  B (use  2 differnt ways of creating an array0
	   //            0   1    2     3    4   5
	char[] grades= {'A' ,'B', 'C', 'D', 'E','F'};
	
	int a=2;
	System.out.println(grades[4]);
	System.out.println(grades[a]);
	
	a+=2;
	System.out.println(grades[a]);
	a--;
	System.out.println(grades[a]);
	System.out.println("********************");
	for(int i=0; i<grades.length; i++) {
		System.out.println(grades[i]);
	} System.out.println("???????????????????");
	String[] animals= {"Cat", "Dog","Cow", "Snake", "Elephant"};
	int size=animals.length;
	
	for(int i=0; i<size; i++) {
		System.out.print(animals[i]+" ,");
	}
	System.out.println("      ");
	 //create an array to store 5 double values , print
	//all in 1 line
			double[] doub= {1.1 ,2.2, 3.3, 4.4, 5.5};
			int size2=doub.length;
			for(int i=0; i<size2; i++) {
				System.out.print(doub[i]+"  ");
			}
			
	
}
}
