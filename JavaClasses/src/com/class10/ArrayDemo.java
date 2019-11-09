package com.class10;

public class ArrayDemo {
	public static void main(String[] args) {
		
		//int[]  nums=new int[2147483647]; last range
		
		int[]  nums=new int[5];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
	        //to find number of elements inside an array we use .length
		System.out.println(nums.length);   // how many element have? length 
		
		             //array  0      1        2        3
		String[]  array= {"winter","fall", "summer", "Spring"};
		//i was born in summer
		System.out.println("i was born in "+array[2]);
		//array.length return an int
		int arraySize=array.length;
		System.out.println(array.length);
		
		int[] score= {80, 90, 30,70,90,100};   // esair create
		
	}

}
