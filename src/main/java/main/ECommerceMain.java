package main;

import java.io.IOException;
import java.util.Scanner;

import main.product.ProductManagement;
import main.user.UserManagement;

public class ECommerceMain {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("############### Welcome to E-Commerce #############\n\n");
		
		Login.login();
		
		while(true) {
			
			System.out.println("What would you like to do today ?");
			System.out.println("1. Product Management");
			System.out.println("2. User Management");
			System.out.println("3. Quit");
			
			int option = scan.nextInt();
			
			if(option==1) {
				ProductManagement.productManagement();
			}else if(option==2) {
				UserManagement.userManagement();
			}else {
				return;
			}
		}
	}
}