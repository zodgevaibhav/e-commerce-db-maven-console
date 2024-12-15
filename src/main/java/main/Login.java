package main;

import java.util.Scanner;

public class Login {
	
	public static void login() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("***** Login :\n");
		
		System.out.println("\tEnter User Name :");
		String userName = scan.next();
		
		System.out.println("\tEnter Password :");
		String password = scan.next();
		
		
		// if(any expression/function that return boolean [true/false])
		// a==b , a>b, a>=b, a and b, a || b
		// boolean isVisible()
		if(userName.equals("vzodge")) {			
			if(password.equals("Test@123")) {
				System.out.println("Login Successful");
				return;
			}
		}
		System.out.println("!!! Login fail");
		System.exit(0);
	}
}
