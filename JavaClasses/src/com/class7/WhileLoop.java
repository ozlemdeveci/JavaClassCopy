package com.class7;

public class ( {
	public static void main(String[] args) {

		int time = 8;
		if (time < 12) { // condition is true
			System.out.println("Good morning"); // code 1 executes 1
		}
		System.out.println("------");
		while (time < 12) {                     // if condition is true
			System.out.println("good morning"); // code executes infinitely-- infinity loop
			time++;
		}   for()
		   // i want to print GA 3 times /while(i<=3)or while(i<4)
		int i=1;
		
		while(i<4) {
			System.out.println("Good afternoon");
			i++;
		}System.out.println("outside of while loop");

	}
}
