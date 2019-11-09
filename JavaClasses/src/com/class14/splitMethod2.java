package com.class14;

public class splitMethod2 {
	public static void main(String[] args) {
		//how to separate comma delimited string
		
		String str="if you come to class early, "
				+ "then you can study more, "
				+ "also you acan learn more,and you can leave early";
		
		String[] array=str.split(",");  // can use\\, but no need juzt . is not working
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("*****************");
		
		String str1="Welcome To Syntax Technologies";
	//String[] array2=str1.split(regex, limit);
	    String[] array2=str1.split(" ", 2); // 2sentences (if 3 3 sentences)(if("to",3)to dan bolunup to yazilmaz)
	    System.out.println(array2.length);
	    
	    for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
	    
		
		
		
	}

}
