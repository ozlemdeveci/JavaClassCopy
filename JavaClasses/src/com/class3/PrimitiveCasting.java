package com.class3;

public class PrimitiveCasting {
	public static void main(String[] args ) {
		//FYI -for your information
		double d=12;
		System.out.println(d);
		//int i=12.0; compile time error
		//casting-cahnging/converting one type to another
		//Widening(implicit/automatic)
		//byte-->short-->int-->long  >    float->double
		
		//Narrowing(Explicit or manuel casting)
		//double >float> long> int>short> byte
		
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num; 
		System.out.println(d);
		double d2=123.56;
		int num2=(int)d2; //bigger box when we put small box lost to something
		System.out.println(num2); //out is 123 lost 0.56
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);
		//out is -24 carzy out wrong so be creaful when changed it
		
		int num4=789;
		byte b2=(byte)num4;  //triying to translate :)
		System.out.println(b2);
		
		
	}

}
