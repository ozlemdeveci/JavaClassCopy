package reviewNes.com;

public class ReverseArray {
public static void main(String[] args) {
//  String[] animals = { "dog", "cat", "mouse", "bird", "donkey", "horse" };
    String[] animals = { "dog", "cat", "bird" };
    for (int i = 0; i < animals.length; i++) {  //or i<=animals.length-1;
        System.out.println(animals[i]);
    }
    System.out.println("---Reverse---");
    for (int i = animals.length - 1; i >= 0; i--) {
        System.out.println(animals[i]);
    }

	      //the last index of the array is one less than the length
	
}
}
