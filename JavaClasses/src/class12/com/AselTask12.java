package class12.com;

import java.util.Scanner;

public class AselTask12 {
	public static void main(String[] args) {
		/*Accept username, pasword and confirm password and check following requirements;
		 * username and password cannot be empty,if so-->msj="username and Password cannot be empty"
		 * password should be min 8 characters,if-->msj="Password is too short"
		 * passoword can not contain user name if-->msj="password cannot contain username"
		 * Password should match confirmed password,if no-->msj="Password do not match"
		 * only after requirement met-->msj="your username and password has been created"
		 */
		Scanner scan;
		String userName,password,confirmedPassword;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter username");
		userName=scan.nextLine();
		
		System.out.println("Please enter Password");
		password=scan.nextLine();
		
		System.out.println("Please enter confirmedPassword");
		confirmedPassword=scan.nextLine();
		
		
		
		
	}

}
