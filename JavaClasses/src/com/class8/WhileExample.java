package com.class8;

import java.util.Scanner;

public class WhileExample {
 public static void main(String[] args) {
	/* lets ask user  to enter if its raining or not (true or false
	 * as long there is rain lets keep asking
	 * no rain as soon as you can go to the park
	 */
	 Scanner scan;
	 boolean isRain;
	 scan=new Scanner(System.in);
	 
	 do {  //as long as is rain its keeping continue asking
		 System.out.println("Is it raining?");
		 isRain=scan.nextBoolean();
	 }while(isRain); 
		 System.out.println("Go to the park");
	 
	 
}
}
