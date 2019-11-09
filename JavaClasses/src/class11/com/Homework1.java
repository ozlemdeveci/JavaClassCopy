package class11.com;

public class Homework1 {
public static void main(String[] args) {
	
	//Create a 2D array or integer type and store numbers 
			//in 3 rows and 3 columns. Print the sum of all numbers.
			{int[][] value= {
					{4,5,6},
					{1,2,3},
					{0,9,8}};
			int sum=0;
			for (int i = 0; i < value.length; i++) {
				for (int j = 0; j < value[i].length; j++) {
					sum=sum+value[i][j];
				}System.out.println();
		} System.out.println("the sum of all elements in the array is= "+sum);
		}
}
}
