package com.demoC2;

import java.util.Scanner;

public class javaScannerDemo {
	public static void main(String[] args) {
		//scanner is a class present in java.util pac
		//whicch allows us to take user input
		//macuser command+shift+0 window Ctrl+SHIFT+0
		
		Scanner  keyBInput=new Scanner(System.in);
		System.out.print("are you  male:  ");
		
		boolean name=keyBInput.nextBoolean(); // int num=keyBInt.nextInt():
		if(name==true)
		{System.out.println("you are male");}
		else{
			System.out.println("you are not male");}
		
		
		
		
		
		
	}

}
