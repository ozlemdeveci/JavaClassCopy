package com.class6;
import java.util.Scanner;
public class Task1 {
public static void main(String[] args) {
	/*ask user enter boolean value for sale
	 * if no sale---- iam not shopping
	 * if sale---- caheck the price of the item
	 * based on the amount we will have to calculate the price sfter discount
	 * if price<20----10%
	 * if price between 20-100$--- 20%
	 * 100-500---- 30%
	 * anything---50%
	 * after discount__ the price of the reduce from__to__
	 */
	
	 double price;
	 double discount;
	 double finalprice;
	Scanner inp=new Scanner(System.in);
	System.out.println("is there a sale going on? true or false");
	boolean sale=inp.nextBoolean();
	
	 if(!sale) {
		 System.out.println("i am not shopping");
	 }else {
		 System.out.println("Whats the actual price?");
		 price = inp.nextDouble();
		 if(price<20) {
			 discount=price*0.10;
			 finalprice=price-discount;
		 }else if(price>=20 && price<100) {
			 discount=price*0.20;
			 finalprice=price-discount;
		 }else if(price>=100 && price<500) {
			 discount=price*0.30;
			 finalprice=price-discount; 
		 }else {
			 discount=price*0.50;
			 finalprice=price-discount;
		 } System.out.println("After discount"+discount+
				 "the price of the item reduce from"+price+"To"+finalprice);
	 }
	
	
}
}
