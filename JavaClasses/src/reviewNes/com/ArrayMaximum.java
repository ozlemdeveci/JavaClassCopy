package reviewNes.com;

import java.util.Scanner;

public class ArrayMaximum {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("Hey body, tell us the size of the array");
	int size=scan.nextInt();
	
	int[] array=new int[size];
	System.out.println("the size of the array "+size);
	
	for(int i=0; i<size; i++) {
		System.out.println("Enter a number");
		array[i]=scan.nextInt();
	}
	//print values of the array
	for(int i=0; i<size; i++) {
		System.out.println(array[i]);
	}
	int max=0;
	for (int i=0; i<array.length; i++) {
		if(array[i]>max) {
			max=array[i];
		}
	}
	System.out.println("The maximum is "+max );
}
}
