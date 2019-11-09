package class11.com;

public class TwoArrayDemo2 {

	public static void main(String[] args) {
		
		String[][] names= {
				{"Khan","yusuf","alex", "Zynab", "jjj"},
				{"han","Ann","Naslyan", "Weqas"},
				{"Diago","asif","Zubeir", "Sofia"},		
		};
		
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		int lengthOfColm=names[0].length;
		System.out.println(lengthOfColm);
		
		for(String getArrays[]: names) {
			for(String getName:getArrays) {
				System.out.print(getName+"  ");
			}
			System.out.println();
		}
		
		
	}
}
