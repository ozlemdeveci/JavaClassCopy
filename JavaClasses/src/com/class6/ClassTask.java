package com.class6;

import java.util.Scanner;

public class ClassTask {
public static void main(String[] args) {
	/*ask user to enter the mounth they were born
	 * based on the month define season
	 * if user born in jan feb dec---winteer
	 * may,apr may---sipring
	 * jun july agust summer
	 * sep octaber nov fall
	 * otherwise--- unkown
	 * at the end of the program
	 * "you were born in ___" 
	 */
	String  month;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("month of born");
	month=scan.nextLine();
	
	String season;
	if(month.equals("january")|| month.equals("February")|| month.equals("December"))
		{season="Winter";
	}else if(month.equals("March")||month.equals("April")||month.equals("May")) {
		season="spring";
	}else if(month.equals("June")||month.equals("July")||month.equals("august")) {
		season="summer";
	}else if(month.equals("september")|| month.equals("october")||month.equals("november")) {
		season="fall";
	}else {
		season="valid";
	}
	System.out.println("you were born in "+season);
	System.out.println(month);
	
	
	
	
}
	
	
	
	
	
	
}
