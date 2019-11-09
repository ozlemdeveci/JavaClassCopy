package com.class9;

public class Clock {
public static void main(String[] args) {
	 //24 hours , 60 minutes
	for(int h=0; h<24; h++) {
		
		for( int m=0; m<60; m++) {
			
			
			for(int s=0; s<60; s++) {
				    if (h<10 && m<10  ) {
	                    System.out.println("0" + h+ ":" +"0" +m+":" +s+"am");
	                }else if(h<10 && m>=10) {
	                    System.out.println("0" + h+ ":" + m+":" +s+"am");
	                }else if(h>=10 && m<10) {
	                	if(h<12) {
	                		System.out.println(h+ ":0" + m+":" +s+"am");
	                	}else {
	                    System.out.println(h+ ":0" + m+":" +s+"pm");
	                	}
	                }else {
	                    System.out.println(h+ ":" + m+":" +s+"pm");
				
				
			}
		}
	}
}
}}
