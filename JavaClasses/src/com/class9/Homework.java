package com.class9;

public class Homework {
	public static void main(String[] args) {
		//Print the following pattern:
		//	55555
		//	4444
		//	333
		//	22
		//	1  
		for(int a=5; a>=1; a--) {          //rows
			for(int b=1; b<=a; b++) {      //cols
				System.out.print(a);
			}System.out.println();
		}

			//Print the following pattern:
			/* *
			 * **
			 * ***
			 * ****
			 * *****
			 * ****
			 * ***
			 * **
			 * *
			 */
       for(int y=1; y<=5; y++) {
    	   for(int g=1; g<=y; g++) {
    		   System.out.print("*");
    	   }System.out.println();
       }
       for(int y=4; y>=1; y--) {
    	   for(int g=1; g<=y; g++) {
    		   System.out.print("*");
    	   }System.out.println();
       }


	}

}
