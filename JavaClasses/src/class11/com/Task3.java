package class11.com;

public class Task3 {
public static void main(String[] args) {
	//Create an array of countries. 
		//While retrieving all values from an array print 
		//capital for each country. (use 2 different loops).
	String[] countries= {"India","Canada","USA"};
	for(String getCountry:countries) {
		if(getCountry.contentEquals("USA")) {
			System.out.println("the capital of USA Wahington DC");
		}
	}
	//2.way
	for (int i = 0; i < countries.length; i++) {
		if(countries[i].contentEquals("USA")) {
			System.out.println("the capital of USA Wahington DC");
		}
		
	}
	
}
}
