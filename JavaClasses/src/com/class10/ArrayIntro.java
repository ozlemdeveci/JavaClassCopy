package com.class10;

public class ArrayIntro {
	public static void main(String[] args) {
	
			int a;
			a=10;
			
			int a1=10;
			//1.way
			int[] b;                     //declare an array prefferred way
			int  c[];
			b=new int[4];                //initalize an array
			
			//2.way ----- al in 1 line (declaration &initalization)
			int[]  array =new int[4];
			array[0]=10;
			array[1]=20;
		    array[2]=30;
			array[3]=40;
			//acces value from an array
			System.out.println(array[2]);
			
			//lets create an array that will store classes
			String[] classes=new String[4];
			classes[0]="java";
			classes[1]="SDLC";
			classes[2]="Manual testing";
			classes[3]="GIT";
			
			//today we have java class 
			System.out.println("Today we have "+classes[0]+" class");
			
			int[] nums=new int[3];
			nums[0]=1;
			nums[1]=2;
			nums[2]=3;
			// how can change 1 to 100
			nums[0]=100;
			System.out.println(nums[0]);
			System.out.println(nums[0]+nums[2]);
			
			String[] names=new String[3];
			names[0]="Diana";        //if delete names[0] sysonames[0] gonna null
			names[1]="seda";        //names are elements in here
			names[2]="jaime";
			// names[3]="Olga"; during runtime we will get an expection
			//(runtime expection)
			//arrayindext out of bounds expection
			//System.out.println(names[3]);
			
			//
			double[]  numbers=new double[4];   // o,100,0,200
			numbers[1]=100;          //if store less elements-- default value
			numbers[3]=200;          //will be assigned to your array
			
			System.out.println(numbers[2]);
			
}
}