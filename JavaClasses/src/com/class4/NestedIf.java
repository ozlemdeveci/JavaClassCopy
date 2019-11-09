package com.class4;

public class NestedIf {
	public static void main(String[] args) {
		//Nested if;if statement inside another
		//statement?had to be true true
		/*boolean b=true;
		 * boolean classToday=true 
		 * if(b){            
		 */
		//System.out.println("Hello ")
		//if (classToday) {,,,  code and another if...)
		//          (--only if true)
		//System.out.println("Hello my friend")
		//}else{ system.outprintln("Bye"
		/*classToday true----out is hello my friend/
		 * classToday=false its gonna out = "Bye" 
	     */
	/*if b=false its go to drict to else so just 
	 * for true it is working
	 * if b=false classtoday=false ----its else
	 */
		boolean b=true;
		boolean classToday=false;
		
		if (b) {
			System.out.println("Hello");
		    if(classToday) {
		    	System.out.println("hello my friends");
		              }
		}else {
			System.out.println("Bye");
		}
		System.out.println("i am continues code");
		
	}

}
