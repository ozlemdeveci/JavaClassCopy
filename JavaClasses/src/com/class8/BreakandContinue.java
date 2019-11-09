package com.class8;

public class BreakandContinue {
	public static void main(String[] args) {
		//break keywords break/exist the loop
	  for(int i=0; i<10; i++) {
		  
		  if(i==7) {
			  break;
		  }
		  System.out.println(i);
	  }
	  System.out.println("i am outside the loop");
	  //continue it will skip current iterarion
	  
	  for( int i=1; i<=5; i++) {
		  if(i==3 || i==4) {
			  continue;
		  }
		  System.out.println(i);
	  }
	  System.out.println("***********");
	  
	  
	  //i want to print numbers from 1 to 20 expect 5 6 and 7
	  
	 for(int a=1; a<=20; a++) {
		 if(a==6|| a==7 || a==5) {
			 continue;
		 } System.out.println(a);
	 } System.out.println("2****************************");
	 for(int b=1; b<=20; b++) {
		 if(b>=5 && b<=17) {
			 continue;   //thats for not print 5 to 17
		 } System.out.println(b);
	 }

}
}