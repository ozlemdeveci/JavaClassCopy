package com.class6;

import java.util.Scanner;

public class ScannerSwitch {
	
	public static void main(String[] args) {
		/*ask user where they are from
		 * based on the country we will spesify favorite food
		 * 
		 */
		String country, foodName;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		
		case "Turkey":
			foodName = "kebab";
			break;
		case "Ethiopia":
			foodName = "Tibs";
			break;
		case "Morocco":
			foodName = "Tajin";
			break;
		case "Kazakhistan":
			foodName = "Kumis";
			break;
		case "pakistan":
			foodName = "Beryani";
			break;
		case "Russia":
			foodName = "Cavair";
			break;
		case "Cuba":
			foodName = "sofrito";
			break;
		default:
			foodName = "unknown";
		}
		System.out.println("you are from "+ country+ " your favorite food is "+ foodName);
		
		
		
	}
	
	

}
