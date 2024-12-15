package main.user;

import java.util.Scanner;

public class UserManagement {

	public static void userManagement() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("############### Welcome to User management #############\n\n");
		
		while(true)
		{
			System.out.println("What would you like to do today ?");
			System.out.println("1. Add User");
			System.out.println("2. Update User");
			System.out.println("3. Search User");
			System.out.println("4. Delete User");
			System.out.println("9. Quit");
			
			int option = scan.nextInt();
			
			if(option==1) {
				User user = new User();
				System.out.println("Add User :");
					System.out.println("\tEnter User Name :");
					user.userName = scan.next();
					
					System.out.println("\tEnter Email :");
					user.email = scan.next();
					
					System.out.println("\tEnter User Password :");
					user.password = scan.next();
					
					System.out.println("User Name: "+user.userName);
					System.out.println("User Email: "+user.email);
					System.out.println("User Password: "+user.password);
			}else if(option==2) {
				System.out.println("To be implemented...");			
			}else if(option==3) {
				System.out.println("To be implemented...");
			}else if(option==4) {
				System.out.println("To be implemented...");
			}else if(option==9) {
				System.out.println("**** Existing the application...");
				return;			
			}else {
				System.out.println("!!!!!! Invalid option selected");
			}
		}
	
	}
}
