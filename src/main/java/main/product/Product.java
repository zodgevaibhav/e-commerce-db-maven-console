package main.product;

public class Product {
	// Security
	//
	
	// {public, private, protected, default} => Access Specifier/Modifier
	
	public String productName; //within class 
	public String price;			//all over the class 
	public String productQuantity;
	
	public Product() {
		
	}

	public  void printProductName() {
		System.out.println(productName);
	}
}
