package class11.com;

public class TwoDimentionalArrays {
	public static void main(String[] args) {
		//declare  array
		// data type [] [] arrayname=new
		//44 80 33 20
		//10  5  7  8
		//10  9 70  8
                   //      rows/colm
		int[][] array=new int[3][4];
		//1 row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		//2row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		//3row
		array[2][0]=10;
		array[2][1]=9;
		array[2][2]=70;
		array[2][3]=8;
		
		System.out.println(array[1][3]);
		//task create 2D array of string and with 2 and 3 colum
		String[][]  arra=new String[2][3];
		arra[0][0]="ali";
		arra[0][1]="veli";
		arra[0][2]="ahmet";
		
		arra[1][0]="saban";
		arra[1][1]="recep";
		arra[1][2]="ramazan";
		System.out.println(arra[1][2]);
		
		int [][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9},
				{3,6,8,0,7}
		};
		System.out.println("the valuess index "+numbers[1][4]);
		
		//to identify the numbers of rows
		System.out.println("The numbers of rows are= " + numbers.length);
		
		
		//to identify the numbers of columns
		System.out.println("The numbers of Colums are="+numbers[1].length);
		System.out.println("=============");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[0].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}System.out.println();
		}
		
		}
	}


