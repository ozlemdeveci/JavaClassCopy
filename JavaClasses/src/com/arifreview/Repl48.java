package com.arifreview;

import java.util.Scanner;

public class Repl48 {
	public static void main(String[] args ){
        String gender;
   
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your gender? F or M");
        gender=scan.next();
        System.out.println("What is your age?");
        int age=scan.nextInt();

        if(gender.equals("F")){
                if(age<=25){
                        System.out.println("Girl");
                }else{
                        System.out.println("Women");
                }
        }else { 
                if(age>=25){
                        System.out.println("Man");
                }else{
                        System.out.println("Boy");
        }}
}

}
