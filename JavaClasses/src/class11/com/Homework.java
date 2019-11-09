package class11.com;

public class Homework {

	public static void main(String[] args) {
		//Create a 2D array or integer type where you 
		//will store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		int[][] values= {
				{4,5,6,7},
				{1,2,3,4},
				{0,9,8,7}
		};
		int sumEven=0;
		int sumOdd=0;
		for (int a = 0; a < values.length; a++) {
			for (int b = 0; b < values[a].length; b++) {
				if(values[a][b]%2 == 0) {
					System.out.println("Even number is="+values[a][b]);
				}//else {
				//	System.out.println("Odd number is ="+ values[a][b]);
				}}System.out.println();
		
		

}}