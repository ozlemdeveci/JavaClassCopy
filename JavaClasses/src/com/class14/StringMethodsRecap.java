package com.class14;

public class StringMethodsRecap {
	public static void main(String[] args) {
		//.replace
		String str="Syntax Technologies";
		System.out.println(str.replace('y', 'i'));
		
		System.out.println("********");
		System.out.println(str.replace("your","My"));
		
		//.replaceAll
		String str2="Video provides a powerful way to help you prove your point."
		        +"When you click Online Video, you can paste in the embed "
				+"code for the video you want to add.";
		System.out.println(str2.replaceAll("way(.*)", "")); //way dahil sonrasi no print
		
		String str3="23423Hell3049o%*$^##";
		System.out.println(str3.replaceAll("[0-9]", "")); //0-9 arasi sayilari no print
		System.out.println(str3.replaceAll("[^0-9]", "")); //sadece sayilari yazdir
		System.out.println(str3.replaceAll("[A-z]",""));   //harfler haric print
		System.out.println(str3.replaceAll("[^A-z]",""));  //sadece harfleri yazdir
		System.out.println(str3.replaceAll("[^a-zA-Z]" , ""));	//buyuk kuzuk harf yazdir	
		System.out.println(str2.replaceFirst(" ","")); //birinci bosluk silme
	}

}
