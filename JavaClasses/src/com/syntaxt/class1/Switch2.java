package com.syntaxt.class1;

public class Switch2 {
public static void main(String[] args) {
	
	// Write a program to found out the user level of experience 
    // Must use a switch statement with  a String variable named levelString and a int variable named level 
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
	//Declaring String variable  
			     String levelString="Expert";  
			      int level=0;   
			     switch(levelString){    
		       
			  case "Beginner": 
			        level=1;  
			        break;    
		      case "Intermediate": 
			        level=2;  
			      break;    
		      case "Expert":
			        level=3;  
			      break;    
			 default: 
			        level=0;  
			        break;  
			     }    
			      System.out.println("Your Level is: "+level); 
}
}
