package com.class7;

public class WhileLoopPractice {
public static void main(String[] args) {
	//how to print numbers from 1 to 20
	int i=1;
	while ( i <=20) {
		System.out.println(i);
		i++;
	}
	// i want to print 10 to 30
	int y=10;
      while(y<=30) {
		System.out.print(y +" ");
		y++;
		}
      // 10 to 1
	int a=10;
	while(a>=1) {
		System.out.println(a);
		a--;}
	//print values from 50 to 20
       	int t = 50;
			while( t >= 20 ) {
				System.out.println(t);
			     t-- ;
			     }
			// iwant to print all even numbers from 1to 20
			// 1way
			 int z=2;
			 while (z<=20) {
				 System.out.println(z);
				 z+=2;
				 }
			 //way2 
			 int q=1;
			 while(q<=20) {
				 System.out.println(".");
				 if(q%2==0) {
					 System.out.println(q);
				 }
		       	 q++;
			 }		
			 System.out.println("///////////////////////////");
			 //print only odd number from 50 to 100
			 //print only even num from 100 to 1
			 
			 int odd=49;
			 while(odd<=100) {
				 System.out.println(odd);
				 odd+=2;
			 }
			 int even=100;
			 while(even>=1) {
				 System.out.println(even);
				 even-=2;
			 }
}
}
