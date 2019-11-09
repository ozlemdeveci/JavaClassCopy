package com.class5;

public class help {
	public static void main(String[] args) {
		

	// 7 days a week
    // if days is Tuesday or Thursday --> SDLC Class
    // if saturday or sunday --> Java Class
    // if Monday or Friday --> No Class
    // if day = 3 --> Review Class
    
    String weekDay="Sunday";
    if(weekDay.equals("Tueasday") || weekDay.equals("Thursday")) {
        System.out.println("SDLC class");
    }else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
    System.out.println("Java Class");
    }if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
        System.out.println("No Class");
    }else if (weekDay.equals("Wendesday")) {
        System.out.println("Review Class");
       }else {
         System.out.println("Not a valid day");
}
}
}


	
	
	

