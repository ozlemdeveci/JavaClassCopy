package com.class5;

public class locicalOr {
	public static void main(String[] args) {
		/* 7 day a week 
		 * if day 2 or 4 sdl class
		 * 6 or 7 java class
		 * 3 review class
		 * if day 1 or 5 no class
		 * 
		 *   ||  or meaning enough to anyone is true
		 */
		int day=3;
		if(day==1 || day==5) {
			System.out.println("no class");
		}else if(day==3) {
			System.out.println("reivew class");
		}else if(day==2 || day==4) {
			System.out.println("sdl class");
		}else if(day==6 || day==7) {
			System.out.println("java class");
		}else {System.out.println("not avalid day");}
		
		/* 7 day a week 
		 * if day tuesday or thursday sdl class
		 * saturday or sunday java class
		 * wednesday review class
		 * if day monday or friday no class
		 * 
		 *   ||  or meaning enough to anyone is true
		 */
		String weekDay="sunday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("Sdl class");
		}else if(weekDay.equals("saturday")|| weekDay.equals("sunday")) {
			System.out.println("java class");
		}else if(weekDay.equals("monday")|| weekDay.equals("friday")) {
			System.out.println("free day");
		}else if(weekDay.equals("wednesday")) {
			System.out.println("review class");
		}else  {
			System.out.println("not valid day");
		}
		
		
		
	}

}
