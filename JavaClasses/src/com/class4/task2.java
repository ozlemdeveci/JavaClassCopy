package com.class4;

public class task2 {
public static void main(String[] args) {
	
	/*mortage rate and mortage price
	 * if rate higher than 4.5 user will not buy a house
	 * otherwise user will consider buyying
	 * once user decides to buy ahouse ;
	 * if price of the house larger than 200000 than user will take a loan
	 * otherwise user will pay cash 
	 */
    double mRate=4;
    boolean houseWant=true;
    double mPrice=200000;
    if (mRate>4.5) {
    	System.out.println("we are sorry!You cant buy a house");
    }else {System.out.println("you can consider buyying");
    }if(houseWant) {if (mPrice>200000) {System.out.println("you can use a loan");
                 }else {System.out.println("you have to pay cash!");}
    	         
    }else {System.out.println("we want to help future");}




}
}
