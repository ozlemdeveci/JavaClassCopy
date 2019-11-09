package com.class8;

public class TaskEx {
	public static void main(String[] args) {
		// print num 1 to 50 except those that are divisible by 3
		int c;
		for(c=1; c<=50; c++) { 
			if(c%3==0) { 
				continue;
			}
			System.out.println(c);
		}
		
		
	}

}
