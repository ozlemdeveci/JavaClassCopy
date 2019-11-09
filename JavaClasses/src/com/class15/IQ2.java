package com.class15;


import java.util.Arrays;

public class IQ2 {
	public static void main(String[] args) {
		// write a po to find the second largest num in the array?
		//maxi and min number in the array
		 int[] array= {100,-90, 8787, 897,0, 1};
		 //1 easiest way
		 Arrays.sort(array);   //sort is function if they dont want 
		 int min=array[0];     //use function we cant use
		 int max=array[array.length-1];
		 System.out.println(min);
		System.out.println(max);
		
		//2 way
		int[] myArray= {100,-90,8787, 898, 0,1, -90,8787};
		int largest=myArray[0];
		int smallest=myArray[0];
		
		for(int i=0; i<myArray.length; i++) {
			if(myArray[i]>largest) {
				largest=myArray[i];
			}
			if(myArray[i]<smallest) {
				smallest=myArray[i];
			}
		}
		System.out.println("The smallest="+smallest);
		System.out.println("The Largest="+largest);
		
		int[] nums= {100,-90,8787, 898, 0,1, -90,8787};
		int large=nums[0];
		int secondLarge=nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]>large) {
				secondLarge=large;
				large=nums[i];
			}
			if(nums[i]>secondLarge && nums[i]<large) {
				secondLarge=nums[i];
			}
			
		}System.out.println("The second  largest="+large);
		System.out.println("The Largest="+secondLarge);
		
		
		
		
		
	}

}
