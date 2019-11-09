package class12.com;

public class AselForEachIn2D {
	public static void main(String[] args) {
		/*creata a grocery list: fruits{}
		 *                       veggies{}
		 *                       dairy{}
		 * retrive all values using 2 different loops                      
		 */
		String[][]	groceryList= {
				{"banana","orange","apple"},
				{"onion", "pootato","cucumber"},
				{"yogurt","cheese","milk"}
				};
		for(String[] list:groceryList) {
			
			for(String item:list) {
				System.out.print(item+" ");
			}
		System.out.println();
		
		
		}
				
	}

}
