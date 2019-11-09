package com.class4;

public class task1 {
public static void main(String[] args) {
	/*store a boolean value of whether user has diplama or not 'if has a diploma--congratulations
	 * otherwise --to get a degree:if degree check a gpa score .
	 * higher or equal=3,5 --you are eligible for schoolership 
	 * otherwise--you should  have studied harder
	 */
	boolean diploma=true;
	double gpa=3.5;
	 if(diploma) {System.out.println("Congratulations");
	       if (gpa>=3.5) {System.out.println("You are eligible for schoolership");
	       }else {System.out.println("You should havce studied harder");}
	       
	 
	 }else {System.out.println("To get degree");}
}
	
	
	
}
