package com.class6;

public class Recap {
public static void main(String[] args) {
/*declare teh time (1-24)
 * based on the time identify wether its morning afternoon
 * evening or night
 * if  1-11 morning
 * if 12-15 noon
 * 16-20 evening
 * 20 den big its night
 */
	
	
	//int time=40;
	//String timeOfDay;
	//if (time>=1 && time<=11) {
	//	System.out.println("Morning");
	//}else if (time>=12 && time<=15) {
	//	System.out.println("Noon");
	//}else if (time>=16 && time<=20) {
		//System.out.println("Evening");
	//} else if( time>20) {
		//System.out.println("night");
	//}-------they are showing same 
	
	
	int zaman=33;
	String timeDay=null;
	if (zaman>=1 && zaman<=11) {
		timeDay="Morning";
	}else if (zaman>=12 && zaman<=15) {
		timeDay="Noon";
	}else if (zaman>=16 && zaman<=20) {
		timeDay="Evening";
	} else if(  zaman<=24 && zaman>20) {
		timeDay="night";
	}else {System.out.println("invalid");
	} System.out.println(timeDay);
	//or system.out.print("time of the day"+timeDay);
	// asking initialeze valur we can put null or add
// 	}else {System.out.println("invalid");
	
	
	
}
}
