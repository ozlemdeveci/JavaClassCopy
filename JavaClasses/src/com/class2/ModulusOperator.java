package com.class2;

public class ModulusOperator {
	public static void main(String[] args) {
		
		float num1=12.5f;
		float num2=3.5f;		
		
		float div=num1/num2; // out is 3.571.. because its ondalik sayi
		System.out.println(div);
		
		int numb1=13;
		int numb2=14;
		int divFintegers=numb1/numb2;
		System.out.println(divFintegers); //out is 0 because int just tam sayi not ondalik
		
		
		int number1=13;
		int number2=2;
		int divOFintegers=number1/number2;
		System.out.println(divOFintegers);
		
		double d=12;
		System.out.println(d);	// out is going to 12.0 beacuse of double
		
		//int i=12.5; cannot convert(donusturmek) from double
		
		//moduler gives remaining of the division;
		
		int a=15;
		int b=4;
		int remainder=a%b;   //moduler yani kalan /left over after div
		System.out.println(remainder);
		
		int myNumber=8+8*2; //smart java oncelik islem sirasini takip ediyor
		
		int myNumber1=(8+8)%2;   // o kalan				
	}

}
