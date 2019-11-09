package replit.com;

import java.util.Scanner;

public class rep80 {

//Note: Create a Scanner Class

//Create an int array with the size of 5 and input values with Scanner. 
//Create a loop and enter values into one loop (don't print prompt question for Scanner). 
//Create the second loop to print the values and it must be multiplied by 10.
//Print out each element of the array multiplied by ten, one element per line.

//Example:
//Input:
//1
//2
//3
//4
//5

//Output:
//10
//20
//30
//40
//50


	public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] no=new int[5];

for (int i=0; i<no.length; i++){
  no[i]=scan.nextInt();
}

for(int i=0; i<no.length; i++){
  System.out.println(no[i]*10);
}		
}
