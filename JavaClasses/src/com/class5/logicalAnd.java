package com.class5;

public class logicalAnd {

	
	public static void main(String[] args) {
		/*if number between 1-10 small
		 *between 11-100 medium 
		 * between 100-1000 large
		 * any other number is out of range
		 * && and demek
		 * 
		 */
		int num=200;
		if (num>1 && num<10) {System.out.println("this number small");
		}else if (num>=10 && num<100){
			System.out.println("medium num");
		}else if(num>=100 && num<1000) {
			System.out.println("this number is large\"");
		}else {System.out.println("number is out of range");
		}
	}
		
		
		
		
	
}
