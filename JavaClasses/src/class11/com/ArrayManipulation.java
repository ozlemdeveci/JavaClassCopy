package class11.com;

import java.util.Arrays;

public class ArrayManipulation {
	public static void main(String[] args) {
		String[] actualNames={"Jhon","Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= {"Smith","Jhon","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));
        
        int[] numbers= {12,34,15,66,99};
        Arrays.sort(numbers); 
        //siralama yapiyoz
        for(int i:numbers) {
        	System.out.println(i+" ");
        }
        System.out.println();
        System.out.println("*****");
        
        Arrays.sort(numbers);
        for(int i:numbers) {
        	System.out.println();
        }
        
     int[] numbers1= {123,34,15,66,99};
        
        for(int i:numbers1) {
            System.out.print(i+" " );
        }
        
        System.out.println();
        System.out.println("*******");
        
        
        Arrays.sort(numbers1);
        for(int i:numbers1) {
            System.out.print(i+" ");
        }
        
                }
		
	}


