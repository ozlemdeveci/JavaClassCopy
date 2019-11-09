package com.class4;

public class NestedIfMore {
 public static void main(String[] args) {
	/*check age, if age is less then 16---you are too young to drive
	 * otherwise--you are eligible to drive& we will check
	 *  if you are older then 18--you can get driver licence
	 * and if you not you -- can get driver permit
	 */
	 int age=17;
	 if( age<16) {
		 System.out.println("you are too young");
	 }else {
		 System.out.println("you are eligible drive");
		 if (age>=18) { System.out.println("you can drive alone");
		 }else {System.out.println("you need your parents to drive");
		 }
		  }	
	 System.out.println("---------------------");
	 /*we need to check if student comleted the quiz
	  * if yes--> good job,if not--->not good
	  * if they completed we will check your score
	  * if more than 90---> you got an  A
	  * if more than 80--> you got B
	  * anything below--> you should study more
	  */
boolean quiz=true;
int score=85;
  if (quiz) {System.out.println("GOod job");
       if(score>=90){System.out.println("you got A");}
       else if(score>80) {System.out.println("you got a B");}
       else {System.out.println("you should study more");}
  }else {System.out.println("not good!!!");}
 
 //true 85 for good job and you got b
  // false   for not good
  //true 77 for good job  you should study more
 
 
 }
}
