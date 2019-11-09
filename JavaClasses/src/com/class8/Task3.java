package com.class8;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		//create prog ask user for credit card 10 times
		//as sson as you get answer "yes" stop asking
		String card;
		Scanner scan=new Scanner(System.in);
		
		for(int q=1; q<=10; q++) {
			System.out.println("do you need credit card?");
			card=scan.next();
			if(card.equals("yes")) {
				break;
			}
		}
		
		
	}

}
