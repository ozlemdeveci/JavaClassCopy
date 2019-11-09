package class11.com;

public class Task {
public static void main(String[] args) {
//Create an array of cars and store 6 elements into it. 
	//Using 2 different loops print all values from the array.
	String [] cars= {"BMW", "toyato", "wolvo", "nissan", "honda","hundai"};
	for (int i = 0; i < cars.length; i++) {
		System.out.println(cars[i]);
	}
//Create an array on integers and calculate the sum 
	//of all elements in an array.
	int[] num= {3, 5, 7, 9};
	int sum=0;
	for (int j = 0; j < num.length; j++) {
		sum=sum+num[j];
		System.out.println(sum);
	}
//Create an array of countries. 
	//While retrieving all values from an array print 
	//capital for each country. (use 2 different loops).
	//we have 2 way for if or for switch other is under the page
	
	String[] c= {"Germany", "USA",  "Turkey"};
    
    for(String country:c) {
        switch(country) {
        case "Germany":
            System.out.println("Berlin");
            break;
        case "USA":
            System.out.println("Washington DC");
            break;
        case "Turkey":
            System.out.println("Ankara");
            break;
        default:
        	System.out.println("unknown");
        
        }
       if(country=="Turkey") {
        	System.out.println("I love my country");
        }
       //also we can make with if
       //for(int i=0; <array.length; i++){
       //if(array[i].equals("USA")){syso("Washington");}
       //else...
	
	
}
}}
