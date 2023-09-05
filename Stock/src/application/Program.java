package application;

import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.println("Enter product name:");
		String name = sc.nextLine();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(1000.00);
		System.out.println("Updated price: " + product.getPrice());

		System.out.println("Product data:" + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		System.out.println("Updated data:" + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be removed in stock:");
		int removeQuantity = sc.nextInt();
		product.removeProduct(removeQuantity);
		System.out.println("Updated data:" + product);

		sc.close();
	}
}