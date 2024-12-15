package main.product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {

	public static void productManagement() throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.println("############### Welcome to product management #############\n\n");

		ArrayList<Product> productList = new ArrayList(); // Empty...

		// Read data from file and put it in to array list
		String filePath = "/Users/vzodge/Documents/ECLIPSE_WORKSPACES/w26-java-developmer/HelloJava/src/file_handling/Product.txt";
		File file = new File(filePath); // File वर डबल क्लिक केल
										// file name & path => address on hard disk

		FileReader fileReader = new FileReader(file); // Send this adress to hard disk and ask to give the data
														// Hard disk Program : adress => Read => RAM
														// Return => Adress of data which is stored in RAM

		BufferedReader br = new BufferedReader(fileReader); // RAM मधला डेटा read करण्याचा साधन (straw)

		String line = "";
		while ((line = br.readLine()) != null) {
			String productArray[] = line.split(",");

			Product product = new Product();
			product.productName = productArray[0];
			product.price = productArray[1];
			product.productQuantity = productArray[2];
			productList.add(product);
		}

		while (true) {
			System.out.println("What would you like to do today ?");
			System.out.println("1. Add Product");
			System.out.println("2. Update Product");
			System.out.println("3. Search Product");
			System.out.println("4. Delete Product");
			System.out.println("5. Print Product");
			System.out.println("9. Quit");

			int option = scan.nextInt();

			if (option == 1) {
				Product product = new Product(); // New dabba created

				System.out.println("Add Product :");
				System.out.println("\tEnter Product Name :");
				product.productName = scan.next();

				System.out.println("\tEnter Product Price :");
				product.price = scan.next();

				System.out.println("\tEnter Product Quantity :");
				product.productQuantity = scan.next();

				productList.add(product);

			} else if (option == 2) {
				System.out.println("To be implemented...");
			} else if (option == 3) {
				System.out.println("To be implemented...");
			} else if (option == 4) {
				System.out.println("To be implemented...");
			} else if (option == 5) {

				for (Product data : productList) {
					System.out.println(data.productName);
					System.out.println(data.productQuantity);
					System.out.println(data.price);
				}

			} else if (option == 9) {
				System.out.println("**** Existing the application...");
				String filePath1 = "/Users/vzodge/Documents/ECLIPSE_WORKSPACES/w26-java-developmer/HelloJava/src/file_handling/Product.txt";
				File file1 = new File(filePath1); // File वर डबल क्लिक केल
													// file name & path => address on hard disk

				FileWriter fileReader1 = new FileWriter(file1, false); // Open file in append mode (keep existing data
																		// and add new)
																		// If we send "false" then all existing data
																		// from file will removed
																		// & new data only written and saved in file
																		// true -> append
																		// false -> Overwrite

				BufferedWriter br1 = new BufferedWriter(fileReader1); // RAM मधला डेटा write करण्याचा साधन (straw)

				for (Product product : productList) {
					br1.write(product.productName + "," + product.price + "," + product.productQuantity + "\n");
				}

				br1.flush(); // Just save the file, dont close the file
				// RAM मधला डेटा harddisk मधे store होतो but ram मधे तो तसाच राहतो

				br1.close(); // Save and Close the file. Once data write to file, save it. If you dont close
								// it will not save
								// Try removing this statement
								//
				return;
			} else {
				System.out.println("!!!!!! Invalid option selected");
			}
		}
	}
}
