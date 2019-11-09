package com.class6;

import java.util.Scanner;

public class homGrade {
public static void main(String[] args) {
	/*ask grade a-excelent
	 * b-good
	 * c avarage
	 * d-bad
	 * others not accepteble
	 * with explanition which garde...
	 */

    
     String word;
   Scanner scan;
   scan=new Scanner(System.in);
   System.out.println("Enter your exam grade?");

    char grade=scan.next().charAt(0);
    switch (grade) {
    case 'A':
    	word="Excellent";
    	break;
    case 'B':
    	word="Good";
    	break;
    case 	'C':
    	word="Avarege";
    	break;
    case 'D':
    	word="bad";
    	break;
    default:
        word="unknown";
    }
    System.out.println("your grade is "+grade+" :"+word);

}
	
	
	
}
