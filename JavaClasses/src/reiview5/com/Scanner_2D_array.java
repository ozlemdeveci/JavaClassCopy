package reiview5.com;

import java.util.Scanner;

public class Scanner_2D_array {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Body,hoa many row do you want? ");
		int rows=scan.nextInt();
		System.out.println("Body,hoa many columns do you want?");
		int cols=scan.nextInt();
		
		System.out.println("your array will have "+rows+ " rows and "+cols+" cols");
		// names.lenght=rows
		//names[0].length=cols
		String[][] names=new String[rows][cols];
		for(int i=0; i<rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("body enter a name!");
				names[i][j]=scan.next();
				
			}
		} System.out.println("lets print the names!");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println(names[i][j]+" ");
			}
			
		}
		//hocanin yaptigi


        Scanner scan = new Scanner(System.in);
        System.out.println("Body, how many rows do you want?");
        int rows = scan.nextInt();
        System.out.println("Body, how many columns do you want?");
        int cols = scan.nextInt();
        String[][] names = new String[rows][cols];
        // names.length = rows
        // names[0].length = cols
        // Entering into array
        System.out.println("Body, enter all the names!");
        for (int i = 0; i < rows; i++) {
//          System.out.println("Body, we are at row index " + i);
            for (int j = 0; j < cols; j++) {
                if (j != 1) {
                    names[i][j] = scan.next();
                } else {
                    scan.next();
                }
            }
        }
        System.out.println("Let's print the names!");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}
		
	}

}