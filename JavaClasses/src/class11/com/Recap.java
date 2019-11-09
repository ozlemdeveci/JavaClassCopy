package class11.com;

public class Recap {
	public static void main(String[] args) {
		// array declaration:
		int []   h=new int [3];
		int e[];
		int [] y,u;
		y=new int [3];
		u=new int [2];
		//u=new int[2]; will not compile when int y[],u; 
		//y[] is array u is int
		int[] array= new int[6];
		array[0]=33;
		
		int [] arr= {2,3,5,7};
		System.out.println(arr[2]);
		System.out.println("***********");
		//     1        2 5 8           4 7
		for (int i = 0; i < arr.length; i++) {
		//      3 6	9
			System.out.println(arr[i]);
			
		}
		for(int ar:arr) {
			System.out.println(ar);
		}
		
		
	}

}
