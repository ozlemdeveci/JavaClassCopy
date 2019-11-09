package com.class9;

public class Ex {
	public static void main(String[] args) {
		for(int a=1; a<5;  a++) { //123456789
			for(int b=1; b<10; b++) {
				System.out.print(b);
			}System.out.println();}
		
		System.out.println("%%%%%%%%%");
		
		for(int i=1; i<=5; i++) {   //54321 5431 54321 54321
			for(int j=5; j>=1; j--) {
				System.out.print(j);
			}System.out.println();
		}
		System.out.println("^^^^");  //55555 44444 33333 22222 11111
		for(int r=5; r>=1; r--) {
			for(int d=5; d>=1; d--) {  // writing out ikinci fordan geliyor
			                       	//ilkini genelde sayi kere
				System.out.print(r);// kullaniliyor
			}
			System.out.println();}
		
		for(int v=1; v<=5; v++) {
			for(int w=1; w<=v; w++ ) {   ///* ** *** **** *****
				System.out.print("*");
			}System.out.println();
		}
		
		for(int u=1; u<=9; u++) {
			for(int q=1; q<=u; q++) {   // 1 22 333 4444 55555 666666 ...
			System.out.print(u);	
			}System.out.println();
		}
		int k = 1;
        for (int j = 5; j >= 1; j--) {
            for (int l = 0; l < ((10 - k) / 2); l++) {
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            k += 2;
            System.out.println("");
        }
		
		}
	}


