package class12.com;

public class FindDuplicatesInarray {
	//duplicates: ciftler
	public static void main(String[] args) {
		//               0  1  2  3  4  5  6 7
		int[] array2 = { 2, 5, 4, 7, 5, 2 ,3,9};
		for (int i = 0; i < array2.length; i++) {
			
			for (int j = i + 1; j < array2.length; j++) {
				
				if (array2[i] == array2[j]) {
				//        
					System.out.println(array2[j]);
				}
			}
		}
	}
}
