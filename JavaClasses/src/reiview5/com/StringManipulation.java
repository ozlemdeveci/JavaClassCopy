package reiview5.com;

public class StringManipulation {
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.length());  // 5
		
		System.out.println(str.toLowerCase());  //hello
		
		System.out.println(str.toUpperCase()); // HELLO
		
		System.out.println(str.equals("hello"));  //boolean false
		
		System.out.println(str.equalsIgnoreCase("hello")); //boolean true
		
		System.out.println(str.contains("ll")); 
		// true *we dont have ignorecase contains so "LL' false
		
		System.out.println(str.startsWith("Hell"));// true
		System.out.println(str.startsWith("ll"));  //false
		System.out.println(str.startsWith("ll",2)); //true
		
		System.out.println(str.endsWith("llo"));  //true, "ll" false
		System.out.println(str.endsWith("LO"));  //false
		
		//System.out.println(str.toLowerCase().contains("LL".toLowerCase));
		
		String str2="";
		System.out.println("Empty "+str2.isEmpty()); // true
		//we cant use string=null because null is not empty is something
		
		String str3=str+" "+"world";     //1
		String str4=str.concat(" ").concat("World"); //2 --1 ve 2 ayni 
		System.out.println(str4);
		
		String str5=str4.trim().concat("Boddies");
		
		char result=str.charAt(3);
		System.out.println(result); 
		//if we make charAt(6) is gonna error because hello is 5 length
		String newStr=""+str.charAt(0)+str.charAt(1)+str.charAt(2)+str.charAt(3)+str.charAt(4)+"";
		System.out.println(newStr);
		
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf("l"));
		
		System.out.println(str.indexOf("Hell",2));
		String str6="klmhjnmpo";
		System.out.println(str6.indexOf("h",5));// after 5 char looking h but its -1
		// -1 meaning is  didnt find it
		
	}

}
