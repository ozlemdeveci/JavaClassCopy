package com.class6;

import java.util.Scanner;

public class Homework {
public static void main(String[] args) {
	
	Scanner scan;
	int quiz,midTerm, finalScore, average;
	
	scan=new Scanner(System.in);
	System.out.println("plesae enter quiz score");
	quiz=scan.nextInt();
	
	System.out.println("please enter mid term score");
	midTerm=scan.nextInt();
	
	System.out.println("please enter final score");
	finalScore=scan.nextInt();
	
	average=(quiz+midTerm+finalScore)/3;
	if (average>90) {
	System.out.println("A");
	}else if(average<90 && average>=70)
	{System.out.println("B");
	}else if(average<70 && average>=50) {
		System.out.println("C");
	}else if(average<50) {System.out.println("D");
	}else {System.out.println("unknown");}
	}
	
	
	

}
