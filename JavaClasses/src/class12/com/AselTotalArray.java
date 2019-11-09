package class12.com;

public class AselTotalArray {
	public static void main(String[] args) {
	int[][] arr= {
			{1,2,3},
			{10,20,30},
			{100,200,300}
	};
	//how many total arrays
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) { //if we write arr[0].length its gonna just 1.row
			System.out.print(arr[i][j]+" ");
		}System.out.println();
	}
	System.out.println("-----for each  Loop----");
	for(int[]  singleArray:arr) {
		for(int numbers:singleArray) {
			System.out.print(numbers+" ");
		}System.out.println();
	}
}
}
