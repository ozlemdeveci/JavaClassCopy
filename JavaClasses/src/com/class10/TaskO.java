package com.class10;

public class TaskO {
	public static void main(String[] args) {
		//create an array of countries.
		//while retrieving all values from an array
		//print capital for each country
		
		String[] countries= {"Afganistan","Colombia", "USA", "Turkey","Russia"};
		
		for(int i=0; i<countries.length; i++) {
			switch(countries[i]) {
			case "Afganistan":              ///String[] capital=null
				System.out.println("Kabul");  //or capital="Kabul"  ;
				break;
			case "Colombia":
				System.out.println("Bogota");
				break;
			case "USA":
				System.out.println("Washington Dc");
				break;
			case "Turkey":
				System.out.println("Ankara");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
			}
		}
		
		
		
	}
}
