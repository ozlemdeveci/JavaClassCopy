package com.syntaxt.class1;

public class For {
public static void main(String[] args) {
	for (int i=0;    i<=4;           i++) {
		System.out.println("Good morning");
		}
		//print numbers from 1-10;
		for (int i=1; i<=10; i++) {
		System.out.println(i);
		}
		//print numbers from 10-1
		for (int i=10; i>=1; i--) {
		System.out.println(i);
		}
		for (int i=0; i<=50; i+=5) {
		System.out.println(i);//5, 10, 15, 2		
		}
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
			break;
			}
			System.out.println(i);
			}
			System.out.println("**********************");
			// continue - it will skip CURRENT iteration
			for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
			continue;
			}
			System.out.println(i);
			}
			System.out.println("*******************");
			// I want to print nums from 1 to 20 except 5,6,7
			for (int a = 1; a <= 20; a++) {//5
			if (a >=5 && a<=17) {
			continue;
			}
			System.out.println(a);
		
}
}}
