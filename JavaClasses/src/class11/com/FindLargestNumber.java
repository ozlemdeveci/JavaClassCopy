package class11.com;

public class FindLargestNumber {
	public static void main(String[] args) {
		//create an array of integers and finf largest numberst
	int[] numbers= {200,20,13,499, 65};
	int largest=numbers[0];
	for (int i = 0; i < numbers.length; i++) {
		if(numbers[i]>largest) {
			largest=numbers[i];
		}	
	}System.out.println("The largest number is "+largest);
	
	
	}

}
