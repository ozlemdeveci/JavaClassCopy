package com.class8;

public class Task {
	public static void main(String[] args) {
		// print 1 to 100 1`line with space
		//print 100 to 1
		//print 20 to 1
		//print  odd number 20 to 50
		
		 for(int i=21; i<=50; i+=2) {
			
				 System.out.println(i);
		 }
		 //2.way
		 for( int i=20; i<=50; i++) {
			 if(i%2==1)
				 System.out.println(i);
		 }
	System.out.println("&&&&&&&&&&&&");	 
	//
	int sum=0;
	for(int i=1; i<=5; i++) {
		sum=sum+i;
		System.out.println(sum);
	}
	System.out.println("&&&&&&&&&&&&");	 
	//out }
	int sum1=0;
	for(int i=1; i<=5; i++) {
		sum1=sum1+i;
		System.out.print(sum1 +"+");
		}
	System.out.println(" ");
	System.out.println(sum1);
	
	System.out.println("&&&&&&&&&&&&");	 
	 int sumA=0;
	for(int i=0; i<=50; i+=5) { 
		sumA=sumA+i;
	}System.out.println(sumA);
	
	
	int total=2;
	for(int y=1; y<=3; y++) {
		total=total*y;  //2.1=2  2.2= 4   4.3=12
	}System.out.println(total);
	}

}
