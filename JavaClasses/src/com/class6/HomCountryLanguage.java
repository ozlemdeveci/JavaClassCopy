package com.class6;

import java.util.Scanner;

public class HomCountryLanguage {
	public static void main(String[] args) {
		
		String country, language;
		Scanner scan=new Scanner(System.in);
		System.out.println("Whats your Country?");
		country=scan.nextLine();
		  
		switch (country) {
		case "Turkey":
			language = "Turkish";
			break;
		case "Usa":
			language = "English and Spanish";
			break;
		case "England":
			language= "English";
			break;
		case "Mexico":
			language= "Espanyol";
			break;
		case "Germany":
			language= "Deucth";
			break;
			default:
				language="unknowning";
			}System.out.println("your country is "+country+" and your language is "+language);
		
		
		
	}

}
