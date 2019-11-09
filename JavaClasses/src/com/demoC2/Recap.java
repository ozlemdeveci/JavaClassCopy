package com.demoC2;

public class Recap {
	public static void main(String[] args) {
		//conditional statetment
		/*1.if condition 2.switch case
		 * if(boolean expression0{ code of is block }
		 *  }else{
		 *        code of else block}
		 *  .  else is optional block
		 *  if you want to find wether number is positive
		 *  int num; num=23;( check positif for)
		 *  if (num>0) {System.out.println(num +"is apositif');
		 *  System.outprintln(num+' is a negative number ");
		 *  if we cahnged num=90 out will positif
		 *  if num-=200;  (90-200 out is negatif  -110)
		 *  num-=100; out is  -220
		 *  num+=220; (out is 0 will see its negatif because first(if) is wrong
		 */ 
		  int num=23;
		  num=90;
		  num-=200;
		  num-=110;
		  num +=220;
		  if (num > 0) {  System.out.println(num +" is a positif");
		 }else if (num==0) { System.out.println("Value number is "+num); 
		 } else {System.out.println(num+" is a negatif number");}
		  
		  //even(cift)  odd(tek) number(7,8)
		  int i=132;
		if (i%2==0) {
			System.out.println(i +"  is an even number");
		}else {
			System.out.println(i + "is an odd number");
		}
		//another way
		  int i1=133;
			if (i1%2!=0) {System.out.println(i1 +" is an odd number ");
			}else{
				System.out.println(i1 + " is an even number");
			}
		int integer=8;
		
	}

}
