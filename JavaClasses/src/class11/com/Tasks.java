package class11.com;

public class Tasks {
public static void main(String[] args) {
	
	//Create a 2D array of integer type with 3 rows and 4 columns 
	//and print all values of the whole array.
	int[][] values= {
			{4,5,6,7},
			{1,2,3,4},
			{0,9,8,7}
	};
	for (int i = 0; i < values.length; i++) {
		for (int j = 0; j < values[i].length; j++) {
			System.out.print(values[i][j]+" ");
		}
		System.out.println();
}
}}
