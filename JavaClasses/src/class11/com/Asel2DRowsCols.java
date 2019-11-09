package class11.com;

public class Asel2DRowsCols {
	public static void main(String[] args) {
		int[][] num= {
				{11,12,13,14},
				{21,22,23},
				{31,32,33,34}
		};
		//int rows=num.length;    ---kac row old yazdik
		//System.out.println(rows);
		
		//int cols=num[0].length;  
		//System.out.println(cols);
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.print(num[row][col]+" ");
			}System.out.println();
		}
	
}

}
