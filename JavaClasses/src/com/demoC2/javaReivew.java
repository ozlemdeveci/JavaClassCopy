package com.demoC2;

public class javaReivew {
	
	public static void main(String[] args) {
		
		//if statement demo; if(condition){some code}
		//i am going to class;if its raining i will take the class online
		boolean  rain=true;
		
		if(rain) {System.out.println("i will ttake the class online");}
		else {System.out.println("i will go to class");}
		
		
		// i create my schedule'7 oclock i study java.8 ovlovk sdlc,9 oclock
		//
		int time=7;
		
		if(time==7) {
			System.out.println("i study java");
			}else if( time==8) {System.out.println("i study sdlc");
			}else if(time==9) {System.out.println("i do my homework");
			}else {System.out.println("its not study time");}
		
	//i wanna eat ,if i have amoney'if restaurant near , i will eat in restaurant
		//or i will not eat outside
		
		
		boolean hasMoney=true;
		boolean isRestNear=false;
		if(hasMoney==true) {if(isRestNear==true) {
			                  System.out.println("i will eat at restaurant");		
		}else{System.out.println("i cant walk long distance");} // i need if inside if second option else        
		}else {System.out.println("i will not eat outside");}	
		
	
	
	}

	}
